package com.vinitvs.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CalcActivity extends Activity implements View.OnClickListener {

    //LinearLayout of numbers
    LinearLayout ll_zero;
    LinearLayout ll_one;
    LinearLayout ll_two;
    LinearLayout ll_three;
    LinearLayout ll_four;
    LinearLayout ll_five;
    LinearLayout ll_six;
    LinearLayout ll_seven;
    LinearLayout ll_eight;
    LinearLayout ll_nine;

    //LinearLayout of operations
    LinearLayout ll_add;
    LinearLayout ll_subtract;
    LinearLayout ll_multiply;
    LinearLayout ll_divide;

    //Button to clearAll all leftValue rightValue and Operations
    Button btn_clear;

    //Button for equalTo function
    Button btn_equal;

    //TextView to display final answer
    TextView txt_answer;

    //Global strings
    String leftValue = "";
    String rightValue = "";
    String operationName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        initializeView();
        //Setting onClickListeners for LinearLayout of numbers
        ll_zero.setOnClickListener(this);
        ll_one.setOnClickListener(this);
        ll_two.setOnClickListener(this);
        ll_three.setOnClickListener(this);
        ll_four.setOnClickListener(this);
        ll_five.setOnClickListener(this);
        ll_six.setOnClickListener(this);
        ll_seven.setOnClickListener(this);
        ll_eight.setOnClickListener(this);
        ll_nine.setOnClickListener(this);
        //Setting onClickListeners for LinearLayout of numbers
        ll_add.setOnClickListener(this);
        ll_subtract.setOnClickListener(this);
        ll_multiply.setOnClickListener(this);
        ll_divide.setOnClickListener(this);
        //Setting onClickListeners for Equal to button
        btn_equal.setOnClickListener(this);
        //Setting onClickListeners for Equal to button
        btn_clear.setOnClickListener(this);
    }

    void initializeView() {
        //Initialize TextView View for final answer
        txt_answer = findViewById(R.id.txt_answer);
        //Initialize Linear Layouts View of Numbers
        ll_zero = findViewById(R.id.ll_zero);
        ll_one = findViewById(R.id.ll_one);
        ll_two = findViewById(R.id.ll_two);
        ll_three = findViewById(R.id.ll_three);
        ll_four = findViewById(R.id.ll_four);
        ll_five = findViewById(R.id.ll_five);
        ll_six = findViewById(R.id.ll_six);
        ll_seven = findViewById(R.id.ll_seven);
        ll_eight = findViewById(R.id.ll_eight);
        ll_nine = findViewById(R.id.ll_nine);
        //Initialize Linear Layouts View of Operations
        ll_add = findViewById(R.id.ll_add);
        ll_subtract = findViewById(R.id.ll_subtract);
        ll_multiply = findViewById(R.id.ll_multiply);
        ll_divide = findViewById(R.id.ll_divide);
        //Initialize Button View for equal to button
        btn_equal = findViewById(R.id.btn_equal);
        //Initialize Button View for clear button
        btn_clear = findViewById(R.id.btn_clear);
    }


    void setLeftRightValue(String value) {
        if (leftValue.equals("") || operationName.equals("")) {
            leftValue = leftValue + value;
            txt_answer.setText(leftValue);

        } else {
            rightValue = rightValue + value;
            txt_answer.setText(rightValue);

        }
    }

    void clearAll() {
        leftValue = "";
        operationName = "";
        rightValue = "";
        txt_answer.setText("0");
    }

    void operationHandler() {
        switch (operationName) {

            case "ADD": {
                int left = Integer.parseInt(leftValue);
                int right = Integer.parseInt(rightValue);
                int result = left + right;
                txt_answer.setText(String.valueOf(result));
                leftValue = String.valueOf(result);
                rightValue = "";
                break;
            }
            case "SUBTRACT": {
                int left = Integer.parseInt(leftValue);
                int right = Integer.parseInt(rightValue);
                int result = left - right;
                txt_answer.setText(String.valueOf(result));
                leftValue = String.valueOf(result);
                rightValue = "";
                break;
            }
            case "MULTIPLY": {
                int left = Integer.parseInt(leftValue);
                int right = Integer.parseInt(rightValue);
                int result = left * right;
                txt_answer.setText(String.valueOf(result));
                leftValue = String.valueOf(result);
                rightValue = "";
                break;
            }
            case "DIVIDE": {

                int left = Integer.parseInt(leftValue);
                int right = Integer.parseInt(rightValue);
                int result = left / right;
                txt_answer.setText(String.valueOf(result));
                leftValue = String.valueOf(result);
                rightValue = "";
                break;
            }

        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ll_zero: {
                String layoutValue = "0";
                setLeftRightValue(layoutValue);
                break;
            }

            case R.id.ll_one: {
                String layoutValue = "1";
                setLeftRightValue(layoutValue);
                break;
            }
            case R.id.ll_two: {
                String layoutValue = "2";
                setLeftRightValue(layoutValue);
                break;
            }
            case R.id.ll_three: {
                String layoutValue = "3";
                setLeftRightValue(layoutValue);
                break;
            }
            case R.id.ll_four: {
                String layoutValue = "4";
                setLeftRightValue(layoutValue);
                break;
            }

            case R.id.ll_five: {
                String layoutValue = "5";
                setLeftRightValue(layoutValue);
                break;
            }

            case R.id.ll_six: {
                String layoutValue = "6";
                setLeftRightValue(layoutValue);
                break;
            }

            case R.id.ll_seven: {
                String layoutValue = "7";
                setLeftRightValue(layoutValue);
                break;
            }

            case R.id.ll_eight: {
                String layoutValue = "8";
                setLeftRightValue(layoutValue);
                break;
            }

            case R.id.ll_nine: {
                String layoutValue = "9";
                setLeftRightValue(layoutValue);
                break;
            }

            case R.id.ll_add: {
                if (rightValue.equals("") != true) {
                    operationHandler();
                } else {
                    operationName = "ADD";

                }
                break;
            }

            case R.id.ll_subtract: {
                if (rightValue.equals("") != true) {
                    operationHandler();
                } else {
                    operationName = "SUBTRACT";
                }
                break;
            }

            case R.id.ll_multiply: {
                if (rightValue.equals("") != true) {
                    operationHandler();
                } else {
                    operationName = "MULTIPLY";
                }
                break;
            }

            case R.id.ll_divide: {
                if (rightValue.equals("") != true) {
                    operationHandler();
                } else {
                    operationName = "DIVIDE";
                }
                break;
            }

            case R.id.btn_equal: {
                if (leftValue.equals("") != true & rightValue.equals("") != true && operationName.equals("") != true) {
                    operationHandler();
                }

                if (leftValue.equals("") == true & rightValue.equals("") == true && operationName.equals("") == true) {
                    clearAll();
                }

                if (rightValue.equals("") == true && leftValue.equals("") != true && operationName.equals("") != true) {
                    txt_answer.setText(leftValue);
                    operationName = "";
                }

                if (rightValue.equals("") == true && operationName.equals("") == true && leftValue.equals("") != true) {
                    txt_answer.setText(leftValue);
                }
                break;
            }

            case R.id.btn_clear: {
                clearAll();
                break;
            }
        }
    }
}
