package ambika.android.com.synergy_app_final;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class slidingintro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_slidingintro);
        addSlide(AppIntroFragment.newInstance("FIrst slide","more shit",R.drawable.b1, ContextCompat.getColor(getApplicationContext(),R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("FIrst slide","more shit",R.drawable.b2, ContextCompat.getColor(getApplicationContext(),R.color.colorAccent)));
    }
    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
    }
}
