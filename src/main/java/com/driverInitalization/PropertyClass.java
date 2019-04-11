package com.driverInitalization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyClass {

	private final static Properties prop = new Properties();

	static {
		loadProperties();
	}

	public static String getPropertyValue(String key) {
		return prop.getProperty(key);
	}

	public static String getPropertyValue(String key, String defultValue) {
		return prop.getProperty(key, defultValue);
	}
	
	private static void loadProperties() {
		InputStream input = null;
		try {
			String filepath="../PgManagement/resource/ui-pgTest-properties";
			File file = new File(filepath);
			input = new FileInputStream(file);
			// load a properties file
			prop.load(input);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
