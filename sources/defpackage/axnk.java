package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axnk extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ffxe e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axnk(ffxe ffxeVar, ffji ffjiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = ffxeVar;
        this.d = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axnk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (((defpackage.ffwn) r1).a(r2, r3) != r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
    
        if (r4 == r0) goto L19;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.c
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)
            goto L47
        Ld:
            java.lang.Object r1 = r3.b
            java.lang.Object r2 = r3.a
            defpackage.ffci.b(r4)     // Catch: java.lang.Throwable -> L15
            goto L31
        L15:
            r4 = move-exception
            r1 = r2
            goto L2d
        L18:
            defpackage.ffci.b(r4)
            ffxe r1 = r3.e
            ffji r4 = r3.d     // Catch: java.lang.Throwable -> L2c
            r3.a = r1     // Catch: java.lang.Throwable -> L2c
            r3.b = r1     // Catch: java.lang.Throwable -> L2c
            r3.c = r2     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L2c
            if (r4 != r0) goto L31
            goto L46
        L2c:
            r4 = move-exception
        L2d:
            java.lang.Object r4 = defpackage.ffci.a(r4)
        L31:
            ffch r2 = new ffch
            r2.<init>(r4)
            r4 = 0
            r3.a = r4
            r3.b = r4
            r4 = 2
            r3.c = r4
            ffwn r1 = (defpackage.ffwn) r1
            java.lang.Object r4 = r1.a(r2, r3)
            if (r4 != r0) goto L47
        L46:
            return r0
        L47:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axnk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new axnk(this.e, this.d, ffguVar);
    }
}
