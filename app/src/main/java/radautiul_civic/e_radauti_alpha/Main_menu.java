package radautiul_civic.e_radauti_alpha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main_menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }
    public void gotoTururi(View view) {
        Intent intent = new Intent(this, tururi.class);
        startActivity(intent);
    }

    public void gotoNumereUtile(View view) {
        Intent intent = new Intent(this, NumereUtile.class);
        startActivity(intent);
    }

    public void gotoQR(View view) {
        Intent intent = new Intent(this, CodQR.class);
        startActivity(intent);
    }
}
