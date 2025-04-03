package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cptl extends ffhv implements ffjm {
    final /* synthetic */ cptm a;
    final /* synthetic */ cpwe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cptl(cptm cptmVar, cpwe cpweVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cptmVar;
        this.b = cpweVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cptl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((enrr) cptm.a.h().h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 47, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).q("Starting incremental reverse sync work.");
        long a = this.a.c.a();
        try {
            eyee eyeeVar = this.b.e;
            eyeeVar.getClass();
            if (eyeeVar.d() != 16) {
                this.a.b.d(2, Optional.empty());
            } else {
                this.a.b.d(2, Optional.of(cqjf.b(eyeeVar)));
            }
            ((enrr) cptm.a.h().h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 68, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).s("Incremental Reverse Sync Complete! Time taken for message import to telephony: %s", this.a.c.a() - a);
            return ceyt.i();
        } catch (cptq e) {
            ((enrr) ((enrr) cptm.a.j()).g(e).h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 60, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).q("Incremental reverse sync retry limit exceeded. Cancelling work.");
            return ceyt.k();
        } catch (Exception e2) {
            ((enrr) ((enrr) cptm.a.j()).g(e2).h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 63, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).q("Incremental reverse sync failed. Scheduling retry.");
            return ceyt.m();
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cptl(this.a, this.b, ffguVar);
    }
}
