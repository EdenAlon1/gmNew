package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nos implements nor {
    private final ncr a;
    private final ndu b;
    private final nou c;
    private final lqc d;
    private final int e;
    private long f;
    private int g;
    private long h;

    public nos(ncr ncrVar, ndu nduVar, nou nouVar, String str, int i) {
        this.a = ncrVar;
        this.b = nduVar;
        this.c = nouVar;
        int i2 = nouVar.b * nouVar.e;
        int i3 = nouVar.d;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw new lrg(a.r(i3, i4, "Expected block size: ", "; got: "), null, true, 1);
        }
        int i5 = nouVar.c * i4;
        int i6 = i5 * 8;
        int max = Math.max(i4, i5 / 10);
        this.e = max;
        lqb lqbVar = new lqb();
        lqbVar.a("audio/wav");
        lqbVar.c(str);
        lqbVar.h = i6;
        lqbVar.i = i6;
        lqbVar.n = max;
        lqbVar.C = nouVar.b;
        lqbVar.D = nouVar.c;
        lqbVar.E = i;
        this.d = new lqc(lqbVar);
    }

    @Override // defpackage.nor
    public final void a(int i, long j) {
        this.a.w(new nox(this.c, 1, i, j));
        this.b.i(this.d);
        this.b.v();
    }

    @Override // defpackage.nor
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.nor
    public final boolean c(ncp ncpVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int e = this.b.e(ncpVar, (int) Math.min(i2 - i, j2), true);
            if (e == -1) {
                j2 = 0;
            } else {
                this.g += e;
                j2 -= e;
            }
        }
        nou nouVar = this.c;
        int i3 = this.g;
        int i4 = nouVar.d;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long w = this.f + lvf.w(this.h, 1000000L, nouVar.c);
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.o(w, 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        return j2 <= 0;
    }
}
