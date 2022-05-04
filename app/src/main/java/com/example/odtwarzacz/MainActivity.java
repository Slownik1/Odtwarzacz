package com.example.odtwarzacz;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    public void Write(View v){
        try{
            FileOutputStream file_out = openFileOutput("zapis.txt", MODE_PRIVATE);
            OutputStreamWriter out_writer = new OutputStreamWriter(file_out);
            EditText text=(EditText)findViewById(R.id.editTextSave) ;

            String textString = text.getText().toString();

            out_writer.write(textString);
            out_writer.close();

            Toast.makeText(this,"Zapisano", Toast.LENGTH_LONG).show();

        } catch (Exception e) {
            Toast.makeText(this,"BLAD", Toast.LENGTH_LONG).show();;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer Sound_A = MediaPlayer.create(this, R.raw.sound1);
        final MediaPlayer Sound_B = MediaPlayer.create(this, R.raw.sound2);
        final MediaPlayer Sound_C = MediaPlayer.create(this, R.raw.sound3);
        final MediaPlayer Sound_D = MediaPlayer.create(this, R.raw.sound4);
        final MediaPlayer Sound_E = MediaPlayer.create(this, R.raw.sound5);
        final MediaPlayer Sound_F = MediaPlayer.create(this, R.raw.sound6);

        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.LOLLIPOP) {

            Toast.makeText(this, "OK", Toast.LENGTH_LONG).show();
            Button playA = this.findViewById(R.id.A);
            Button playB = this.findViewById(R.id.B);
            Button playC = this.findViewById(R.id.C);
            Button playD = this.findViewById(R.id.D);
            Button playE = this.findViewById(R.id.E);
            Button playF = this.findViewById(R.id.F);

            playA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Sound_A.start();
                    EditText editText = findViewById(R.id.editTextSave);
                    editText.append(playA.getText());
                    playA.setBackgroundColor(Color.GREEN);
                    playB.setBackgroundColor(Color.RED);
                    playC.setBackgroundColor(Color.RED);
                    playD.setBackgroundColor(Color.RED);
                    playE.setBackgroundColor(Color.RED);
                    playF.setBackgroundColor(Color.RED);
                }
            });

            playB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Sound_B.start();
                    EditText editText = findViewById(R.id.editTextSave);
                    editText.append(playB.getText());
                    playA.setBackgroundColor(Color.RED);
                    playB.setBackgroundColor(Color.GREEN);
                    playC.setBackgroundColor(Color.RED);
                    playD.setBackgroundColor(Color.RED);
                    playE.setBackgroundColor(Color.RED);
                    playF.setBackgroundColor(Color.RED);
                }
            });

            playC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Sound_C.start();
                    EditText editText = findViewById(R.id.editTextSave);
                    editText.append(playC.getText());
                    playA.setBackgroundColor(Color.RED);
                    playB.setBackgroundColor(Color.RED);
                    playC.setBackgroundColor(Color.GREEN);
                    playD.setBackgroundColor(Color.RED);
                    playE.setBackgroundColor(Color.RED);
                    playF.setBackgroundColor(Color.RED);
                }
            });

            playD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Sound_D.start();
                    EditText editText = findViewById(R.id.editTextSave);
                    editText.append(playD.getText());
                    playA.setBackgroundColor(Color.RED);
                    playB.setBackgroundColor(Color.RED);
                    playC.setBackgroundColor(Color.RED);
                    playD.setBackgroundColor(Color.GREEN);
                    playE.setBackgroundColor(Color.RED);
                    playF.setBackgroundColor(Color.RED);
                }
            });


            playE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Sound_E.start();
                    EditText editText = findViewById(R.id.editTextSave);
                    editText.append(playE.getText());
                    playA.setBackgroundColor(Color.RED);
                    playB.setBackgroundColor(Color.RED);
                    playC.setBackgroundColor(Color.RED);
                    playD.setBackgroundColor(Color.RED);
                    playE.setBackgroundColor(Color.GREEN);
                    playF.setBackgroundColor(Color.RED);
                }
            });

            playF.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Sound_F.start();
                    EditText editText = findViewById(R.id.editTextSave);
                    editText.append(playF.getText());
                    playA.setBackgroundColor(Color.RED);
                    playB.setBackgroundColor(Color.RED);
                    playC.setBackgroundColor(Color.RED);
                    playD.setBackgroundColor(Color.RED);
                    playE.setBackgroundColor(Color.RED);
                    playF.setBackgroundColor(Color.GREEN);
                }
            });

        }
        else
            Toast.makeText(this,"BAD", Toast.LENGTH_LONG).show();

    }
}