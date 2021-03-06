package first.swufe.com.week5;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Caculation extends AppCompatActivity implements View.OnClickListener {

    TextView scoreA;
    TextView scoreB;
    Button reset;
    Button add3A;
    Button add2A;
    Button add1A;
    Button add3B;
    Button add2B;
    Button add1B;
    int a=0,b=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caculation);
        Log.i(TAG, "onCreate: ");

        scoreA = findViewById(R.id.scoreA);
        scoreB = findViewById(R.id.scoreB);
        findViewById(R.id.add3A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add3A){
                    a=a+3;
                    scoreA.setText(Integer.toString(a));
                }
            }
        });
        findViewById(R.id.add2A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add2A){
                    a=a+2;
                    scoreA.setText(Integer.toString(a));
                }
            }
        });
        findViewById(R.id.add1A).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.add1A){
                    a=a+1;
                    scoreA.setText(Integer.toString(a));
                }
            }
        });

        findViewById(R.id.add3B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(w.getId()==R.id.add3B){
                    b=b+3;
                    scoreB.setText(Integer.toString(b));
                }
            }
        });
        findViewById(R.id.add2B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(w.getId()==R.id.add2B){
                    b=b+2;
                    scoreB.setText(Integer.toString(b));
                }
            }
        });
        findViewById(R.id.add1B).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w) {
                if(w.getId()==R.id.add1B){
                    b=b+1;
                    scoreB.setText(Integer.toString(b));
                }
            }
        });


        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.reset){
                    a=0;
                    b=0;
                    scoreA.setText(Integer.toString(a));
                    scoreB.setText(Integer.toString(b));
                }
            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    private final String TAG = "calculation";

    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, "onResume: ");
    }
    
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    protected void onPause(){
        super.onPause();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String scorea=((TextView)findViewById(R.id.scoreA)).getText().toString();
        String scoreb=((TextView)findViewById(R.id.scoreB)).getText().toString();
        Log.i(TAG, "onSaveInstanceState: ");
        outState.putString("teama_score",scorea);
        outState.putString("teamb_score",scoreb);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String scorea = savedInstanceState.getString("teama_score");
        String scoreb = savedInstanceState.getString("teamb_score");
        Log.i(TAG, "onRestoreInstanceState: ");
        ((TextView)findViewById(R.id.scoreA)).setText(scorea);
        ((TextView)findViewById(R.id.scoreB)).setText(scoreb);
    }
}
