package Properties;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException  {
		
		Properties p=new Properties();
		 
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\Properties\\config.properties");
		p.load(fis);
		System.out.println(p.get("url"));
		System.out.println(p.get("uname"));
		
			}

}
