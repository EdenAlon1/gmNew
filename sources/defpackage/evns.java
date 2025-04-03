package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class evns extends evlf {
    private final evnv a;

    public evns(evnv evnvVar) {
        this.a = evnvVar;
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        Object c = c();
        Map map = this.a.b;
        try {
            evplVar.m();
            while (evplVar.r()) {
                evnt evntVar = (evnt) map.get(evplVar.h());
                if (evntVar == null) {
                    evplVar.q();
                } else {
                    f(c, evplVar, evntVar);
                }
            }
            evplVar.o();
            return e(c);
        } catch (IllegalAccessException e) {
            throw evpf.b(e);
        } catch (IllegalStateException e2) {
            throw new evlb(e2);
        }
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        if (obj == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        try {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((evnt) it.next()).c(evpnVar, obj);
            }
            evpnVar.h();
        } catch (IllegalAccessException e) {
            throw evpf.b(e);
        }
    }

    public abstract Object c();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, evpl evplVar, evnt evntVar);
}
