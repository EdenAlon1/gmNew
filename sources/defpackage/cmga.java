package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmga extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cmgg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmga(cmgg cmggVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cmggVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmga) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        if (r7 != r0) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Lf
            java.lang.Object r1 = r6.a
            defpackage.ffci.b(r7)
            goto L47
        Lf:
            defpackage.ffci.b(r7)
            goto L41
        L13:
            defpackage.ffci.b(r7)
            enru r7 = defpackage.cmgg.a
            ensk r7 = r7.e()
            java.lang.String r1 = "invokeSuspend"
            r3 = 323(0x143, float:4.53E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/shared/rcsdata/carriertos/CarrierTosDataServiceImpl$resetCarrierTosConsentForAllSimsFuture$1"
            java.lang.String r5 = "CarrierTosDataServiceImpl.kt"
            ensk r7 = r7.h(r4, r1, r3, r5)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r1 = "Resetting explicit carrier tos consent all sims"
            r7.q(r1)
            cmgg r7 = r6.c
            ffbr r7 = r7.f
            java.lang.Object r7 = r7.b()
            cort r7 = (defpackage.cort) r7
            r6.b = r2
            java.lang.Object r7 = r7.u()
            if (r7 == r0) goto L65
        L41:
            java.util.Set r7 = (java.util.Set) r7
            java.util.Iterator r1 = r7.iterator()
        L47:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L63
            java.lang.Object r7 = r1.next()
            djrm r7 = (defpackage.djrm) r7
            cmgg r2 = r6.c
            r6.a = r1
            r3 = 2
            r6.b = r3
            enru r3 = defpackage.cmgg.a
            java.lang.Object r7 = r2.o(r7, r6)
            if (r7 != r0) goto L47
            goto L65
        L63:
            r7 = 0
            return r7
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmga.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmga(this.c, ffguVar);
    }
}
