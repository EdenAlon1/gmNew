package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccwj extends ffhv implements ffjm {
    final /* synthetic */ Collection a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwj(ffgu ffguVar, Collection collection) {
        super(2, ffguVar);
        this.a = collection;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccwj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bsob e = bsom.e();
        e.z("CmsConversationsUpdater#loadCorrelationIds");
        e.i(new ccwk(this.a));
        bskp bskpVar = bsom.c;
        e.c(bskpVar.a, bskpVar.aw);
        engw y = e.b().y();
        y.getClass();
        ArrayList<bseh> arrayList = new ArrayList();
        enqv it = y.iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (((bseh) next).Q() != null) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(arrayList, 10)), 16));
        for (bseh bsehVar : arrayList) {
            String a = bsehVar.C().a();
            String Q = bsehVar.Q();
            Q.getClass();
            ffcf ffcfVar = new ffcf(a, new ffch(Q));
            linkedHashMap.put(ffcfVar.a, ffcfVar.b);
        }
        return linkedHashMap;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccwj ccwjVar = new ccwj(ffguVar, this.a);
        ccwjVar.b = obj;
        return ccwjVar;
    }
}
