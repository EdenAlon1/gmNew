package defpackage;

import android.text.Spannable;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class excd implements Runnable {
    final /* synthetic */ TextView a;
    final /* synthetic */ String b;
    final /* synthetic */ exbz c;
    final /* synthetic */ CharSequence d;
    final /* synthetic */ excg e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;

    public excd(TextView textView, String str, exbz exbzVar, CharSequence charSequence, excg excgVar, int i, int i2) {
        this.a = textView;
        this.b = str;
        this.c = exbzVar;
        this.d = charSequence;
        this.e = excgVar;
        this.f = i;
        this.g = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (excj.f(this.a, true) && this.b.equals(this.a.getText().toString()) && this.c.i()) {
            ((Spannable) this.d).setSpan(this.e, this.f, this.g, 0);
        }
    }
}
