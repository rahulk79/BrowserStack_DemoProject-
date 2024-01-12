package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class fileUtil {
	private static Properties propObj;
	private static InputStream reader = null;
	private static String projectpath = null;
	private static String filename = null;
	
	public static String readProperty(String key) throws IOException{
	
		propObj = new Properties(); 
		projectpath = System.getProperty("user.dir");
		filename = System.getProperty("Env")+"_config.properties";
		reader = new FileInputStream(projectpath+"/src/test/java/" + filename );
		propObj.load(reader);
		return propObj.getProperty(key);
        }
}
