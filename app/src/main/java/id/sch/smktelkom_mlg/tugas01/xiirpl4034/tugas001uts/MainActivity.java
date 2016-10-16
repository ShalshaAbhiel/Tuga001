package id.sch.smktelkom_mlg.tugas01.xiirpl4034.tugas001uts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText NamaLengkap;
    EditText Alamat;
    TextView hasil1, hasil2, hasil3, hasil4, hasil5;
    Button bOk;
    CheckBox cbFs, cbOr, cbtv;
    RadioGroup rgKelas;
    Spinner spKelas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NamaLengkap = (EditText) findViewById(R.id.editText);
        Alamat = (EditText) findViewById(R.id.editText2);
        cbFs = (CheckBox) findViewById(R.id.Fashion);
        cbOr = (CheckBox) findViewById(R.id.Olahraga);
        cbtv = (CheckBox) findViewById(R.id.Traveling);
        rgKelas = (RadioGroup) findViewById(R.id.RadioGroup);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        bOk = (Button) findViewById(R.id.button);
        hasil1 = (TextView) findViewById(R.id.tvHasil1);
        hasil2 = (TextView) findViewById(R.id.tvHasil2);
        hasil3 = (TextView) findViewById(R.id.tvHasil3);
        hasil4 = (TextView) findViewById(R.id.tvHasil4);
        hasil5 = (TextView) findViewById(R.id.tvHasil5);

        bOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProses();
            }
        });
    }

    private void doProses() {
        String nama = NamaLengkap.getText().toString();
        String alamat = Alamat.getText().toString();
        String hobi = "Hobi: \n";
        String kls = null;
        int startlen = hobi.length();
        if (cbFs.isChecked()) hobi += cbFs.getText() + " ";
        if (cbOr.isChecked()) hobi += cbOr.getText() + " ";
        if (cbtv.isChecked()) hobi += cbtv.getText() + " ";
        if (hobi.length() == startlen) hobi += "Tidak ada pilihan hobi";

        if (rgKelas.getCheckedRadioButtonId() != -1) {
            RadioButton rpl1 = (RadioButton)
                    findViewById(rgKelas.getCheckedRadioButtonId());
            kls = rpl1.getText().toString();

        }
        hasil1.setText("Nama: " + nama);
        hasil2.setText("Alamat: " + alamat);
        hasil3.setText(hobi);
        if (kls == null) {
            hasil4.setText("Belum Memilih Kelas");
        } else {
            hasil4.setText("Jurusan: " + kls);
        }
        hasil5.setText("Kelas: " + spKelas.getSelectedItem().toString());
    }
}
