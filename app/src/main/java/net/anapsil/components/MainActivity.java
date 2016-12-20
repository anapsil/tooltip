package net.anapsil.components;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import net.anapsil.components.tooltip.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                Tooltip tooltip_01 = (Tooltip) findViewById(R.id.tooltip_01);
                tooltip_01.setText("Texto de Tooltip Flutuante para a Ancora 01 maior que o " +
                        "texto!");
                tooltip_01.show();

                Tooltip tooltip_02 = (Tooltip) findViewById(R.id.tooltip_02);
                tooltip_02.setText("Texto de Tooltip Ancora 02!");
                tooltip_02.show();
            }
        };

        new Handler().postDelayed(r, 3000);
    }
}
