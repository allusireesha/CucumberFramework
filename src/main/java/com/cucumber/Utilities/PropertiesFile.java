package com.cucumber.Utilities;


	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class PropertiesFile {
		
		static FileInputStream fileinputstream;
		public String getproperty(String key) throws IOException {
		
		String FilePath="Properties\\application.properties";
		
		fileinputstream = new FileInputStream(FilePath);
		
		Properties prop=new Properties();
		prop.load(fileinputstream);
		
		String value=prop.getProperty(key);
		return value;
		

	}
	}

