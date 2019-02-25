package cores;

import java.util.Arrays;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import org.apache.spark.api.java.function.VoidFunction;

import scala.Tuple2;

public class WordCount {
	public static void main(String[] args) {
		SparkConf sf=new SparkConf().setAppName("test").setMaster("local");
		JavaSparkContext sc=new JavaSparkContext();
		JavaRDD<String> js=sc.textFile("D:\\README.md");
		JavaRDD<String> word=js.flatMap(new FlatMapFunction<String, String>() {

			public Iterable<String> call(String arg0) throws Exception {
				// TODO Auto-generated method stub
				return Arrays.asList(arg0.split(" "));
			}
			
		});
		JavaPairRDD<String,Integer> mp=word.mapToPair(new PairFunction<String, String,Integer>() {

			public Tuple2<String, Integer> call(String arg0) throws Exception {
				// TODO Auto-generated method stub
				return new Tuple2<String, Integer>(arg0,1);
			}
			
		});
		JavaPairRDD<String,Integer> fd=mp.reduceByKey(new Function2<Integer, Integer, Integer>() {
			
			public Integer call(Integer arg0, Integer arg1) throws Exception {
				// TODO Auto-generated method stub
				return arg0+arg1;
			}
		});
		fd.foreach(new VoidFunction<Tuple2<String,Integer>>() {
			
			public void call(Tuple2<String, Integer> arg0) throws Exception {
				// TODO Auto-generated method stub
				System.out.println(arg0._1+" : " +arg0._2);
			}
		});
        sc.close();
	}

}
