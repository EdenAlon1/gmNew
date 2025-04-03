package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpsr extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ dptb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpsr(dptb dptbVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = dptbVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List a;
        ffci.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        dpwi dpwiVar = (dpwi) this.c;
        List<dpvw> list = dpwiVar.a;
        boolean z = dpwiVar.b;
        Object obj4 = this.d;
        if (list.isEmpty()) {
            a = ffel.a;
        } else {
            fffs fffsVar = new fffs((byte[]) null);
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            for (final dpvw dpvwVar : list) {
                final dptb dptbVar = this.e;
                arrayList.add(new dpwn(dpvwVar.b, dpvwVar.c, dpvwVar.d, z, dpvwVar.e, new ffji() { // from class: dprz
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj5) {
                        lkr lkrVar = (lkr) obj5;
                        lkrVar.getClass();
                        dpvw dpvwVar2 = dpvwVar;
                        dptb dptbVar2 = dptb.this;
                        ffqy.d(dptbVar2.d, null, null, new dpta(dptbVar2, lkrVar, dpvwVar2, null), 3);
                        return ffcu.a;
                    }
                }));
            }
            fffsVar.addAll(arrayList);
            a = ffdx.a(fffsVar);
        }
        List list2 = a;
        obj3.getClass();
        return dptl.a((dptl) obj2, 0, null, 0, (Duration) obj3, false, null, list2, (dpxa) obj4, 1011703);
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        dpsr dpsrVar = new dpsr(this.e, (ffgu) obj5);
        dpsrVar.a = (dptl) obj;
        dpsrVar.b = (Duration) obj2;
        dpsrVar.c = (dpwi) obj3;
        dpsrVar.d = (dpxa) obj4;
        return dpsrVar.b(ffcu.a);
    }
}
