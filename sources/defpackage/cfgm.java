package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfgm extends ffhv implements ffji {
    public cfgm(ffgu ffguVar) {
        super(1, ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        String[] strArr = cfft.a;
        cffo cffoVar = new cffo(cfft.a);
        cffoVar.z("WorkQueueWorkManagerTableJanitorTask#findQueuesWithNullWorkManagerUuid");
        cffoVar.c(cfft.c.a);
        cffoVar.d(new Function() { // from class: cfgl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                cffs cffsVar = (cffs) obj2;
                cffsVar.aq(new dtrx("work_queue_work_manager_ids.workmanager_id", 5));
                return cffsVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = cffoVar.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(((cfdx) it.next()).l());
        }
        return arrayList;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfgm((ffgu) obj).b(ffcu.a);
    }
}
