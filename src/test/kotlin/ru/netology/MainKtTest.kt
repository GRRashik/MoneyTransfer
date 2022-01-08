package ru.netology

import ifTypeCard
import org.junit.Test

import org.junit.Assert.*
import transferVkPay

class MainKtTest {

    @Test
    fun transferVkPayTest(){
        //arrange
        val ammount = 123456
        val expectedResult = 123456
        //act
        val actualResult = transferVkPay(ammount)
        //assert
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun select_vkpay_transfer() {
        // arrange
        val type = "VK Pay"
        val amount = 123456
        val expectedResult = 123456
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun select_mir_transfer_1() {
        // arrange
        val type = "Мир"
        val amount = 1234
        val expectedResult = 4734
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun select_mir_transfer_2() {
        // arrange
        val type = "Мир"
        val amount = 1234567
        val expectedResult = 1243826
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun select_visa_transfer_1() {
        // arrange
        val type = "Visa"
        val amount = 5432
        val expectedResult = 8932
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }
    @Test
    fun select_visa_transfer_2() {
        // arrange
        val type = "Visa"
        val amount = 654321
        val expectedResult = 659228
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun select_mastercard_transfer_1() {
        // arrange
        val type = "Mastercard"
        val amount = 5566778
        val expectedResult = 5566778
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun select_mastercard_transfer_2() {
        // arrange
        val type = "Mastercard"
        val amount = 7600000
        val expectedResult = 7647600
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun select_maestro_transfer_1() {
        // arrange
        val type = "Maestro"
        val amount = 1234567
        val expectedResult = 1234567
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun select_maestro_transfer_2() {
        // arrange
        val type = "Maestro"
        val amount = 7766554
        val expectedResult = 7815153
        // act
        val actualResult = ifTypeCard(type, amount)
        // assert
        assertEquals(expectedResult, actualResult)
    }



}