### Spark Connect Examples

```bash
git clone https://github.com/HyukjinKwon/spark-connect-example
cd spark-connect-example
build/sbt package
cd ..
git clone https://github.com/apache/spark.git
cd spark
build/sbt package
sbin/start-connect-server.sh
bin/spark-submit --name "testApp" --remote "sc://localhost" --class com.hyukjinkwon.SparkConnectExample ../spark-connect-example/target/scala-2.13/spark-connect-example_2.13-0.0.1.jar
```

