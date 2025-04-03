package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lka extends ffhv implements ffjm {
    int a;
    final /* synthetic */ lld b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lka(lld lldVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = lldVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lka) c((ffxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (defpackage.ffra.a(r8, r5, r7) != r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [llh] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L15
            java.lang.Object r0 = r7.c
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            defpackage.ffci.b(r8)
            goto L7f
        L15:
            java.lang.Object r1 = r7.c
            llh r1 = (defpackage.llh) r1
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L1d
            goto L57
        L1d:
            r8 = move-exception
            goto L5d
        L1f:
            java.lang.Object r1 = r7.c
            llh r1 = (defpackage.llh) r1
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L1d
            goto L4c
        L27:
            defpackage.ffci.b(r8)
            java.lang.Object r8 = r7.c
            ffxe r8 = (defpackage.ffxe) r8
            ljx r1 = new ljx
            r1.<init>()
            ffsd r8 = defpackage.fftc.a     // Catch: java.lang.Throwable -> L1d
            ffuu r8 = defpackage.fghh.a     // Catch: java.lang.Throwable -> L1d
            ffuu r8 = r8.j()     // Catch: java.lang.Throwable -> L1d
            ljy r5 = new ljy     // Catch: java.lang.Throwable -> L1d
            lld r6 = r7.b     // Catch: java.lang.Throwable -> L1d
            r5.<init>(r6, r1, r2)     // Catch: java.lang.Throwable -> L1d
            r7.c = r1     // Catch: java.lang.Throwable -> L1d
            r7.a = r4     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r8 = defpackage.ffra.a(r8, r5, r7)     // Catch: java.lang.Throwable -> L1d
            if (r8 == r0) goto L7d
        L4c:
            r7.c = r1     // Catch: java.lang.Throwable -> L1d
            r7.a = r3     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r8 = defpackage.ffsw.b(r7)     // Catch: java.lang.Throwable -> L1d
            if (r8 != r0) goto L57
            goto L7d
        L57:
            ffbx r8 = new ffbx     // Catch: java.lang.Throwable -> L1d
            r8.<init>()     // Catch: java.lang.Throwable -> L1d
            throw r8     // Catch: java.lang.Throwable -> L1d
        L5d:
            ffsd r3 = defpackage.fftc.a
            ffuu r3 = defpackage.fghh.a
            ffuu r3 = r3.j()
            ffuw r4 = defpackage.ffuw.a
            ffhd r3 = r3.plus(r4)
            lld r4 = r7.b
            ljz r5 = new ljz
            r5.<init>(r4, r1, r2)
            r7.c = r8
            r1 = 3
            r7.a = r1
            java.lang.Object r1 = defpackage.ffra.a(r3, r5, r7)
            if (r1 != r0) goto L7e
        L7d:
            return r0
        L7e:
            r0 = r8
        L7f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lka.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        lka lkaVar = new lka(this.b, ffguVar);
        lkaVar.c = obj;
        return lkaVar;
    }
}
