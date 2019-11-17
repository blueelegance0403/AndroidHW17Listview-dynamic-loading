package com.example.androidhw17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView=(ListView)findViewById(R.id.listview);
        final TextView textView=(TextView)findViewById(R.id.textView);

        ArrayAdapter<CharSequence>arrayAdapt=ArrayAdapter.
                createFromResource(MainActivity.this,R.array.list,
                        android.R.layout.simple_list_item_single_choice);
        listView.setAdapter(arrayAdapt);
        listView.setSelector(R.color.colorPrimary);
        listView.setSelection(0);

        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                textView.setText("你選擇了:"+((TextView) view).getText());
            }
        });

    }
}
