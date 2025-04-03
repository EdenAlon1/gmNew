package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class corc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cord b;
    final /* synthetic */ corf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public corc(cord cordVar, corf corfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cordVar;
        this.c = corfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((corc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object i;
        ffhh ffhhVar = ffhh.a;
        int i2 = this.a;
        ffci.b(obj);
        if (i2 != 0) {
            return obj;
        }
        cord cordVar = this.b;
        corf corfVar = this.c;
        this.a = 1;
        int i3 = corfVar.c;
        corq corqVar = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? null : corq.WORK_TYPE_UPDATE_PHONE_SIMS_STATE : corq.WORK_TYPE_VERIFY_SIM_REMOVAL : corq.WORK_TYPE_VERIFY_UNSTABLE_SUBSCRIPTION : corq.WORK_TYPE_UNKNOWN;
        if (corqVar == null) {
            corqVar = corq.UNRECOGNIZED;
        }
        corqVar.getClass();
        ((enrr) cord.a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleSimStateUpdateInternal", 70, "SimStateUpdateHandler.kt")).t("Handling SimStateUpdate. Request for %s work type received.", corqVar);
        int ordinal = corqVar.ordinal();
        if (ordinal == 1) {
            eygi eygiVar = corfVar.d;
            eygiVar.getClass();
            eraj b = eraj.b(corfVar.e);
            if (b == null) {
                b = eraj.UNRECOGNIZED;
            }
            b.getClass();
            if (eygiVar.isEmpty()) {
                ((enrr) cord.a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleUnstableSubscription", 89, "SimStateUpdateHandler.kt")).q("No unstable subscriptions to reverify.");
                i = ceyt.i();
            } else {
                ((enrr) cord.a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleUnstableSubscription", 94, "SimStateUpdateHandler.kt")).t("Handling unstable subscriptions reverification: %s", eygiVar);
                coqc coqcVar = (coqc) cordVar.b.b();
                ArrayList arrayList = new ArrayList(ffdx.n(eygiVar, 10));
                Iterator<E> it = eygiVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(new djrq(((Number) it.next()).intValue()));
                }
                coqcVar.b(arrayList, b);
                cordVar.l(corq.WORK_TYPE_VERIFY_UNSTABLE_SUBSCRIPTION);
                i = ceyt.i();
            }
        } else if (ordinal == 2) {
            eraj b2 = eraj.b(corfVar.e);
            if (b2 == null) {
                b2 = eraj.UNRECOGNIZED;
            }
            b2.getClass();
            ((enrr) cord.a.h().h("com/google/android/apps/messaging/shared/simstatetracker/SimStateUpdateHandler", "handleSimRemoval", 107, "SimStateUpdateHandler.kt")).q("Handling SIM removal verification.");
            ((coqc) cordVar.b.b()).c(b2);
            cordVar.l(corq.WORK_TYPE_VERIFY_SIM_REMOVAL);
            i = ceyt.i();
        } else if (ordinal != 3) {
            i = ceyt.i();
        } else {
            eraj b3 = eraj.b(corfVar.e);
            if (b3 == null) {
                b3 = eraj.UNRECOGNIZED;
            }
            b3.getClass();
            i = cordVar.k(b3, this);
        }
        return i == ffhhVar ? ffhhVar : i;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new corc(this.b, this.c, ffguVar);
    }
}
