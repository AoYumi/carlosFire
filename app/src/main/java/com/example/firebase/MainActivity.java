package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase database;
    DatabaseReference myRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText empid= (EditText) findViewById(R.id.etvEmpID);
        EditText empname = (EditText) findViewById(R.id.etvEmpName);
        Button btn = (Button) findViewById(R.id.btnSubmit);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String URL = "https://fir-624e0-default-rtdb.asia-southeast1.firebasedatabase.app/Employees";
                        database = FirebaseDatabase.getInstance(URL);
                        myRef = database.getReference("Employees");

                        String eid = empid.getText().toString();
                        String ename = empname.getText().toString();

                        Employee emp = new Employee(eid,ename);
                        myRef.child(eid).setValue(emp);

                    }
                }
        );

    }
}