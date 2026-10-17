package com.justvapor.hello;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int count = 0;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setBackgroundColor(Color.rgb(20, 24, 38));

        TextView title = new TextView(this);
        title.setText("Hello, World!");
        title.setTextSize(40);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        final TextView msg = new TextView(this);
        msg.setText("justvapor의 첫 번째 앱");
        msg.setTextSize(16);
        msg.setTextColor(Color.rgb(154, 164, 191));
        msg.setGravity(Gravity.CENTER);
        msg.setPadding(0, 24, 0, 48);

        Button btn = new Button(this);
        btn.setText("눌러보기");
        btn.setOnClickListener(v -> {
            count++;
            msg.setText("안녕하세요 👋 (" + count + "번 눌렀어요)");
        });

        root.addView(title);
        root.addView(msg);
        root.addView(btn);
        setContentView(root);
    }
}
