package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxx extends hvh implements itu {
    public float a;

    public dxx(float f) {
        this.a = f;
    }

    private final long a(long j, boolean z) {
        int a = jzk.a(j);
        if (a == Integer.MAX_VALUE) {
            return 0L;
        }
        int round = Math.round(a * this.a);
        if (round <= 0) {
            return 0L;
        }
        if (!z || dxv.a(j, round, a)) {
            return (round << 32) | a;
        }
        return 0L;
    }

    private final long i(long j, boolean z) {
        int b = jzk.b(j);
        if (b == Integer.MAX_VALUE) {
            return 0L;
        }
        int round = Math.round(b / this.a);
        if (round <= 0) {
            return 0L;
        }
        if (z && !dxv.a(j, b, round)) {
            return 0L;
        }
        return (b << 32) | (round & 4294967295L);
    }

    private final long j(long j, boolean z) {
        int c = jzk.c(j);
        int round = Math.round(c * this.a);
        if (round <= 0) {
            return 0L;
        }
        if (!z || dxv.a(j, round, c)) {
            return (round << 32) | c;
        }
        return 0L;
    }

    private final long k(long j, boolean z) {
        int d = jzk.d(j);
        int round = Math.round(d / this.a);
        if (round <= 0) {
            return 0L;
        }
        if (z && !dxv.a(j, d, round)) {
            return 0L;
        }
        return (d << 32) | (round & 4294967295L);
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        long i = i(j, true);
        if (kaf.e(i, 0L)) {
            i = a(j, true);
            if (kaf.e(i, 0L)) {
                i = k(j, true);
                if (kaf.e(i, 0L)) {
                    i = j(j, true);
                    if (kaf.e(i, 0L)) {
                        i = i(j, false);
                        if (kaf.e(i, 0L)) {
                            i = a(j, false);
                            if (kaf.e(i, 0L)) {
                                i = k(j, false);
                                if (kaf.e(i, 0L)) {
                                    i = j(j, false);
                                    if (kaf.e(i, 0L)) {
                                        i = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!kaf.e(i, 0L)) {
            j = jzj.c((int) (i >> 32), (int) (i & 4294967295L));
        }
        iqk e = iplVar.e(j);
        ei = ipqVar.ei(e.a, e.b, ffem.a, new dxw(e));
        return ei;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return inxVar.a(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return inxVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i * this.a);
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return inxVar.c(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i / this.a);
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        if (i == Integer.MAX_VALUE) {
            return inxVar.d(Alert.DURATION_SHOW_INDEFINITELY);
        }
        return Math.round(i * this.a);
    }
}
