package com.cast.software.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtility {

	public static void main(String[] args) throws IOException {
		{
			FileInputStream fis=new FileInputStream("./data.properties");
			Properties pro=new Properties();
			pro.load(fis);
		  String admissinno=pro.getProperty("Admissinno");
		  String	  FirstName=pro.getProperty("Dhanamma");
		  String  LastName=pro.getProperty("klmn");
		  String  FatherName=pro.getProperty("abc");
          String  Gender=pro.getProperty("F");	
		 String PaymentStatus=pro.getProperty("no"); 
		String Registered=pro.getProperty("no");	
		String Area=pro.getProperty("vijaynagar	");
	    String Address=pro.getProperty("banglore");	
		String  AdmissinDate=pro.getProperty("25/08/2023");
		}

		}

}
