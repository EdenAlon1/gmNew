package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnd implements nnb {
    private static final double[] a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String b;
    private ndu c;
    private final nop d;
    private final String e;
    private final luv f;
    private final nns g;
    private final boolean[] h = new boolean[4];
    private final nnc i = new nnc();
    private long j;
    private boolean k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private boolean r;

    public nnd(nop nopVar, String str) {
        luv luvVar;
        this.d = nopVar;
        this.e = str;
        if (nopVar != null) {
            this.g = new nns(178);
            luvVar = new luv();
        } else {
            luvVar = null;
            this.g = null;
        }
        this.f = luvVar;
        this.n = -9223372036854775807L;
        this.p = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x010a  */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r22) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnd.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.b = nomVar.b();
        this.c = ncrVar.p(nomVar.a(), 2);
        nop nopVar = this.d;
        if (nopVar != null) {
            nopVar.b(ncrVar, nomVar);
        }
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
        lti.g(this.c);
        if (z) {
            boolean z2 = this.q;
            long j = this.j - this.o;
            this.c.o(this.p, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.n = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        lwa.j(this.h);
        nnc nncVar = this.i;
        nncVar.b = false;
        nncVar.c = 0;
        nncVar.d = 0;
        nns nnsVar = this.g;
        if (nnsVar != null) {
            nnsVar.b();
        }
        this.j = 0L;
        this.k = false;
        this.n = -9223372036854775807L;
        this.p = -9223372036854775807L;
    }
}
