package com.example.audio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class registration extends AppCompatActivity {
    FirebaseAuth auth;
    EditText mail,pass;
    Button btn;


    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        FirebaseApp.initializeApp(this);

        mail=findViewById(R.id.Email01);
        pass=findViewById(R.id.Pass01);
        btn=findViewById(R.id.logBut03);
       // auth=FirebaseAuth.getInstance();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               auth=FirebaseAuth.getInstance();
                //System.out.print("yez");
               // System
                String a,b;
                a=mail.getText().toString();
                b=pass.getText().toString();
                auth.createUserWithEmailAndPassword(a,b).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(registration.this, "reg sucess", Toast.LENGTH_SHORT).show();

                        }
                        else{
                            Toast.makeText(registration.this, "error", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });


    }
}