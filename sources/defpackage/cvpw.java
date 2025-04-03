package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpw extends ceut {
    public static final /* synthetic */ int a = 0;
    private final ffsk b;
    private final cvpl c;
    private final cvqg d;

    static {
        cfvl.e(cfvl.b, "starred_message_configuration_batch_size", 100);
    }

    public cvpw(ffsk ffskVar, cvpl cvplVar, cvqg cvqgVar) {
        ffskVar.getClass();
        this.b = ffskVar;
        this.c = cvplVar;
        this.d = cvqgVar;
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("StarAnalyticsWorkHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = cvpn.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c;
        cvpn cvpnVar = (cvpn) eyhsVar;
        cvpnVar.getClass();
        c = axol.c(this.b, ffhe.a, ffsm.a, new cvpu(this, cvpnVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009c A[LOOP:0: B:11:0x0096->B:13:0x009c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.bulm r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cvpt
            if (r0 == 0) goto L13
            r0 = r6
            cvpt r0 = (defpackage.cvpt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cvpt r0 = new cvpt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            cvpw r5 = r0.d
            defpackage.ffci.b(r6)
            goto L90
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            java.lang.String[] r6 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.a
            java.lang.String r6 = "parts"
            java.lang.Class<com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable$BindData> r2 = com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData.class
            dtro r5 = r5.av(r6, r2)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable$BindData r5 = (com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable.BindData) r5
            cvpl r6 = r4.c
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.String r2 = r5.K()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L60
            java.lang.String r5 = r5.K()
            r5.getClass()
            java.lang.Object r5 = r6.a(r5, r0)
        L5e:
            r6 = r5
            goto L8d
        L60:
            java.lang.String r6 = r5.H()
            java.util.Set r0 = defpackage.cvpl.a
            boolean r6 = r0.contains(r6)
            if (r6 == 0) goto L73
            cvqh r5 = defpackage.cvqh.g
            java.util.List r5 = defpackage.ffdx.b(r5)
            goto L5e
        L73:
            java.lang.String r5 = r5.H()
            java.util.Set r6 = defpackage.cvpl.b
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L86
            cvqh r5 = defpackage.cvqh.h
            java.util.List r5 = defpackage.ffdx.b(r5)
            goto L5e
        L86:
            cvqh r5 = defpackage.cvqh.i
            java.util.List r5 = defpackage.ffdx.b(r5)
            goto L5e
        L8d:
            if (r6 == r1) goto Lba
            r5 = r4
        L90:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L96:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb7
            java.lang.Object r0 = r6.next()
            cvqh r0 = (defpackage.cvqh) r0
            cvqg r1 = r5.d
            r0.getClass()
            ffbr r1 = r1.a
            java.lang.Object r1 = r1.b()
            akzt r1 = (defpackage.akzt) r1
            java.lang.String r2 = "Bugle.Star.Message.Type.Counts"
            int r0 = r0.j
            r1.e(r2, r0)
            goto L96
        Lb7:
            ffcu r5 = defpackage.ffcu.a
            return r5
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvpw.k(bulm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00f4 -> B:10:0x00f6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.cvpn r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvpw.l(cvpn, ffgu):java.lang.Object");
    }
}
