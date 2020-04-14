/*
 * package parallel.cucumber.utils;
 * 
 * import java.io.FileInputStream; import java.util.Properties;
 * 
 * public class ReadConfigFile {
 * 
 * public static Properties prop; public static FileInputStream filePath;
 * 
 * 
 * public Properties configFileReader() {
 * 
 * prop = new Properties();
 * 
 * try { filePath= new FileInputStream(System.getProperty("user.dir") +
 * Constants.PROPERTIES_FILE_PATH ); prop.load(filePath);
 * 
 * } catch (Exception e) {
 * 
 * System.out.println("Exception Message" +e.getMessage());
 * 
 * } return prop; }
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public String browserName() {
 * 
 * String configFilePath =(prop.getProperty("browser")); return configFilePath;
 * 
 * 
 * }
 * 
 * public String getURL() { String URL= (prop.getProperty("url")); return URL;
 * 
 * }
 * 
 * 
 * }
 */