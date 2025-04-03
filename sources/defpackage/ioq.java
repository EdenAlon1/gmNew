package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ioq implements irg, ipq {
    final /* synthetic */ ipa a;
    private final /* synthetic */ iot b;

    public ioq(ipa ipaVar) {
        this.a = ipaVar;
        this.b = ipaVar.h;
    }

    @Override // defpackage.irg
    public final List a(Object obj, ffjm ffjmVar) {
        iui iuiVar = (iui) this.a.g.f(obj);
        if (iuiVar != null && this.a.a.I().indexOf(iuiVar) < this.a.d) {
            return iuiVar.F();
        }
        ipa ipaVar = this.a;
        if (ipaVar.l.b < ipaVar.e) {
            imn.b("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        hne hneVar = ipaVar.l;
        int i = hneVar.b;
        int i2 = ipaVar.e;
        if (i == i2) {
            hneVar.n(obj);
        } else {
            hneVar.d(i2, obj);
        }
        ipaVar.e++;
        if (!ipaVar.j.g(obj)) {
            ipaVar.k.e(obj, ipaVar.a(obj, ffjmVar));
            if (ipaVar.a.aD() == 3) {
                ipaVar.a.ad(true);
            } else {
                iui.ax(ipaVar.a, true, 6);
            }
        }
        iui iuiVar2 = (iui) ipaVar.j.f(obj);
        if (iuiVar2 == null) {
            return ffel.a;
        }
        List q = iuiVar2.x().q();
        int size = q.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((ivm) q.get(i3)).f.b = true;
        }
        return q;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.b.b;
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.b.c;
    }

    @Override // defpackage.jzx
    public final float ef(long j) {
        return jzw.a(this.b, j);
    }

    @Override // defpackage.jzn
    public final float eg(float f) {
        return jzm.a(this.b, f);
    }

    @Override // defpackage.ipq
    public final ipo ei(int i, int i2, Map map, ffji ffjiVar) {
        return ipp.a(this.b, i, i2, map, ffjiVar);
    }

    @Override // defpackage.jzn
    public final float ek(int i) {
        return jzm.b(this.b, i);
    }

    @Override // defpackage.jzn
    public final float el(long j) {
        return jzm.c(this.b, j);
    }

    @Override // defpackage.jzn
    public final float em(float f) {
        return jzm.d(this.b, f);
    }

    @Override // defpackage.jzn
    public final int en(long j) {
        return jzm.e(this.b, j);
    }

    @Override // defpackage.jzn
    public final int eo(float f) {
        return jzm.f(this.b, f);
    }

    @Override // defpackage.jzn
    public final long ep(long j) {
        return jzm.g(this.b, j);
    }

    @Override // defpackage.jzn
    public final long eq(long j) {
        return jzm.h(this.b, j);
    }

    @Override // defpackage.jzx
    public final long er(float f) {
        return jzw.b(this.b, f);
    }

    @Override // defpackage.jzn
    public final long es(float f) {
        return jzm.i(this.b, f);
    }

    @Override // defpackage.ipq
    public final ipo et(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2) {
        return this.b.et(i, i2, map, ffjiVar, ffjiVar2);
    }

    @Override // defpackage.iny
    public final boolean eu() {
        return this.b.eu();
    }

    @Override // defpackage.iny
    public final kah q() {
        return this.b.a;
    }
}
