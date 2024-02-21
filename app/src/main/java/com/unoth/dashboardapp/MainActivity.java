package com.unoth.dashboardapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ContactAdapter adapter;
    private RecyclerView recyclerViewContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        List<ContactDomain> contactsList = new ArrayList<>();
        contactsList.add(new ContactDomain("John", "user_1"));
        contactsList.add(new ContactDomain("Lucy", "user_2"));
        contactsList.add(new ContactDomain("Mary", "user_3"));
        contactsList.add(new ContactDomain("Alexa", "user_4"));
        contactsList.add(new ContactDomain("Rose", "user_5"));
        recyclerViewContact = findViewById(R.id.recyclerView);
        recyclerViewContact.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapter = new ContactAdapter(contactsList);
        recyclerViewContact.setAdapter(adapter);
    }
}