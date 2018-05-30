package ambika.android.com.synergy_app_final;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class contactus2 extends AppCompatActivity {
    String arrayName[]={
            "img1",
            "img2",
            "img3","img4","img5"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactus2);
        CircleMenu circleMenu =(CircleMenu)findViewById(R.id.circlemenu);
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.plus, R.drawable.social)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.img1)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.img2)
                .addSubMenu(Color.parseColor("#FF4B32"), R.drawable.img3)
                .addSubMenu(Color.parseColor("#8A39FF"), R.drawable.img4)
                .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.img5)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(contactus2.this, "you clicked! "+arrayName[index], Toast.LENGTH_LONG).show();
                    }

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {


            }

            @Override
            public void onMenuClosed() {}

        });


    }
    }

