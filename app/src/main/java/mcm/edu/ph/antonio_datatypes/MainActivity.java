package mcm.edu.ph.antonio_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        String firstName = "Duke Jero Antonio";
        char middleInitial = 'F';
        String lastName = "Antonio";
        int myAge = 19;
        float myDreamTVLGrade = 95.0f;


        //String.valueOf(myMoney)
        display.setText("My name is "+ firstName+" "
                + String.valueOf(middleInitial)+ " "
                +lastName+ "\nand my age is "
                +myAge+ ". \nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

    }
}