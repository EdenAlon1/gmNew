package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjt {
    public static final ffbz a = ffca.a(new ffix() { // from class: cqjq
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = cqjt.a;
            return new cqkc(new ffjm() { // from class: cqjr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqjt.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (!collection.isEmpty() && !cqjg.b(collection) && cqjg.e(cqgjVar)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, new ffjm() { // from class: cqjs
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection<cqgj> collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqjt.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        eygr eygrVar = ((cqgj) it.next()).f;
                        eygrVar.getClass();
                        ffdx.w(arrayList, eygrVar);
                    }
                    ArrayList arrayList2 = new ArrayList(ffdx.n(collection, 10));
                    for (cqgj cqgjVar2 : collection) {
                        cqgjVar2.getClass();
                        cqge cqgeVar = (cqge) cqgjVar2.toBuilder();
                        cqgeVar.getClass();
                        DesugarCollections.unmodifiableList(((cqgj) cqgeVar.instance).f).getClass();
                        cqgs.j(cqgeVar);
                        DesugarCollections.unmodifiableList(((cqgj) cqgeVar.instance).h).getClass();
                        cqgs.i(cqgeVar);
                        arrayList2.add(cqjo.b(cqgs.c(cqgeVar)));
                    }
                    List<cqgj> ad = ffdx.ad(arrayList, arrayList2);
                    ArrayList arrayList3 = new ArrayList(ffdx.n(ad, 10));
                    for (cqgj cqgjVar3 : ad) {
                        cqgjVar3.getClass();
                        eyee eyeeVar = cqgjVar.e;
                        eyeeVar.getClass();
                        arrayList3.add(new cqji(cqgjVar3, eyeeVar));
                    }
                    return new cqjk(ffdx.b(cqgjVar), 3, arrayList3);
                }
            });
        }
    });
}
