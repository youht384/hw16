package com.example.hw16;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        listView = (ListView) findViewById(R.id.ListView);
        listView.setOnItemClickListener(listViewOnClickListener);


    }

    private AdapterView.OnItemClickListener listViewOnClickListener
            = new AdapterView.OnItemClickListener()
    {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id)
        {
            // TODO Auto-generated method stub

            textView.setText("你選擇了: " + ((TextView) view).getText());
        }
    };

}

