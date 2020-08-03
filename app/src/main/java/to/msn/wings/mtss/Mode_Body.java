package to.msn.wings.mtss;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Mode_Body extends AppCompatActivity {

    private TextView text_kubi;
    private TextView text_sankakukin;
    private TextView text_kyoukin;
    private TextView text_hukusyakin;
    private TextView text_hukkin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_body);
    }

    public void btn_kubi(View v){

        ImageView imageView = findViewById(R.id.body_all);
        imageView.setImageResource(R.drawable.view_kubi);
        text_kubi = findViewById(R.id.txt_kubi);
        text_kubi.setTextColor(Color.RED);
        text_sankakukin = findViewById(R.id.txt_sankakukin);
        text_sankakukin.setTextColor(Color.BLACK);
        text_kyoukin = findViewById(R.id.txt_kyoukin);
        text_kyoukin.setTextColor(Color.BLACK);
        text_hukusyakin = findViewById(R.id.txt_hukusyakin);
        text_hukusyakin.setTextColor(Color.BLACK);
        text_hukkin = findViewById(R.id.txt_hukkin);
        text_hukkin.setTextColor(Color.BLACK);

    }

    public void btn_sankakukin(View v){

        ImageView imageView = findViewById(R.id.body_all);
        imageView.setImageResource(R.drawable.view_sankakukin);
        text_kubi = findViewById(R.id.txt_kubi);
        text_kubi.setTextColor(Color.BLACK);
        text_sankakukin = findViewById(R.id.txt_sankakukin);
        text_sankakukin.setTextColor(Color.RED);
        text_kyoukin = findViewById(R.id.txt_kyoukin);
        text_kyoukin.setTextColor(Color.BLACK);
        text_hukusyakin = findViewById(R.id.txt_hukusyakin);
        text_hukusyakin.setTextColor(Color.BLACK);
        text_hukkin = findViewById(R.id.txt_hukkin);
        text_hukkin.setTextColor(Color.BLACK);

    }

    public void btn_kyoukin(View v){

        ImageView imageView = findViewById(R.id.body_all);
        imageView.setImageResource(R.drawable.view_kyoukin);
        text_kubi = findViewById(R.id.txt_kubi);
        text_kubi.setTextColor(Color.BLACK);
        text_sankakukin = findViewById(R.id.txt_sankakukin);
        text_sankakukin.setTextColor(Color.BLACK);
        text_kyoukin = findViewById(R.id.txt_kyoukin);
        text_kyoukin.setTextColor(Color.RED);
        text_hukusyakin = findViewById(R.id.txt_hukusyakin);
        text_hukusyakin.setTextColor(Color.BLACK);
        text_hukkin = findViewById(R.id.txt_hukkin);
        text_hukkin.setTextColor(Color.BLACK);

    }

    public void btn_hukusyakin(View v){

        ImageView imageView = findViewById(R.id.body_all);
        imageView.setImageResource(R.drawable.view_hukusyakin);
        text_kubi = findViewById(R.id.txt_kubi);
        text_kubi.setTextColor(Color.BLACK);
        text_sankakukin = findViewById(R.id.txt_sankakukin);
        text_sankakukin.setTextColor(Color.BLACK);
        text_kyoukin = findViewById(R.id.txt_kyoukin);
        text_kyoukin.setTextColor(Color.BLACK);
        text_hukusyakin = findViewById(R.id.txt_hukusyakin);
        text_hukusyakin.setTextColor(Color.RED);
        text_hukkin = findViewById(R.id.txt_hukkin);
        text_hukkin.setTextColor(Color.BLACK);

    }

    public void btn_hukkin(View v){

        ImageView imageView = findViewById(R.id.body_all);
        imageView.setImageResource(R.drawable.view_hukkin);
        text_kubi = findViewById(R.id.txt_kubi);
        text_kubi.setTextColor(Color.BLACK);
        text_sankakukin = findViewById(R.id.txt_sankakukin);
        text_sankakukin.setTextColor(Color.BLACK);
        text_kyoukin = findViewById(R.id.txt_kyoukin);
        text_kyoukin.setTextColor(Color.BLACK);
        text_hukusyakin = findViewById(R.id.txt_hukusyakin);
        text_hukusyakin.setTextColor(Color.BLACK);
        text_hukkin = findViewById(R.id.txt_hukkin);
        text_hukkin.setTextColor(Color.RED);

    }

    public void btn_body_search(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Original_menu.class);
        startActivity(i);
    }

}
