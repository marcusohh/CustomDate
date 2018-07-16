package sg.edu.rp.c346.customdate;

import java.util.Calendar;

/**
 * Created by 16020089 on 16/7/2018.
 */

public class TodoItem {

    private String name;
    private Calendar date;

    public TodoItem(String name, Calendar date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
