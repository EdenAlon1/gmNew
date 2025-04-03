package defpackage;

import android.os.SystemClock;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvci implements dvbw {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("GnpSdk");
    private static final Duration d;
    public final dlpw a;
    private final String e;
    private final dvdy f;
    private final dvcp g;
    private final fazb h;
    private final dvmt i;
    private final dhfu j;

    static {
        Duration ofMinutes = Duration.ofMinutes(1L);
        ofMinutes.getClass();
        d = ofMinutes;
    }

    public dvci(String str, dlpw dlpwVar, dvdy dvdyVar, dvcp dvcpVar, fazb fazbVar, dvmt dvmtVar, dhfu dhfuVar) {
        str.getClass();
        dlpwVar.getClass();
        dvdyVar.getClass();
        dvcpVar.getClass();
        fazbVar.getClass();
        dvmtVar.getClass();
        this.e = str;
        this.a = dlpwVar;
        this.f = dvdyVar;
        this.g = dvcpVar;
        this.h = fazbVar;
        this.i = dvmtVar;
        this.j = dhfuVar;
    }

    private final void e(long j, boolean z) {
        ((efky) ((ears) this.h.b()).u.get()).b(SystemClock.elapsedRealtime() - j, this.e, Boolean.valueOf(z));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0145, code lost:
    
        if (((java.lang.Boolean) r4).booleanValue() != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e8 -> B:13:0x0148). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x013a -> B:11:0x013b). Please report as a decompilation issue!!! */
    @Override // defpackage.dvbw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r17, defpackage.ffgu r18) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvci.a(java.util.List, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(final long r9, final j$.time.Instant r11, defpackage.ffgu r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.dvcd
            if (r0 == 0) goto L13
            r0 = r12
            dvcd r0 = (defpackage.dvcd) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dvcd r0 = new dvcd
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            long r9 = r0.a
            dvci r11 = r0.e
            defpackage.ffci.b(r12)     // Catch: java.lang.Exception -> L2c
            goto L77
        L2c:
            r12 = move-exception
            goto L96
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.ffci.b(r12)
            long r5 = android.os.SystemClock.elapsedRealtime()
            entd r12 = defpackage.dvci.c     // Catch: java.lang.Exception -> L92
            ensk r12 = r12.o()     // Catch: java.lang.Exception -> L92
            java.lang.String r2 = "Getting cross-app impression count."
            r12.q(r2)     // Catch: java.lang.Exception -> L92
            dhfu r12 = r8.j     // Catch: java.lang.Exception -> L92
            r11.getClass()     // Catch: java.lang.Exception -> L92
            dfun r2 = new dfun     // Catch: java.lang.Exception -> L92
            r2.<init>()     // Catch: java.lang.Exception -> L92
            r2.b()     // Catch: java.lang.Exception -> L92
            dhfs r7 = new dhfs     // Catch: java.lang.Exception -> L92
            r7.<init>()     // Catch: java.lang.Exception -> L92
            r2.a = r7     // Catch: java.lang.Exception -> L92
            r9 = 34602(0x872a, float:4.8488E-41)
            r2.c = r9     // Catch: java.lang.Exception -> L92
            dfuo r9 = r2.a()     // Catch: java.lang.Exception -> L92
            dhre r9 = r12.i(r9)     // Catch: java.lang.Exception -> L92
            r0.e = r8     // Catch: java.lang.Exception -> L92
            r0.a = r5     // Catch: java.lang.Exception -> L92
            r0.d = r4     // Catch: java.lang.Exception -> L92
            java.lang.Object r12 = defpackage.fgju.a(r9, r0)     // Catch: java.lang.Exception -> L92
            if (r12 == r1) goto L91
            r11 = r8
            r9 = r5
        L77:
            java.lang.Number r12 = (java.lang.Number) r12     // Catch: java.lang.Exception -> L2c
            int r12 = r12.intValue()     // Catch: java.lang.Exception -> L2c
            r11.e(r9, r3)     // Catch: java.lang.Exception -> L2c
            entd r0 = defpackage.dvci.c     // Catch: java.lang.Exception -> L2c
            ensk r0 = r0.o()     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "Got cross-app impression count: %d"
            r0.r(r1, r12)     // Catch: java.lang.Exception -> L2c
            java.lang.Integer r0 = new java.lang.Integer     // Catch: java.lang.Exception -> L2c
            r0.<init>(r12)     // Catch: java.lang.Exception -> L2c
            return r0
        L91:
            return r1
        L92:
            r9 = move-exception
            r12 = r9
            r11 = r8
            r9 = r5
        L96:
            r11.e(r9, r4)
            entd r9 = defpackage.dvci.c
            ensk r9 = r9.j()
            java.lang.String r10 = "Failed to get cross-app capping for promotions, API might not be available."
            defpackage.a.K(r9, r10, r12)
            java.lang.Integer r9 = new java.lang.Integer
            r9.<init>(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvci.b(long, j$.time.Instant, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dvdp r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvci.c(dvdp, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.dvch
            if (r0 == 0) goto L13
            r0 = r5
            dvch r0 = (defpackage.dvch) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dvch r0 = new dvch
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            dvci r0 = r0.d
            defpackage.ffci.b(r5)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            dvmt r5 = r4.i
            com.google.common.util.concurrent.ListenableFuture r5 = r5.c()
            r5.getClass()
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgfz.c(r5, r0)
            if (r5 != r1) goto L48
            return r1
        L48:
            r0 = r4
        L49:
            java.util.Map r5 = (java.util.Map) r5
            java.util.Set r1 = r5.entrySet()
            dvcc r2 = new dvcc
            r2.<init>()
            defpackage.ffdx.y(r1, r2)
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvci.d(ffgu):java.lang.Object");
    }
}
