package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfbn implements ejny {
    public final ffbr b;
    private final cfjc d;
    private final cfim e;
    private final ejoc f;
    private final ffsk g;
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueTikTokWorker");
    public static final cskc a = cskc.g("BugleWorkQueue", "WorkQueueTikTokWorker");

    public cfbn(cqoh cqohVar, cfjc cfjcVar, cfim cfimVar, ffbr ffbrVar, ejoc ejocVar, ffsk ffskVar) {
        cqohVar.getClass();
        cfjcVar.getClass();
        cfimVar.getClass();
        ffbrVar.getClass();
        ejocVar.getClass();
        ffskVar.getClass();
        this.d = cfjcVar;
        this.e = cfimVar;
        this.b = ffbrVar;
        this.f = ejocVar;
        this.g = ffskVar;
    }

    private final Object d(final WorkerParameters workerParameters, ffgu ffguVar) {
        String[] strArr = cfft.a;
        cffj cffjVar = new cffj();
        cffjVar.f("deleteAssociationsForQueues");
        cffjVar.e();
        cffjVar.c(new Function() { // from class: cfbj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cffs cffsVar = (cffs) obj;
                cffsVar.aq(new dtrt("work_queue_work_manager_ids.workmanager_id", 1, bdhj.b(Optional.of(WorkerParameters.this.a))));
                return cffsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (cffjVar.d() != 0) {
            ensk i = c.i();
            i.Y(ente.a, "BugleWorkQueue");
            ((enrr) i.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueTikTokWorker", "completePeriodicJob", 109, "WorkQueueTikTokWorker.kt")).t("WorkQueueWorkManagerId row deleted by WorkQueueTikTokWorker. It should already have been deleted. WorkManager ID: %s", workerParameters.a);
        }
        Object c2 = fgfz.c(this.f.b(workerParameters.a), ffguVar);
        return c2 == ffhh.a ? c2 : ffcu.a;
    }

    @Override // defpackage.ejok
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return ejoj.a();
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(WorkerParameters workerParameters) {
        elfl c2;
        c2 = axol.c(this.g, ffhe.a, ffsm.a, new cfbk(this, workerParameters, null));
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ec, code lost:
    
        if (d(r11, r6) == r0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7 A[Catch: cfhy -> 0x00d4, TRY_LEAVE, TryCatch #0 {cfhy -> 0x00d4, blocks: (B:14:0x0034, B:20:0x0046, B:21:0x00ba, B:23:0x00c7, B:28:0x009f), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(androidx.work.WorkerParameters r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cfbn.c(androidx.work.WorkerParameters, ffgu):java.lang.Object");
    }
}
