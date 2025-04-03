package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dftk implements Runnable {
    final /* synthetic */ dfth a;
    final /* synthetic */ String b = "ConnectionlessLifecycleHelper";
    final /* synthetic */ dftl c;

    public dftk(dftl dftlVar, dfth dfthVar) {
        this.a = dfthVar;
        this.c = dftlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dftl dftlVar = this.c;
        if (dftlVar.a > 0) {
            dfth dfthVar = this.a;
            Bundle bundle = dftlVar.b;
            dfthVar.d(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (this.c.a >= 2) {
            this.a.i();
        }
        if (this.c.a >= 3) {
            ((dfsq) this.a).k();
        }
        if (this.c.a >= 4) {
            this.a.j();
        }
    }
}
