package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yea extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yec b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yea(ffgu ffguVar, yec yecVar) {
        super(2, ffguVar);
        this.b = yecVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yea) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r4.b.a((defpackage.ffud) r5, r4) == r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r5 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r5)
            goto L3a
        Ld:
            defpackage.ffci.b(r5)
            goto L2c
        L11:
            defpackage.ffci.b(r5)
            java.lang.Object r5 = r4.c
            ffsk r5 = (defpackage.ffsk) r5
            yec r5 = r4.b
            r4.a = r2
            ydb r1 = r5.e
            ydy r2 = r5.c
            ffsk r3 = r5.a
            fgdj r1 = r1.a
            j$.time.Duration r5 = r5.d
            java.lang.Object r5 = r2.f(r3, r1, r5)
            if (r5 == r0) goto L3d
        L2c:
            yec r1 = r4.b
            ffud r5 = (defpackage.ffud) r5
            r2 = 2
            r4.a = r2
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 != r0) goto L3a
            goto L3d
        L3a:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yea.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yea yeaVar = new yea(ffguVar, this.b);
        yeaVar.c = obj;
        return yeaVar;
    }
}
