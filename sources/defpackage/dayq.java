package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dayq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dayt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dayq(dayt daytVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = daytVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dayq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r1.a(r8, r7) == r0) goto L18;
     */
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
            java.lang.String r2 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/ui/debug/cloudstore/CloudStoreDebugMenuProviderImpl$linkAccount$1"
            java.lang.String r4 = "CloudStoreDebugMenuProviderImpl.kt"
            java.lang.String r5 = "BugleCms"
            r6 = 1
            if (r1 == 0) goto L19
            if (r1 == r6) goto L15
            defpackage.ffci.b(r8)     // Catch: defpackage.babn -> L60
            goto L78
        L15:
            defpackage.ffci.b(r8)     // Catch: defpackage.babn -> L60
            goto L33
        L19:
            defpackage.ffci.b(r8)
            dayt r8 = r7.b     // Catch: defpackage.babn -> L60
            ffbr r8 = r8.i     // Catch: defpackage.babn -> L60
            java.lang.Object r8 = r8.b()     // Catch: defpackage.babn -> L60
            babf r8 = (defpackage.babf) r8     // Catch: defpackage.babn -> L60
            elfl r8 = r8.a()     // Catch: defpackage.babn -> L60
            r7.a = r6     // Catch: defpackage.babn -> L60
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)     // Catch: defpackage.babn -> L60
            if (r8 != r0) goto L33
            goto L5f
        L33:
            eisx r8 = (defpackage.eisx) r8     // Catch: defpackage.babn -> L60
            if (r8 != 0) goto L52
            enru r8 = defpackage.dayt.a     // Catch: defpackage.babn -> L60
            ensk r8 = r8.h()     // Catch: defpackage.babn -> L60
            ensn r0 = defpackage.ente.a     // Catch: defpackage.babn -> L60
            r8.Y(r0, r5)     // Catch: defpackage.babn -> L60
            r0 = 422(0x1a6, float:5.91E-43)
            ensk r8 = r8.h(r3, r2, r0, r4)     // Catch: defpackage.babn -> L60
            enrr r8 = (defpackage.enrr) r8     // Catch: defpackage.babn -> L60
            java.lang.String r0 = "No account to link."
            r8.q(r0)     // Catch: defpackage.babn -> L60
            ffcu r8 = defpackage.ffcu.a     // Catch: defpackage.babn -> L60
            return r8
        L52:
            dayt r1 = r7.b     // Catch: defpackage.babn -> L60
            cgwa r1 = r1.j     // Catch: defpackage.babn -> L60
            r6 = 2
            r7.a = r6     // Catch: defpackage.babn -> L60
            java.lang.Object r8 = r1.a(r8, r7)     // Catch: defpackage.babn -> L60
            if (r8 != r0) goto L78
        L5f:
            return r0
        L60:
            enru r8 = defpackage.dayt.a
            ensk r8 = r8.h()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r5)
            r0 = 427(0x1ab, float:5.98E-43)
            ensk r8 = r8.h(r3, r2, r0, r4)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "No linked account."
            r8.q(r0)
        L78:
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dayq.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dayq(this.b, ffguVar);
    }
}
