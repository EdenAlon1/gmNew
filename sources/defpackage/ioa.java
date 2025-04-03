package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioa implements ipq, iny {
    private final kah a;
    private final /* synthetic */ iny b;

    public ioa(iny inyVar, kah kahVar) {
        this.a = kahVar;
        this.b = inyVar;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.b.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.b.ed();
    }

    @Override // defpackage.jzx
    public final float ef(long j) {
        return this.b.ef(j);
    }

    @Override // defpackage.jzn
    public final float eg(float f) {
        return this.b.eg(f);
    }

    @Override // defpackage.ipq
    public final /* synthetic */ ipo ei(int i, int i2, Map map, ffji ffjiVar) {
        return ipp.a(this, i, i2, map, ffjiVar);
    }

    @Override // defpackage.jzn
    public final float ek(int i) {
        return this.b.ek(i);
    }

    @Override // defpackage.jzn
    public final float el(long j) {
        return this.b.el(j);
    }

    @Override // defpackage.jzn
    public final float em(float f) {
        return this.b.em(f);
    }

    @Override // defpackage.jzn
    public final int en(long j) {
        return this.b.en(j);
    }

    @Override // defpackage.jzn
    public final int eo(float f) {
        return this.b.eo(f);
    }

    @Override // defpackage.jzn
    public final long ep(long j) {
        return this.b.ep(j);
    }

    @Override // defpackage.jzn
    public final long eq(long j) {
        return this.b.eq(j);
    }

    @Override // defpackage.jzx
    public final long er(float f) {
        return this.b.er(f);
    }

    @Override // defpackage.jzn
    public final long es(float f) {
        return this.b.es(f);
    }

    @Override // defpackage.ipq
    public final ipo et(int i, int i2, Map map, ffji ffjiVar, ffji ffjiVar2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            imn.c(a.x(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new inz(i, i2, map, ffjiVar);
    }

    @Override // defpackage.iny
    public final boolean eu() {
        return this.b.eu();
    }

    @Override // defpackage.iny
    public final kah q() {
        return this.a;
    }
}
