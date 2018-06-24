package radiobutton.cursoandroid.dell.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioGroup grupo;
    private RadioButton escolhido;
    private Button mostrar;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grupo = (RadioGroup) findViewById(R.id.radio_group_id);
        mostrar = (Button) findViewById(R.id.escolher_id);
        resultado = (TextView) findViewById(R.id.exibicao_id);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadioSelecionado = grupo.getCheckedRadioButtonId();

                if (idRadioSelecionado > 0) {
                    escolhido = (RadioButton) findViewById(idRadioSelecionado);
                    resultado.setText(escolhido.getText().toString());
                } else {
                    resultado.setText("Selecione pelo menos uma opção");
                }
            }
        });
    }
}
