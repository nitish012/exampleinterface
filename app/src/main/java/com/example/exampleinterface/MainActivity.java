package com.example.exampleinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         editText1=findViewById(R.id.e1);
         editText2=findViewById(R.id.e2);
         editText3=findViewById(R.id.e3);
         editText4=findViewById(R.id.e4);




    }

    public void Data(View view) {


        Intent intent=new Intent(this,result.class);

        intent.putExtra("int",Integer.parseInt(editText1.getText().toString()));
        intent.putExtra("string",editText2.getText().toString());
        intent.putExtra("int",Float.parseFloat(editText3.getText().toString()));
        intent.putExtra("int",Long.parseLong(editText4.getText().toString()));

        startActivityForResult(intent,1);

    }



}
