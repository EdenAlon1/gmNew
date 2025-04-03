package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cprm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cprn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprm(cprn cprnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cprnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0107, code lost:
    
        if (defpackage.ffqv.a(r2, r10) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x010c, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0016, code lost:
    
        if (r11 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L23;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cprm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cprm(this.b, ffguVar);
    }
}
