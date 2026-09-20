package com.mgdwork.drumcloud;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);

        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(24, 32, 24, 24);
        root.setGravity(Gravity.CENTER_HORIZONTAL);
        root.setBackgroundColor(Color.WHITE);

        TextView title = new TextView(this);
        title.setText("🥁 DrumCloud Demo");
        title.setTextSize(28);
        title.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        title.setGravity(Gravity.CENTER);
        root.addView(title, new LinearLayout.LayoutParams(-1, 90));

        TextView info = new TextView(this);
        info.setText("نسخة تجريبية مبنية تلقائياً من GitHub Actions\n\nالهدف التالي: إعادة بناء واجهة صانع الإيقاعات وتطويرها.");
        info.setTextSize(18);
        info.setGravity(Gravity.CENTER);
        root.addView(info, new LinearLayout.LayoutParams(-1, 180));

        LinearLayout pads = new LinearLayout(this);
        pads.setOrientation(LinearLayout.VERTICAL);
        pads.setGravity(Gravity.CENTER);

        String[] names = {"KICK", "SNARE", "HAT", "BASS"};
        for (String name : names) {
            Button b = new Button(this);
            b.setText(name);
            b.setTextSize(18);
            b.setOnClickListener(v -> ((Button)v).setText("✓ " + name));
            pads.addView(b, new LinearLayout.LayoutParams(-1, 70));
        }
        root.addView(pads, new LinearLayout.LayoutParams(-1, -2));

        setContentView(root);
    }
}
