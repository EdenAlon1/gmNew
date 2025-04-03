package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adjq extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ adjr c;
    final /* synthetic */ eisx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adjq(adjr adjrVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = adjrVar;
        this.d = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adjq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ce, code lost:
    
        if (defpackage.fgfz.c(r8, r7) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00eb, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        if (defpackage.fgfz.c(r8, r7) != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r8 != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (r8 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (defpackage.fgfz.c(r8, r7) != r0) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adjq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adjq(this.c, this.d, ffguVar);
    }
}
