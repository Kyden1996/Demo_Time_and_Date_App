package sg.edu.rp.c346.id21030068.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnReset = findViewById(R.id.buttonReset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int h = tp.getCurrentHour();
                int m = tp.getCurrentMinute();
                if (m < 10){
                    String message = "Time is " + h + ":0" + m;
                    tvDisplay.setText(message);
                }else{
                    String message = "Time is " + h + ":" + m;
                    tvDisplay.setText(message);
                }
                    }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int d = dp.getDayOfMonth();
                int m = dp.getMonth();
                int y = dp.getYear();

                String message = "Date is " + d + "/" + (m + 1) + "/" + y;
                tvDisplay.setText(message);

            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dp.updateDate(2020,01,01);
                tp.setCurrentHour(00);
                tp.setCurrentMinute(00);


            }
        });



    }
}