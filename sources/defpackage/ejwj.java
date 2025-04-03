package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejwj implements ljv {
    final /* synthetic */ ea a;
    final /* synthetic */ ejwk b;

    public ejwj(ejwk ejwkVar, ea eaVar) {
        this.a = eaVar;
        this.b = ejwkVar;
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        this.b.a.e.c();
        this.b.b.c();
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        this.b.b.c();
        this.b.b.a();
        ejwn ejwnVar = this.b.a;
        Iterator it = ejwnVar.a.values().iterator();
        while (it.hasNext()) {
            ((ejwz) it.next()).d();
        }
        Iterator it2 = ejwnVar.b.values().iterator();
        while (it2.hasNext()) {
            ((ejwz) it2.next()).d();
        }
        ejwnVar.c.c();
        ejwnVar.d.clear();
    }

    @Override // defpackage.ljv
    public final void gZ(lkr lkrVar) {
        loa loaVar = new loa(this.a.T());
        loaVar.b(lmc.c, Bundle.EMPTY);
        ea eaVar = this.a;
        this.b.a = (ejwn) new lmw(eaVar.S(), eaVar.R(), loaVar).a(ejwn.class);
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        this.b.b.b();
        ejwn ejwnVar = this.b.a;
        ejwnVar.c.g();
        for (Integer num : ejwnVar.b.keySet()) {
            emxf.n(ejwnVar.d.contains(num), "Did not re-register a subscription for @ResId %s. You must re-register all subscriptions you previously had after a configuration change, so that you don't lose user state.", num.intValue());
        }
        this.b.a.e.b();
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }
}
