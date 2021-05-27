package com.coolcats.cooltesting101

import junit.framework.TestCase
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test

class CalculatorTest{

    private var calculator: Calculator? = null

    @Before
    fun setUp(){
        calculator = Calculator()
    }

    @Test
    fun `test code to make sure addition works`(){
        assertEquals( 10, calculator?.addition(7, 3))
    }

    @Test
    fun `test code to make sure multiplication works`(){
        assertEquals(20, calculator?.multiplication(5, 4))
    }

    @Test
    fun `test code to make sure division works`(){
        assertEquals(5, calculator?.division(20, 4))
    }

    @Test
    fun `test code to make sure modulus works`(){
        assertEquals(0, calculator?.modulus(25, 5))
    }

    @Test
    fun `test code to make sure modules works`(){
        assertEquals(1, calculator?.modulus(26, 5))
    }

    @Test
    fun `test code to make sure subtraction`(){
        assertEquals(10, calculator?.subtraction(225, 115))
    }

    @Test
    fun calculateWeeklyRate(){
        assertEquals(784, calculator?.multiplication(28, 40))
    }

    @Test
    fun calculateMonthlyRate() {
        assertEquals(0, calculator?. multiplication (28, 160))
    }

    @Test
    fun calcualteYearlyRate(){
        assertNotEquals(0, calculator?.multiplication(28, 53))
    }

    @Test
    fun `test code to make sure taxCalulation works`(){
        assertNotEquals(0, calculator?.taxCalulation(28.0, 53.0, 0.35))
    }
    @After
    fun tearDown(){

    }


}