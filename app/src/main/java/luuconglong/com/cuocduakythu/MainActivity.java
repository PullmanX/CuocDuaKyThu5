package luuconglong.com.cuocduakythu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtDiem;
    CheckBox cbOne, cbTrue, cbThree;
    SeekBar skOne, skTrue, skThree;
    ImageButton imageBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuocduakythu);
        AnhXa();

        CountDownTimer countDownTimer = new CountDownTimer(60000, 300) {
            @Override
            public void onTick(long l) {
                skOne.setProgress(skOne.getProgress()+5);
                skTrue.setProgress(skTrue.getProgress()+5);
                skThree.setProgress(skThree.getProgress()+5);

            }
            @Override
            public void onFinish() {

            }
        };
        imageBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countDownTimer.start();
            }
        });
    }

    private void AnhXa(){
        txtDiem     = (TextView) findViewById(R.id.textviewDiemSo);
        cbOne       = (CheckBox) findViewById(R.id.checkBox1);
        cbTrue      = (CheckBox) findViewById(R.id.checkBox2);
        cbThree     = (CheckBox) findViewById(R.id.checkBox3);
        imageBT     = (ImageButton) findViewById(R.id.imgPlay);
        skOne       = (SeekBar) findViewById(R.id.seek1);
        skTrue      = (SeekBar) findViewById(R.id.seek2);
        skThree     = (SeekBar) findViewById(R.id.seek3);
    }
}