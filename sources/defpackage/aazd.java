package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aazd extends ffhv implements ffji {
    int a;
    final /* synthetic */ aoax b;
    final /* synthetic */ abac c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aazd(aoax aoaxVar, abac abacVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = aoaxVar;
        this.c = abacVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L15;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.a
            r2 = 0
            r3 = 1
            defpackage.ffci.b(r7)
            if (r1 == 0) goto Lc
            goto L3f
        Lc:
            aoax r7 = r6.b
            aoav r1 = r7.a()
            aoav r4 = defpackage.aoav.e
            if (r1 != r4) goto L49
            abac r1 = r6.c
            aoaw r7 = (defpackage.aoaw) r7
            r6.a = r3
            java.lang.String r4 = r7.d()
            if (r4 != 0) goto L27
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            goto L3c
        L27:
            java.lang.String r7 = r7.e()
            r5 = 11
            r1.m(r5)
            ffbr r1 = r1.E
            java.lang.Object r1 = r1.b()
            avij r1 = (defpackage.avij) r1
            java.lang.Object r7 = r1.a(r4, r7, r6)
        L3c:
            if (r7 != r0) goto L3f
            return r0
        L3f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L49
        L47:
            r2 = r3
            goto L9b
        L49:
            abac r7 = r6.c
            aoax r0 = r6.b
            aoaw r0 = (defpackage.aoaw) r0
            java.lang.String r0 = r0.d()
            if (r0 == 0) goto L69
            int r1 = r0.length()
            if (r1 != 0) goto L5c
            goto L69
        L5c:
            ffbr r7 = r7.v
            java.lang.Object r7 = r7.b()
            crjp r7 = (defpackage.crjp) r7
            android.content.Intent r7 = r7.c(r0)
            goto L83
        L69:
            enru r7 = defpackage.abac.a
            ensk r7 = r7.h()
            java.lang.String r0 = "getWebIntent"
            r1 = 1234(0x4d2, float:1.729E-42)
            java.lang.String r4 = "com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl"
            java.lang.String r5 = "SuggestionUiAdapterImpl.kt"
            ensk r7 = r7.h(r4, r0, r1, r5)
            enrr r7 = (defpackage.enrr) r7
            java.lang.String r0 = "suggestion type web has empty uri. Cannot create web intent."
            r7.q(r0)
            r7 = 0
        L83:
            if (r7 == 0) goto L9b
            abac r0 = r6.c
            ffbr r0 = r0.v
            java.lang.Object r0 = r0.b()
            crjp r0 = (defpackage.crjp) r0
            boolean r7 = r0.e(r7)
            if (r7 == 0) goto L9b
            abac r7 = r6.c
            r7.m(r3)
            goto L47
        L9b:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new aazd(this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
