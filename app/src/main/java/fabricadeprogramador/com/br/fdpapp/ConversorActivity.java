package fabricadeprogramador.com.br.fdpapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by viniciuspodi on 09/11/17.
 */

public class ConversorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_conversor);

        final EditText ed1 = findViewById(R.id.ed_conversor_1);

        Button btnConversorCm = findViewById(R.id.btn_conversor_cm);
        Button btnConversorKm = findViewById(R.id.btn_conversor_km);
        Button btnConversorPol = findViewById(R.id.btn_conversor_pol);
        Button btnConversorMilhas = findViewById(R.id.btn_conversor_milhas);

        btnConversorCm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = ed1.getText().toString();

                if(valor.isEmpty()){
                    Toast.makeText(ConversorActivity.this, "Insira os dados !", Toast.LENGTH_SHORT).show();
                } else {
                    Double valorEmMetros = Double.parseDouble(valor);
                    Double resultado = valorEmMetros * 100;

                    Intent irParaResultado = new Intent(ConversorActivity.this, ResultadoConversorActivity.class);


                    Bundle bundle = new Bundle();
                    bundle.putDouble("valorMetros", valorEmMetros);
                    bundle.putDouble("valorConvertido", resultado);

                    irParaResultado.putExtras(bundle);

                    startActivity(irParaResultado);
                }
            }
        });

        btnConversorKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = ed1.getText().toString();

                if(valor.isEmpty()){
                    Toast.makeText(ConversorActivity.this, "Insira os dados !", Toast.LENGTH_SHORT).show();
                } else {
                    Double valorEmMetros = Double.parseDouble(valor);
                    Double resultado = valorEmMetros / 1000;

                    Intent irParaResultado = new Intent(ConversorActivity.this, ResultadoConversorActivity.class);


                    Bundle bundle = new Bundle();
                    bundle.putDouble("valorMetros", valorEmMetros);
                    bundle.putDouble("valorConvertido", resultado);

                    irParaResultado.putExtras(bundle);

                    startActivity(irParaResultado);
                }
            }
        });

        btnConversorPol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = ed1.getText().toString();

                if(valor.isEmpty()){
                    Toast.makeText(ConversorActivity.this, "Insira os dados !", Toast.LENGTH_SHORT).show();
                } else {
                    Double valorEmMetros = Double.parseDouble(valor);
                    Double resultado = valorEmMetros * 39.370;

                    Intent irParaResultado = new Intent(ConversorActivity.this, ResultadoConversorActivity.class);


                    Bundle bundle = new Bundle();
                    bundle.putDouble("valorMetros", valorEmMetros);
                    bundle.putDouble("valorConvertido", resultado);

                    irParaResultado.putExtras(bundle);

                    startActivity(irParaResultado);
                }
            }
        });

        btnConversorMilhas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String valor = ed1.getText().toString();

                if(valor.isEmpty()){
                    Toast.makeText(ConversorActivity.this, "Insira os dados !", Toast.LENGTH_SHORT).show();
                } else {
                    Double valorEmMetros = Double.parseDouble(valor);
                    Double resultado = valorEmMetros * 0.00062137;

                    Intent irParaResultado = new Intent(ConversorActivity.this, ResultadoConversorActivity.class);


                    Bundle bundle = new Bundle();
                    bundle.putDouble("valorMetros", valorEmMetros);
                    bundle.putDouble("valorConvertido", resultado);

                    irParaResultado.putExtras(bundle);

                    startActivity(irParaResultado);
                }
            }
        });


    }
}
