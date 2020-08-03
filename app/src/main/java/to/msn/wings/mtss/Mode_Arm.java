package to.msn.wings.mtss;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Mode_Arm extends AppCompatActivity {

    private TextView text_santoukin;
    private TextView text_nitoukin;
    private TextView text_zenwan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_arm);
    }

    public void btn_santoukin(View v){

        ImageView imageView = findViewById(R.id.arm_all);
        imageView.setImageResource(R.drawable.view_santoukin);
        text_santoukin = findViewById(R.id.txt_santoukin);
        text_santoukin.setTextColor(Color.RED);
        text_nitoukin = findViewById(R.id.txt_nitoukin);
        text_nitoukin.setTextColor(Color.BLACK);
        text_zenwan = findViewById(R.id.txt_zenwan);
        text_zenwan.setTextColor(Color.BLACK);

    }

    public void btn_nitoukin(View v){

        ImageView imageView = findViewById(R.id.arm_all);
        imageView.setImageResource(R.drawable.view_nitoukin);
        text_santoukin = findViewById(R.id.txt_santoukin);
        text_santoukin.setTextColor(Color.BLACK);
        text_nitoukin = findViewById(R.id.txt_nitoukin);
        text_nitoukin.setTextColor(Color.RED);
        text_zenwan = findViewById(R.id.txt_zenwan);
        text_zenwan.setTextColor(Color.BLACK);

    }

    public void btn_zenwan(View v){

        ImageView imageView = findViewById(R.id.arm_all);
        imageView.setImageResource(R.drawable.view_zenwan);
        text_santoukin = findViewById(R.id.txt_santoukin);
        text_santoukin.setTextColor(Color.BLACK);
        text_nitoukin = findViewById(R.id.txt_nitoukin);
        text_nitoukin.setTextColor(Color.BLACK);
        text_zenwan = findViewById(R.id.txt_zenwan);
        text_zenwan.setTextColor(Color.RED);

    }

    public void btn_arm_search(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Original_menu.class);
        startActivity(i);
    }
}
