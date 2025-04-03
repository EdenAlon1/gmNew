package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emat extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ emar c;
    final /* synthetic */ ffjm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emat(emar emarVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = emarVar;
        this.d = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((emat) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        if (defpackage.ffhh.a != r0) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 == r2) goto L13
            java.lang.Object r0 = r5.e
            fgjb r0 = (defpackage.fgjb) r0
            defpackage.ffci.b(r6)     // Catch: java.lang.Throwable -> L11
            goto L5b
        L11:
            r6 = move-exception
            goto L63
        L13:
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.e
            fgjb r2 = (defpackage.fgjb) r2
            defpackage.ffci.b(r6)
            r6 = r2
            goto L4b
        L1e:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.e
            ffsk r6 = (defpackage.ffsk) r6
            defpackage.ffsl.f(r6)
            emar r6 = r5.c
            ffjm r1 = r5.d
            fgjb r6 = r6.a
            r5.e = r6
            r5.a = r1
            r5.b = r2
            emas r2 = defpackage.emas.a
            java.lang.Object r2 = defpackage.ffhi.a(r2, r6, r5)
            ffhh r3 = defpackage.ffhh.a
            if (r2 == r3) goto L47
            ffgu r2 = defpackage.ffhi.c(r5)
            ffcu r3 = defpackage.ffcu.a
            r2.w(r3)
        L47:
            ffhh r2 = defpackage.ffhh.a
            if (r2 == r0) goto L67
        L4b:
            r5.e = r6     // Catch: java.lang.Throwable -> L5f
            r2 = 0
            r5.a = r2     // Catch: java.lang.Throwable -> L5f
            r2 = 2
            r5.b = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = defpackage.ffsl.a(r1, r5)     // Catch: java.lang.Throwable -> L5f
            if (r1 == r0) goto L67
            r0 = r6
            r6 = r1
        L5b:
            defpackage.fgja.c(r0)
            return r6
        L5f:
            r0 = move-exception
            r4 = r0
            r0 = r6
            r6 = r4
        L63:
            defpackage.fgja.c(r0)
            throw r6
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emat.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        emat ematVar = new emat(this.c, this.d, ffguVar);
        ematVar.e = obj;
        return ematVar;
    }
}
