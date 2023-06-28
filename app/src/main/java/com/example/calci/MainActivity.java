package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2,op;
    TextView result;
    ImageView img;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        views();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=num1.getText().toString();
                float n1=Float.parseFloat(s);
                String n=num2.getText().toString();
                float n2=Float.parseFloat(n);
                String k=op.getText().toString();
                calculate(n1,n2,k);
            }
        });
    }
    public void views()
    {
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        op=findViewById(R.id.op);
        button=findViewById(R.id.button);
        result=findViewById(R.id.result);
        img=findViewById(R.id.img);
    }
    public void calculate(float n1,float n2,String k){
        Toast.makeText(MainActivity.this, "Calculated !!", Toast.LENGTH_SHORT).show();
        if (k.equals("+"))
        {
            float add=n1+n2;
            result.setText(n1+"+"+n2+"="+add);
        }
        else if (k.equals("-"))
        {
            float sub=n1-n2;
            result.setText(n1+"-"+n2+"="+sub);
        }
        else if (k.equals("*"))
        {
            float mult=n1*n2;
            result.setText(n1+"*"+n2+"="+mult);
        }
        else if (k.equals("/"))
        {
            float div1=n1/n2;
            result.setText(n1+"/"+n2+"="+div1);
        }
        else{
            result.setText("Enter valid operator !!");
        }
    }
}
