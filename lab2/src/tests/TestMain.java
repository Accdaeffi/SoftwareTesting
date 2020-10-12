package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Main;

class TestMain {

	@ParameterizedTest
	@CsvSource({
		"-13, 8.32342931334835526139986804652012677689196177648113288829218, 0.00001",
		"-5, -14.71039706840404903345337261621642575199046046272663702102186273, 0.00001",
		"-3, 2296.3104834967403293254003682080696674800769757667293648237646577, 0.00001",
		"0, NaN, 0.1",
		"1, NaN, 0.1",
		"0.3, 3669.61, 0.1",
		"10, 56123.6, 0.1",
	})
	void test(double x, double result, double delta) {
		assertEquals(Main.finalFunction(x), result, delta);
		//assertEquals(Main.finalFunction(-3.14), 155421083513.02891, 0.00001);
	}
}
