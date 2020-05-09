package runTest;



import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
@cucumber.api.CucumberOptions(
		

		features = "./features/search_product.feature", 
		glue = "parallel.cucumber.stepDefs", 
		tags="@parallelRunner",
		monochrome = true, 
		dryRun = false, 
		strict = true, 
		
		plugin = {
				"pretty", "html:target/report/cucumber.html", "html:target/report/cucumber-pretty","json:target/report/cucumber.json",  }

)

public class RunBrowseSearchTest {
	
	@Test
	public void runCukes() {
		new TestNGCucumberRunner(getClass()).runCukes();
		
	}

}




	/*private TestNGCucumberRunner testNGCucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void features(CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider(parallel=true)
	public Object[][] features() {

		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void tearDownClass() {
		testNGCucumberRunner.finish();
	}
}
*/