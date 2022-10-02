package com.example.doctorapointement.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.doctorapointement.R;
import com.example.doctorapointement.databinding.ActivitySelectSignupBinding;
import com.example.doctorapointement.view.doctor.DoctorSignupActivity;
import com.example.doctorapointement.view.patient.PatientSignupActivity;

public class SelectSignupActivity extends AppCompatActivity {

    private ActivitySelectSignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_select_signup);

        binding.doctorRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectSignupActivity.this, DoctorSignupActivity.class));
                finish();
            }
        });
        binding.patientRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SelectSignupActivity.this, PatientSignupActivity.class));
                finish();
            }
        });
    }
}