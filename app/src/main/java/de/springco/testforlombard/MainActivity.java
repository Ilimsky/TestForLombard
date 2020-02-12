package de.springco.testforlombard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNewLoan = (Button) findViewById(R.id.button_new_loan);
        TableRow tableRow = (TableRow) findViewById(R.id.table_row);

        buttonNewLoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewLoanActivity.class);
                startActivity(intent);
            }
        });

        tableRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FullInfoActivity.class);
                startActivity(intent);
            }
        });
    }


}
