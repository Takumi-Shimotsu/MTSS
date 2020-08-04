package to.msn.wings.mtss;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Mode_Back extends AppCompatActivity {
    private TextView text_souboukin;
    private TextView text_kouhaikin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_back);
    }

    public void btn_souboukin(View v){

        ImageView imageView = findViewById(R.id.body_back_all);
        imageView.setImageResource(R.drawable.view_souboukin);
        text_souboukin = findViewById(R.id.txt_souboukin);
        text_souboukin.setTextColor(Color.RED);
        text_kouhaikin = findViewById(R.id.txt_kouhaikin);
        text_kouhaikin.setTextColor(Color.BLACK);

    }

    public void btn_kouhaikin(View v){

        ImageView imageView = findViewById(R.id.body_back_all);
        imageView.setImageResource(R.drawable.view_kouhaikin);
        text_souboukin = findViewById(R.id.txt_souboukin);
        text_souboukin.setTextColor(Color.BLACK);
        text_kouhaikin = findViewById(R.id.txt_kouhaikin);
        text_kouhaikin.setTextColor(Color.RED);

    }

    public void btn_back_search(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Original_menu.class);
        startActivity(i);
    }
}
