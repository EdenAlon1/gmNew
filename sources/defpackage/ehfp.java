package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehfp implements View.OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ ehfr b;

    public ehfp(ehfr ehfrVar, int i) {
        this.a = i;
        this.b = ehfrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ehfd d = ehfd.d(this.a, this.b.a.c.b);
        eheb ehebVar = this.b.a.b;
        if (d.compareTo(ehebVar.a) < 0) {
            d = ehebVar.a;
        } else if (d.compareTo(ehebVar.b) > 0) {
            d = ehebVar.b;
        }
        this.b.a.e(d);
        this.b.a.f(1);
    }
}
