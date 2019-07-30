package vn.edu.poly.lab5;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Bai4Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);


        //   final AlertDialog.Builder builder = new AlertDialog.Builder(Bai4Activity.this);
//        LayoutInflater inflater = Bai4Activity.this.getLayoutInflater();
//        View view = inflater.inflate(R.layout.login, null);
//        builder.setView(view);

        final Dialog dialog = new Dialog(Bai4Activity.this);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.login);
        final EditText edtUser = dialog.findViewById(R.id.edtUser);
        final EditText edtPass = dialog.findViewById(R.id.edtPass);
        Button btnNo = dialog.findViewById(R.id.btnNo);
        Button btnYes=dialog.findViewById(R.id.btnYes);

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });


        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username="abc";
                String Password="123";
                if (edtUser.getText().toString().equals(Username) && edtPass.getText().toString().equals(Password)) {
                    Toast.makeText(Bai4Activity.this, "Đăng Nhập Thành Công", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Bai4Activity.this, "Đăng Nhập Thất Bại", Toast.LENGTH_SHORT).show();
             }
                dialog.cancel();
            }

        });

//        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//
//
//
//
//            }
//        });
//
//        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        });


        dialog.show();
    }
}
