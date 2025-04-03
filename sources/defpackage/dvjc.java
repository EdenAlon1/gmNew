package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvjc implements dviy {
    private static final entd a = entd.c("GnpSdk");
    private final ealf b;
    private final ealb c;
    private final eajw d;
    private final ffbr e;
    private final eajz f;

    public dvjc(ealf ealfVar, ealb ealbVar, eajw eajwVar, eajz eajzVar, ffbr ffbrVar) {
        ealfVar.getClass();
        eajwVar.getClass();
        eajzVar.getClass();
        ffbrVar.getClass();
        this.b = ealfVar;
        this.c = ealbVar;
        this.d = eajwVar;
        this.f = eajzVar;
        this.e = ffbrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.dviy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eagt r8, defpackage.exyl r9, defpackage.exrt r10, defpackage.ffgu r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.dvjb
            if (r0 == 0) goto L13
            r0 = r11
            dvjb r0 = (defpackage.dvjb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dvjb r0 = new dvjb
            r0.<init>(r7, r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.ffci.b(r11)
            goto Lc3
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ffci.b(r11)
            entd r11 = defpackage.dvjc.a
            ensk r1 = r11.o()
            java.lang.String r3 = "Handling a sync instruction in the InAppPushHandlerImpl."
            r1.q(r3)
            ffbr r1 = r7.e
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc8
            int r9 = r9.b
            exyk r1 = defpackage.exyk.b(r9)
            if (r1 != 0) goto L57
            exyk r1 = defpackage.exyk.UNKNOWN_INSTRUCTION
        L57:
            exyk r3 = defpackage.exyk.SYNC
            if (r1 == r3) goto L71
            ensk r8 = r11.i()
            ensz r8 = (defpackage.ensz) r8
            exyk r9 = defpackage.exyk.b(r9)
            if (r9 != 0) goto L69
            exyk r9 = defpackage.exyk.UNKNOWN_INSTRUCTION
        L69:
            java.lang.String r10 = "Received unsupported in-app sync instruction type - %s."
            r8.t(r10, r9)
            ffcu r8 = defpackage.ffcu.a
            return r8
        L71:
            ensk r9 = r11.o()
            java.lang.String r1 = "Payload has SYNC instruction."
            r9.q(r1)
            eajw r9 = r7.d
            eajz r1 = r7.f
            r3 = 13
            eajx r1 = r1.b(r3)
            r1.b(r8)
            r1.a(r10)
            r10 = r1
            eaka r10 = (defpackage.eaka) r10
            r3 = 4
            r10.t = r3
            r9.a(r1)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            easy r9 = r8.s()
            eaur r9 = defpackage.ealv.a(r9)
            java.lang.String r9 = defpackage.eafw.a(r9)
            java.lang.String r10 = "GNP_ACCOUNT_TO_SYNC"
            r4.putString(r10, r9)
            ensk r9 = r11.o()
            java.lang.String r10 = "Scheduling an inAppSyncJob in the InAppPushHandlerImpl."
            r9.q(r10)
            ealf r1 = r7.b
            r9 = r2
            ealb r2 = r7.c
            r5.c = r9
            r6 = 8
            r3 = r8
            java.lang.Object r11 = defpackage.eale.b(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lc3
            return r0
        Lc3:
            eafl r11 = (defpackage.eafl) r11
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lc8:
            ensk r8 = r11.o()
            java.lang.String r9 = "Can't handle sync instruction as GrowthKit is disabled."
            r8.q(r9)
            ffcu r8 = defpackage.ffcu.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvjc.a(eagt, exyl, exrt, ffgu):java.lang.Object");
    }
}
