package elliott.qian.submidemo

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by elliottqian on 16-12-5.
  */
object WordCount {
  def main(args: Array[String]): Unit = {

    val input_path = args(0)
    val out_path = args(0)

    val conf = new SparkConf().setAppName("word_count")
    val sc = new SparkContext(conf)

    val rdd = sc.textFile(input_path)

    val result = rdd.map(x => x.replace(",", "").replace(".", "").replace("'", "").replace("\t", ""))
      .flatMap(x => x.split(" "))
      .map(x => (x, 1))
      .reduceByKey(_ + _)

    result.foreach(println)

    //result.saveAsTextFile(out_path)
    sc.stop()
  }
}
