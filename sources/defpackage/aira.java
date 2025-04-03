package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aira implements ejny {
    public static final aiqy a = new aiqy();
    public static final entd b = entd.c("BugleNudge");
    public static final emyl c = emys.a(new emyl() { // from class: aiqv
        @Override // defpackage.emyl
        public final Object get() {
            aiqy aiqyVar = aira.a;
            return cfvl.f(cfvl.b, "birthday_nudge_sync_worker_interval_sec", TimeUnit.DAYS.toSeconds(1L));
        }
    });
    public static final emyl d = emys.a(new emyl() { // from class: aiqw
        @Override // defpackage.emyl
        public final Object get() {
            aiqy aiqyVar = aira.a;
            return cfvl.f(cfvl.b, "birthday_nudge_sync_worker_initial_delay_sec", 0L);
        }
    });
    public static final emyl e = cfvl.w("birthday_nudge_sync_worker_enabled");
    public final ffbr f;
    public final aire g;
    public final ejoc h;
    private final ffsk i;

    public aira(ffsk ffskVar, ffbr ffbrVar, aire aireVar, ejoc ejocVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ejocVar.getClass();
        this.i = ffskVar;
        this.f = ffbrVar;
        this.g = aireVar;
        this.h = ejocVar;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final /* bridge */ /* synthetic */ ListenableFuture b(WorkerParameters workerParameters) {
        elfl c2;
        workerParameters.getClass();
        c2 = axol.c(this.i, ffhe.a, ffsm.a, new aiqz(this, null));
        return c2;
    }
}
