package com.tuychiev.javatpoint;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author toir427
 * @link http://tuychiev.com
 * @since 10/22/21
 */
public class Date {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.printf("Display the current date: %s\n", localDate);
        System.out.printf("Display the current time: %s\n", localTime);
        System.out.printf("Display the current date and time: %s\n", localDateTime);
        System.out.printf("Display the current date and time with formatter: %s\n", dateTimeFormatter);
    }
}
