package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class citi extends civa {
    @Override // defpackage.civa
    public final elfl a(List list, Object obj) {
        return b(obj).h(new emwl() { // from class: cith
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                citk citkVar = (citk) obj2;
                if (citkVar == null) {
                    return null;
                }
                civk n = civl.n();
                n.f(citkVar.d());
                ((ciss) n).b = citkVar.a();
                n.e(citkVar.c());
                n.k(citkVar.e());
                n.g(citkVar.b());
                n.i(citkVar.f());
                return new cisv(engw.r(n.a()), Optional.empty());
            }
        }, erpp.a);
    }

    public abstract elfl b(Object obj);
}
