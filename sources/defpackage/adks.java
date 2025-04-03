package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adks extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adkv b;
    final /* synthetic */ eisx c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adks(ffgu ffguVar, adkv adkvVar, eisx eisxVar, String str) {
        super(2, ffguVar);
        this.b = adkvVar;
        this.c = eisxVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adks) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x002e, code lost:
    
        if (r9 != r0) goto L10;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r8.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r9)
            return r9
        Ld:
            defpackage.ffci.b(r9)
            goto L30
        L11:
            defpackage.ffci.b(r9)
            java.lang.Object r9 = r8.e
            ffsk r9 = (defpackage.ffsk) r9
            adkv r9 = r8.b
            ffbr r9 = r9.e
            java.lang.Object r9 = r9.b()
            eixo r9 = (defpackage.eixo) r9
            eisx r1 = r8.c
            com.google.common.util.concurrent.ListenableFuture r9 = r9.c(r1)
            r8.a = r2
            java.lang.Object r9 = defpackage.fgfz.c(r9, r8)
            if (r9 == r0) goto Lb3
        L30:
            eixn r9 = (defpackage.eixn) r9
            eixz r1 = r9.b()
            java.lang.String r1 = r1.k
            int r2 = r1.hashCode()
            r3 = -1425037495(0xffffffffab0fa749, float:-5.103596E-13)
            java.lang.String r4 = "invokeSuspend"
            java.lang.String r5 = "com/google/android/apps/messaging/gaia/capability/GmsGaiaCapabilityRetriever$hasCapabilityInternal$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "GmsGaiaCapabilityRetriever.kt"
            java.lang.String r7 = "BugleGaia"
            if (r2 == r3) goto L68
            r3 = -1240244679(0xffffffffb6135e39, float:-2.1959552E-6)
            if (r2 == r3) goto L4f
            goto L8b
        L4f:
            java.lang.String r2 = "google"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8b
            adkv r9 = r8.b
            eisx r1 = r8.c
            java.lang.String r2 = r8.d
            r3 = 2
            r8.a = r3
            java.lang.Object r9 = r9.d(r1, r2, r8)
            if (r9 != r0) goto L67
            goto Lb3
        L67:
            return r9
        L68:
            java.lang.String r0 = "pseudonymous"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L8b
            enru r9 = defpackage.adkv.a
            ensk r9 = r9.h()
            ensn r0 = defpackage.ente.a
            r9.Y(r0, r7)
            r0 = 113(0x71, float:1.58E-43)
            ensk r9 = r9.h(r5, r4, r0, r6)
            enrr r9 = (defpackage.enrr) r9
            java.lang.String r0 = "Skipped retrieving capability. Pseudonymous account."
            r9.q(r0)
            adko r9 = defpackage.adko.SKIPPED_PSEUDONYMOUS_ACCOUNT
            return r9
        L8b:
            adkv r0 = r8.b
            r1 = 9
            r0.e(r1)
            enru r0 = defpackage.adkv.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r7)
            r1 = 120(0x78, float:1.68E-43)
            ensk r0 = r0.h(r5, r4, r1, r6)
            enrr r0 = (defpackage.enrr) r0
            eixz r9 = r9.b()
            java.lang.String r9 = r9.k
            java.lang.String r1 = "Failed retrieving capability. Unknown account type: %s"
            r0.t(r1, r9)
            adko r9 = defpackage.adko.FAILED
            return r9
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adks.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        adks adksVar = new adks(ffguVar, this.b, this.c, this.d);
        adksVar.e = obj;
        return adksVar;
    }
}
