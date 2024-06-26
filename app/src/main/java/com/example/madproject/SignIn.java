package com.example.madproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//aiman
public class SignIn extends AppCompatActivity {
    private EditText firstNameEditText, lastNameEditText, usernameEditText, emailEditText, passwordEditText, confirmPasswordEditText;
    private CheckBox termsCheckbox;
    private Button signupButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);firstNameEditText = findViewById(R.id.firstName);
        lastNameEditText = findViewById(R.id.lastName);
        usernameEditText = findViewById(R.id.username);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirmPassword);
        termsCheckbox = findViewById(R.id.termsCheckbox);
        signupButton = findViewById(R.id.signupButton);

        signupButton.setOnClickListener(v -> {
            String firstName = firstNameEditText.getText().toString().trim();
            String lastName = lastNameEditText.getText().toString().trim();
            String username = usernameEditText.getText().toString().trim();
            String email = emailEditText.getText().toString().trim();
            String password = passwordEditText.getText().toString().trim();
            String confirmPassword = confirmPasswordEditText.getText().toString().trim();

            if (TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName) || TextUtils.isEmpty(username) ||
                    TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(confirmPassword)) {
                Toast.makeText(MainActivity.this, "Please fill all fields", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!password.equals(confirmPassword)) {
                Toast.makeText(MainActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                return;
            }

            if (!termsCheckbox.isChecked()) {
                Toast.makeText(MainActivity.this, "You must accept the terms of use and privacy policy", Toast.LENGTH_SHORT).show();
                return;
            }

            // Add your signup logic here (e.g., save data, navigate to another activity)
            Toast.makeText(MainActivity.this, "Sign Up Successful", Toast.LENGTH_SHORT).show();
        });

    }
}
