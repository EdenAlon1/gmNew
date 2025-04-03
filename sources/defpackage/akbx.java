package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akbx extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ akby c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbx(akby akbyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = akbyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00a1, code lost:
    
        if (r2.i(r10, r9) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (r10 != r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r10 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.b
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/restore/listeners/RestoreAfterAppUpdateBootAndPackageReplacedListener$onPackageReplaced$1"
            java.lang.String r4 = "RestoreAfterAppUpdateBootAndPackageReplacedListener.kt"
            java.lang.String r5 = "BugleBackup"
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L23
            if (r1 == r7) goto L1f
            if (r1 == r6) goto L19
            defpackage.ffci.b(r10)
            goto La4
        L19:
            java.lang.Object r1 = r9.a
            defpackage.ffci.b(r10)
            goto L6b
        L1f:
            defpackage.ffci.b(r10)
            goto L38
        L23:
            defpackage.ffci.b(r10)
            akby r10 = r9.c
            ffbr r10 = r10.b
            java.lang.Object r10 = r10.b()
            ajyr r10 = (defpackage.ajyr) r10
            r9.b = r7
            java.lang.Object r10 = r10.k(r9)
            if (r10 == r0) goto La7
        L38:
            r1 = r10
            java.util.List r1 = (java.util.List) r1
            enru r10 = defpackage.akby.a
            ensk r10 = r10.e()
            ensn r7 = defpackage.ente.a
            r10.Y(r7, r5)
            r7 = 64
            ensk r10 = r10.h(r3, r2, r7, r4)
            enrr r10 = (defpackage.enrr) r10
            int r7 = r1.size()
            java.lang.String r8 = "Found %d executions waiting for app update after package replaced"
            r10.r(r8, r7)
            akby r10 = r9.c
            ffbr r10 = r10.b
            java.lang.Object r10 = r10.b()
            ajyr r10 = (defpackage.ajyr) r10
            r9.a = r1
            r9.b = r6
            java.lang.Object r10 = r10.l(r9)
            if (r10 == r0) goto La7
        L6b:
            java.util.List r10 = (java.util.List) r10
            enru r6 = defpackage.akby.a
            ensk r6 = r6.e()
            ensn r7 = defpackage.ente.a
            r6.Y(r7, r5)
            r5 = 72
            ensk r2 = r6.h(r3, r2, r5, r4)
            enrr r2 = (defpackage.enrr) r2
            int r3 = r10.size()
            java.lang.String r4 = "Found %d executions waiting for reprompt after package replaced"
            r2.r(r4, r3)
            akby r2 = r9.c
            ffbr r2 = r2.c
            java.lang.Object r2 = r2.b()
            ajys r2 = (defpackage.ajys) r2
            java.util.List r10 = defpackage.ffdx.ad(r1, r10)
            r1 = 0
            r9.a = r1
            r1 = 3
            r9.b = r1
            java.lang.Object r10 = r2.i(r10, r9)
            if (r10 != r0) goto La4
            goto La7
        La4:
            ffcu r10 = defpackage.ffcu.a
            return r10
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akbx(this.c, ffguVar);
    }
}
