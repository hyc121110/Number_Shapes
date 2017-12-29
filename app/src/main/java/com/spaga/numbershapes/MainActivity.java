package com.spaga.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isTriangular() {
            int x = 1;
            int triangular = 1;

            while (triangular < number) {
                x++;
                triangular += x;
            }
            if (triangular == number)
                return true;
            return false;
        }

        public boolean isSquare() {
            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot))
                return true;
            return false;
        }
    }

    public void testNumber(View view) {
        EditText usersNumber = findViewById(R.id.usersNumber);

        String msg = "";
        Number myNumber= new Number();
        myNumber.number = Integer.parseInt(usersNumber.getText().toString());

        if (myNumber.isSquare()) {
            if (myNumber.isTriangular())
                msg = myNumber.number + " is both triangular and square!";
            else
                msg = myNumber.number + " is a square number but not a triangular number!";
        } else {
            if (myNumber.isTriangular())
                msg = myNumber.number + " is a triangular number but not a square number!";
            else
                msg = myNumber.number + " is neither a square nor triangular number.";
        }



        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        System.out.println(msg);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
