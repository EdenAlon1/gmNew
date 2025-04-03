package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htb extends ffkk implements ffjm {
    final /* synthetic */ hte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htb(hte hteVar) {
        super(2);
        this.a = hteVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hte hteVar;
        Object obj3;
        Object ad;
        Set set = (Set) obj;
        do {
            hteVar = this.a;
            obj3 = hteVar.b.get();
            if (obj3 == null) {
                ad = set;
            } else if (obj3 instanceof Set) {
                ad = ffdx.g(obj3, set);
            } else {
                if (!(obj3 instanceof List)) {
                    hte.g();
                    throw new ffbx();
                }
                ad = ffdx.ad((Collection) obj3, ffdx.b(set));
            }
        } while (!hsx.a(hteVar.b, obj3, ad));
        if (this.a.f()) {
            hte hteVar2 = this.a;
            hteVar2.a.invoke(new htd(hteVar2));
        }
        return ffcu.a;
    }
}
