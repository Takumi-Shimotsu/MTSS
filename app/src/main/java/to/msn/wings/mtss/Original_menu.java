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


    private static final String [] shitumon = {"n1. 腕やおなかなどの\n    たるみが気になる\n",
            "\n2. 音を出しても大丈夫\n",
            "\n3. メインで鍛える部位を選択\n",
            "\n4. 週に2日以上運動している\n",
            "\n5. 高校時代運動部に所属した\n    経験がありますか\n",
            "\n6. 20Kg程度(ママチャリなど)を\n    軽く持ち上げることが出来る\n",
            "\n7. 腹筋が20秒間で\n    35回以上できる\n",
            "\n8. 20Kgの段ボールを\n    持ち上げることが出来る\n",
            "\n9. 長距離の移動(10Km程度)を\n    自転車で走っても疲れない\n"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.original_menu);

        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_item_shi);
        ListView list = findViewById(R.id.shitsumon_list);
        for (String str: shitumon){
            adapter.add(str);
        }
        list.setAdapter(adapter);

         */

    }

    public void btn_create_original(View v){
        DialogFragment dialog = new Original_Create_DialogFragment();
        dialog.show(getSupportFragmentManager(), "original_button");
    }

}
