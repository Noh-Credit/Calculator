package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    boolean isFirstInput = true; // 입력 값이 처음 입력되는가를 체크
    int resultNumber = 0; // 계산된 결과 값을 저장하는 변수
    char operator = '+'; // 입력된 연산자를 저장하는 변수

    TextView resultText;

    Button num0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultText = findViewById(R.id.result_text);
    }

    @SuppressLint("ResourceType")
    public void buttonClick(View view) {
        Button getButton = findViewById(view.getId());
        if (view.getId() == R.id.all_clear_button)
        {
            isFirstInput = true;
            resultNumber = 0;
            operator = '+';
            resultText.setTextColor(0xff666666);
            resultText.setText(String.valueOf(resultNumber));
        }
        else if (view.getId() == R.id.addition_button)
        {
            int lastNum = Integer.parseInt(resultText.getText().toString());
            if (operator == '+') {
                resultNumber = resultNumber + lastNum;
            } else if (operator == '-') {
                resultNumber = resultNumber - lastNum;
            } else if (operator == '/') {
                resultNumber = resultNumber / lastNum;
            } else if (operator == '*') {
                resultNumber = resultNumber * lastNum;
            }
            operator = getButton.getText().toString().charAt(0);
            resultText.setText(String.valueOf(resultNumber));
            isFirstInput = true;
        }
        else if (view.getId() == R.id.subtraction_button)
        {
            int lastNum = Integer.parseInt(resultText.getText().toString());
            if (operator == '+') {
                resultNumber = resultNumber + lastNum;
            } else if (operator == '-') {
                resultNumber = resultNumber - lastNum;
            } else if (operator == '/') {
                resultNumber = resultNumber / lastNum;
            } else if (operator == '*') {
                resultNumber = resultNumber * lastNum;
            }
            operator = getButton.getText().toString().charAt(0);
            resultText.setText(String.valueOf(resultNumber));
            isFirstInput = true;
        }
        else if (view.getId() == R.id.division_button)
        {
            int lastNum = Integer.parseInt(resultText.getText().toString());
            if (operator == '+')
            {
                resultNumber = resultNumber + lastNum;
            }

            else if (operator == '-')
            {
                resultNumber = resultNumber - lastNum;
            }

            else if (operator == '/')
            {
                resultNumber = resultNumber / lastNum;
            }

            else if (operator == '*')
            {
                resultNumber = resultNumber * lastNum;
            }
            operator = getButton.getText().toString().charAt(0);
            resultText.setText(String.valueOf(resultNumber));
            isFirstInput = true;
        }
        else if (view.getId() == R.id.multiply_button)
        {
            int lastNum = Integer.parseInt(resultText.getText().toString());
            if (operator == '+')
            {
                resultNumber = resultNumber + lastNum;
            }

            else if (operator == '-')
            {
                resultNumber = resultNumber - lastNum;
            }

            else if (operator == '/')
            {
                resultNumber = resultNumber / lastNum;
            }

            else if (operator == '*')
            {
                resultNumber = resultNumber * lastNum;
            }

            operator = getButton.getText().toString().charAt(0);
            resultText.setText(String.valueOf(resultNumber));
            isFirstInput = true;
        }


        else if(view.getId() == R.id.result_button)
        {
            if (operator == '+')
            {
                resultNumber = resultNumber + Integer.parseInt(resultText.getText().toString());
            }

            else if (operator == '-')
            {
                resultNumber = resultNumber - Integer.parseInt(resultText.getText().toString());
            }

            else if (operator == '/')
            {
                resultNumber = resultNumber / Integer.parseInt(resultText.getText().toString());
            }

            else if (operator == '*')
            {
                resultNumber = resultNumber * Integer.parseInt(resultText.getText().toString());
            }
            resultText.setText(String.valueOf(resultNumber));
            isFirstInput = true;
        }


        if (view.getId() == R.id.num_0_button
                || view.getId() == R.id.num_1_button
                || view.getId() == R.id.num_2_button
                || view.getId() == R.id.num_3_button
                || view.getId() == R.id.num_4_button
                || view.getId() == R.id.num_5_button
                || view.getId() == R.id.num_6_button
                || view.getId() == R.id.num_7_button
                || view.getId() == R.id.num_8_button
                || view.getId() == R.id.num_9_button) {
            if (isFirstInput) {
                resultText.setTextColor(0xff000000);
                resultText.setText(getButton.getText().toString());
                isFirstInput = false;
            } else {
                resultText.append(getButton.getText().toString());
            }
        } else {
            //Log.e(tag."buttonClick", "default" + getButton.getText().toString() + " 버튼이 클릭되었습니다.");
        }

    }
}