package sg.edu.rp.c346.customdate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
/*
    Calendar now = Calendar.getInstance();  //Create a Calendar object with current date and time
    String datetime = now.get(Calendar.DAY_OF_MONTH) + "/" +
            (now.get(Calendar.MONTH)+1) + "/" +
            now.get(Calendar.YEAR) + " " +
            now.get(Calendar.HOUR_OF_DAY) + ":" +
            now.get(Calendar.MINUTE);

*/

    ListView lvTodo;
    ArrayList<TodoItem> alTodoList;
    CustomAdapter caTodo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.listViewTodo);

        alTodoList = new ArrayList<>();
        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);
        TodoItem todo1 = new TodoItem("MSA" ,date1);

        alTodoList.add(todo1);

        caTodo = new CustomAdapter(this,R.layout.todo_item, alTodoList);

        lvTodo.setAdapter(caTodo);


    }
}
