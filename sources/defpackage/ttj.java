package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ttj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ttk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ttj(ttk ttkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ttkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ttj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        if (r4.d(r3) == r0) goto L23;
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
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r4)     // Catch: java.lang.Throwable -> L11
            goto L52
        Ld:
            defpackage.ffci.b(r4)     // Catch: java.lang.Throwable -> L11
            goto L3d
        L11:
            r4 = move-exception
            goto L5a
        L13:
            defpackage.ffci.b(r4)
            emyl r4 = defpackage.csfu.f
            java.lang.Object r4 = r4.get()
            cfup r4 = (defpackage.cfup) r4
            java.lang.Object r4 = r4.e()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L68
            boolean r4 = defpackage.csgj.a()
            if (r4 == 0) goto L68
            ttk r4 = r3.b     // Catch: java.lang.Throwable -> L11
            axld r4 = r4.b     // Catch: java.lang.Throwable -> L11
            r3.a = r2     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r4.g(r3)     // Catch: java.lang.Throwable -> L11
            if (r4 != r0) goto L3d
            goto L51
        L3d:
            axla r1 = defpackage.axla.b     // Catch: java.lang.Throwable -> L11
            if (r4 == r1) goto L44
            ffcu r4 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L11
            return r4
        L44:
            ttk r4 = r3.b     // Catch: java.lang.Throwable -> L11
            axld r4 = r4.b     // Catch: java.lang.Throwable -> L11
            r1 = 2
            r3.a = r1     // Catch: java.lang.Throwable -> L11
            java.lang.Object r4 = r4.d(r3)     // Catch: java.lang.Throwable -> L11
            if (r4 != r0) goto L52
        L51:
            return r0
        L52:
            ttk r4 = r3.b     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = "Bugle.Cms.Folsom.Conversion.Encrypt.Success"
            r4.f(r0)     // Catch: java.lang.Throwable -> L11
            goto L68
        L5a:
            ttk r0 = r3.b
            java.lang.String r1 = "Bugle.Cms.Folsom.Conversion.Encrypt.Failed"
            r0.f(r1)
            cskc r0 = defpackage.ttk.a
            java.lang.String r1 = "Exception thrown in EncryptCmsBackupSyncletTask"
            r0.s(r1, r4)
        L68:
            ffcu r4 = defpackage.ffcu.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttj.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ttj(this.b, ffguVar);
    }
}
