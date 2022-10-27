import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import Util.BatteryUtil;
import Util.Constants;

public class Main {

	public static void main(String[] args) {

		getInputFromConsole();

	}

	public static void getInputFromConsole() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		System.out.println("Please enter temparture,soc,charging rate readings as x,y,z -> 200,20,1");
		try {
			while ((line = br.readLine()) != null) {
				// validate the entered value
				String[] values = line.split(",");
				if (values.length == 3) {
					Double tempVal = Double.parseDouble(values[0]);
					Double socVal = Double.parseDouble(values[1]);
					Double crVal = Double.parseDouble(values[2]);

					BatteryUtil.mapReadingsFromConsole(tempVal, socVal, crVal);
					BatteryUtil.printProcessedData(Constants.tempStr, BatteryUtil.tempValues);
					BatteryUtil.printProcessedData(Constants.socStr, BatteryUtil.socValues);
					BatteryUtil.printProcessedData(Constants.crStr, BatteryUtil.crValues);

					System.out.println("Please enter temp reading and soc reading as x,y -> 200,20");
				} else {
					System.out.println("Invalid reading data, please reenter proper reading");
					System.out.println("Please enter temp reading and soc reading as x,y -> 200,20");
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid reading data, please reenter proper reading");
			getInputFromConsole();
		} catch (IOException e) {
			System.out.println("Invalid reading data");
			getInputFromConsole();

		}
	}

}