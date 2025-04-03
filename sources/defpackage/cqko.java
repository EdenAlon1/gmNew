package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqko {
    public static final ffbz a = ffca.a(new ffix() { // from class: cqkn
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = cqko.a;
            return new cqkc(new ffjm() { // from class: cqkl
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqko.a;
                    ((cqgj) obj).getClass();
                    collection.getClass();
                    return Boolean.valueOf(cqjg.b(collection));
                }
            }, new ffjm() { // from class: cqkm
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    ffbz ffbzVar2 = cqko.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    cqgj cqgjVar2 = (cqgj) ffdx.J(collection);
                    List b = ffdx.b(cqgjVar2);
                    eyee eyeeVar = cqgjVar2.e;
                    eyeeVar.getClass();
                    return new cqjk(b, 2, ffdx.b(new cqji(cqgjVar, eyeeVar)));
                }
            });
        }
    });
}
