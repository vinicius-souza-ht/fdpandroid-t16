package fabricadeprogramador.com.br.fdpapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by viniciuspodi on 13/11/17.
 */

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnCalculadora = findViewById(R.id.btn_menu_calculadora);
        Button btnConversor = findViewById(R.id.btn_menu_conversor);

        btnCalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaCalculadora = new Intent(MenuActivity.this, CalculadoraActivity.class);
                startActivity(irParaCalculadora);
            }
        });

        btnConversor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irParaConversor = new Intent(MenuActivity.this, ConversorActivity.class);
                startActivity(irParaConversor);
            }
        });

    }
}
