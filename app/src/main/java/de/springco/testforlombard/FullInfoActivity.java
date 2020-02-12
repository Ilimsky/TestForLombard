package de.springco.testforlombard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FullInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_info);

        Button extensionButton = (Button) findViewById(R.id.button_extension);
        Button closeButton = (Button) findViewById(R.id.button_close);

        extensionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullInfoActivity.this, ExtensionActivity.class);
                startActivity(intent);
            }
        });

        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FullInfoActivity.this, CloseActivity.class);
                startActivity(intent);
            }
        });
    }
}
