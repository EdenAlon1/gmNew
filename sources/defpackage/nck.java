package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nck implements ndu {
    private final byte[] a = new byte[4096];

    @Override // defpackage.ndu
    public final /* synthetic */ int e(lpp lppVar, int i, boolean z) {
        return nds.a(this, lppVar, i, z);
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void m(luv luvVar, int i) {
        nds.b(this, luvVar, i);
    }

    @Override // defpackage.ndu
    public final void n(luv luvVar, int i, int i2) {
        luvVar.L(i);
    }

    @Override // defpackage.ndu
    public final int w(lpp lppVar, int i, boolean z) {
        int a = lppVar.a(this.a, 0, Math.min(4096, i));
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // defpackage.ndu
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.ndu
    public final void i(lqc lqcVar) {
    }

    @Override // defpackage.ndu
    public final void o(long j, int i, int i2, int i3, ndt ndtVar) {
    }
}
