package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuus extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cuuw b;
    final /* synthetic */ cujo c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuus(ffgu ffguVar, cuuw cuuwVar, cujo cujoVar) {
        super(2, ffguVar);
        this.b = cuuwVar;
        this.c = cujoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cuus) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (r13 == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        if (r13 != r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
    
        if (r13 != r0) goto L11;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L1b
            if (r1 == r5) goto L17
            if (r1 == r3) goto L13
            defpackage.ffci.b(r13)
            goto L8e
        L13:
            defpackage.ffci.b(r13)
            goto L47
        L17:
            defpackage.ffci.b(r13)
            goto L30
        L1b:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.d
            ffsk r13 = (defpackage.ffsk) r13
            cuuw r13 = r12.b
            cujo r1 = r12.c
            erdy r6 = defpackage.erdy.MESSAGE_RECEIPT
            r12.a = r5
            java.lang.Object r13 = r13.g(r1, r6, r4, r12)
            if (r13 == r0) goto Lc8
        L30:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L3d
            cukp r13 = defpackage.cuko.a()
            return r13
        L3d:
            cujo r13 = r12.c
            r12.a = r3
            java.lang.Object r13 = r13.c(r12)
            if (r13 == r0) goto Lc8
        L47:
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r1 = "invokeSuspend"
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/spam/strangerdanger/StrangerDangerSpamProtection$classify$$inlined$withLegacyPropagatingContext$1"
            java.lang.String r6 = "StrangerDangerSpamProtection.kt"
            java.lang.String r7 = "BugleSpam"
            if (r13 == 0) goto Lab
            int r8 = r13.length()
            if (r8 != 0) goto L5a
            goto Lab
        L5a:
            enru r8 = defpackage.cuwf.a
            cujo r8 = r12.c
            int r9 = r8.j
            int r9 = defpackage.cuvt.b(r9)
            if (r9 != r5) goto L83
            enru r13 = defpackage.cuuw.a
            ensk r13 = r13.e()
            ensn r0 = defpackage.ente.a
            r13.Y(r0, r7)
            r0 = 60
            ensk r13 = r13.h(r3, r1, r0, r6)
            enrr r13 = (defpackage.enrr) r13
            java.lang.String r0 = "Unknown message protocol, skipping StrangerDanger"
            r13.q(r0)
            cukp r13 = defpackage.cuko.a()
            return r13
        L83:
            cuuw r1 = r12.b
            r12.a = r2
            java.lang.Object r13 = r1.i(r8, r13, r9, r12)
            if (r13 != r0) goto L8e
            goto Lc8
        L8e:
            cuuq r13 = (defpackage.cuuq) r13
            if (r13 != 0) goto La6
            cukp r5 = new cukp
            erer r6 = defpackage.erer.NO_VERDICT
            cula r7 = defpackage.cula.a
            enru r13 = defpackage.cuuw.a
            java.lang.Integer r9 = defpackage.cuup.b(r4, r2)
            r10 = 0
            r11 = 20
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        La6:
            cukp r13 = r13.a(r4)
            return r13
        Lab:
            enru r13 = defpackage.cuuw.a
            ensk r13 = r13.j()
            ensn r0 = defpackage.ente.a
            r13.Y(r0, r7)
            r0 = 54
            ensk r13 = r13.h(r3, r1, r0, r6)
            enrr r13 = (defpackage.enrr) r13
            java.lang.String r0 = "Null E164 destination, skipping StrangerDanger"
            r13.q(r0)
            cukp r13 = defpackage.cuko.a()
            return r13
        Lc8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuus.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cuus cuusVar = new cuus(ffguVar, this.b, this.c);
        cuusVar.d = obj;
        return cuusVar;
    }
}
