package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cujh {
    public final Context e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffsk n;
    private final ffbr s;
    private final ffbr t;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/carrier/CarrierSpamReporter");
    private static final cfva o = cfvl.n(cfvl.b, "carrier_spam_reporter_send_bystander_destination", true);
    private static final cfva p = cfvl.n(cfvl.b, "carrier_spam_reporter_truncate_timestamps_to_nearest_hour", false);
    public static final emyl b = cfvl.y("spam_send_772x_report");
    private static final cfup q = cfvl.h(cfvl.b, "carrier_spam_reporter_normalized_destination_772x", "7726");
    private static final emyl r = cfvl.y("spam_use_carrier_config_for_772x");
    public static final emyl c = cfvl.y("ensure_q_and_single_destination_usage");
    public static final cfup d = cfvl.n(cfvl.b, "carrier_spam_reporter_disable_v1_reporting", false);

    public cujh(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffsk ffskVar) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffskVar.getClass();
        this.e = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = ffbrVar6;
        this.l = ffbrVar7;
        this.m = ffbrVar8;
        this.s = ffbrVar9;
        this.t = ffbrVar10;
        this.n = ffskVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x032e A[LOOP:0: B:11:0x0328->B:13:0x032e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r27, java.util.List r28, defpackage.ffgu r29) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cujh.a(java.lang.String, java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, int r10, java.util.List r11, defpackage.ffgu r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.cujg
            if (r0 == 0) goto L13
            r0 = r12
            cujg r0 = (defpackage.cujg) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cujg r0 = new cujg
            r0.<init>(r8, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.c
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.e
            r7 = 1
            if (r1 == 0) goto L3a
            if (r1 != r7) goto L32
            int r10 = r6.b
            java.lang.Object r9 = r6.a
            java.lang.String r11 = r6.g
            cujh r1 = r6.f
            defpackage.ffci.b(r12)
            r5 = r10
            r10 = r1
            goto L46
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            defpackage.ffci.b(r12)
            java.util.Iterator r11 = r11.iterator()
            r5 = r11
            r11 = r9
            r9 = r5
            r5 = r10
            r10 = r8
        L46:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L96
            java.lang.Object r12 = r9.next()
            cujb r12 = (defpackage.cujb) r12
            r6.f = r10
            r6.g = r11
            r6.a = r9
            r6.b = r5
            r6.e = r7
            ffbr r1 = r10.s
            java.lang.Object r1 = r1.b()
            cuiv r1 = (defpackage.cuiv) r1
            java.lang.String r2 = r12.a
            emyl r3 = defpackage.cujh.c
            java.lang.Object r3 = r3.get()
            cfup r3 = (defpackage.cfup) r3
            java.lang.Object r3 = r3.e()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L7c
            r3 = r11
            goto L84
        L7c:
            cfup r3 = defpackage.cujh.q
            java.lang.Object r3 = r3.e()
            java.lang.String r3 = (java.lang.String) r3
        L84:
            r3.getClass()
            int r4 = r12.c
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            ffhh r1 = defpackage.ffhh.a
            if (r12 == r1) goto L93
            ffcu r12 = defpackage.ffcu.a
        L93:
            if (r12 != r0) goto L46
            return r0
        L96:
            ffcu r9 = defpackage.ffcu.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cujh.b(java.lang.String, int, java.util.List, ffgu):java.lang.Object");
    }
}
