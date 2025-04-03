package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class noq implements nor {
    private static final int[] a = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] b = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final ncr c;
    private final ndu d;
    private final nou e;
    private final int f;
    private final byte[] g;
    private final luv h;
    private final int i;
    private final lqc j;
    private int k;
    private long l;
    private int m;
    private long n;

    public noq(ncr ncrVar, ndu nduVar, nou nouVar) {
        this.c = ncrVar;
        this.d = nduVar;
        this.e = nouVar;
        int max = Math.max(1, nouVar.c / 10);
        this.i = max;
        luv luvVar = new luv(nouVar.f);
        luvVar.h();
        int h = luvVar.h();
        this.f = h;
        int i = nouVar.b;
        int i2 = (((nouVar.d - (i * 4)) * 8) / (nouVar.e * i)) + 1;
        if (h != i2) {
            throw new lrg(a.r(h, i2, "Expected frames per block: ", "; got: "), null, true, 1);
        }
        int c = lvf.c(max, h);
        this.g = new byte[nouVar.d * c];
        this.h = new luv(c * (h + h) * i);
        int i3 = ((nouVar.c * nouVar.d) * 8) / h;
        lqb lqbVar = new lqb();
        lqbVar.c("audio/raw");
        lqbVar.h = i3;
        lqbVar.i = i3;
        lqbVar.n = (max + max) * i;
        lqbVar.C = nouVar.b;
        lqbVar.D = nouVar.c;
        lqbVar.E = 2;
        this.j = new lqc(lqbVar);
    }

    private final int d(int i) {
        int i2 = this.e.b;
        return i / (i2 + i2);
    }

    private final int e(int i) {
        return (i + i) * this.e.b;
    }

    private final void f(int i) {
        long w = this.l + lvf.w(this.n, 1000000L, this.e.c);
        int e = e(i);
        this.d.o(w, 1, e, this.m - e, null);
        this.n += i;
        this.m -= e;
    }

    @Override // defpackage.nor
    public final void a(int i, long j) {
        this.c.w(new nox(this.e, this.f, i, j));
        this.d.i(this.j);
        this.d.v();
    }

    @Override // defpackage.nor
    public final void b(long j) {
        this.k = 0;
        this.l = j;
        this.m = 0;
        this.n = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x003a -> B:3:0x001e). Please report as a decompilation issue!!! */
    @Override // defpackage.nor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.ncp r21, long r22) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noq.c(ncp, long):boolean");
    }
}
