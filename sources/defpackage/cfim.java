package defpackage;

import android.app.Notification;
import android.os.Build;
import com.google.android.apps.messaging.shared.datamodel.workqueue.foregroundservice.BugleDataSyncForegroundService;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfim {
    private static final cskc b = cskc.g("BugleWorkQueue", "WorkQueueWorkerRunner");
    public final cfki a;
    private final cqoh c;
    private final cfjc d;
    private final cetc e;
    private final avdu f;
    private final ffsk g;
    private final fgjb h;
    private final fgjb i;
    private final Map j;
    private final Map k;

    public cfim(cqoh cqohVar, cfki cfkiVar, cfjc cfjcVar, cetc cetcVar, avdu avduVar, ffsk ffskVar) {
        cqohVar.getClass();
        cfjcVar.getClass();
        cetcVar.getClass();
        ffskVar.getClass();
        this.c = cqohVar;
        this.a = cfkiVar;
        this.d = cfjcVar;
        this.e = cetcVar;
        this.f = avduVar;
        this.g = ffskVar;
        this.h = new fgjf();
        this.i = new fgjf();
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
    }

    private final void g(elfl elflVar, cety cetyVar) {
        cetj cetjVar = (cetj) cetyVar;
        Notification notification = cetjVar.g;
        if (notification == null) {
            throw new IllegalStateException("ForegroundServiceNotification cannot be null.");
        }
        Optional optional = cetjVar.k;
        if (optional == null || optional.isEmpty()) {
            throw new IllegalStateException("Foreground service type cannot be null or empty.");
        }
        int intValue = ((Number) optional.get()).intValue();
        Class<BugleDataSyncForegroundService> cls = null;
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2048) {
                    throw new IllegalStateException(a.h(intValue, "Unexpected foreground service type: "));
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                cls = BugleDataSyncForegroundService.class;
            }
        }
        if (cls == null) {
            this.e.e(elflVar, notification, 13);
        } else {
            this.e.g(elflVar, notification, cls, ((Number) optional.get()).intValue());
        }
    }

    private final void h(ffss ffssVar, cety cetyVar) {
        cevc cevcVar = ((cetj) cetyVar).b;
        elfl a = axol.a(ffssVar);
        if (cevcVar != null) {
            int ordinal = cevcVar.ordinal();
            if (ordinal == 0) {
                Objects.toString(cevcVar);
                throw new IllegalStateException("Unexpected value: ".concat(cevcVar.toString()));
            }
            if (ordinal == 1 || ordinal == 2) {
                try {
                    this.e.c(a);
                    this.e.a(a);
                    return;
                } catch (IllegalStateException unused) {
                    b.p("unable to attach service - probably in background already");
                    if (cevcVar == cevc.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE) {
                        g(a, cetyVar);
                        return;
                    }
                    return;
                }
            }
            if (ordinal == 3) {
                this.e.c(a);
                g(a, cetyVar);
                return;
            }
        }
        b.p("Unspecified KeepAliveStrategy.");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cc A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {all -> 0x00ed, blocks: (B:36:0x00c7, B:38:0x00cc, B:47:0x00e9, B:48:0x00ec, B:56:0x0076, B:30:0x0090, B:32:0x009a, B:34:0x00a0, B:43:0x00ae, B:45:0x00b8), top: B:55:0x0076, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[Catch: all -> 0x00e8, TRY_LEAVE, TryCatch #1 {all -> 0x00e8, blocks: (B:30:0x0090, B:32:0x009a, B:34:0x00a0, B:43:0x00ae, B:45:0x00b8), top: B:29:0x0090, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfim.a(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.cfib
            if (r0 == 0) goto L13
            r0 = r7
            cfib r0 = (defpackage.cfib) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfib r0 = new cfib
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            fgjf r6 = r0.f
            java.lang.String r1 = r0.e
            cfim r0 = r0.d
            defpackage.ffci.b(r7)
            r7 = r6
            r6 = r1
            goto L4f
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.ffci.b(r7)
            fgjb r7 = r5.i
            r0.d = r5
            r0.e = r6
            r2 = r7
            fgjf r2 = (defpackage.fgjf) r2
            r0.f = r2
            r0.c = r4
            java.lang.Object r0 = r7.a(r3, r0)
            if (r0 == r1) goto L88
            r0 = r5
        L4f:
            java.util.Map r1 = r0.k     // Catch: java.lang.Throwable -> L83
            r1.remove(r6)     // Catch: java.lang.Throwable -> L83
            java.util.Map r0 = r0.j     // Catch: java.lang.Throwable -> L83
            java.lang.Object r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L83
            ffss r0 = (defpackage.ffss) r0     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L75
            boolean r1 = r0.v()     // Catch: java.lang.Throwable -> L83
            if (r1 != r4) goto L75
            cskc r0 = defpackage.cfim.b     // Catch: java.lang.Throwable -> L83
            java.lang.String r1 = " work has completed."
            java.lang.String r6 = defpackage.a.v(r6, r1)     // Catch: java.lang.Throwable -> L83
            r0.p(r6)     // Catch: java.lang.Throwable -> L83
            ffcu r6 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L83
            r7.b(r3)
            return r6
        L75:
            java.lang.String r6 = "Invalid state: "
            java.lang.String r1 = " is not active when being completed"
            java.lang.String r6 = defpackage.a.i(r0, r6, r1)     // Catch: java.lang.Throwable -> L83
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L83
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L83
            throw r0     // Catch: java.lang.Throwable -> L83
        L83:
            r6 = move-exception
            r7.b(r3)
            throw r6
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfim.b(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x0053, B:13:0x005d, B:14:0x0060), top: B:10:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, defpackage.cfhz r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cfic
            if (r0 == 0) goto L13
            r0 = r8
            cfic r0 = (defpackage.cfic) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cfic r0 = new cfic
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            fgjf r6 = r0.g
            cfhz r7 = r0.f
            java.lang.String r1 = r0.e
            cfim r0 = r0.d
            defpackage.ffci.b(r8)
            r8 = r6
            r6 = r1
            goto L53
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            defpackage.ffci.b(r8)
            fgjb r8 = r5.i
            r0.d = r5
            r0.e = r6
            r0.f = r7
            r2 = r8
            fgjf r2 = (defpackage.fgjf) r2
            r0.g = r2
            r0.c = r3
            java.lang.Object r0 = r8.a(r4, r0)
            if (r0 == r1) goto L6b
            r0 = r5
        L53:
            java.util.Map r0 = r0.k     // Catch: java.lang.Throwable -> L66
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L66
            java.util.EnumSet r6 = (java.util.EnumSet) r6     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L60
            r6.remove(r7)     // Catch: java.lang.Throwable -> L66
        L60:
            ffcu r6 = defpackage.ffcu.a     // Catch: java.lang.Throwable -> L66
            r8.b(r4)
            return r6
        L66:
            r6 = move-exception
            r8.b(r4)
            throw r6
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfim.c(java.lang.String, cfhz, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:14:0x00a3, B:16:0x00ab, B:17:0x00b7, B:19:0x00bf, B:21:0x00c7, B:23:0x00f4, B:25:0x016b, B:30:0x00fc, B:33:0x0102, B:34:0x0116, B:36:0x014f, B:38:0x0157, B:41:0x015d, B:42:0x017d, B:43:0x0182), top: B:13:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bf A[Catch: all -> 0x0183, TryCatch #0 {all -> 0x0183, blocks: (B:14:0x00a3, B:16:0x00ab, B:17:0x00b7, B:19:0x00bf, B:21:0x00c7, B:23:0x00f4, B:25:0x016b, B:30:0x00fc, B:33:0x0102, B:34:0x0116, B:36:0x014f, B:38:0x0157, B:41:0x015d, B:42:0x017d, B:43:0x0182), top: B:13:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d A[Catch: all -> 0x0183, TRY_ENTER, TryCatch #0 {all -> 0x0183, blocks: (B:14:0x00a3, B:16:0x00ab, B:17:0x00b7, B:19:0x00bf, B:21:0x00c7, B:23:0x00f4, B:25:0x016b, B:30:0x00fc, B:33:0x0102, B:34:0x0116, B:36:0x014f, B:38:0x0157, B:41:0x015d, B:42:0x017d, B:43:0x0182), top: B:13:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, defpackage.cfhz r10, java.lang.Runnable r11, defpackage.cety r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfim.d(java.lang.String, cfhz, java.lang.Runnable, cety, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|(1:(1:(1:(2:11|12)(2:14|15))(5:16|17|18|19|20))(1:28))(3:37|(1:39)|27)|29|30|31|(3:33|19|20)|27))|40|6|(0)(0)|29|30|31|(0)|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r11, defpackage.cfhz r12, java.lang.Runnable r13, defpackage.cety r14, defpackage.ffgu r15) {
        /*
            r10 = this;
            boolean r2 = r15 instanceof defpackage.cfig
            if (r2 == 0) goto L13
            r2 = r15
            cfig r2 = (defpackage.cfig) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.d = r3
            goto L18
        L13:
            cfig r2 = new cfig
            r2.<init>(r10, r15)
        L18:
            r6 = r2
            java.lang.Object r0 = r6.b
            ffhh r7 = defpackage.ffhh.a
            int r2 = r6.d
            r8 = 3
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L56
            if (r2 == r3) goto L49
            if (r2 == r9) goto L3b
            if (r2 == r8) goto L32
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L32:
            java.lang.Object r2 = r6.a
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
            defpackage.ffci.b(r0)
            goto Lbc
        L3b:
            cfhz r2 = r6.f
            java.lang.String r3 = r6.e
            java.lang.Object r4 = r6.a
            cfim r4 = (defpackage.cfim) r4
            defpackage.ffci.b(r0)     // Catch: java.util.concurrent.CancellationException -> L47
            goto L80
        L47:
            r0 = move-exception
            goto L85
        L49:
            cfhz r2 = r6.f
            java.lang.String r3 = r6.e
            java.lang.Object r4 = r6.a
            cfim r4 = (defpackage.cfim) r4
            defpackage.ffci.b(r0)
            r1 = r4
            goto L6f
        L56:
            defpackage.ffci.b(r0)
            r6.a = r10
            r6.e = r11
            r6.f = r12
            r6.d = r3
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.Object r0 = r1.d(r2, r3, r4, r5, r6)
            if (r0 == r7) goto Lbd
            r1 = r10
            r3 = r11
            r2 = r12
        L6f:
            ffss r0 = (defpackage.ffss) r0
            r6.a = r1     // Catch: java.util.concurrent.CancellationException -> L83
            r6.e = r3     // Catch: java.util.concurrent.CancellationException -> L83
            r6.f = r2     // Catch: java.util.concurrent.CancellationException -> L83
            r6.d = r9     // Catch: java.util.concurrent.CancellationException -> L83
            java.lang.Object r0 = r0.c(r6)     // Catch: java.util.concurrent.CancellationException -> L83
            if (r0 == r7) goto Lbd
            r4 = r1
        L80:
            ppq r0 = (defpackage.ppq) r0     // Catch: java.util.concurrent.CancellationException -> L47
            return r0
        L83:
            r0 = move-exception
            r4 = r1
        L85:
            cskc r1 = defpackage.cfim.b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "Runner "
            r5.<init>(r9)
            r5.append(r2)
            java.lang.String r9 = " cancelled for "
            r5.append(r9)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            r1.p(r5)
            ffuw r1 = defpackage.ffuw.a
            ffhd r1 = defpackage.ekxi.a(r1)
            cfif r5 = new cfif
            r9 = 0
            r5.<init>(r9, r4, r3, r2)
            r6.a = r0
            r6.e = r9
            r6.f = r9
            r6.d = r8
            java.lang.Object r1 = defpackage.ffra.a(r1, r5, r6)
            if (r1 != r7) goto Lbb
            goto Lbd
        Lbb:
            r2 = r0
        Lbc:
            throw r2
        Lbd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfim.e(java.lang.String, cfhz, java.lang.Runnable, cety, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(2:3|(10:5|6|7|(1:(1:(1:(1:(4:13|14|15|16)(2:18|19))(3:20|21|22))(6:23|24|25|(3:27|15|16)|28|29))(4:31|32|33|34))(5:50|51|52|(1:54)|29)|35|36|37|(3:39|25|(0))|28|29))|7|(0)(0)|35|36|37|(0)|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r17, java.lang.Runnable r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfim.f(java.lang.String, java.lang.Runnable, ffgu):java.lang.Object");
    }
}
