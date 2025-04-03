package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adka extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adke b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adka(adke adkeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adkeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adka) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        r6 = r5.b;
        r5.a = 3;
        r6 = defpackage.ctzl.a(r6.d, new defpackage.adjv(), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r6 != r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        r6 = defpackage.adjz.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (r5.b.f == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        r6 = defpackage.adjz.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        r5.b.f = true;
        r6 = defpackage.adjz.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r6 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0022, code lost:
    
        if (r6 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (((java.lang.Boolean) r6).booleanValue() != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        r6 = defpackage.adjz.e;
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L10
            defpackage.ffci.b(r6)
            if (r1 == r3) goto L24
            if (r1 == r2) goto L41
            goto L5f
        L10:
            defpackage.ffci.b(r6)
            adke r6 = r5.b
            r5.a = r3
            adjx r1 = new adjx
            r1.<init>()
            effy r6 = r6.d
            java.lang.Object r6 = defpackage.ctzl.a(r6, r1, r5)
            if (r6 == r0) goto L9e
        L24:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L2f
            adjz r6 = defpackage.adjz.a
            goto L79
        L2f:
            adke r6 = r5.b
            ffbr r6 = r6.e
            java.lang.Object r6 = r6.b()
            deip r6 = (defpackage.deip) r6
            r5.a = r2
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L9e
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L4c
            adjz r6 = defpackage.adjz.e
            goto L79
        L4c:
            adke r6 = r5.b
            r1 = 3
            r5.a = r1
            adjv r1 = new adjv
            r1.<init>()
            effy r6 = r6.d
            java.lang.Object r6 = defpackage.ctzl.a(r6, r1, r5)
            if (r6 != r0) goto L5f
            goto L9e
        L5f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6a
            adjz r6 = defpackage.adjz.d
            goto L79
        L6a:
            adke r6 = r5.b
            boolean r6 = r6.f
            if (r6 == 0) goto L73
            adjz r6 = defpackage.adjz.b
            goto L79
        L73:
            adke r6 = r5.b
            r6.f = r3
            adjz r6 = defpackage.adjz.c
        L79:
            enru r0 = defpackage.adke.a
            ensk r0 = r0.e()
            ensn r1 = defpackage.ente.a
            java.lang.String r2 = "BugleGaia"
            r0.Y(r1, r2)
            java.lang.String r1 = "invokeSuspend"
            r2 = 59
            java.lang.String r3 = "com/google/android/apps/messaging/gaia/autosignin/AutoSignInDataService$dataSource$1$loadData$1"
            java.lang.String r4 = "AutoSignInDataService.kt"
            ensk r0 = r0.h(r3, r1, r2, r4)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "[Auto sign-in] Auto sign-in state checked. Value: %s"
            java.lang.String r2 = r6.name()
            r0.t(r1, r2)
            return r6
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adka.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adka(this.b, ffguVar);
    }
}
