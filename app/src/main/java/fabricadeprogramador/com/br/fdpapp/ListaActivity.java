package fabricadeprogramador.com.br.fdpapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by viniciuspodi on 14/11/17.
 */

public class ListaActivity extends AppCompatActivity {

    @BindView(R.id.my_list)
    ListView list;

    private static final String[] NAMES = {"Jão", "Maria", "Zé"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        ButterKnife.bind(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, NAMES);

        list.setAdapter(adapter);
    }
}
