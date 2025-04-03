package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnp implements nnb {
    private String f;
    private ndu g;
    private boolean j;
    private int l;
    private int m;
    private int o;
    private int p;
    private int t;
    private boolean v;
    private final String a = "video/mp2t";
    private int e = 0;
    private final luv b = new luv(new byte[15], 2);
    private final luu c = new luu();
    private final luv d = new luv();
    private final nnq q = new nnq();
    private int r = -2147483647;
    private int s = -1;
    private long u = -1;
    private boolean k = true;
    private boolean n = true;
    private double h = -9.223372036854776E18d;
    private double i = -9.223372036854776E18d;

    private static final void f(luv luvVar, luv luvVar2, boolean z) {
        int i = luvVar.b;
        int min = Math.min(luvVar.b(), luvVar2.b());
        luvVar.F(luvVar2.a, luvVar2.b, min);
        luvVar2.L(min);
        if (z) {
            luvVar.K(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0370 A[SYNTHETIC] */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r25) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnp.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.f = nomVar.b();
        this.g = ncrVar.p(nomVar.a(), 1);
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.l = i;
        if (!this.k && (this.p != 0 || !this.n)) {
            this.j = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.j) {
                this.i = d;
            } else {
                this.h = d;
            }
        }
    }

    @Override // defpackage.nnb
    public final void e() {
        this.e = 0;
        this.m = 0;
        this.b.G(2);
        this.o = 0;
        this.p = 0;
        this.r = -2147483647;
        this.s = -1;
        this.t = 0;
        this.u = -1L;
        this.v = false;
        this.j = false;
        this.n = true;
        this.k = true;
        this.h = -9.223372036854776E18d;
        this.i = -9.223372036854776E18d;
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
    }
}
