package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ylh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ yln c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ylh(ffgu ffguVar, List list, yln ylnVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = ylnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ylh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffud a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.d;
        List<xhp> list = this.b;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (xhp xhpVar : list) {
            if (xhpVar instanceof xhm) {
                a = ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new yli(null, xhpVar, this.c));
            } else {
                if (!(xhpVar instanceof xho)) {
                    throw new ffcd();
                }
                a = ffrr.a(xhpVar);
            }
            arrayList.add(a);
        }
        this.a = 1;
        Object a2 = ffqv.a(arrayList, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ylh ylhVar = new ylh(ffguVar, this.b, this.c);
        ylhVar.d = obj;
        return ylhVar;
    }
}
