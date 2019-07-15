package com.example.projectdddd;

import android.content.DialogInterface;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//취소하기
        Button button_cancel=(Button)findViewById(R.id.button_cancel);
        button_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_cancel();
            }
        });
//양보하기
        Button button_yangbo=(Button)findViewById(R.id.button_yangbo);
        button_yangbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                show_yangbo();
            }
        });
    }
    void show_yangbo()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("팝업");
        builder.setMessage("정말 양보하시겠습니까?");
        builder.setPositiveButton("예",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"양보하였습니다.",Toast.LENGTH_LONG).show();
                    }
                });
        builder.setNegativeButton("아니오",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"취소하였습니다.",Toast.LENGTH_LONG).show();
                    }
                });
        builder.show();
    }


    void show_cancel()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("팝업");
        builder.setMessage("정말 취소하시겠습니까?");
        builder.setPositiveButton("예",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"취소하였습니다.",Toast.LENGTH_LONG).show();
                    }
                });
        builder.setNegativeButton("아니오",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"취소하지 않았습니다.",Toast.LENGTH_LONG).show();
                    }
                });
        builder.show();
    }
}
