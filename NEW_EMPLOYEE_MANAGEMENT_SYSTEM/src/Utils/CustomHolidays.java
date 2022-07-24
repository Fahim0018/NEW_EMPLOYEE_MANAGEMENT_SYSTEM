package Utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.util.HashSet;
import java.util.Set;

public class CustomHolidays {
    private final Set<MonthDay> holidays = new HashSet<>();

    public void addHoliday(final MonthDay monthDay) {
        holidays.add(monthDay);
    }

    public boolean isHoliday(final LocalDate localDate) {
        return isWeekend(localDate) || holidays.contains(toMonthDay(localDate));
    }

    public int numberOfWorkdaysBetween(final LocalDate startInclusive, final LocalDate endInclusive) {
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