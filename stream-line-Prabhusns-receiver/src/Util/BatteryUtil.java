package Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class BatteryUtil {

	public static List<Double> socValues = new ArrayList<Double>();
	public static List<Double> crValues = new ArrayList<Double>();
	public static List<Double> tempValues = new ArrayList<Double>();

	public static void mapReadingsFromConsole(Double tempVal, Double socVal, Double crVal) {
		socValues.add(socVal);
		tempValues.add(tempVal);
		crValues.add(crVal);
	}

	public static void mapReadingsFromConsole(List<Double> socList, List<Double> crList, List<Double> tempList) {
		socValues.addAll(socList);
		tempValues.addAll(tempList);
		crValues.addAll(crList);
	}

	public static Double calculateMinValue(List<Double> readingValues) {
		if (readingValues != null && readingValues.size() > 0)
			return Collections.min(readingValues);
		return null;
	}

	public static Double calculateMaxValue(List<Double> readingValues) {
		if (readingValues != null && readingValues.size() > 0)
			return Collections.max(readingValues);
		return null;
	}

	public static Double calculateAvgValue(List<Double> readingValues) {
		if (readingValues != null && readingValues.size() > 0)
			return readingValues.subList(Math.max(readingValues.size() - 5, 0), readingValues.size()).stream()
					.collect(Collectors.averagingDouble(x -> x));
		return null;
	}

	public static void printProcessedData(String parameterName, List<Double> readingValues) {
		if (readingValues != null && readingValues.size() > 0) {
			if (readingValues.size() > 5) {
				double avgVal = calculateAvgValue(readingValues);
				System.out.println(
						parameterName + " readings" + readingValues + ", Min:" + calculateMinValue(readingValues)
								+ ", Max: " + calculateMaxValue(readingValues) + ", Avg of last 5 values:" + avgVal);
			} else {
				System.out.println(parameterName + " readings" + readingValues + ", Min:"
						+ calculateMinValue(readingValues) + ", Max: " + calculateMaxValue(readingValues));
			}
		}
	}
}