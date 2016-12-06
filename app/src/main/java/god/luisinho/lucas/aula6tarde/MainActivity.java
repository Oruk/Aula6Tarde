package god.luisinho.lucas.aula6tarde;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Widgets
    private EditText etNome;
    private EditText etNumero1;
    private EditText etNumero2;
    private Button btnCalcular;
    private TextView tvResposta;

    //Objeto
    private Calculadora calc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referências
        etNome = (EditText) findViewById(R.id.home_et_nome);
        etNumero1 = (EditText) findViewById(R.id.home_et_numero1);
        etNumero2 = (EditText) findViewById(R.id.home_et_numero2);
        btnCalcular = (Button) findViewById(R.id.home_btn_calcular);
        tvResposta = (TextView) findViewById(R.id.home_tv_resposta);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Instanciar objeto
                calc = new Calculadora();

                calc.setNome(etNome.getText().toString());
                calc.setNum1(
                        Double.parseDouble(
                                etNumero1.getText().toString()));
                calc.setNum2(
                        Double.parseDouble(
                                etNumero2.getText().toString()));

                /*Toast.makeText(
                        getBaseContext(),
                        calc.toString(),
                        Toast.LENGTH_LONG).show();

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(getResources().getText(R.string.alert_titulo));
                msg.setMessage(calc.toString());
                msg.setIcon(R.mipmap.ic_launcher);
                msg.setNeutralButton(getResources().getText(R.string.alert_botao), null);
                msg.show();*/

                tvResposta.setText(calc.toString());
            }//fecha onClick
        });//fecha setOnClickListener

    }//fecha onCreate
}//fecha MainActivity
