package to.msn.wings.mtss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Model_All extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.model_all);
    }
    public void leg_mode(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Mode_Leg.class);
        startActivity(i);
    }

    public void arm_mode(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Mode_Arm.class);
        startActivity(i);
    }

    public void body_mode(View v){
        Intent i = new Intent(this, to.msn.wings.mtss.Mode_Body.class);
        startActivity(i);
    }


}
