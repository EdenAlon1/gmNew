package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dggn {
    public dggo a;
    public Bundle b;
    public LinkedList c;
    private final dggf d = new dggf(this);

    public static void k(FrameLayout frameLayout) {
        dfpi dfpiVar = dfpi.a;
        Context context = frameLayout.getContext();
        int h = dfpiVar.h(context);
        String c = dfvt.c(context, h);
        String b = dfvt.b(context, h);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c);
        linearLayout.addView(textView);
        Intent j = dfpiVar.j(context, h, null);
        if (j != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b);
            linearLayout.addView(button);
            button.setOnClickListener(new dggj(context, j));
        }
    }

    public final void a(Bundle bundle) {
        j(bundle, new dggh(this, bundle));
    }

    public final void b() {
        dggo dggoVar = this.a;
        if (dggoVar != null) {
            dggoVar.c();
        } else {
            i(1);
        }
    }

    public final void c() {
        dggo dggoVar = this.a;
        if (dggoVar != null) {
            dggoVar.f();
        }
    }

    public final void d() {
        dggo dggoVar = this.a;
        if (dggoVar != null) {
            dggoVar.g();
        } else {
            i(5);
        }
    }

    public final void e() {
        j(null, new dggl(this));
    }

    public final void f(Bundle bundle) {
        dggo dggoVar = this.a;
        if (dggoVar != null) {
            dggoVar.i(bundle);
            return;
        }
        Bundle bundle2 = this.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public final void g() {
        j(null, new dggk(this));
    }

    public final void h() {
        dggo dggoVar = this.a;
        if (dggoVar != null) {
            dggoVar.k();
        } else {
            i(4);
        }
    }

    public final void i(int i) {
        while (!this.c.isEmpty() && ((dggm) this.c.getLast()).a() >= i) {
            this.c.removeLast();
        }
    }

    public final void j(Bundle bundle, dggm dggmVar) {
        if (this.a != null) {
            dggmVar.b();
            return;
        }
        if (this.c == null) {
            this.c = new LinkedList();
        }
        this.c.add(dggmVar);
        if (bundle != null) {
            Bundle bundle2 = this.b;
            if (bundle2 == null) {
                this.b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        l(this.d);
    }

    protected abstract void l(dggf dggfVar);
}
