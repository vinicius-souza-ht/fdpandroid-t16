package fabricadeprogramador.com.br.fdpapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by viniciuspodi on 09/11/17.
 */

public class ResultadoConversorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_conversor_resultado);

        TextView tv1 = findViewById(R.id.tv_resultado_conversor_1);
        TextView tv2 = findViewById(R.id.tv_resultado_conversor_2);

        Button btnFechar = findViewById(R.id.btn_resultado_conversor_fechar);

        btnFechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Double n1 = bundle.getDouble("valorMetros");
        Double n2 = bundle.getDouble("valorConvertido");

//        Usuario usu = (Usuario) bundle.getSerializable("usuario");
//
//        Toast.makeText(ResultadoConversorActivity.this, usu.nome, Toast.LENGTH_SHORT).show();

        tv1.setText(n1.toString());
        tv2.setText(n2.toString());

    }

}
