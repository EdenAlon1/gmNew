package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxy extends hvh implements itu, itg {
    public igq a;
    public boolean b;
    public huo c;
    public inp d;
    public float e;
    public ibx f;

    public hxy(igq igqVar, boolean z, huo huoVar, inp inpVar, float f, ibx ibxVar) {
        this.a = igqVar;
        this.b = z;
        this.c = huoVar;
        this.d = inpVar;
        this.e = f;
        this.f = ibxVar;
    }

    private final long a(long j) {
        char c;
        boolean z = jzk.i(j) && jzk.h(j);
        boolean z2 = jzk.k(j) && jzk.j(j);
        if ((!i() && z) || z2) {
            return jzk.m(j, jzk.b(j), 0, jzk.a(j), 0, 10);
        }
        long a = this.a.a();
        long floatToRawIntBits = (Float.floatToRawIntBits(jzl.c(j, k(a) ? Math.round(Float.intBitsToFloat((int) (a >> 32))) : jzk.d(j))) << 32) | (Float.floatToRawIntBits(jzl.b(j, j(a) ? Math.round(Float.intBitsToFloat((int) (a & 4294967295L))) : jzk.c(j))) & 4294967295L);
        if (i()) {
            int i = (int) (floatToRawIntBits >> 32);
            float intBitsToFloat = !k(this.a.a()) ? Float.intBitsToFloat(i) : Float.intBitsToFloat((int) (this.a.a() >> 32));
            float intBitsToFloat2 = !j(this.a.a()) ? Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat2);
            long j2 = floatToRawIntBits2 << 32;
            long j3 = floatToRawIntBits3 & 4294967295L;
            if (Float.intBitsToFloat(i) == 0.0f) {
                c = ' ';
            } else {
                c = ' ';
                if (Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) != 0.0f) {
                    long j4 = j2 | j3;
                    floatToRawIntBits = iqv.a(j4, this.d.a(j4, floatToRawIntBits));
                }
            }
            floatToRawIntBits = 0;
        } else {
            c = ' ';
        }
        return jzk.m(j, jzl.c(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> c)))), 0, jzl.b(j, Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), 0, 10);
    }

    private final boolean i() {
        return this.b && this.a.a() != 9205357640488583168L;
    }

    private static final boolean j(long j) {
        return !iar.f(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    private static final boolean k(long j) {
        return !iar.f(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    @Override // defpackage.itu
    public final ipo b(ipq ipqVar, ipl iplVar, long j) {
        ipo ei;
        iqk e = iplVar.e(a(j));
        ei = ipqVar.ei(e.a, e.b, ffem.a, new hxx(e));
        return ei;
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.itu
    public final int e(iny inyVar, inx inxVar, int i) {
        if (!i()) {
            return inxVar.a(i);
        }
        long a = a(jzl.k(0, i, 0, 13));
        return Math.max(jzk.c(a), inxVar.a(i));
    }

    @Override // defpackage.itu
    public final int f(iny inyVar, inx inxVar, int i) {
        if (!i()) {
            return inxVar.b(i);
        }
        long a = a(jzl.k(0, 0, i, 7));
        return Math.max(jzk.d(a), inxVar.b(i));
    }

    @Override // defpackage.itu
    public final int g(iny inyVar, inx inxVar, int i) {
        if (!i()) {
            return inxVar.c(i);
        }
        long a = a(jzl.k(0, i, 0, 13));
        return Math.max(jzk.c(a), inxVar.c(i));
    }

    @Override // defpackage.itu
    public final int h(iny inyVar, inx inxVar, int i) {
        if (!i()) {
            return inxVar.d(i);
        }
        long a = a(jzl.k(0, 0, i, 7));
        return Math.max(jzk.d(a), inxVar.d(i));
    }

    @Override // defpackage.itg
    public final void s(ifo ifoVar) {
        long j;
        long a = this.a.a();
        float intBitsToFloat = k(a) ? Float.intBitsToFloat((int) (a >> 32)) : Float.intBitsToFloat((int) (ifoVar.b() >> 32));
        float intBitsToFloat2 = j(a) ? Float.intBitsToFloat((int) (a & 4294967295L)) : Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L));
        long floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L;
        if (Float.intBitsToFloat((int) (ifoVar.b() >> 32)) == 0.0f || Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L)) == 0.0f) {
            j = 0;
        } else {
            long j2 = floatToRawIntBits2 | floatToRawIntBits;
            j = iqv.a(j2, this.d.a(j2, ifoVar.b()));
        }
        long j3 = j;
        long a2 = this.c.a((Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j3 >> 32))) << 32), (Math.round(Float.intBitsToFloat((int) (ifoVar.b() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L))) & 4294967295L), ifoVar.q());
        float a3 = kaa.a(a2);
        float b = kaa.b(a2);
        ifoVar.t().c.e(a3, b);
        float f = -a3;
        float f2 = -b;
        try {
            this.a.e(ifoVar, j3, this.e, this.f);
            ifoVar.t().c.e(f, f2);
            ifoVar.p();
        } catch (Throwable th) {
            ifoVar.t().c.e(f, f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }

    @Override // defpackage.itg
    public final /* synthetic */ void u() {
    }
}
