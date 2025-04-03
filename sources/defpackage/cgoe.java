package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgoe extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgof b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgoe(ffgu ffguVar, cgof cgofVar) {
        super(2, ffguVar);
        this.b = cgofVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgoe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        if ((r6.b & 1) != 0) goto L23;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> Lc
            goto L47
        Lc:
            r6 = move-exception
            goto L51
        Le:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.c
            ffsk r6 = (defpackage.ffsk) r6
            boolean r6 = defpackage.ctjd.d()
            if (r6 != 0) goto L20
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L20:
            dwrp r6 = defpackage.dwrq.f()     // Catch: java.lang.Exception -> Lc
            java.lang.String r1 = "genai-models-group"
            r6.b(r1)     // Catch: java.lang.Exception -> Lc
            dwrq r6 = r6.a()     // Catch: java.lang.Exception -> Lc
            cgof r1 = r5.b     // Catch: java.lang.Exception -> Lc
            ffbr r1 = r1.a     // Catch: java.lang.Exception -> Lc
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Exception -> Lc
            dwub r1 = (defpackage.dwub) r1     // Catch: java.lang.Exception -> Lc
            com.google.common.util.concurrent.ListenableFuture r6 = r1.e(r6)     // Catch: java.lang.Exception -> Lc
            r6.getClass()     // Catch: java.lang.Exception -> Lc
            r5.a = r2     // Catch: java.lang.Exception -> Lc
            java.lang.Object r6 = defpackage.fgfz.c(r6, r5)     // Catch: java.lang.Exception -> Lc
            if (r6 != r0) goto L47
            return r0
        L47:
            dwns r6 = (defpackage.dwns) r6     // Catch: java.lang.Exception -> Lc
            if (r6 == 0) goto L72
            int r6 = r6.b     // Catch: java.lang.Exception -> Lc
            r6 = r6 & r2
            if (r6 == 0) goto L72
            goto L73
        L51:
            cgof r0 = r5.b
            enru r0 = r0.b
            ensk r0 = r0.i()
            enrr r0 = (defpackage.enrr) r0
            ensk r6 = r0.g(r6)
            java.lang.String r0 = "invokeSuspend"
            r1 = 56
            java.lang.String r2 = "com/google/android/apps/messaging/shared/mdd/geller/EmotifyControllerImpl$special$$inlined$asyncPropagatingLegacy$default$1"
            java.lang.String r4 = "EmotifyControllerImpl.kt"
            ensk r6 = r6.h(r2, r0, r1, r4)
            enrr r6 = (defpackage.enrr) r6
            java.lang.String r0 = "Failed to get Emotify FileGroup"
            r6.q(r0)
        L72:
            r2 = r3
        L73:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgoe.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cgoe cgoeVar = new cgoe(ffguVar, this.b);
        cgoeVar.c = obj;
        return cgoeVar;
    }
}
