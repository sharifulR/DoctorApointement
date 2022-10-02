package com.example.doctorapointement.view.doctor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.doctorapointement.R;
import com.example.doctorapointement.databinding.ActivityDoctorSignupBinding;
import com.example.doctorapointement.view.LoginActivity;

public class DoctorSignupActivity extends AppCompatActivity {
    ActivityDoctorSignupBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this, R.layout.activity_doctor_signup);
        binding.dSignInTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DoctorSignupActivity.this, LoginActivity.class));
            }
        });
    }
}