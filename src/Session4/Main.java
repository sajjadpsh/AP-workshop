package Session4;

import ir.huri.jcal.JalaliCalendar;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
//        System.out.println(java.time.LocalDate.now());
//        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(java.time.LocalDate.now());
//        ZonedDateTime date = gregorianCalendar.toZonedDateTime();
//        LocalDate date = LocalDate.now();
        JalaliCalendar jalaliCalendar = new JalaliCalendar();
        System.out.println(jalaliCalendar.toString());
    }
}
