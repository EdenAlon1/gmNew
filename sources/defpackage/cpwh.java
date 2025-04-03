package defpackage;

import j$.util.DesugarDate;
import j$.util.function.Function$CC;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpwh extends ffhv implements ffjm {
    final /* synthetic */ cpwi a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpwh(ffgu ffguVar, cpwi cpwiVar) {
        super(2, ffguVar);
        this.a = cpwiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpwh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        cpvt cpvtVar;
        ffci.b(obj);
        final cpwi cpwiVar = this.a;
        boolean z = false;
        try {
            cpvtVar = ((cpvu) cpwiVar.d.l()).c;
            if (cpvtVar == null) {
                cpvtVar = cpvt.a;
            }
        } catch (eygu e) {
            ensk j = cpwi.a.j();
            j.Y(ente.a, "BugleTelephony");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/telephony/TelephonySyncPauseLatch", "getReverseSyncState", 104, "TelephonySyncPauseLatch.kt")).q("Incorrect protobuf in settings store");
        }
        if (cpvtVar.b) {
            cfba a = cfbf.a();
            a.z("TelephonySyncPauseLatch#isLatched");
            cfae cfaeVar = cfbf.c;
            a.c(cfaeVar.e, cfaeVar.j);
            a.e(new Function() { // from class: cpwg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    cfbe cfbeVar = (cfbe) obj2;
                    String[] strArr = {"ReverseTelephonySync-", "IncrementalReverseSyncWorkItemHandler-"};
                    int intValue = cfbf.c().intValue();
                    if (intValue < 41030) {
                        dtub.w("queue", intValue);
                    }
                    cpwi cpwiVar2 = cpwi.this;
                    cfbeVar.aq(new dtrw("work_queue.queue", 3, cfbe.av(strArr), false));
                    cfbeVar.e(DesugarDate.from(cpwiVar2.c.f()));
                    return cfbeVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            a.B(new dtzq("MAX(timestamp,minimum_start_time) DESC", new Object[0]));
            a.x(1);
            dtsu o = a.b().o();
            try {
                cfag cfagVar = (cfag) o;
                if (cfagVar.moveToNext()) {
                    long max = Math.max(cfagVar.c(), cfagVar.g().getTime());
                    long epochMilli = cpwiVar.c.f().toEpochMilli();
                    Object b = cpwiVar.b.b();
                    b.getClass();
                    if (max > epochMilli - ((Number) b).longValue()) {
                        z = true;
                    }
                }
                ffig.a(o, null);
                return Boolean.valueOf(z);
            } finally {
            }
        }
        ensk e2 = cpwi.a.e();
        e2.Y(ente.a, "BugleTelephony");
        enrr enrrVar = (enrr) e2;
        enrrVar.W(10, TimeUnit.SECONDS);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/telephony/TelephonySyncPauseLatch", "isLatchedSync", 73, "TelephonySyncPauseLatch.kt")).q("Reverse Sync is currently not running. Forward sync is not latched.");
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cpwh cpwhVar = new cpwh(ffguVar, this.a);
        cpwhVar.b = obj;
        return cpwhVar;
    }
}
