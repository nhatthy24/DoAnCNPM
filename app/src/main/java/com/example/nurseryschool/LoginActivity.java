package com.example.nurseryschool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edtEmail, edtPassword;
    private Button btnLogin;
//    private ProgressBar progressBar;

//    private static final String TAG = "LoginActivity";

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        assign();
        btnLogin.setOnClickListener(this);
        mAuth = FirebaseAuth.getInstance();

    }

    private void assign(){
        edtEmail = findViewById(R.id.editTextEmail);
        edtPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.ButtonLogin);
//        progressBar = findViewById(R.id.progressBarLogin);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ButtonLogin:
                userLogin();
                break;
        }
    }

    private void userLogin() {
        String email = edtEmail.getText().toString();
        String password = edtPassword.getText().toString();

        if(email.isEmpty()){
            edtEmail.setError("Email is required");
            edtEmail.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            edtEmail.setError("Please enter a valid email");
            edtEmail.requestFocus();
            return;
        }

        if(password.length() < 6){
            edtPassword.setError("Min password length is 6 characters");
            edtPassword.requestFocus();
            return;
        }

//        progressBar.setVisibility(View.VISIBLE);

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(LoginActivity.this, "Login successfull", Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(LoginActivity.this, "Failed to login! Please check your credentials", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}