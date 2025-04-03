package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqmd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqmh b;
    final /* synthetic */ aoku c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqmd(ffgu ffguVar, aqmh aqmhVar, aoku aokuVar) {
        super(2, ffguVar);
        this.b = aqmhVar;
        this.c = aokuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqmd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0086, code lost:
    
        if (r1 != false) goto L18;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r13.a
            r2 = 1
            r3 = 0
            java.lang.String r4 = "invokeSuspend"
            java.lang.String r5 = "com/google/android/apps/messaging/shared/api/messaging/recipient/kids/RecipientsTrustedContactsApiImpl$isDestinationInAllowlist$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "RecipientsTrustedContactsApiImpl.kt"
            java.lang.String r7 = "RecipientTrustedContactsApiImpl"
            java.lang.String r8 = "Bugle"
            if (r1 == 0) goto L1a
            java.lang.Object r0 = r13.d
            ecri r0 = (defpackage.ecri) r0
            defpackage.ffci.b(r14)     // Catch: java.lang.Exception -> L8a
            goto L4f
        L1a:
            defpackage.ffci.b(r14)
            java.lang.Object r14 = r13.d
            ffsk r14 = (defpackage.ffsk) r14
            aqmh r14 = r13.b     // Catch: java.lang.Exception -> L8a
            ffbr r14 = r14.c     // Catch: java.lang.Exception -> L8a
            java.lang.Object r14 = r14.b()     // Catch: java.lang.Exception -> L8a
            ecrj r14 = (defpackage.ecrj) r14     // Catch: java.lang.Exception -> L8a
            ecri r14 = r14.d()     // Catch: java.lang.Exception -> L8a
            aqmh r1 = r13.b     // Catch: java.lang.Exception -> L8a
            ffbr r1 = r1.b     // Catch: java.lang.Exception -> L8a
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Exception -> L8a
            dgsq r1 = (defpackage.dgsq) r1     // Catch: java.lang.Exception -> L8a
            aoku r9 = r13.c     // Catch: java.lang.Exception -> L8a
            android.net.Uri r9 = defpackage.aqmh.f(r9)     // Catch: java.lang.Exception -> L8a
            dhre r1 = r1.b(r9)     // Catch: java.lang.Exception -> L8a
            r13.d = r14     // Catch: java.lang.Exception -> L8a
            r13.a = r2     // Catch: java.lang.Exception -> L8a
            java.lang.Object r1 = defpackage.fgju.a(r1, r13)     // Catch: java.lang.Exception -> L8a
            if (r1 == r0) goto L89
            r0 = r14
            r14 = r1
        L4f:
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch: java.lang.Exception -> L8a
            boolean r1 = r14.booleanValue()     // Catch: java.lang.Exception -> L8a
            aqmh r9 = r13.b     // Catch: java.lang.Exception -> L8a
            ffbr r9 = r9.c     // Catch: java.lang.Exception -> L8a
            java.lang.Object r9 = r9.b()     // Catch: java.lang.Exception -> L8a
            ecrj r9 = (defpackage.ecrj) r9     // Catch: java.lang.Exception -> L8a
            ecda r10 = defpackage.cggm.a     // Catch: java.lang.Exception -> L8a
            ecrh r11 = defpackage.ecrh.SUCCESS     // Catch: java.lang.Exception -> L8a
            r12 = 0
            r9.f(r0, r10, r12, r11)     // Catch: java.lang.Exception -> L8a
            enru r0 = defpackage.aqmh.a     // Catch: java.lang.Exception -> L8a
            ensk r0 = r0.h()     // Catch: java.lang.Exception -> L8a
            ensn r9 = defpackage.ente.a     // Catch: java.lang.Exception -> L8a
            r0.Y(r9, r8)     // Catch: java.lang.Exception -> L8a
            enrr r0 = (defpackage.enrr) r0     // Catch: java.lang.Exception -> L8a
            ensn r9 = defpackage.csux.O     // Catch: java.lang.Exception -> L8a
            r0.Y(r9, r7)     // Catch: java.lang.Exception -> L8a
            r9 = 182(0xb6, float:2.55E-43)
            ensk r0 = r0.h(r5, r4, r9, r6)     // Catch: java.lang.Exception -> L8a
            enrr r0 = (defpackage.enrr) r0     // Catch: java.lang.Exception -> L8a
            java.lang.String r9 = "Is number allowed by parents: %s"
            r0.t(r9, r14)     // Catch: java.lang.Exception -> L8a
            if (r1 == 0) goto Lb0
            goto Lb1
        L89:
            return r0
        L8a:
            r14 = move-exception
            enru r0 = defpackage.aqmh.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r8)
            enrr r0 = (defpackage.enrr) r0
            ensk r14 = r0.g(r14)
            enrr r14 = (defpackage.enrr) r14
            ensn r0 = defpackage.csux.O
            r14.Y(r0, r7)
            r0 = 189(0xbd, float:2.65E-43)
            ensk r14 = r14.h(r5, r4, r0, r6)
            enrr r14 = (defpackage.enrr) r14
            java.lang.String r0 = "Exception thrown by the Family Link API when querying isAllowed"
            r14.q(r0)
        Lb0:
            r2 = r3
        Lb1:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqmd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqmd aqmdVar = new aqmd(ffguVar, this.b, this.c);
        aqmdVar.d = obj;
        return aqmdVar;
    }
}
