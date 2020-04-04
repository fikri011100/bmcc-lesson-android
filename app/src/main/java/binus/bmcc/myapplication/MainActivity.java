package binus.bmcc.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView imageLogo, imageGosend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //line buat connect antara java ke xml
        imageLogo = findViewById(R.id.logo);
        imageGosend = findViewById(R.id.image_gosend);
        //cara buat widget biar bisa di klik
        imageLogo.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                //action "toast"
                Toast.makeText(MainActivity.this, "tes bisa klik", Toast.LENGTH_LONG).show();
            }
        });

        //cara buat klik trus pindah activity(page)
        imageGosend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //fungsi buat pindah page
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}
