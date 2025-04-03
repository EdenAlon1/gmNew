package com.google.android.gms.gmscompliance.ui;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import defpackage.egyl;
import defpackage.eipn;
import defpackage.eipq;
import defpackage.eipr;
import defpackage.eira;
import defpackage.eirb;
import defpackage.iy;
import defpackage.kud;
import defpackage.kvd;
import defpackage.kvo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class UncertifiedDeviceActivity extends iy {
    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        int i;
        Spanned fromHtml;
        super.onCreate(bundle);
        if (TextUtils.isEmpty("glif_v3_light")) {
            i = 0;
        } else {
            if (eirb.a == null) {
                eira eiraVar = new eira();
                eiraVar.a = R.style.SudThemeGlif_DayNight;
                eiraVar.b();
                eirb.a = eiraVar.a();
            }
            eira eiraVar2 = new eira(eirb.a);
            eiraVar2.a = 0;
            eiraVar2.b();
            i = true != eiraVar2.a().d ? R.style.SudThemeGlifV3_Light : R.style.SudThemeGlifV3_DayNight;
        }
        if (i != 0) {
            setTheme(i);
        }
        Window window = getWindow();
        eipn eipnVar = eipr.a;
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.systemUiVisibility &= -5635;
        window.setAttributes(attributes);
        eipq eipqVar = new eipq();
        eipqVar.b = window;
        eipqVar.c = 3;
        eipqVar.d.run();
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{android.R.attr.statusBarColor, android.R.attr.navigationBarColor});
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        window.setStatusBarColor(color);
        window.setNavigationBarColor(color2);
        obtainStyledAttributes.recycle();
        setContentView(R.layout.auth_uncertified_activity_v2);
        if (Build.VERSION.SDK_INT >= 35 && getApplicationInfo().targetSdkVersion >= 35) {
            View decorView = getWindow().getDecorView();
            kud kudVar = new kud() { // from class: dgng
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    view.setPadding(0, kxhVar.f(1).c, 0, kxhVar.f(64).e);
                    return kxh.a;
                }
            };
            int[] iArr = kvo.a;
            kvd.k(decorView, kudVar);
        }
        if (getIntent().getBooleanExtra("overrideNavBarColor", false)) {
            getWindow().setNavigationBarColor(getColor(R.color.play_protect_auth_navigation_bar_color));
        }
        egyl.d((TextView) findViewById(R.id.play_protect_body_text), LinkMovementMethod.getInstance());
        Button button = (Button) findViewById(R.id.goToWebsiteButton);
        if (button != null) {
            String stringExtra = getIntent().getStringExtra("customCtaText");
            final Intent intent = (Intent) getIntent().getParcelableExtra("ctaIntent");
            if (TextUtils.isEmpty(stringExtra) || intent == null) {
                button.setVisibility(4);
            } else {
                final Bundle bundleExtra = getIntent().getBundleExtra("ctaIntentOptions");
                button.setText(stringExtra);
                button.setOnClickListener(new View.OnClickListener() { // from class: dgnf
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UncertifiedDeviceActivity.this.startActivity(intent, bundleExtra);
                    }
                });
            }
        }
        TextView textView = (TextView) findViewById(R.id.play_protect_custom_body_text);
        if (textView != null) {
            String stringExtra2 = getIntent().getStringExtra("customBodyText");
            if (TextUtils.isEmpty(stringExtra2)) {
                textView.setVisibility(4);
            } else {
                fromHtml = Html.fromHtml(stringExtra2, 63);
                textView.setText(fromHtml);
                egyl.d(textView, LinkMovementMethod.getInstance());
                final Intent intent2 = (Intent) getIntent().getParcelableExtra("customBodyTextOnClickIntent");
                if (intent2 != null) {
                    textView.setOnClickListener(new View.OnClickListener() { // from class: dgni
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UncertifiedDeviceActivity.this.startActivity(intent2);
                        }
                    });
                }
            }
        }
        Button button2 = (Button) findViewById(R.id.finishButton);
        if (button2 != null) {
            button2.setOnClickListener(new View.OnClickListener() { // from class: dgnh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    UncertifiedDeviceActivity.this.finish();
                }
            });
        }
    }
}
