package Utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class CustomHolidays {
    public final Set<MonthDay> holidays = new HashSet<>();
    public CustomHolidays(){
        addHoliday(MonthDay.of(Month.JANUARY,26));
        addHoliday(MonthDay.of(Month.APRIL,14));
        addHoliday(MonthDay.of(Month.APRIL,15));
        addHoliday(MonthDay.of(Month.MAY,3));
        addHoliday(MonthDay.of(Month.MAY,16));
        addHoliday(MonthDay.of(Month.JULY,10));
        addHoliday(MonthDay.of(Month.AUGUST,9));
        addHoliday(MonthDay.of(Month.AUGUST,15));
        addHoliday(MonthDay.of(Month.OCTOBER,2));
        addHoliday(MonthDay.of(Month.OCTOBER,5));
        addHoliday(MonthDay.of(Month.OCTOBER,7));
        addHoliday(MonthDay.of(Month.OCTOBER,24));
        addHoliday(MonthDay.of(Month.NOVEMBER,8));
        addHoliday(MonthDay.of(Month.DECEMBER,25));
    }

    public void addHoliday(final MonthDay monthDay) {
        holidays.add(monthDay);
    }

    public boolean isHoliday(final LocalDate localDate) {
        return isWeekend(localDate) || holidays.contains(toMonthDay(localDate));
    }

    public int numberOfWorkdaysBetween(LocalDate startInclusive, LocalDate endInclusive) {
        int c = 0;
        for (LocalDate i = startInclusive; !i.isAfter(endInclusive); i = i.plusDays(1)) {
            if (!isHoliday(i)) {
                c++;
            }
        }
        return c;
    }

    private boolean isWeekend(final LocalDate localDate) {
        final DayOfWeek dow = localDate.getDayOfWeek();
        return dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY;
    }

    private static MonthDay toMonthDay(final LocalDate localDate) {
        return MonthDay.of(localDate.getMonth(), localDate.getDayOfMonth());
    }

//    public static void main(String[] args) {
//        final CustomHolidays ch = new CustomHolidays();
//        ch.addHoliday(MonthDay.of(Month.MAY, 1));
//        ch.addHoliday(MonthDay.of(Month.MAY, 2));
//        ch.addHoliday(MonthDay.of(Month.MAY, 3));
//
//        System.out.println(ch.numberOfWorkdaysBetween(LocalDate.of(2018, 5, 1), LocalDate.of(2018, 5, 8)));
//    }
}
