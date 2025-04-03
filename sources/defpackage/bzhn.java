package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzhn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bzho b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzhn(bzho bzhoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bzhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzhn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r14 != r0) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzhn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzhn(this.b, ffguVar);
    }
}
