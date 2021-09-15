import java.time.*;
import java.time.temporal.*;
public class DateTimeAPIQuestions {
/* 
1. The LocalDateTime class would be used to store a birthday in years, months, days, seconds, and nanoseconds.
2. date.with(TemporalAdjuster.previous(DayOfWeek.THURSDAY)) would be used to find the date of the previous Thursday.
3. ZoneOffset uses only absolute offset from UTC time, while ZoneId looks at absolute offset + regional/yearly zone rules (such as daylight savings).
4. Instant->ZonedDateTime: ZonedDateTime zdt = ZonedDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
    ZonedDateTime -> Instant: Instant inst = ZonedDateTime.now().toInstant();
    
*/
    public static void number5(int y){
         for (Month month : Month.values()) {
            YearMonth ym = YearMonth.of(y, month);
            System.out.printf("%s: %d days%n", month, ym.lengthOfMonth());
        }
    }
    public static void number6(Month m){
        LocalDate date = Year.now().atMonth(m).atDay(1).
              with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        Month mi = date.getMonth();
        while (mi == m) {
            System.out.printf("%s%n", date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            mi = date.getMonth();
        }
    }
    public static void number7(TemporalAccessor date){
        if (((date.get(ChronoField.DAY_OF_MONTH) == 13) &&(date.get(ChronoField.DAY_OF_WEEK) == 5))==true)
        System.out.println("It is a Friday the 13th");
        else System.out.println("It is not an unlucky date");
    }
    public static void main(String args[]) {
      number5(1996);
      Month ap=Month.valueOf("april".toUpperCase());
      System.out.println();
      number6(ap);
    }
}