package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccyw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ ffjn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyw(Map map, ffjn ffjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = map;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccyw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ffdn ffdnVar = new ffdn(this.b.keySet());
            List ak = ffdx.ak(ffmk.q(0, 4));
            ffjn ffjnVar = this.c;
            Map map = this.b;
            ArrayList arrayList = new ArrayList(ffdx.n(ak, 10));
            Iterator it = ak.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                ffhe ffheVar = ffhe.a;
                arrayList.add(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new ccyu(null, intValue, ffdnVar, ffjnVar, map)));
            }
            this.a = 1;
            obj = ffqv.a(arrayList, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Iterator it2 = ((Iterable) obj).iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            next = ffew.j((Map) next, (Map) it2.next());
        }
        return next;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccyw ccywVar = new ccyw(this.b, this.c, ffguVar);
        ccywVar.d = obj;
        return ccywVar;
    }
}
