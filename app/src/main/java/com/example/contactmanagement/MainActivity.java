package com.example.contactmanagement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contacts;
    RecyclerView recyclerView;
    FloatingActionButton fabAddContact;
    AdapterList adapterList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvList);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        contacts = generateList();
        adapterList = new AdapterList(contacts, this);
        recyclerView.setAdapter(adapterList);
        fabAddContact = findViewById(R.id.fabAddContact);
        context = this;
        fabAddContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ActivityAddModify.class);
                startActivity(intent);
            }
        });
    }

    private List<Contact> generateList() {
        return new ArrayList<>(Arrays.asList(
                new Contact("William", "Hudon", "(819) 668-1234", "(819) 123-4567", "william.hudon@gmail.com", true),
                new Contact("Alexis", "Lecuyer", "(819) 668-1235", "(819) 123-4568", "alexis.lecuyer@gmail.com", false),
                new Contact("Simon", "Bolduc", "(819) 668-1236", "(819) 123-4569", "simon.bolduc@gmail.com", true),
                new Contact("Raphael", "Cere", "(819) 668-1237", "(819) 123-4560", "raph.cere@gmail.com", false),
                new Contact("Antoine", "St-Arnaud", "(819) 668-1238", "(819) 123-4561", "antoine.arnaud@gmail.com", true)
        ));
    }
}