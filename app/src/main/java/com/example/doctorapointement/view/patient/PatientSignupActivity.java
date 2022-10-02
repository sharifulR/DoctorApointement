package com.example.doctorapointement.view.patient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.doctorapointement.R;
import com.example.doctorapointement.databinding.ActivityPatientSignupBinding;
import com.example.doctorapointement.view.LoginActivity;

public class PatientSignupActivity extends AppCompatActivity {
    ActivityPatientSignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_patient_signup);
        binding.pSignInTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PatientSignupActivity.this, LoginActivity.class));
            }
        });
    }
}