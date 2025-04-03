package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmfu extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ String d;
    final /* synthetic */ cmgg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmfu(String str, cmgg cmggVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = str;
        this.e = cmggVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmfu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r15 != r0) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmfu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmfu(this.d, this.e, ffguVar);
    }
}
