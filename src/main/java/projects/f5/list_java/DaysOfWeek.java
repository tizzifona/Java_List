package projects.f5.list_java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeek {
    public List<String> days;

    public DaysOfWeek() {
        createList();
    }

    public void createList() {
        days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
    }

    public List<String> getDays() {
        return new ArrayList<>(days);
    }

    public int getListSize() {
        return days.size();
    }

    public void removeDay(String day) {
        days.remove(day);
    }

    public String getDay(int index) {
        if (index >= 0 && index < days.size()) {
            return days.get(index);
        }
        return null;
    }

    public boolean containsDay(String day) {
        return days.contains(day);
    }

    public void sortDaysAlphabetically() {
        Collections.sort(days);
    }

    public void clearList() {
        days.clear();
    }

}
