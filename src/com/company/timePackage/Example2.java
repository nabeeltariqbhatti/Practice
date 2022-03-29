package com.company.timePackage;

import java.time.*;

/**
 * @author is Nabeel Tariq Bhatti
 * @created at 3/27/2022
 * @Time at 5:10 PM
 */
public class Example2 {

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

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(2022,3,27,1,0,0), ZoneId.systemDefault());

        System.out.println(zonedDateTime);
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }
}
