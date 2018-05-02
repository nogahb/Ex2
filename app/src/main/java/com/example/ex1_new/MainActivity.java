package com.example.ex1_new;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    ListView list;
    ArrayList<String> msgList = new ArrayList<String>();
    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list);
        text = findViewById(R.id.edit_text);
        button = findViewById(R.id.button);
//        list.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View view) {
//
//                Bundle args = new Bundle();
//                MessageFragment fragment = new LongClickFragment();
//                fragment.setArguments(args);
//                fragment.message = message;
//                fragment.deleteHandler=deleteHandler;
//
//                return false;
//            }
//
//
//
//        });

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String currMsg = text.getText().toString();

                String time = DateFormat.getDateTimeInstance().format(new Date());
                msgList.add("The One and Only: " + currMsg + " " + time);
                text.setText("");
                ArrayAdapter<String> listAdapt = new ArrayAdapter<>(MainActivity.this,
                        android.R.layout.simple_list_item_1, msgList);
                list.setAdapter(listAdapt);
                listAdapt.notifyDataSetChanged();

            }
        });
    }

}


