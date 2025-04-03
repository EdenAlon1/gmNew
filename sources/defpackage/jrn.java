package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrn extends kpn {
    final /* synthetic */ ffrf a;
    final /* synthetic */ jtl b;

    public jrn(ffrf ffrfVar, jtl jtlVar) {
        this.a = ffrfVar;
        this.b = jtlVar;
    }

    @Override // defpackage.kpn
    public final void a(int i) {
        this.a.h(new IllegalStateException("Unable to load font " + this.b + " (reason=" + i + ')'));
    }

    @Override // defpackage.kpn
    public final void b(Typeface typeface) {
        this.a.w(typeface);
    }
}
