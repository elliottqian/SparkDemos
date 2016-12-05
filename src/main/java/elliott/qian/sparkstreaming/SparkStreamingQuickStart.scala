package elliott.qian.sparkstreaming

import org.apache.spark._
import org.apache.spark.streaming._ // not necessary since Spark 1.3

/**
  * Created by ElliottQian on 2016.04.12.
  */
object SparkStreamingQuickStart {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local").setAppName("SSQS")
    val sparkStreaming = new StreamingContext(conf, Seconds(1))

    val lines = sparkStreaming.socketTextStream("localhost", 9999)




  }
}
