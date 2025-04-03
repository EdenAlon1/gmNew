package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfsq extends dfsi {
    public final cmj e;
    private final dftd g;

    public dfsq(dfti dftiVar, dftd dftdVar) {
        super(dftiVar, dfpi.a);
        this.e = new cmj();
        this.g = dftdVar;
        this.f.b(this);
    }

    @Override // defpackage.dfsi
    protected final void e(ConnectionResult connectionResult, int i) {
        this.g.e(connectionResult, i);
    }

    @Override // defpackage.dfsi
    protected final void f() {
        this.g.f();
    }

    @Override // defpackage.dfth
    public final void h() {
        k();
    }

    @Override // defpackage.dfth
    public final void i() {
        this.a = true;
        k();
    }

    @Override // defpackage.dfth
    public final void j() {
        this.a = false;
        Object obj = dftd.c;
        dftd dftdVar = this.g;
        synchronized (obj) {
            if (dftdVar.m == this) {
                dftdVar.m = null;
                dftdVar.n.clear();
            }
        }
    }

    public final void k() {
        if (this.e.isEmpty()) {
            return;
        }
        this.g.g(this);
    }
}
