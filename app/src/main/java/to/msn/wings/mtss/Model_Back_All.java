package to.msn.wings.mtss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Model_Back_All extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_back_all);
    }
    public void leg_mode(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Mode_Leg.class);
        startActivity(i);
    }

    public void arm_mode(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Mode_Arm.class);
        startActivity(i);
    }

    public void back_mode(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Mode_Back.class);
        startActivity(i);
    }

    public void btn_right(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Model_All.class);
        startActivity(i);
    }

    public void btn_left(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Model_All.class);
        startActivity(i);
    }
}
