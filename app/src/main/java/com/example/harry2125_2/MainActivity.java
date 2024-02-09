package com.example.harry2125_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button UploadButton;
    private Button DownloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UploadButton= findViewById(R.id.btnUpload);
        DownloadButton=findViewById(R.id.btnDownload);

        // Set onClickListeners for buttons
        UploadButton.setOnClickListener(view -> {
        // Display uploading toast message
            Toast.makeText(MainActivity.this, "Uploading....", Toast.LENGTH_SHORT).show();
          // Add your uploading logic here
        });
        DownloadButton.setOnClickListener(view -> {
         // Display downloading toast message
            Toast.makeText(MainActivity.this, "Downloading.....", Toast.LENGTH_SHORT).show();
         // Add your downloading logic here
        });

    }
}