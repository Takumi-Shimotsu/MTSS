package to.msn.wings.mtss;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Mode_Leg extends AppCompatActivity {

    private TextView text_gaisoku;
    private TextView text_daitai;
    private TextView text_naiten;
    private TextView text_hukura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_leg);
    }
    public void btn_gaisoku(View v){

        ImageView imageView = findViewById(R.id.leg_all);
        imageView.setImageResource(R.drawable.view_gaisoku);
        text_gaisoku = findViewById(R.id.gaisokukoukin);
        text_gaisoku.setTextColor(Color.RED);
        text_daitai = findViewById(R.id.yontoukin);
        text_daitai.setTextColor(Color.BLACK);
        text_naiten = findViewById(R.id.naitenkin);
        text_naiten.setTextColor(Color.BLACK);
        text_hukura = findViewById(R.id.hukurahagi);
        text_hukura.setTextColor(Color.BLACK);

    }

    public void btn_daitai(View v){

        ImageView imageView = findViewById(R.id.leg_all);
        imageView.setImageResource(R.drawable.view_daitai);
        text_gaisoku = findViewById(R.id.gaisokukoukin);
        text_gaisoku.setTextColor(Color.BLACK);
        text_daitai = findViewById(R.id.yontoukin);
        text_daitai.setTextColor(Color.RED);
        text_naiten = findViewById(R.id.naitenkin);
        text_naiten.setTextColor(Color.BLACK);
        text_hukura = findViewById(R.id.hukurahagi);
        text_hukura.setTextColor(Color.BLACK);

    }

    public void btn_naiten(View v){

        ImageView imageView = findViewById(R.id.leg_all);
        imageView.setImageResource(R.drawable.view_naiten);
        text_gaisoku = findViewById(R.id.gaisokukoukin);
        text_gaisoku.setTextColor(Color.BLACK);
        text_daitai = findViewById(R.id.yontoukin);
        text_daitai.setTextColor(Color.BLACK);
        text_naiten = findViewById(R.id.naitenkin);
        text_naiten.setTextColor(Color.RED);
        text_hukura = findViewById(R.id.hukurahagi);
        text_hukura.setTextColor(Color.BLACK);

    }

    public void btn_hukura(View v){

        ImageView imageView = findViewById(R.id.leg_all);
        imageView.setImageResource(R.drawable.view_hukura);
        text_gaisoku = findViewById(R.id.gaisokukoukin);
        text_gaisoku.setTextColor(Color.BLACK);
        text_daitai = findViewById(R.id.yontoukin);
        text_daitai.setTextColor(Color.BLACK);
        text_naiten = findViewById(R.id.naitenkin);
        text_naiten.setTextColor(Color.BLACK);
        text_hukura = findViewById(R.id.hukurahagi);
        text_hukura.setTextColor(Color.RED);

    }
}
