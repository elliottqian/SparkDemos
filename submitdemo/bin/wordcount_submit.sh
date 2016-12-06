#!/bin/bash

export SPARK_HOME=/home/elliottqian/d/Programs/spark-2.0.0-bin-hadoop2.7
cd $SPARK_HOME

./bin/spark-submit \
  --class elliott.qian.submidemo.WordCount \
  --master yarn \
  /home/elliottqian/Codes/JavaScala/SparkDemos/submitdemo/target/submitdemo-1.0-SNAPSHOT.jar \
  /user/wordcount.txt \
  /user/wordcountout