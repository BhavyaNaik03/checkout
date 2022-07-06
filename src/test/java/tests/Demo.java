package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		
		File file= new File(".\\src\\main\\java\\properties//projectdata.properties");
		
		FileInputStream fis = new FileInputStream(file);
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Username"));
		System.out.println(prop.getProperty("Password"));
	}

}
