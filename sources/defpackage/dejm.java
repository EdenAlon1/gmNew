package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dejm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dejl b;
    final /* synthetic */ eisx c;
    final /* synthetic */ cvjl d;
    final /* synthetic */ cjtw e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dejm(dejl dejlVar, eisx eisxVar, cvjl cvjlVar, cjtw cjtwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dejlVar;
        this.c = eisxVar;
        this.d = cvjlVar;
        this.e = cjtwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dejm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00ba, code lost:
    
        r8 = (defpackage.cjgc) r7.b.d.get();
        r7.a = 5;
        r8 = r8.g(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cb, code lost:
    
        if (r8 != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ea, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        r8 = (defpackage.fbpu) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r8 != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        if (r8.b(r1, r7) != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
    
        if (r8.c(r1, r6, r7) != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x003e, code lost:
    
        if (r8 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r1 != 4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b8, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L34;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dejm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dejm(this.b, this.c, this.d, this.e, ffguVar);
    }
}
