package to.msn.wings.mtss;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class Original_menu extends AppCompatActivity {


    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    TextView textView;
    LinearLayout linearLayout, line;

    Spinner sp1, sp2, sp3, sp4, sp5, sp6, sp7, sp8, sp9;

    TextView textView1, textView2, textView3;


    static int [] shitumon = {
            0,0,0,0,0,0,0,0,0
    };

    private static final int [] douga = {
            R.raw.abdominalcrunch,
            R.raw.airchair,
            R.raw.armcircle,
            R.raw.armraise,
            R.raw.backlunge
    };

    private static final String [] menu = {

    };

    private static final String [] syumoku = {
            "アブドミナルクランチ",
            "空気椅子",
            "アームサークル",
            "アームレイズ",
            "バックレイズ"
    };

    private static final String [] timer = {
            "３０秒",
            "４５秒",
            "１分"
    };

    /*public void layout_set(int linear){
        linearLayout = findViewById(linear);
        setContentView(linearLayout);
    }*/

    /*public void text_set(String text1, String text2, String text3){
        textView1 = findViewById(text[0]);
        //textView2 = findViewById(text[1]);
        //textView3 = findViewById(text[2]);
        textView1.setText(text1);
        //textView2.setText(text2);
        //textView3.setText(text3);
        linearLayout.addView(textView1, createParam(WC, WC));
        //linearLayout.addView(textView2, createParam(WC, WC));
        //linearLayout.addView(textView3, createParam(WC, WC));

    }*/

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }


    static int [] spn = {
            R.id.layout,
            R.id.spinner1,
            R.id.spinner2,
            R.id.spinner3,
            R.id.spinner4,
            R.id.spinner5,
            R.id.spinner6,
            R.id.spinner7,
            R.id.spinner8,
            R.id.spinner9


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.original_menu);


        sp1 = findViewById(spn[1]);
        sp2 = findViewById(spn[2]);
        sp3 = findViewById(spn[3]);
        sp4 = findViewById(spn[4]);
        sp5 = findViewById(spn[5]);
        sp6 = findViewById(spn[6]);
        sp7 = findViewById(spn[7]);
        sp8 = findViewById(spn[8]);
        sp9 = findViewById(spn[9]);


        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[0] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String hukkin = "腹筋";
                String jouhansin  = "上半身";
                String kahansin  = "下半身";
                if(sp.getSelectedItem().equals(hukkin)){
                    shitumon[1] = 1;
                }else if(sp.getSelectedItem().equals(jouhansin)){
                    shitumon[1] = 2;
                }else if(sp.getSelectedItem().equals(kahansin)){
                    shitumon[1] = 3;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[2] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[3] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[4] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[5] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp7.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[6] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp8.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[7] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        sp9.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Spinner sp = (Spinner) parent;
                String yes = "はい";
                String no  = "いいえ";
                if(sp.getSelectedItem().equals(no)){
                    shitumon[8] = 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        /*ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item_item_shi);
        ListView list = findViewById(R.id.shitsumon_list);
        for (String str: shitumon){
            adapter.add(str);
        }
        list.setAdapter(adapter);

         */

    }



    public void btn_create_original(View v){
        Toast.makeText(Original_menu.this,String.format("オリジナルメニューが作成されました"),
                Toast.LENGTH_SHORT).show();
        line = findViewById(R.id.layout);
        TextView textView1 = new TextView(this);
        textView1.setText("\n今日オリジナルメニュー\n");
        textView1.setTextSize(30);
        textView1.setTextColor(Color.RED);
        line.addView(textView1);
        TextView textView2 = new TextView(this);
        String message = syumoku[0]+timer[0]+ "➡" +syumoku[1]+timer[0]+ "➡" + "\n"+
                         syumoku[2]+timer[0]+ "➡" +syumoku[3]+timer[0]+ "➡" + "\n"+
                         syumoku[4]+timer[0]+ "➡" +"\n\n\n" ;
        textView2.setText(message);
        line.addView(textView2);

        for(int i=0;i<5;i++) {
            textView3 = new TextView(this);
            String message2 = "    ➡"+syumoku[i]+"の動画\n";
            textView3.setText(message2);
            line.addView(textView3);
            final int [] junban = {
                douga[0],
                douga[1],
                douga[2],
                douga[3],
                douga[4]
            };
            final int finalI = i;
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(Original_menu.this, to.msn.wings.mtss.MainFrame.class);
                    intent.putExtra("mp4", junban[finalI]);
                    startActivity(intent);
                }
            });
        }



        /*LinearLayout layout = new LinearLayout(this);
        layout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.setOrientation(LinearLayout.VERTICAL);
        this.setContentView(layout);*/


        //質問１＆２
        /*if(shitumon[0]==0 && shitumon[1]==0 ){
            //マウンテンクライマーを表示
        }else if(shitumon[0]==0 && shitumon[1]==1){
            //プランク
        }else if(shitumon[0]==1 && shitumon[1]==0){
            //ジャンピングジャック
        }else if(shitumon[0]==1 && shitumon[1]==1){
            //スクワット
        }

        //質問３
        if(shitumon[2]==0){
            if(shitumon[3]==){

            }
        }*/

    }



}
