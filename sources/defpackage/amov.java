package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amov extends ffhv implements ffjm {
    final /* synthetic */ amoz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amov(amoz amozVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = amozVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amov) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw y = amoz.d(this.a.c.a).y();
        y.getClass();
        ArrayList arrayList = new ArrayList(ffdx.n(y, 10));
        enqv it = y.iterator();
        while (it.hasNext()) {
            brae braeVar = (brae) it.next();
            axcl m = braeVar.m();
            m.getClass();
            axcj l = braeVar.l();
            l.getClass();
            arrayList.add(new amop(m, l, braeVar.k(), braeVar.n()));
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amov(this.a, ffguVar);
    }
}
