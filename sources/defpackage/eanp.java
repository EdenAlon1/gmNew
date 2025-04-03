package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eanp extends ffhv implements ffjm {
    final /* synthetic */ eans a;
    final /* synthetic */ eagp b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eanp(eans eansVar, eagp eagpVar, List list, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = eansVar;
        this.b = eagpVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eanp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eagp eagpVar = this.b;
        boolean a = eagpVar.a();
        boolean b = eagpVar.b();
        List list = this.c;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((easy) it.next()).b()) {
                    z = false;
                    break;
                }
            }
        }
        eans eansVar = this.a;
        return eansVar.e.a(new ealy(a, b, z));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eanp(this.a, this.b, this.c, ffguVar);
    }
}
