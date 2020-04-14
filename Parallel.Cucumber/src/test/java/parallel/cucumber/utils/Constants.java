package parallel.cucumber.utils;

public class Constants {

	
	public final static String PROPERTIES_FILE_PATH= "\\src\\test\\java\\parallel\\cucumber\\properties\\Config.properties";
	public final static String CHROME_DRIVRE_PATH= System.getProperty("user.dir") + "\\browserDrivres\\chromedriver.exe";
	public final static String FIREFOXE_DRIVRE_PATH= System.getProperty("user.dir") + "\\browserDrivres\\geckodriver.exe";
	public final static String IE_DRIVRE_PATH= System.getProperty("user.dir") + "\\browserDrivres\\IEDriverServer.exe";
	public final static int PAGE_TIME_OUT= 60;   
	public final static int IMPLICIT_WAIT_TIME=60;
}
