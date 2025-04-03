package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class coqj extends ffhv implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ coqo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqj(List list, coqo coqoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = list;
        this.b = coqoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coqj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk h = coqo.a.h();
        h.Y(ente.a, "BugleSimStateTracker");
        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl$scheduleStateUpdateForUnstableSubscription$1", "invokeSuspend", 394, "PhoneSimsStateUpdaterImpl.kt");
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((djrq) it.next()).a));
        }
        enrrVar.w("Found %s unstable subscriptions. Scheduling verification delay for subIds: %s.", size, arrayList);
        List list2 = this.a;
        ArrayList arrayList2 = new ArrayList(ffdx.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Integer(((djrq) it2.next()).a));
        }
        ffdx.ax(arrayList2);
        ensk h2 = coqo.a.h();
        h2.Y(ente.a, "BugleSimStateTracker");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl$scheduleStateUpdateForUnstableSubscription$1", "invokeSuspend", 412, "PhoneSimsStateUpdaterImpl.kt")).q("Unstable subscription verification is disabled by flag.");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new coqj(this.a, this.b, ffguVar);
    }
}
