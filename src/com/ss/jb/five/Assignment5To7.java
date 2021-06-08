package com.ss.jb.five;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.*;
import java.time.temporal.*;
import java.util.Locale;


public class Assignment5To7 {
    //This is the method for lengths of each month in a year
    private static void printMonthLength (int year){
        Year yr = Year.of(year);
        for (Month month: Month.values()){
            YearMonth ym = YearMonth.of (year, month);
            System.out.println(month + ": " + ym.lengthOfMonth() + " days");
        }
    }

    /**
     * Method for printing all mondays of a month in current year
     * @param month the month specified for monday printing
     */
    private static void printMondays (String month){
        Month m = Month.valueOf(month.toUpperCase());
        LocalDate date = Year.now().atMonth(m).atDay(1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month referenceMonth = date.getMonth();
        while (referenceMonth == m){
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            referenceMonth = date.getMonth();
        }
    }

    /**
     * Method for querying whether a date is a friday the 13th
     * @param m month
     * @param day day
     * @return true or false if is friday the 13th
     */
    private static boolean fridayTheThirteenth (String m, int day){
        Month month = Month.valueOf(m.toUpperCase());
        LocalDate date = Year.now().atMonth(month).atDay(day);
        return date.query(new FridayThirteenthQuery());
    }

    //class for querying a date
    static class FridayThirteenthQuery implements TemporalQuery<Boolean>{
        @Override
        public Boolean queryFrom(TemporalAccessor temporal) {
            return (temporal.get(ChronoField.DAY_OF_MONTH) == 13) &&
                    (temporal.get(ChronoField.DAY_OF_WEEK) == 5);
        }
    }

    public static class Assignment5To7TestHook{
        private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        private final PrintStream printStream = new PrintStream(outputStream);
        private final PrintStream old = System.out;

        private void resetStreamOut (){
            System.out.flush();
            System.setOut(old);
        }

        public String printMonthLength (int year){
            System.setOut (printStream);
            Assignment5To7.printMonthLength(year);
            String result = outputStream.toString();
            resetStreamOut();
            return result;
        }

        public String printMondays (String month){
            System.setOut(printStream);
            Assignment5To7.printMondays(month);
            String result = outputStream.toString();
            resetStreamOut();
            return result;
        }

        public boolean fridayTheThirteenth (String m, int day){
            return Assignment5To7.fridayTheThirteenth(m, day);
        }
    }
}
