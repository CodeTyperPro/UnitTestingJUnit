package com.example.unittestingjunit

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun emptyUsernameReturnsFalse(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun validUsernameAndCorrectlyRepeatedPasswordReturnsTrue(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Énio",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun usernameAlreadyExistsReturnsFalse(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Énio",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }
}