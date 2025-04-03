package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cype extends ffhv implements ffjp {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ cypg e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cype(cypg cypgVar, ffgu ffguVar) {
        super(5, ffguVar);
        this.e = cypgVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aqux, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        Object obj3 = this.d;
        obj2.getClass();
        boolean d = byyr.d(((amfx) obj2).v());
        if (r0 == 0 || ((r1 instanceof Collection) && r1.isEmpty())) {
            return null;
        }
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            if (((aqux) it.next()).g().b().equals(r0.g().b())) {
                int i = 0;
                boolean z = (obj3 instanceof xlv) && ((xlv) obj3).w();
                if (!d && (!z || ((engw) r1).size() <= 1)) {
                    return null;
                }
                String b = r0.g().b();
                ArrayList arrayList = new ArrayList(ffdx.n(r1, 10));
                for (Object obj4 : r1) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ffdx.l();
                    }
                    final cypg cypgVar = this.e;
                    final aqux aquxVar = (aqux) obj4;
                    String b2 = aquxVar.g().b();
                    String o = aquxVar.o();
                    String n = aquxVar.n();
                    if (n == null) {
                        n = "";
                    }
                    arrayList.add(new dnkm(b2, new doie(ffol.c(i2), aquxVar.a()), o, n, new ffix() { // from class: cypc
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            cypg cypgVar2 = cypg.this;
                            axol.k(cypgVar2.b, null, new cypd(cypgVar2, aquxVar, null), 3);
                            return ffcu.a;
                        }
                    }));
                    i = i2;
                }
                return new cyph(new dnkl(b, arrayList), null);
            }
        }
        return null;
    }

    @Override // defpackage.ffjp
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cype cypeVar = new cype(this.e, (ffgu) obj5);
        cypeVar.a = (alxj) obj;
        cypeVar.b = (aqux) obj2;
        cypeVar.c = (engw) obj3;
        cypeVar.d = (xlw) obj4;
        return cypeVar.b(ffcu.a);
    }
}
