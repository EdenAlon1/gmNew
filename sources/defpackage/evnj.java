package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evnj extends evlf {
    private final evlf a;
    private final evmw b;

    public evnj(evlf evlfVar, evmw evmwVar) {
        this.a = evlfVar;
        this.b = evmwVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        Collection collection = (Collection) this.b.a();
        evplVar.l();
        while (evplVar.r()) {
            collection.add(this.a.a(evplVar));
        }
        evplVar.n();
        return collection;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        Collection collection = (Collection) obj;
        if (collection == null) {
            evpnVar.j();
            return;
        }
        evpnVar.e();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.a.b(evpnVar, it.next());
        }
        evpnVar.g();
    }
}
