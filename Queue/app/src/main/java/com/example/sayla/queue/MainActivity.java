package com.example.sayla.queue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] arr = new int[10];
    int start=0;
    int move=-1;
    int end = arr.length;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }


    public void push(View v){
        EditText txt = (EditText) findViewById(R.id.edtxt);
        try {
            move++;
            arr[move] = Integer.parseInt(txt.getText().toString());
        }
        catch(ArrayIndexOutOfBoundsException ex){
            Toast.makeText(MainActivity.this, "Queue is full", Toast.LENGTH_SHORT).show();
        }
        catch(Exception ex){
            Toast.makeText(MainActivity.this, "Write only Number", Toast.LENGTH_SHORT).show();
        }


    }




    public  void pop (View  v){
        start++;
    }
    public void display(View v){

    }


}
