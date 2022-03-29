package com.company.timePackage;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 5:10 PM
 */
public class Example3 {

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

        //util.time, Date, Calendar (legacy)
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss dd:MM:YYYY");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));


        Period p1 = Period.ofDays(10);
        Period p2 = Period.of(1,5,10);
        Period p3 = Period.between(LocalDate.of(2020,5,10),LocalDate.now());

//        Duration

    }
}
