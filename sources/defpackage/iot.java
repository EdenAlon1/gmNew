package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iot implements irg {
    public kah a = kah.b;
    public float b;
    public float c;
    final /* synthetic */ ipa d;

    public iot(ipa ipaVar) {
        this.d = ipaVar;
    }

    @Override // defpackage.irg
    public final List a(Object obj, ffjm ffjmVar) {
        ipa ipaVar = this.d;
        ipaVar.i();
        int aD = ipaVar.a.aD();
        if (aD != 1 && aD != 3 && aD != 2 && aD != 4) {
            imn.c("subcompose can only be used inside the measure or layout blocks");
        }
        cop copVar = ipaVar.g;
        Object f = copVar.f(obj);
        if (f == null) {
            f = (iui) ipaVar.j.b(obj);
            if (f != null) {
                if (ipaVar.n <= 0) {
                    imn.c("Check failed.");
                }
                ipaVar.n--;
            } else {
                f = ipaVar.f(obj);
                if (f == null) {
                    f = ipaVar.e(ipaVar.d);
                }
            }
            copVar.e(obj, f);
        }
        iui iuiVar = (iui) f;
        if (ffdx.N(ipaVar.a.I(), ipaVar.d) != iuiVar) {
            int indexOf = ipaVar.a.I().indexOf(iuiVar);
            if (indexOf < ipaVar.d) {
                imn.b(a.i(obj, "Key \"", "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item."));
            }
            int i = ipaVar.d;
            if (i != indexOf) {
                ipaVar.l(indexOf, i);
            }
        }
        ipaVar.d++;
        ipaVar.k(iuiVar, obj, ffjmVar);
        return (aD == 1 || aD == 3) ? iuiVar.F() : iuiVar.E();
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.b;
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.c;
    }

    @Override // defpackage.jzx
    public final /* synthetic */ float ef(long j) {
        return jzw.a(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float eg(float f) {
        return jzm.a(this, f);
    }

    @Override // defpackage.ipq
    public final /* synthetic */ ipo ei(int i, int i2, Map map, ffji ffjiVar) {
        return ipp.a(this, i, i2, map, ffjiVar);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float ek(int i) {
        return jzm.b(this, i);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float el(long j) {
        return jzm.c(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ float em(float f) {
        return jzm.d(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int en(long j) {
        return jzm.e(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ int eo(float f) {
        return jzm.f(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long ep(long j) {
        return jzm.g(this, j);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long eq(long j) {
        return jzm.h(this, j);
    }

    @Override // defpackage.jzx
    public final /* synthetic */ long er(float f) {
        return jzw.b(this, f);
    }

    @Override // defpackage.jzn
    public final /* synthetic */ long es(float f) {
        return jzm.i(this, f);
    }

    @Override // defpackage.ipq
    public final ipo et(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            imn.c(a.x(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new ios(i, i2, map, ffjiVar, this, this.d, ffjiVar2);
    }

    @Override // defpackage.iny
    public final boolean eu() {
        return this.d.a.aD() == 4 || this.d.a.aD() == 2;
    }

    @Override // defpackage.iny
    public final kah q() {
        return this.a;
    }
}
