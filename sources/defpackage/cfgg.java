package defpackage;

import j$.util.Objects;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfgg extends ffhv implements ffji {
    Object a;
    int b;
    final /* synthetic */ cfgt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgg(cfgt cfgtVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.c = cfgtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        LinkedHashMap linkedHashMap;
        ffhh ffhhVar = ffhh.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            ffci.b(obj);
            linkedHashMap = obj2;
        } else {
            ffci.b(obj);
            String[] strArr = cfft.a;
            cffo cffoVar = new cffo(cfft.a);
            cfev cfevVar = cfft.c;
            cffoVar.c(cfevVar.a, cfevVar.b);
            cffoVar.z("findFailedWorkManagerTasks");
            cffoVar.d(new Function() { // from class: cfge
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj3) {
                    cffs cffsVar = (cffs) obj3;
                    cffsVar.aq(new dtrx("work_queue_work_manager_ids.workmanager_id", 6));
                    return cffsVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            cffoVar.r();
            engw y = cffoVar.b().y();
            y.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
            enqv it = y.iterator();
            while (it.hasNext()) {
                cfdx cfdxVar = (cfdx) it.next();
                Object obj3 = cfdxVar.k().get();
                String l = cfdxVar.l();
                l.getClass();
                ffcf ffcfVar = new ffcf(obj3, l);
                linkedHashMap2.put(ffcfVar.a, ffcfVar.b);
            }
            Set<UUID> keySet = linkedHashMap2.keySet();
            cfgt cfgtVar = this.c;
            ArrayList arrayList = new ArrayList(ffdx.n(keySet, 10));
            for (UUID uuid : keySet) {
                arrayList.add(ffra.b(cfgtVar.h, ekxi.a(ffhe.a), ffsm.a, new cfgf(null, uuid, cfgtVar)));
            }
            this.a = linkedHashMap2;
            this.b = 1;
            obj = ffqv.a(arrayList, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            linkedHashMap = linkedHashMap2;
        }
        Set<Map.Entry> entrySet = ffew.k((Iterable) obj).entrySet();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            key.getClass();
            pqq pqqVar = (pqq) entry.getValue();
            Object obj4 = linkedHashMap.get((UUID) key);
            obj4.getClass();
            ffcf ffcfVar2 = new ffcf(obj4, pqqVar);
            linkedHashMap3.put(ffcfVar2.a, ffcfVar2.b);
        }
        Set entrySet2 = linkedHashMap3.entrySet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : entrySet2) {
            pqq pqqVar2 = (pqq) ((Map.Entry) obj5).getValue();
            if (!Objects.isNull(pqqVar2)) {
                Set set = cfgt.c;
                pqqVar2.getClass();
                if (!set.contains(pqqVar2.b)) {
                }
            }
            arrayList2.add(obj5);
        }
        ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add((String) ((Map.Entry) it2.next()).getKey());
        }
        return arrayList3;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfgg(this.c, (ffgu) obj).b(ffcu.a);
    }
}
