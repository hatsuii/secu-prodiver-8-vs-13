package demosecu;

import java.security.Provider;
import java.security.Provider.Service;
import java.security.Security;

public class DemoProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		Provider provider = Security.getProvider("SunJCE");
		System.out.println("Service du provider" + provider.getName());

		for (Service service : provider.getServices()) {
			System.out.println("\t" + service.getType() + " " + service.getAlgorithm());
			i++;
		}

		System.out.println(i + " Providers found");

	}

}
