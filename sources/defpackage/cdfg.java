package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdfg extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cdfh c;
    final /* synthetic */ ceuw d;
    final /* synthetic */ cdvx e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdfg(cdfh cdfhVar, ceuw ceuwVar, cdvx cdvxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cdfhVar;
        this.d = ceuwVar;
        this.e = cdvxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdfg) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
    
        if (r6 == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r6 != r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r6 != r0) goto L22;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdfg.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cdfg(this.c, this.d, this.e, ffguVar);
    }
}
