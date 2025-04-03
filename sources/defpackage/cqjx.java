package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqjx {
    public static final ffbz a = ffca.a(new ffix() { // from class: cqju
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = cqjx.a;
            return new cqkc(new ffjm() { // from class: cqjv
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqjx.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    if (cqjg.c(collection) && cqjg.f(cqgjVar)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }, new ffjm() { // from class: cqjw
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqjx.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cqjg.f((cqgj) obj4)) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    cqgj cqgjVar2 = (cqgj) obj3;
                    cqge cqgeVar = (cqge) cqgjVar2.toBuilder();
                    cqgeVar.getClass();
                    cqga cqgaVar = (cqga) cqgs.a(cqgeVar).toBuilder();
                    cqgaVar.getClass();
                    eyja eyjaVar = ((cqgb) cqgaVar.instance).c;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    eyjaVar.getClass();
                    eyja eyjaVar2 = (cqgjVar.c == 4 ? (cqgb) cqgjVar.d : cqgb.a).c;
                    if (eyjaVar2 == null) {
                        eyjaVar2 = eyja.a;
                    }
                    eyjaVar2.getClass();
                    cqgq.b(cqjh.a(eyjaVar, eyjaVar2), cqgaVar);
                    cqgs.e(cqgq.a(cqgaVar), cqgeVar);
                    cqgj c = cqgs.c(cqgeVar);
                    List ae = ffdx.ae(ffdx.ac(collection, cqgjVar2), c);
                    eyee eyeeVar = c.e;
                    eyeeVar.getClass();
                    return new cqjk(ae, 4, ffdx.b(new cqji(cqgjVar, eyeeVar)));
                }
            });
        }
    });
}
