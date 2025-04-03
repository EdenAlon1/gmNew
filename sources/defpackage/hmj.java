package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmj extends hmq {
    public static final hmj a = new hmj();

    private hmj() {
        super(1, 0, 2);
    }

    @Override // defpackage.hmq
    protected final void a(hmv hmvVar, hep hepVar, hjv hjvVar, hjj hjjVar, hmr hmrVar) {
        int i;
        int a2 = hmvVar.a(0);
        int g = hjvVar.g();
        int i2 = hjvVar.s;
        int q = hjvVar.q(i2);
        int c = hjvVar.c(hjvVar.b, hjvVar.h(i2 + 1));
        for (int max = Math.max(q, c - a2); max < c; max++) {
            Object obj = hjvVar.c[hjvVar.d(max)];
            if (obj instanceof hjl) {
                int i3 = g - max;
                hjl hjlVar = (hjl) obj;
                hen henVar = hjlVar.b;
                int i4 = -1;
                if (henVar == null || !henVar.a()) {
                    i = -1;
                } else {
                    i4 = hjvVar.a(henVar);
                    i = hjvVar.g() - hjvVar.p(i4);
                }
                ((hqe) hjjVar).d(hjlVar, i3, i4, i);
            } else if (obj instanceof hio) {
                ((hio) obj).b();
            }
        }
        if (a2 <= 0) {
            hfp.j("Check failed");
        }
        int i5 = hjvVar.s;
        int n = hjvVar.n(hjvVar.b, hjvVar.h(i5));
        int c2 = hjvVar.c(hjvVar.b, hjvVar.h(i5 + 1)) - a2;
        if (c2 < n) {
            hfp.j("Check failed");
        }
        hjvVar.J(c2, a2, i5);
        int i6 = hjvVar.i;
        if (i6 >= n) {
            hjvVar.i = i6 - a2;
        }
    }
}
