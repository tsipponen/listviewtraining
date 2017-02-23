package com.example.listviewtraining;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

public class ListViewActivity extends Activity {

    ArrayList<String> list = new ArrayList<String>();
    MyCustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_list_view);

        adapter = new MyCustomAdapter(list,this);

        ListView lView = (ListView)findViewById(R.id.list_view);
        lView.setAdapter(adapter);
    }

    public void addItems(View v){
        EditText edit = (EditText)findViewById(R.id.myText);
        list.add(edit.getText().toString());
        edit.setText(null);
        adapter.notifyDataSetChanged();
    }
}
