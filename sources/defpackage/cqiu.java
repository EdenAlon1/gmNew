package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqiu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqiy b;
    final /* synthetic */ CancellationException c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqiu(ffgu ffguVar, cqiy cqiyVar, CancellationException cancellationException) {
        super(2, ffguVar);
        this.b = cqiyVar;
        this.c = cancellationException;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqiu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ensk h = cqiy.a.h();
            h.Y(ente.a, "BugleTelephony");
            ((enrr) h.h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer$processBatches$lambda$3$lambda$2$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 196, "PausingForwardSyncWorkOrganizer.kt")).q("processBatches Cancelled");
            cqfr cqfrVar = this.b.c;
            this.a = 1;
            obj = cqfrVar.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            throw this.c;
        }
        ensk h2 = cqiy.a.h();
        h2.Y(ente.a, "BugleTelephony");
        ((enrr) ((enrr) h2).g(this.c).h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer$processBatches$lambda$3$lambda$2$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 198, "PausingForwardSyncWorkOrganizer.kt")).q("processBatches was paused");
        throw new cqfg("Batch interrupted by pausing forward sync", this.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cqiu cqiuVar = new cqiu(ffguVar, this.b, this.c);
        cqiuVar.d = obj;
        return cqiuVar;
    }
}
