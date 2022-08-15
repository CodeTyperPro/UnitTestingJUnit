package com.example.unittestingjunit

object RegistrationUtil {

    final val existingUses = listOf("Peter" , "Carl");

    /**
     *
     * The input is not valid if ...
     * the username passowrod is empty
     * ... the username is already taken
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ) : Boolean{

        if(username.isEmpty() || password.isEmpty()){
            return false;
        }

        if(username in existingUses){
            return false;
        }

        if(password != confirmedPassword){
            return false;
        }

        if(password.count{
            it.isDigit()
            } < 2){
            return false;
        }

        return true;
    }
}