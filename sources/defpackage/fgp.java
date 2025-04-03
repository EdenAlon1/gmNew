package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fgp implements fen {
    private final boolean a;
    private final int b;
    private final int c;
    private final fcy d;
    private final fcw e;

    public fgp(boolean z, int i, int i2, fcy fcyVar, fcw fcwVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = fcyVar;
        this.e = fcwVar;
    }

    @Override // defpackage.fen
    public final int a() {
        return this.c;
    }

    @Override // defpackage.fen
    public final int b() {
        return 1;
    }

    @Override // defpackage.fen
    public final int c() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r4.a.b <= r4.b.b) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r4.a.b <= r4.b.b) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r4 = defpackage.fcy.a(r4, null, null, !r0, 3);
     */
    @Override // defpackage.fen
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cnj d(defpackage.fcy r4) {
        /*
            r3 = this;
            boolean r0 = r4.c
            if (r0 != 0) goto Le
            fcx r1 = r4.a
            fcx r2 = r4.b
            int r1 = r1.b
            int r2 = r2.b
            if (r1 > r2) goto L1a
        Le:
            if (r0 == 0) goto L22
            fcx r1 = r4.a
            fcx r2 = r4.b
            int r1 = r1.b
            int r2 = r2.b
            if (r1 > r2) goto L22
        L1a:
            r0 = r0 ^ 1
            r1 = 3
            r2 = 0
            fcy r4 = defpackage.fcy.a(r4, r2, r2, r0, r1)
        L22:
            fcw r0 = r3.e
            long r0 = r0.a
            cnj r4 = defpackage.cnk.b(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgp.d(fcy):cnj");
    }

    @Override // defpackage.fen
    public final fcw e() {
        return this.e;
    }

    @Override // defpackage.fen
    public final fcw f() {
        return this.e;
    }

    @Override // defpackage.fen
    public final fcw g() {
        return this.e;
    }

    @Override // defpackage.fen
    public final fcw i() {
        return this.e;
    }

    @Override // defpackage.fen
    public final fcy j() {
        return this.d;
    }

    @Override // defpackage.fen
    public final boolean l() {
        return this.a;
    }

    @Override // defpackage.fen
    public final boolean m(fen fenVar) {
        return (this.d != null && fenVar != null && (fenVar instanceof fgp) && this.b == fenVar.c() && this.c == fenVar.a() && this.a == fenVar.l() && !this.e.e(((fgp) fenVar).e)) ? false : true;
    }

    @Override // defpackage.fen
    public final int o() {
        int i = this.b;
        int i2 = this.c;
        if (i < i2) {
            return 2;
        }
        if (i > i2) {
            return 1;
        }
        return this.e.f();
    }

    public final String toString() {
        return "SingleSelectionLayout(isStartHandle=" + this.a + ", crossed=" + ((Object) fcm.a(o())) + ", info=\n\t" + this.e + ')';
    }

    @Override // defpackage.fen
    public final void k(ffji ffjiVar) {
    }
}
