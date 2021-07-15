package sg.edu.rp.c346.id20008787.nationaldaythemesongcompilation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class showSongNDP extends AppCompatActivity {

    Button btnShow;
    ListView lv;
    ArrayList<String> songs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_song_n_d_p);

        btnShow = findViewById(R.id.btnShow);
        lv = findViewById(R.id.lv);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,songs);
        lv.setAdapter(adapter);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

    }


}