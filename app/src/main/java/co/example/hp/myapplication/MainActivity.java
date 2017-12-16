package co.example.hp.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Integer i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         final TextView text = (TextView) findViewById(R.id.text);
        Button button = (Button) findViewById(R.id.button);
        text.setText("0");


        text.setText(""+i);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer integer = i + 1;
                text.setText(""+integer);
                i++;

            }
        } );

    }

}
