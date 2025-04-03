package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eixi implements ljv {
    public final ejll a;
    public eiwk b;
    private final List c;
    private final ekki d;

    public eixi(ekki ekkiVar) {
        ekkiVar.getClass();
        this.d = ekkiVar;
        this.a = new ejll("KeepStateCallbacksHandler");
        this.c = new ArrayList();
        ekkiVar.P().c(this);
        ekkiVar.U().b("tiktok_keep_state_callback_handler", new owu() { // from class: eixh
            @Override // defpackage.owu
            public final Bundle a() {
                Bundle bundle = new Bundle();
                eixi eixiVar = eixi.this;
                eixiVar.a.f(bundle);
                eiwk eiwkVar = eixiVar.b;
                if (eiwkVar != null) {
                    bundle.putInt("KSCH$AC$callbacks_id", eiwkVar.a);
                    bundle.putInt("KSCH$AC$callbacks_state", eiwkVar.b);
                }
                return bundle;
            }
        });
    }

    public final void g() {
        efbd.c();
        eiwk eiwkVar = this.b;
        if (eiwkVar == null) {
            return;
        }
        if (eiwkVar.b == 1) {
        }
        this.b = null;
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        eiwk eiwkVar = null;
        Bundle a = this.d.U().d() ? this.d.U().a("tiktok_keep_state_callback_handler") : null;
        if (a != null) {
            this.a.e(a);
            if (a.containsKey("KSCH$AC$callbacks_id")) {
                if (!a.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
                eiwkVar = new eiwk(a.getInt("KSCH$AC$callbacks_id"), a.getInt("KSCH$AC$callbacks_state"));
            } else if (a.containsKey("KSCH$AC$callbacks_state")) {
                throw new IllegalStateException("Check failed.");
            }
            this.b = eiwkVar;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            this.a.d((adjn) it.next());
        }
        this.c.clear();
    }

    public final void h(eiup eiupVar) {
        eiupVar.getClass();
        efbd.c();
        eiwk eiwkVar = this.b;
        eiwkVar.getClass();
        this.b = null;
    }

    public final void i() {
        efbd.c();
        eiwk eiwkVar = this.b;
        eiwkVar.getClass();
        if (eiwkVar.b == 1) {
            return;
        }
        eiwkVar.b = 1;
    }

    public final int j(adjn adjnVar) {
        return this.a.a(adjnVar);
    }

    public final adjn k(int i) {
        return (adjn) this.a.b(i);
    }

    public final void l(adjn adjnVar) {
        efbd.c();
        if (this.d.P().a().a(lkj.CREATED)) {
            throw new IllegalStateException("registerKeepStateCallbacks should be invoked in the constructor only.");
        }
        this.c.add(adjnVar);
    }

    public final void m(adjn adjnVar) {
        efbd.c();
        g();
        this.b = new eiwk(this.a.a(adjnVar), 0);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
