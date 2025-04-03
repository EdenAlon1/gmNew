package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnps extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnpt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnps(cnpt cnptVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnptVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnps) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        if (r8 != r0) goto L16;
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
            r2 = 1
            java.lang.String r3 = "invokeSuspend"
            java.lang.String r4 = "com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker$startWork$1"
            java.lang.String r5 = "PeriodPullWorker.kt"
            java.lang.String r6 = "BugleSatellite"
            if (r1 == 0) goto L1d
            if (r1 == r2) goto L19
            defpackage.ffci.b(r8)     // Catch: java.lang.Exception -> L16
            goto L92
        L16:
            r8 = move-exception
            goto L98
        L19:
            defpackage.ffci.b(r8)
            goto L5e
        L1d:
            defpackage.ffci.b(r8)
            cnpt r8 = r7.b
            ffbr r8 = r8.d
            java.lang.Object r8 = r8.b()
            csiy r8 = (defpackage.csiy) r8
            boolean r8 = r8.a
            if (r8 == 0) goto L4c
            enru r8 = defpackage.cnpt.a
            ensk r8 = r8.h()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r6)
            r0 = 37
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Skip period pull work because Bugle is in foreground."
            r8.q(r0)
            ppp r8 = new ppp
            r8.<init>()
            return r8
        L4c:
            cnpt r8 = r7.b
            ffbr r8 = r8.c
            java.lang.Object r8 = r8.b()
            cnpm r8 = (defpackage.cnpm) r8
            r7.a = r2
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto Led
        L5e:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb7
            enru r8 = defpackage.cnpt.a     // Catch: java.lang.Exception -> L16
            ensk r8 = r8.h()     // Catch: java.lang.Exception -> L16
            ensn r1 = defpackage.ente.a     // Catch: java.lang.Exception -> L16
            r8.Y(r1, r6)     // Catch: java.lang.Exception -> L16
            r1 = 41
            ensk r8 = r8.h(r4, r3, r1, r5)     // Catch: java.lang.Exception -> L16
            enrr r8 = (defpackage.enrr) r8     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = "Start period pull work."
            r8.q(r1)     // Catch: java.lang.Exception -> L16
            cnpt r8 = r7.b     // Catch: java.lang.Exception -> L16
            ffbr r8 = r8.b     // Catch: java.lang.Exception -> L16
            java.lang.Object r8 = r8.b()     // Catch: java.lang.Exception -> L16
            cnpw r8 = (defpackage.cnpw) r8     // Catch: java.lang.Exception -> L16
            r1 = 2
            r7.a = r1     // Catch: java.lang.Exception -> L16
            java.lang.Object r8 = r8.a()     // Catch: java.lang.Exception -> L16
            if (r8 != r0) goto L92
            goto Led
        L92:
            ppp r8 = new ppp     // Catch: java.lang.Exception -> L16
            r8.<init>()     // Catch: java.lang.Exception -> L16
            return r8
        L98:
            enru r0 = defpackage.cnpt.a
            ensk r0 = r0.j()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            ensk r8 = r0.g(r8)
            r0 = 45
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Failed to pull messages for all available SIMs."
            r8.q(r0)
            goto Lcf
        Lb7:
            enru r8 = defpackage.cnpt.a
            ensk r8 = r8.h()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r6)
            r0 = 48
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Skip period pull work because carrier is not enabled."
            r8.q(r0)
        Lcf:
            enru r8 = defpackage.cnpt.a
            ensk r8 = r8.h()
            ensn r0 = defpackage.ente.a
            r8.Y(r0, r6)
            r0 = 50
            ensk r8 = r8.h(r4, r3, r0, r5)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r0 = "Complete period pull work."
            r8.q(r0)
            ppp r8 = new ppp
            r8.<init>()
            return r8
        Led:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnps.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnps(this.b, ffguVar);
    }
}
