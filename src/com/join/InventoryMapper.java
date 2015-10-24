package com.join;

import java.io.IOException;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class InventoryMapper extends Mapper<LongWritable, Text, IntWritable, Text>{
	
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, IntWritable, Text>.Context context)
			throws IOException, InterruptedException {
		if(value.toString().contains("lane_id")){
			return;
		}
		try{
		String lane_id = value.toString().substring(0,value.toString().indexOf(","));
		IntWritable laneID = new IntWritable(Integer.valueOf(lane_id));
		context.write(laneID, value);
		}catch(Exception e){
			System.out.println(value.toString());
		}
	}

}
