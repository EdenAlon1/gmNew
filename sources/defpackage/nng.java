package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nng implements nnb {
    private static final float[] a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final nop b;
    private nnf g;
    private long h;
    private String i;
    private ndu j;
    private boolean k;
    private final boolean[] d = new boolean[4];
    private final nne e = new nne();
    private long l = -9223372036854775807L;
    private final nns f = new nns(178);
    private final luv c = new luv();

    public nng(nop nopVar) {
        this.b = nopVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013d  */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r19) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nng.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.i = nomVar.b();
        this.j = ncrVar.p(nomVar.a(), 2);
        this.g = new nnf(this.j);
        this.b.b(ncrVar, nomVar);
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
        lti.g(this.g);
        if (z) {
            this.g.b(this.h, 0, this.k);
            this.g.c();
        }
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.l = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        lwa.j(this.d);
        this.e.b();
        nnf nnfVar = this.g;
        if (nnfVar != null) {
            nnfVar.c();
        }
        this.f.b();
        this.h = 0L;
        this.l = -9223372036854775807L;
    }
}
