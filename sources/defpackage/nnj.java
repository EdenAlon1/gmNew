package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnj implements nnb {
    private final nod a;
    private long f;
    private String h;
    private ndu i;
    private nni j;
    private boolean k;
    private boolean m;
    private final String b = "video/mp2t";
    private final boolean[] g = new boolean[3];
    private final nns c = new nns(7);
    private final nns d = new nns(8);
    private final nns e = new nns(6);
    private long l = -9223372036854775807L;
    private final luv n = new luv();

    public nnj(nod nodVar) {
        this.a = nodVar;
    }

    private final void f() {
        lti.g(this.i);
        int i = lvf.a;
    }

    private final void g(byte[] bArr, int i, int i2) {
        if (this.k) {
            boolean z = this.j.b;
        } else {
            this.c.a(bArr, i, i2);
            this.d.a(bArr, i, i2);
        }
        this.e.a(bArr, i, i2);
        boolean z2 = this.j.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x018f  */
    @Override // defpackage.nnb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.luv r26) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nnj.a(luv):void");
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.h = nomVar.b();
        this.i = ncrVar.p(nomVar.a(), 2);
        this.j = new nni(this.i);
        this.a.c(ncrVar, nomVar);
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
        f();
        if (z) {
            this.a.d();
            nni nniVar = this.j;
            long j = this.f;
            nniVar.e();
            nniVar.e = j;
            nniVar.a(0);
            nniVar.i = false;
        }
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.l = j;
        int i2 = i & 2;
        this.m = (i2 != 0) | this.m;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.f = 0L;
        this.m = false;
        this.l = -9223372036854775807L;
        lwa.j(this.g);
        this.c.b();
        this.d.b();
        this.e.b();
        this.a.a();
        nni nniVar = this.j;
        if (nniVar != null) {
            nniVar.d();
        }
    }
}
