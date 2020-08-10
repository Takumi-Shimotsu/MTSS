package to.msn.wings.mtss;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.support.v7.app.AppCompatActivity;

public class MainFrame extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainframe);

        // 元の画面で指定した動画を取得
        Intent intent = getIntent();
        int mp4 = intent.getIntExtra("mp4",R.raw.abdominalcrunch);

        // ID取得
        VideoView v = (VideoView)findViewById(R.id.v);

        // 動画の指定
        v.setVideoURI(Uri.parse("android.resource://" + this.getPackageName() + "/" + mp4));

        // 再生スタート
        v.start();

        // コントローラNO（動画をタップするとメニュー表示）
        v.setMediaController(new MediaController(this));
    }

}