package mycalc.estudosprova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import mycalc.estudosprova.Model.IecCalculator;


public class IecCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iec_calculator);
    }

    public void calculaIec(View v){

            float res;

            EditText quant = (EditText) findViewById(R.id.qtdIec);
            IecCalculator ic = new IecCalculator(Float.parseFloat(quant.getText().toString()));
            res = ic.resultIec();


            Log.d("iusdifugsd","Sucesso");
            TextView tv = (TextView) findViewById(R.id.resultIec);
            tv.setText(Float.toString(res));

    }
}
