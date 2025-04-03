package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxe implements ejns {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/profile/refresh/ProfilesRefreshWorker");
    public final cjxi b;
    public final ffbr c;
    public final ffbr d;
    private final ffsk e;

    public cjxe(ffsk ffskVar, cjxi cjxiVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.e = ffskVar;
        this.b = cjxiVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejns, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        workerParameters.getClass();
        c = axol.c(this.e, ffhe.a, ffsm.a, new cjxd(this, null));
        return c;
    }
}
