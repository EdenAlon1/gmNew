package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxb implements qvk, qvj {
    public final qvl a;
    public final qvj b;
    public volatile Object c;
    public volatile qvh d;
    private volatile int e;
    private volatile qvg f;
    private volatile ran g;

    public qxb(qvl qvlVar, qvj qvjVar) {
        this.a = qvlVar;
        this.b = qvjVar;
    }

    @Override // defpackage.qvk
    public final void a() {
        ran ranVar = this.g;
        if (ranVar != null) {
            ranVar.c.d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b A[Catch: IOException -> 0x0123, TRY_ENTER, TryCatch #4 {IOException -> 0x0123, blocks: (B:20:0x00b2, B:58:0x011b, B:59:0x0122), top: B:4:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    @Override // defpackage.qvk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxb.b():boolean");
    }

    @Override // defpackage.qvj
    public final void c(qtp qtpVar, Exception exc, qud qudVar, qsy qsyVar) {
        this.b.c(qtpVar, exc, qudVar, this.g.c.eV());
    }

    @Override // defpackage.qvj
    public final void d(qtp qtpVar, Object obj, qud qudVar, qsy qsyVar, qtp qtpVar2) {
        this.b.d(qtpVar, obj, qudVar, this.g.c.eV(), qtpVar);
    }

    final boolean e(ran ranVar) {
        ran ranVar2 = this.g;
        return ranVar2 != null && ranVar2 == ranVar;
    }
}
