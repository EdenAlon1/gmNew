package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajez extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ ajfa c;
    final /* synthetic */ eisx d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajez(ajfa ajfaVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ajfaVar;
        this.d = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0076, code lost:
    
        if (r6 == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ee  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajez.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ajez(this.c, this.d, ffguVar);
    }
}
