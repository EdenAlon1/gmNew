package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azmh extends ffhv implements ffjm {
    final /* synthetic */ azml a;
    final /* synthetic */ Iterable b;
    final /* synthetic */ Iterable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azmh(azml azmlVar, Iterable iterable, Iterable iterable2, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = azmlVar;
        this.b = iterable;
        this.c = iterable2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azmh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.b.d(this.b);
        Iterable iterable = this.c;
        ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((azop) it.next()).b());
        }
        this.a.b.c(arrayList);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azmh(this.a, this.b, this.c, ffguVar);
    }
}
