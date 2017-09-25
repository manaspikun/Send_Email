package com.example.manas.send_email;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1= (EditText) findViewById(R.id.id);
        ed2= (EditText) findViewById(R.id.message);
        ed3= (EditText) findViewById(R.id.sub);
        b1= (Button) findViewById(R.id.send);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String to=ed1.getText().toString();
                String sub=ed2.getText().toString();
                String message=ed3.getText().toString();
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_EMAIL,new String[] {to});
                intent.putExtra(intent.EXTRA_EMAIL,sub);
                intent.putExtra(intent.EXTRA_EMAIL,message);
                intent.setType("plain/text");

                startActivity(intent.createChooser(intent,"Select Action"));

            }
        });
    }
}
