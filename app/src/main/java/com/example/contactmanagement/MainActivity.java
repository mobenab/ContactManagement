package com.example.contactmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> contacts;
    RecyclerView recyclerView;
    FloatingActionButton fabAddContact;
    AdapterList adapterList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        contacts = generateList();
        adapterList = new AdapterList(contacts);

        recyclerView.setAdapter(adapterList);

        fabAddContact = findViewById(R.id.fabAddContact);
    }

    private List<Contact> generateList() {
        return new ArrayList<Contact>(Arrays.asList(
                new Contact("William", "Hudon", "(819) 668-1234", "(819) 123-4567", "william.hudon@gmail.com"),
                new Contact("Alexis", "Lecuyer", "(819) 668-1235", "(819) 123-4568", "alexis.lecuyer@gmail.com"),
                new Contact("Simon", "Bolduc", "(819) 668-1236", "(819) 123-4569", "simon.bolduc@gmail.com"),
                new Contact("Raphael", "Cere", "(819) 668-1237", "(819) 123-4560", "raph.cere@gmail.com"),
                new Contact("Antoine", "St-Arnaud", "(819) 668-1238", "(819) 123-4561", "antoine.arnaud@gmail.com")
        ));
    }
}