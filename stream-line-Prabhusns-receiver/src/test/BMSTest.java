package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Util.BatteryUtil;

class BMSTest {
	List<Double> socValues = new ArrayList<Double>();
	List<Double> crValues = new ArrayList<Double>();
	List<Double> tempValues = new ArrayList<Double>();

	@BeforeEach
	void populateSampleData() {
		socValues = Arrays.asList(45.0D, 34.0D, 23.0D, 44.0D, 30.0D, 90D, 100D, 12D);
		crValues = Arrays.asList(451.0D, 341.0D, 231.0D, 441.0D, 301.0D, 901D, 1010D, 112D);
		tempValues = Arrays.asList(405.0D, 304.0D, 203.0D, 404.0D, 300.0D, 900D, 1000D, 102D);

	}

	@Test
	public void assertNullReadingsANdNotNullReadings() {
		List<Double> data = new ArrayList<>();

		assertNull(BatteryUtil.calculateMinValue(null));
		assertNull(BatteryUtil.calculateMaxValue(null));
		assertNull(BatteryUtil.calculateAvgValue(null));

		BatteryUtil.mapReadingsFromConsole(data, data, data);
		assertNull(BatteryUtil.calculateMinValue(data));
		assertNull(BatteryUtil.calculateMaxValue(data));
		assertNull(BatteryUtil.calculateAvgValue(data));
	}

	@Test
	public void calcTempTest() {
		assertNotNull(BatteryUtil.calculateMinValue(tempValues));
		assertNotNull(BatteryUtil.calculateMinValue(crValues));
		assertNotNull(BatteryUtil.calculateMinValue(socValues));
	}

	@Test
	public void calcSOCTest() {
		assertNotNull(BatteryUtil.calculateMaxValue(tempValues));
		assertNotNull(BatteryUtil.calculateMaxValue(socValues));
		assertNotNull(BatteryUtil.calculateMaxValue(crValues));
	}

	@Test
	public void calcCRTest() {
		assertNotNull(BatteryUtil.calculateAvgValue(tempValues));
		assertNotNull(BatteryUtil.calculateAvgValue(socValues));
		assertNotNull(BatteryUtil.calculateAvgValue(crValues));
	}

	@Test
	public void validArrayTest() {
		BatteryUtil.mapReadingsFromConsole(tempValues, socValues, crValues);
		assertTrue(BatteryUtil.crValues.size() > 0);
		assertTrue(BatteryUtil.socValues.size() > 0);
		assertTrue(BatteryUtil.tempValues.size() > 0);
	}

	@Test
	public void assertNullReadings() {
		assertNull(BatteryUtil.calculateMinValue(null));
		assertNull(BatteryUtil.calculateMaxValue(null));
		assertNull(BatteryUtil.calculateAvgValue(null));
	}

	@Test
	public void emptyArrayTest() {
		List<Double> data = new ArrayList<>();
		BatteryUtil.mapReadingsFromConsole(data, data, data);
		assertEquals(0, BatteryUtil.crValues.size());
		assertEquals(0, BatteryUtil.socValues.size());
		assertEquals(0, BatteryUtil.tempValues.size());
	}
}
