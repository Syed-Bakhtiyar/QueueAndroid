package com.example.sayla.queue;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] arr = new int[10];
    int start=0;
    int move=-1;
    //int end = arr.length;
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
            txt.setText("");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            Toast.makeText(MainActivity.this, "Queue is full", Toast.LENGTH_SHORT).show();
            txt.setText("");
        }
        catch(Exception ex){
            Toast.makeText(MainActivity.this, "Write only Number", Toast.LENGTH_SHORT).show();
            txt.setText("");
        }


    }




    public  void pop (View  v){
        if(move<0){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("There is no data to pop");
            builder.show();
        }else {
            start++;
        }
    }





    public void display(View v){
        TextView txt = (TextView) findViewById(R.id.txtv);
        txt.setText("");
        if(move<0){
            Toast.makeText(MainActivity.this, "There is no data to display", Toast.LENGTH_SHORT).show();
        }
        else {
            for (int i = start; i <= move; i++) {
                txt.setText(txt.getText().toString()+arr[i]+"\n");
            }
        }
    }




    public void reset (View v){
        TextView txtv = (TextView) findViewById(R.id.edtxt);
        txtv.setText("");
        txtv = (TextView) findViewById(R.id.txtv);
        txtv.setText("");
        start=0;
        move=-1;
    }


}
