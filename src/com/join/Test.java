package com.join;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.xml.crypto.Data;

public class Test {

	public static void main(String[] args) throws IOException, ParseException {

		String date = "2006-11-01 12:52:47-05";
		String date2 = "2006-11-01 12:52:47.123-10";
		String format1 = "yyyy-MM-dd HH:mm:ss";
		String format2 = "yyyy-MM-dd HH:mm:ss.SSS";
		SimpleDateFormat sfd = new SimpleDateFormat(format1);
		SimpleDateFormat sfd2 = new SimpleDateFormat(format2);
		Date d = sfd.parse(date2);
		System.out.println(d);
	}
}
