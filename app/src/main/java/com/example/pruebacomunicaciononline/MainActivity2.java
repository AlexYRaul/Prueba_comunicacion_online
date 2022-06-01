package com.example.pruebacomunicaciononline;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    Button button;

    List<String> roomList;

    String playerName = "";
    String roomName = "";

    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}