package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqda implements dqcw {
    final /* synthetic */ dqdb a;

    public dqda(dqdb dqdbVar) {
        this.a = dqdbVar;
    }

    @Override // defpackage.dqcw
    public final Size a(int i) {
        dqcz dqczVar = this.a.f;
        if (dqczVar == null) {
            ffkj.c("gridState");
            dqczVar = null;
        }
        dqcy dqcyVar = dqczVar instanceof dqcy ? (dqcy) dqczVar : null;
        if (dqcyVar == null) {
            return null;
        }
        dqcp dqcpVar = dqcyVar.a;
        if (i == 2) {
            return new Size(dqcpVar.c, dqcpVar.d);
        }
        if (i == 3) {
            return new Size(dqcpVar.c, ffln.a(dqcpVar.d * 0.25d));
        }
        if (i == 4) {
            return new Size(dqcpVar.c, ffln.a(dqcpVar.d * 0.75d));
        }
        Size size = dqcpVar.b;
        if (size != null) {
            return size;
        }
        ffkj.c("doubleSpanSize");
        return null;
    }

    @Override // defpackage.dqcw
    public final boolean b() {
        dqcz dqczVar = this.a.f;
        return dqczVar != null && (dqczVar instanceof dqcy);
    }
}
