package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iei extends iej {
    private final iff a;
    private final iff b;
    private final float[] c;

    public iei(iff iffVar, iff iffVar2) {
        super(iffVar2, iffVar, iffVar2);
        float[] f;
        this.a = iffVar;
        this.b = iffVar2;
        if (idz.c(iffVar.d, iffVar2.d)) {
            f = idz.f(iffVar2.j, iffVar.i);
        } else {
            float[] fArr = iffVar.i;
            float[] fArr2 = iffVar2.j;
            float[] a = iffVar.d.a();
            float[] a2 = iffVar2.d.a();
            ifi ifiVar = iffVar.d;
            ifi ifiVar2 = iem.a;
            f = idz.f(idz.c(iffVar2.d, iem.b) ? fArr2 : idz.e(idz.f(idz.d(idw.b.c, a2, iem.a()), iffVar2.i)), idz.c(ifiVar, iem.b) ? fArr : idz.f(idz.d(idw.b.c, a, iem.a()), iffVar.i));
        }
        this.c = f;
    }

    @Override // defpackage.iej
    public final long a(long j) {
        double d = ibw.d(j);
        float c = ibw.c(j);
        float b = ibw.b(j);
        float a = (float) this.a.p.a(d);
        float a2 = (float) this.a.p.a(c);
        float a3 = (float) this.a.p.a(b);
        float[] fArr = this.c;
        float f = fArr[0] * a;
        float f2 = fArr[3] * a2;
        float f3 = fArr[6] * a3;
        float f4 = fArr[1] * a;
        float f5 = fArr[4] * a2;
        float f6 = fArr[7] * a3;
        float f7 = fArr[2] * a;
        float f8 = fArr[5] * a2;
        return iby.f((float) this.b.m.a(f + f2 + f3), (float) this.b.m.a(f4 + f5 + f6), (float) this.b.m.a(f7 + f8 + (fArr[8] * a3)), ibw.a(j), this.b);
    }
}
