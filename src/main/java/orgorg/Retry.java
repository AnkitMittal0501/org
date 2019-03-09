package orgorg;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

	public boolean retry(ITestResult result) {
		for (int i = 0; i < 5; i++) {
			System.out.println(result.getName());
			System.out.println("Retry "+i);
		}
		return false;
	}

}
