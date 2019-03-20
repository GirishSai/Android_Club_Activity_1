package in.blueoc.newtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView showValue,value;
    int counter=0,amount=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue = (TextView) findViewById(R.id.counterValue);
        value = (TextView) findViewById(R.id.Amount);
    }

    public void countIN(View view)
    {
        counter++;
        showValue.setText(Integer.toString(counter));
        amount=counter*10;
        showValue.setText(String.valueOf(amount));
    }

    public void countDE(View v)
    {
        counter--;
        showValue.setText(Integer.toString(counter));
        amount=counter*10;
        showValue.setText(String.valueOf(amount));
    }

    public void resetCount(View view)
    {
        counter=0;
        showValue.setText(String.valueOf(counter));
        amount=counter*10;
        showValue.setText(String.valueOf(amount));
    }

}