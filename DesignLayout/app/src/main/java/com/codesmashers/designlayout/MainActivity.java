package com.codesmashers.designlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox checkBoxPending,checkBoxDone,checkBoxRead;

    Button btn;

//    public void pending(View view)
//    {
//        Toast.makeText(this, "Pending clicked", Toast.LENGTH_SHORT).show();
//    }
//    public void read(View view)
//    {
//        Toast.makeText(this, "send clicked", Toast.LENGTH_SHORT).show();
//    } public void done(View view)
//    {
//        Toast.makeText(this, "done clicked", Toast.LENGTH_SHORT).show();
//    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxPending=findViewById(R.id.checkBoxPending);

        checkBoxPending.setOnClickListener(this);

        checkBoxDone=findViewById(R.id.checkBoxDone);

        checkBoxDone.setOnClickListener(this);

        checkBoxRead=findViewById(R.id.checkBoxRead);

        checkBoxRead.setOnClickListener(this);

        btn=findViewById(R.id.button);
    }

    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.checkBoxPending:
                if(checkBoxPending.isChecked())
                    btn.setText("Pending");
                break;
            case R.id.checkBoxDone:
                if(checkBoxDone.isChecked())
                    btn.setText("Done");
                break;
            case R.id.checkBoxRead:
                if(checkBoxRead.isChecked())
                    btn.setText("Read");
                break;

        }

    }
}