package com.company.timePackage;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.Temporal;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 5:10 PM
 */
public class Example1 {

    public static void main(String[] args) {
        /**
         * LocalTime
         * LocalDate
         * LocalDateTime
         * ZonedDateTime
         * ZoneId
         * Instant
         * Duration
         * Period
         */

        LocalTime localTime = LocalTime.now();

        System.out.println(localTime);

        LocalDate now = LocalDate.now();

        System.out.println(now);

        LocalTime of =  LocalTime.of(14, 34);

        System.out.println(of);

        System.out.println(localTime.minusHours(1));

        System.out.println(localTime.withHour(1));
    }
}
