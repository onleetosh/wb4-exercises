/***
 * The purpose of this exercise is to encapsulate a class with only static methods.
 * In essence the class will be a name formatting factory. The class acts as a library
 * of functions that are used to standardize the way a name should be formatted
 *
 */

package com.pluralsight;

import java.util.Scanner;

public class NameFormatter {


    //private constructor
    private NameFormatter(){

    }

    public static String format(String firstName, String lastName) {
        return firstName.trim() + " " + lastName.trim();

    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {

        return prefix.trim() + " " + firstName.trim() + " " + middleName.trim() + " " + lastName.trim() + " " + suffix.trim();

    }

    public static String format(String fullName) {
        return fullName.trim();
    }

}
