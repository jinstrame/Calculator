package javaLab.calculator;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class FlowCalculatorTest {
    @Test
    public void testCalculate() {
        Calculator calculator = new FlowCalculator();

        assertThat(calculator.getSolve("((5+3)*21)/3"), equalTo(56.0));
    }
}