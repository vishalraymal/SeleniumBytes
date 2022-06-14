package defPack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		FileInputStream Fis = new FileInputStream(
				"C:\\Users\\ThisPc\\eclipse-workspace\\Introduction\\src\\defPack\\data.properties");
		prop.load(Fis);
		System.out.println(prop.getProperty("browser"));

	}

}
