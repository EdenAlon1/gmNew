package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import androidx.work.WorkerParameters;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnhr extends ffhv implements ffjm {
    final /* synthetic */ WorkerParameters a;
    final /* synthetic */ cnhs b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnhr(WorkerParameters workerParameters, cnhs cnhsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = workerParameters;
        this.b = cnhsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnhr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        JobInfo pendingJob;
        ffci.b(obj);
        String d = this.a.b.d("intent_action");
        if (!ffkj.e(d, "android.intent.action.BOOT_COMPLETED")) {
            ((enrr) cnhs.b.h().h("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker$startWork$1", "invokeSuspend", 76, "BootCompleteWorker.kt")).t("Got unexpected action: %s", d);
            return new ppn();
        }
        if (!((ctvs) this.b.f.b()).e()) {
            return new ppn();
        }
        cnhs cnhsVar = this.b;
        long epochMilli = ((cqoh) cnhsVar.g.b()).f().toEpochMilli();
        if (((ctyx) cnhsVar.h.b()).e("app_install_time_millis", 0L) == 0) {
            ((ctyx) cnhsVar.h.b()).k("app_install_time_millis", epochMilli);
        }
        cnhs cnhsVar2 = this.b;
        ((ensz) cnhs.a.h()).q("Silently refreshing notifications after Boot/Package replacement");
        ((cjbc) cnhsVar2.p.b()).f();
        Optional optional = (Optional) cnhsVar2.m.b();
        final ffji ffjiVar = new ffji() { // from class: cnhp
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                cnla cnlaVar = (cnla) obj2;
                entd entdVar = cnhs.a;
                cnlaVar.getClass();
                cnlaVar.j();
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: cnhq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                entd entdVar = cnhs.a;
                ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cnhs cnhsVar3 = this.b;
        ((altk) cnhsVar3.i.b()).af();
        ((alir) cnhsVar3.l.b()).f(aliq.BOOT_COMPLETE, Optional.empty());
        ((almw) cnhsVar3.j.b()).j();
        JobScheduler jobScheduler = (JobScheduler) this.b.d.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            int[] iArr = cnhs.c;
            int length = iArr.length;
            for (int i = 0; i < 2; i++) {
                int i2 = iArr[i];
                pendingJob = jobScheduler.getPendingJob(i2);
                if (pendingJob != null) {
                    jobScheduler.cancel(i2);
                }
            }
        } else {
            ((enrr) cnhs.b.i().h("com/google/android/apps/messaging/shared/receiver/bootcomplete/BootCompleteWorker", "cancelObsoleteJobs", 143, "BootCompleteWorker.kt")).q("JobScheduler is null");
        }
        Optional optional2 = (Optional) this.b.o.b();
        if (optional2.isPresent()) {
            axnw.h(((cqlx) optional2.get()).a());
        }
        ((cnew) this.b.k.b()).a();
        ((cnjw) this.b.e.b()).c();
        Iterator it = ((Set) this.b.n.b()).iterator();
        while (it.hasNext()) {
            ((cnjs) it.next()).a();
        }
        return new ppp();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnhr(this.a, this.b, ffguVar);
    }
}
