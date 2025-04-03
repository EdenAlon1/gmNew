package defpackage;

import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfgj extends ffhv implements ffji {
    int a;
    final /* synthetic */ cfgt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfgj(cfgt cfgtVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cfgtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl c = this.b.g.c(cexh.b);
            this.a = 1;
            obj = fgfz.c(c, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        final Collection collection = (Collection) obj;
        cfba a = cfbf.a();
        a.z("WorkQueueWorkManagerTableJanitorTask#findQueuesNotScheduledInWorkManager");
        a.c(cfbf.c.f);
        String[] strArr = cfft.a;
        cffo cffoVar = new cffo(cfft.a);
        cffoVar.c(cfft.c.a);
        dtvy i2 = dtvz.i(cffoVar.b(), cfft.c.a, cfbf.c.f);
        ((dtrd) i2).e = "wm";
        a.F(i2);
        a.e(new Function() { // from class: cfgi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                cfbe cfbeVar = (cfbe) obj2;
                cfbeVar.aq(new dtrw("work_queue.type", 3, cfbe.at(collection), false));
                cfbeVar.as(new dtzq("$V{wm} is NULL", new Object[]{cfft.c.a}));
                return cfbeVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a.v(cfbf.c.f);
        engw y = a.b().y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            arrayList.add(((ceze) it.next()).q());
        }
        return ffdx.ar(arrayList);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cfgj(this.b, (ffgu) obj).b(ffcu.a);
    }
}
