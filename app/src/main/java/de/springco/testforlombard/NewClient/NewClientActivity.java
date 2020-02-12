package de.springco.testforlombard.NewClient;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.google.firebase.firestore.CollectionReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;

import de.springco.testforlombard.R;

public class NewClientActivity extends AppCompatActivity {

    private EditText editTextLastName;
    private EditText editTextFirstName;
    private EditText editTextPatronymic;
    private EditText editTextDateOfBirth;
    private EditText editTextPassport;
    private EditText editTextPhoneNumbers;
    private EditText editTextRegistrationAddress;
    private EditText editTextActualAddress;
    private EditText editTextPersonalID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_client);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("NewClientActivity");

        editTextLastName = findViewById(R.id.edit_text_last_name);
        editTextFirstName = findViewById(R.id.edit_text_first_name);
        editTextPatronymic = findViewById(R.id.edit_text_patronymic);
        editTextDateOfBirth = findViewById(R.id.edit_text_date_of_birth);
        editTextPassport = findViewById(R.id.edit_text_passport);
        editTextPhoneNumbers = findViewById(R.id.edit_text_phone_numbers);
        editTextRegistrationAddress = findViewById(R.id.edit_text_registration_address);
        editTextActualAddress = findViewById(R.id.edit_text_actual_address);
        editTextPersonalID = findViewById(R.id.edit_text_personal_id);

        editTextLastName.setInputType(InputType.TYPE_NULL);
        editTextFirstName.setInputType(InputType.TYPE_NULL);
        editTextPatronymic.setInputType(InputType.TYPE_NULL);
        editTextDateOfBirth.setInputType(InputType.TYPE_NULL);
        editTextPassport.setInputType(InputType.TYPE_NULL);
        editTextPhoneNumbers.setInputType(InputType.TYPE_NULL);
        editTextRegistrationAddress.setInputType(InputType.TYPE_NULL);
        editTextActualAddress.setInputType(InputType.TYPE_NULL);
        editTextPersonalID.setInputType(InputType.TYPE_NULL);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.new_client_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.save_note:
                saveNote();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void saveNote() {
        String lastName = editTextLastName.getText().toString();
        String firstName = editTextFirstName.getText().toString();
        String patronymic = editTextPatronymic.getText().toString();
        String dateOfBirth = editTextDateOfBirth.getText().toString();
        String passport = editTextPassport.getText().toString();
        String phoneNumbers = editTextPhoneNumbers.getText().toString();
        String registrationAddress = editTextRegistrationAddress.getText().toString();
        String actualAddress = editTextActualAddress.getText().toString();
        String personalID = editTextPersonalID.getText().toString();

        if (lastName.trim().isEmpty() || firstName.trim().isEmpty()) {
            Toast.makeText(this,
                    "Please insert a title and description",
                    Toast.LENGTH_SHORT).show();
            return;
        }

        CollectionReference notebookRef = FirebaseFirestore.getInstance()
                .collection("New Client");
        notebookRef.add(new NewClentModel(lastName, firstName, patronymic, dateOfBirth,
                passport, phoneNumbers, registrationAddress, actualAddress, personalID));
        Toast.makeText(this, "NewClentModel added", Toast.LENGTH_SHORT).show();
        finish();
    }

}
