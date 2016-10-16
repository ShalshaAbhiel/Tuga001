package id.sch.smktelkom_mlg.tugas01.xiirpl4034.tugas001uts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText NamaLengkap;
    EditText Alamat;
    Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NamaLengkap = (EditText) findViewById(R.id.editText);
        Alamat = (EditText) findViewById(R.id.editText2);
        Submit = (Button) findViewById(R.id.button);
    }
}
