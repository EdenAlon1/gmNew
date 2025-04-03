package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnov implements ejny {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker");
    public final cnom b;
    public final csjk c;
    public final ejoc d;
    public final Duration e;
    public final ffhd f;
    private final azei g;
    private final azpx h;
    private final azpo i;
    private final ffsk j;

    public cnov(azei azeiVar, cnom cnomVar, azpx azpxVar, azpo azpoVar, csjk csjkVar, ejoc ejocVar, Duration duration, ffsk ffskVar, ffhd ffhdVar) {
        azeiVar.getClass();
        azpxVar.getClass();
        azpoVar.getClass();
        csjkVar.getClass();
        ejocVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        this.g = azeiVar;
        this.b = cnomVar;
        this.h = azpxVar;
        this.i = azpoVar;
        this.c = csjkVar;
        this.d = ejocVar;
        this.e = duration;
        this.j = ffskVar;
        this.f = ffhdVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        c = axol.c(this.j, ffhe.a, ffsm.a, new cnou(workerParameters, this, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnov.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x009a A[LOOP:0: B:11:0x0094->B:13:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.cnot
            if (r0 == 0) goto L13
            r0 = r9
            cnot r0 = (defpackage.cnot) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cnot r0 = new cnot
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            azsu r8 = r0.e
            cnov r0 = r0.d
            defpackage.ffci.b(r9)
            goto L72
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.ffci.b(r9)
            if (r8 != 0) goto L5e
            enru r8 = defpackage.cnov.a
            ensk r8 = r8.j()
            ensn r9 = defpackage.ente.a
            java.lang.String r0 = "BugleSatellite"
            r8.Y(r9, r0)
            java.lang.String r9 = "notifyOnNewInServiceTerrestrialConnection"
            r0 = 83
            java.lang.String r1 = "com/google/android/apps/messaging/shared/satelliteapi/dunestar/NotifySatelliteConnectionChangeWorker"
            java.lang.String r2 = "NotifySatelliteConnectionChangeWorker.kt"
            ensk r8 = r8.h(r1, r9, r0, r2)
            enrr r8 = (defpackage.enrr) r8
            java.lang.String r9 = "Serialized MyIdentityToken was null"
            r8.q(r9)
            ppn r8 = new ppn
            r8.<init>()
            return r8
        L5e:
            azpx r9 = r7.h
            azsu r8 = defpackage.azsu.a(r8)
            r0.d = r7
            r0.e = r8
            r0.c = r3
            java.lang.Object r9 = r9.f(r8, r0)
            if (r9 != r1) goto L71
            return r1
        L71:
            r0 = r7
        L72:
            azop r9 = (defpackage.azop) r9
            azei r1 = r0.g
            cnoo r2 = new cnoo
            r2.<init>()
            r1.d(r2)
            cnom r8 = r0.b
            r9.getClass()
            azpo r1 = r8.b
            azpp r1 = r1.a(r9)
            enip r1 = r1.a()
            enqu r1 = r1.listIterator()
            r1.getClass()
        L94:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc0
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            android.net.ConnectivityManager r3 = r8.a
            azsu r4 = r9.b()
            java.lang.String r5 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_WIFI_CONNECTION"
            r6 = 2
            android.app.PendingIntent r4 = defpackage.cnom.d(r8, r4, r5, r6)
            r3.unregisterNetworkCallback(r4)
            android.net.ConnectivityManager r3 = r8.a
            azsu r4 = r9.b()
            java.lang.String r5 = "com.google.android.apps.messaging.shared.satelliteapi.dunestar.ACTION_LOST_SATELLITE_NEW_CELLULAR_CONNECTION"
            android.app.PendingIntent r2 = r8.a(r4, r2, r5)
            r3.unregisterNetworkCallback(r2)
            goto L94
        Lc0:
            cnom r8 = r0.b
            r8.b()
            ppp r8 = new ppp
            r8.<init>()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnov.d(java.lang.String, ffgu):java.lang.Object");
    }
}
