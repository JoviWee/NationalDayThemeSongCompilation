package sg.edu.rp.c346.id20008787.nationaldaythemesongcompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView tvTitle;
    EditText etTitle;
    TextView tvSinger;
    EditText etSinger;
    TextView tvYear;
    EditText etYear;
    RadioButton rdBtn1;
    RadioButton rdBtn2;
    RadioButton rdBtn3;
    RadioButton rdBtn4;
    RadioButton rdBtn5;
    Button btnInsert;
    Button btnShowList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle = findViewById(R.id.tvTitle);
        etTitle = findViewById(R.id.etTitle);
        tvSinger = findViewById(R.id.tvSinger);
        etSinger = findViewById(R.id.etSinger);
        tvYear = findViewById(R.id.tvYear);
        etYear = findViewById(R.id.etYear);
        rdBtn1 = findViewById(R.id.rdBtn1);
        rdBtn2 = findViewById(R.id.rdBtn2);
        rdBtn3 = findViewById(R.id.rdBtn3);
        rdBtn4 = findViewById(R.id.rdBtn4);
        rdBtn5 = findViewById(R.id.rdBtn5);
        btnInsert = findViewById(R.id.btnInsert);
        btnShowList = findViewById(R.id.btnShowList);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rdBtn5.isChecked()) {

                    String title = etTitle.getText().toString();
                    String singer = etSinger.getText().toString();
                    String year = etYear.getText().toString();
                    Toast.makeText(MainActivity.this, "Song is insert", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this, showSongNDP.class);
                    startActivity(i);
                }
            }
        });

    }
}