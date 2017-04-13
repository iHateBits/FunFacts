package com.example.imarin.funfacts;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    /*
        Added this simple comment just to test how android studio, and github work together.
     */
    // view variables:
    private TextView mFactTextView;
    private Button mShowFactButton;
    private ConstraintLayout mConstraintLayout;
    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // assign view variables:
        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        mFactTextView = (TextView) findViewById(R.id.factTextView);
        mShowFactButton = (Button) findViewById(R.id.showFactButton);
        mShowFactButton.setOnClickListener(factButtonListener);
    }

    // OnclickListener - button event listener to change the fun fact.
    View.OnClickListener factButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int color = mFactBook.getBackgroundColor();
            mFactTextView.setText( mFactBook.getFact() );
            mShowFactButton.setTextColor(color);
            mConstraintLayout.setBackgroundColor(color);
        }
    };

}
