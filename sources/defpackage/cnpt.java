package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnpt implements ejny {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;

    public cnpt(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffskVar.getClass();
        this.e = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        ensk h = a.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/periodpull/PeriodPullWorker", "startWork", 34, "PeriodPullWorker.kt")).q("Start periodic pull work.");
        c = axol.c(this.e, ffhe.a, ffsm.a, new cnps(this, null));
        return c;
    }
}
