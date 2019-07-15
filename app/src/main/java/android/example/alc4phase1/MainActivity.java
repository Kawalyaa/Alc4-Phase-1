package android.example.alc4phase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //Launch aAbout ALC activity
    public void showAlcPage(View view) {
        Intent intentAlc = new Intent(this,AboutALC.class);
        startActivity(intentAlc);
    }

    //Launch MyProfile activity
    public void showMyProfile(View view) {
        Intent intentProfile = new Intent(this, MyProfile.class);
        startActivity(intentProfile);
    }
}
