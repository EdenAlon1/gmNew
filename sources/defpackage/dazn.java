package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dazn {
    private static final LinearLayout.LayoutParams d;
    public final dbiq a;
    public final AlertDialog.Builder b;
    public int c;
    private final LinearLayout e;

    static {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        d = layoutParams;
    }

    public dazn(dbiq dbiqVar, Activity activity) {
        this.a = dbiqVar;
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        this.e = linearLayout;
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setFillViewport(true);
        scrollView.addView(linearLayout);
        builder.setView(scrollView);
        this.b = builder;
        TextView a = dbis.a(activity, "Cms Settings Data");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 17;
        a.setLayoutParams(layoutParams);
        a.setTypeface(((AppCompatTextView) a).d, 1);
        b(a);
    }

    public final void a(String str, String str2) {
        str2.getClass();
        int i = this.c + 1;
        this.c = i;
        b(this.a.b(i + ". " + str + ":"));
        TextView b = this.a.b(str2);
        b.setLayoutParams(d);
        b.setPadding(0, 5, 0, 10);
        b(b);
    }

    public final void b(View view) {
        this.e.addView(view);
    }
}
