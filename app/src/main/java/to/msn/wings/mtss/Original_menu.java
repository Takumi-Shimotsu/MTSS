package to.msn.wings.mtss;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


public class Original_menu extends AppCompatActivity {


    private static final String [] shitumon = {"1. 音を出しても大丈夫",
            "2. 腕やおなかなどの\n    たるみが気になる",
            "3. メインで鍛える部位を選択",
            "4. 週に2日以上運動している",
            "5. 運動部に所属した経験が\n    ありますか",
            "6. 20Kg程度(ママチャリなど)を\n    軽く持ち上げることが出来る",
            "7. 腹筋が20秒間で\n    35回以上できる",
            "8. 20Kgの段ボールを\n    持ち上げることが出来る",
            "9. 長距離の移動(10Km程度)を\n    自転車で走っても疲れない"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.original_menu);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_item_shi);
        ListView list = findViewById(R.id.listlist);
        for (String str: shitumon){
            adapter.add(str);
        }
        list.setAdapter(adapter);
    }

    public void btn_create_original(View v){
        DialogFragment dialog = new Original_Create_DialogFragment();
        dialog.show(getSupportFragmentManager(), "original_button");
    }

}
