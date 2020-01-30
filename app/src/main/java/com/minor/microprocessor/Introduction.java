package com.minor.microprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Introduction extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        pdfView=findViewById(R.id.into_pdf);

        pdfView.fromAsset("Introduction.pdf").load();
    }
}
