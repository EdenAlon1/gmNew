package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ coqo c;
    final /* synthetic */ eraj d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coqm(ffgu ffguVar, List list, coqo coqoVar, eraj erajVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = coqoVar;
        this.d = erajVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((coqm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                List list = this.b;
                ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ctwb) this.c.d.b()).h(((djrq) it.next()).a));
                }
                coqo coqoVar = this.c;
                eraj erajVar = this.d;
                this.a = 1;
                obj = coqoVar.g(arrayList, erajVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return (cosw) obj;
        } catch (dkvd unused) {
            ensk j = coqo.a.j();
            j.Y(ente.a, "BugleSimStateTracker");
            ((enrr) j.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl$updateSubscriptionsOnceStable$$inlined$asyncPropagatingLegacy$default$1", "invokeSuspend", 185, "PhoneSimsStateUpdaterImpl.kt")).q("updateSubscriptionsOnceStable: Missing permissions for TelephonyManager");
            cosv cosvVar = (cosv) cosw.a.createBuilder();
            cosvVar.getClass();
            return cosx.a(cosvVar);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        coqm coqmVar = new coqm(ffguVar, this.b, this.c, this.d);
        coqmVar.e = obj;
        return coqmVar;
    }
}
