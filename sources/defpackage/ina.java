package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ina implements imy, ipq, ipe {
    public final itx a;
    public imx b;
    public boolean c;

    public ina(itx itxVar, imx imxVar) {
        this.a = itxVar;
        this.b = imxVar;
    }

    @Override // defpackage.ipe
    public final ioc dX(ioc iocVar) {
        ipc ipcVar;
        iuw C = ((iwi) iocVar).C();
        return (C == null || (ipcVar = C.n) == null) ? iocVar : ipcVar;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.a.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.a.ed();
    }

    @Override // defpackage.jzx
    public final float ef(long j) {
        return jzw.a(this.a, j);
    }

    @Override // defpackage.jzn
    public final float eg(float f) {
        return jzm.a(this.a, f);
    }

    @Override // defpackage.ipq
    public final ipo ei(int i, int i2, Map map, ffji ffjiVar) {
        return ipp.a(this.a, i, i2, map, ffjiVar);
    }

    @Override // defpackage.jzn
    public final float ek(int i) {
        return jzm.b(this.a, i);
    }

    @Override // defpackage.jzn
    public final float el(long j) {
        return jzm.c(this.a, j);
    }

    @Override // defpackage.jzn
    public final float em(float f) {
        return jzm.d(this.a, f);
    }

    @Override // defpackage.jzn
    public final int en(long j) {
        return jzm.e(this.a, j);
    }

    @Override // defpackage.jzn
    public final int eo(float f) {
        return jzm.f(this.a, f);
    }

    @Override // defpackage.jzn
    public final long ep(long j) {
        return jzm.g(this.a, j);
    }

    @Override // defpackage.jzn
    public final long eq(long j) {
        return jzm.h(this.a, j);
    }

    @Override // defpackage.jzx
    public final long er(float f) {
        return jzw.b(this.a, f);
    }

    @Override // defpackage.jzn
    public final long es(float f) {
        return jzm.i(this.a, f);
    }

    @Override // defpackage.ipq
    public final ipo et(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            imn.c(a.x(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new imz(i, i2, map, ffjiVar, ffjiVar2, this);
    }

    @Override // defpackage.iny
    public final boolean eu() {
        return false;
    }

    @Override // defpackage.iny
    public final kah q() {
        return this.a.q();
    }
}
