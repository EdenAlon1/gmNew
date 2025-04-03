package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusm {
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    private final ffbr m;
    private final ffbr n;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/reclassification/SpamReclassification");
    private static final cfup l = cfvl.e(cfvl.b, "spam_max_reclassification_index", 100);
    public static final cfup b = cfvl.e(cfvl.b, "spam_max_reclassification_latency_hours", 24);

    public cusm(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar11.getClass();
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.m = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffbrVar9;
        this.k = ffbrVar10;
        this.n = ffbrVar11;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cusr r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.cusk
            if (r0 == 0) goto L13
            r0 = r14
            cusk r0 = (defpackage.cusk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cusk r0 = new cusk
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            ekzz r13 = r0.d
            defpackage.ffci.b(r14)     // Catch: java.lang.Throwable -> L2b
            goto Lb9
        L2b:
            r0 = move-exception
            r14 = r0
            goto Lc5
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            defpackage.ffci.b(r14)
            java.lang.String r14 = "SpamReclassification.reclassifySpam"
            ekzz r14 = defpackage.eleg.f(r14)
            java.lang.String r2 = r13.d     // Catch: java.lang.Throwable -> Lc0
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r8 = defpackage.bdhb.b(r2)     // Catch: java.lang.Throwable -> Lc0
            cukx r2 = defpackage.cukx.a     // Catch: java.lang.Throwable -> Lc0
            int r2 = r13.c     // Catch: java.lang.Throwable -> Lc0
            cukx r9 = defpackage.cukw.a(r2)     // Catch: java.lang.Throwable -> Lc0
            int r10 = r13.e     // Catch: java.lang.Throwable -> Lc0
            cfup r13 = defpackage.cusm.l     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r2 = r13.e()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> Lc0
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> Lc0
            if (r10 < r2) goto L98
            enru r0 = defpackage.cusm.a     // Catch: java.lang.Throwable -> Lc0
            ensk r0 = r0.j()     // Catch: java.lang.Throwable -> Lc0
            ensn r1 = defpackage.ente.a     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r2 = "BugleSpam"
            r0.Y(r1, r2)     // Catch: java.lang.Throwable -> Lc0
            enrr r0 = (defpackage.enrr) r0     // Catch: java.lang.Throwable -> Lc0
            ensn r1 = defpackage.csux.b     // Catch: java.lang.Throwable -> Lc0
            r0.Y(r1, r8)     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "com/google/android/apps/messaging/shared/util/spam/reclassification/SpamReclassification"
            java.lang.String r2 = "reclassifySpam$third_party_java_src_android_app_bugle_shared_java_com_google_android_apps_messaging_shared_util_spam_reclassification_spam_reclassification_AUTO_DEPS_ORIGINAL"
            java.lang.String r4 = "SpamReclassification.kt"
            r5 = 115(0x73, float:1.61E-43)
            ensk r0 = r0.h(r1, r2, r5, r4)     // Catch: java.lang.Throwable -> Lc0
            enrr r0 = (defpackage.enrr) r0     // Catch: java.lang.Throwable -> Lc0
            java.lang.String r1 = "reclassification skipped: current index %d exceeds maximum %d"
            java.lang.Object r13 = r13.e()     // Catch: java.lang.Throwable -> Lc0
            r13.getClass()     // Catch: java.lang.Throwable -> Lc0
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> Lc0
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> Lc0
            r0.u(r1, r10, r13)     // Catch: java.lang.Throwable -> Lc0
            ffcu r13 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> Lc0
            defpackage.ffig.a(r14, r3)
            return r13
        L98:
            ffbr r13 = r12.n     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r13 = r13.b()     // Catch: java.lang.Throwable -> Lc0
            r13.getClass()     // Catch: java.lang.Throwable -> Lc0
            ffhd r13 = (defpackage.ffhd) r13     // Catch: java.lang.Throwable -> Lc0
            ffhd r13 = defpackage.ekxi.a(r13)     // Catch: java.lang.Throwable -> Lc0
            cusl r5 = new cusl     // Catch: java.lang.Throwable -> Lc0
            r6 = 0
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lc0
            r0.d = r14     // Catch: java.lang.Throwable -> Lc0
            r0.c = r4     // Catch: java.lang.Throwable -> Lc0
            java.lang.Object r13 = defpackage.ffra.a(r13, r5, r0)     // Catch: java.lang.Throwable -> Lc0
            if (r13 == r1) goto Lbf
            r13 = r14
        Lb9:
            defpackage.ffig.a(r13, r3)
            ffcu r13 = defpackage.ffcu.a
            return r13
        Lbf:
            return r1
        Lc0:
            r0 = move-exception
            r13 = r0
            r11 = r14
            r14 = r13
            r13 = r11
        Lc5:
            throw r14     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            defpackage.ffig.a(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cusm.a(cusr, ffgu):java.lang.Object");
    }

    public final void b(cukx cukxVar, MessageIdType messageIdType, cukp cukpVar, int i) {
        if (cukpVar.d == null) {
            return;
        }
        cusp cuspVar = (cusp) this.m.b();
        cusq cusqVar = (cusq) cusr.a.createBuilder();
        cusqVar.getClass();
        int i2 = cukxVar.l;
        cusqVar.copyOnWrite();
        cusr cusrVar = (cusr) cusqVar.instance;
        cusrVar.b |= 1;
        cusrVar.c = i2;
        String b2 = messageIdType.b();
        b2.getClass();
        cusqVar.copyOnWrite();
        cusr cusrVar2 = (cusr) cusqVar.instance;
        cusrVar2.b |= 2;
        cusrVar2.d = b2;
        cusqVar.copyOnWrite();
        cusr cusrVar3 = (cusr) cusqVar.instance;
        cusrVar3.b |= 4;
        cusrVar3.e = i;
        Integer num = cukpVar.d;
        num.getClass();
        int intValue = num.intValue();
        cusqVar.copyOnWrite();
        cusr cusrVar4 = (cusr) cusqVar.instance;
        cusrVar4.b |= 8;
        cusrVar4.f = intValue;
        eyfy build = cusqVar.build();
        build.getClass();
        Integer num2 = cukpVar.d;
        num2.getClass();
        int intValue2 = num2.intValue();
        cetp cetpVar = new cetp();
        cetpVar.c = Duration.ofSeconds(intValue2);
        ((cevh) cuspVar.a.b()).g(ceyr.h("spam_reclassification_handler", (cusr) build, cetpVar.a()));
    }
}
