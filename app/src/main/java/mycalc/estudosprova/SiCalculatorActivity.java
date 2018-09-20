package mycalc.estudosprova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import mycalc.estudosprova.Model.IecCalculator;
import mycalc.estudosprova.Model.SiCalculator;

public class SiCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si_calculator);
    }

    public void calculaSI(View v){

        float res;

        EditText quant = (EditText) findViewById(R.id.qtdSi);
        SiCalculator sc = new SiCalculator(Float.parseFloat(quant.getText().toString()));
        res = sc.result_Si();


        Log.d("iusdifugsd","Sucesso");
        TextView tv = (TextView) findViewById(R.id.resultSi);
        tv.setText(Float.toString(res));


    }

}
