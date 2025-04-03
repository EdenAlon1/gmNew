package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgil extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgis b;
    final /* synthetic */ Integer c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgil(cgis cgisVar, Integer num, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgisVar;
        this.c = num;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgil) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0141, code lost:
    
        if (defpackage.ffra.a((defpackage.ffhd) r10, r2, r9) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0147, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0034, code lost:
    
        if (r10 != r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L32;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgil.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgil(this.b, this.c, ffguVar);
    }
}
