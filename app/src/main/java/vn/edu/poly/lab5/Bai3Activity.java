package vn.edu.poly.lab5;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Bai3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
    }

    public void AlertDialog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(Bai3Activity.this);
        builder.setTitle("Tiêu đề nội dung").setMessage("Hello, I'm Dialog");

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();
    }

    public void AlertDialogList(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(Bai3Activity.this);
        builder.setTitle("Chọn màu");

        builder.setItems(R.array.colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int position) {
                String[] color=getResources().getStringArray(R.array.colors);
                Toast.makeText(Bai3Activity.this, color[position], Toast.LENGTH_SHORT).show();            }
        });
        builder.show();

    }

    public void AlertDialogSingleChoice(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(Bai3Activity.this);
        builder.setTitle("Chọn màu");

        builder.setSingleChoiceItems(R.array.colors, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int position) {
                String[] color=getResources().getStringArray(R.array.colors);
                Toast.makeText(Bai3Activity.this, color[position], Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int position) {

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();

    }

    public void AlertDialogMultiChoice(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(Bai3Activity.this);
        builder.setTitle("Chọn màu");

        builder.setMultiChoiceItems(R.array.colors, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int position, boolean isChecked) {
                String[] color=getResources().getStringArray(R.array.colors);
                Toast.makeText(Bai3Activity.this, color[position], Toast.LENGTH_SHORT).show();
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int position) {

            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.show();
    }
}
