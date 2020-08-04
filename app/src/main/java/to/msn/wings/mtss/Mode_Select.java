package to.msn.wings.mtss;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Mode_Select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mode_select);
    }
    public void kintore_OnClick(View v){
        DialogFragment dialog = new Mode_Select_DialogFragment();
        dialog.show(getSupportFragmentManager(), "dialog_button");
    }

    public void taikan_OnClick(View v) {
        DialogFragment dialog = new Mode_Select_DialogFragment_2();
        dialog.show(getSupportFragmentManager(), "dialog_button");
    }
}

