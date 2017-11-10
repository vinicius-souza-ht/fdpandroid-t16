package fabricadeprogramador.com.br.fdpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        final EditText edNum1 = findViewById(R.id.ed_num1);
        final EditText edNum2 = findViewById(R.id.ed_num2);
        final Button btnSoma = findViewById(R.id.btn_soma);

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = edNum1.getText().toString();
                String str2 = edNum2.getText().toString();

                //Verifica se foi digitado algum valor

                if(str1.isEmpty() || str2.isEmpty()){
                    Toast.makeText(CalculadoraActivity.this, "Insira os dados", Toast.LENGTH_LONG).show();
                } else {
                    Double n1 = Double.parseDouble(str1);
                    Double n2 = Double.parseDouble(str2);

                    Double soma = n1 + n2;

                    Toast.makeText(CalculadoraActivity.this, "O resultado da soma: " + soma, Toast.LENGTH_SHORT).show();
                }
            }
        });

        final Button btnSubtracao = findViewById(R.id.btn_subtracao);

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = edNum1.getText().toString();
                String str2 = edNum2.getText().toString();

                //Verifica se foi digitado algum valor

                if(str1.isEmpty() || str2.isEmpty()){
                    Toast.makeText(CalculadoraActivity.this, "Insira os dados", Toast.LENGTH_LONG).show();
                } else {
                    Double n1 = Double.parseDouble(str1);
                    Double n2 = Double.parseDouble(str2);

                    Double subtracao = n1 - n2;

                    Toast.makeText(CalculadoraActivity.this, "O resultado da soma: " + subtracao, Toast.LENGTH_SHORT).show();
                }
            }
        });

        final Button btnMultiplicacao = findViewById(R.id.btn_multiplicacao);

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = edNum1.getText().toString();
                String str2 = edNum2.getText().toString();

                //Verifica se foi digitado algum valor

                if(str1.isEmpty() || str2.isEmpty()){
                    Toast.makeText(CalculadoraActivity.this, "Insira os dados", Toast.LENGTH_LONG).show();
                } else {
                    Double n1 = Double.parseDouble(str1);
                    Double n2 = Double.parseDouble(str2);

                    Double multiplicacao = n1 * n2;

                    Toast.makeText(CalculadoraActivity.this, "O resultado da soma: " + multiplicacao, Toast.LENGTH_SHORT).show();
                }
            }
        });

        final Button btnDivisao = findViewById(R.id.btn_divisao);

        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str1 = edNum1.getText().toString();
                String str2 = edNum2.getText().toString();

                //Verifica se foi digitado algum valor

                if(str1.isEmpty() || str2.isEmpty()){
                    Toast.makeText(CalculadoraActivity.this, "Insira os dados", Toast.LENGTH_LONG).show();
                }
                else if(str2.equals("0")){
                    Toast.makeText(CalculadoraActivity.this, "O divisor não pode ser zero", Toast.LENGTH_LONG).show();
                }else{
                    Double n1 = Double.parseDouble(str1);
                    Double n2 = Double.parseDouble(str2);

                    Double divisao = n1 / n2;

                    Toast.makeText(CalculadoraActivity.this, "O resultado da soma: " + divisao, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
