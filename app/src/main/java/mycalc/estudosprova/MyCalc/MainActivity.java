package mycalc.estudosprova.MyCalc;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mycalc.estudosprova.IecCalculatorActivity;
import mycalc.estudosprova.Model.SiCalculator;
import mycalc.estudosprova.R;
import mycalc.estudosprova.SiCalculatorActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculaIec(View v){

        Context context = getApplicationContext();
        Intent intent = new Intent(context, IecCalculatorActivity.class);

        startActivity(intent);
    }

    public void calculaSi(View v){

        Context context = getApplicationContext();
        Intent intent_Si = new Intent(context, SiCalculatorActivity.class);

        startActivity(intent_Si);
    }
}
