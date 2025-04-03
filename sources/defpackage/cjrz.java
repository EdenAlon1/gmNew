package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjrz implements ejny {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/profile/cleanup/ProfilesCleanupWorker");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    private final ffsk g;

    public cjrz(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.g = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final /* bridge */ /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        elfl c;
        workerParameters.getClass();
        c = axol.c(this.g, ffhe.a, ffsm.a, new cjry(this, workerParameters, null));
        return c;
    }
}
