package com.android.mounika.sharedprefassign;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences=getSharedPreferences("Mouni",MODE_PRIVATE);
    }


    public void saveName(View View){
        EditText name= (EditText) findViewById(R.id.editText);
        String EnterName=name.getText().toString();
        EditText age= (EditText) findViewById(R.id.editText2);
        String EnterAge=age.getText().toString();
        EditText Phone= (EditText) findViewById(R.id.editText3);
        String EnterPhone=Phone.getText().toString();
        EditText City= (EditText) findViewById(R.id.editText4);
        String Entercity=City.getText().toString();

        preferences.edit().putString("username",EnterName).putString("userage", EnterAge).putString("userphone", EnterPhone).putString("usercity", Entercity).commit();
        Toast.makeText(MainActivity.this,"saved..",Toast.LENGTH_LONG).show();

    }
    public void showName(View View){
         String name=preferences.getString("username","");
         String age=preferences.getString("userage", "");
        String phone=preferences.getString("userphone", "");
        String city=preferences.getString("usercity", "");

         String text="Name:" + name +    "Age:"+age+   "phone:"+phone+   "City"+city ;
         Toast.makeText(MainActivity.this,""+text,Toast.LENGTH_LONG).show();


    }
}
