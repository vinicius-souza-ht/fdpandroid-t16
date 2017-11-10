package fabricadeprogramador.com.br.fdpapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
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

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        Double n1 = bundle.getDouble("valorMetros");
        Double n2 = bundle.getDouble("valorConvertido");

        tv1.setText(n1.toString());
        tv2.setText(n2.toString());

    }

}
