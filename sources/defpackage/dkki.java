package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkki implements dkhk {
    final /* synthetic */ dkkj a;
    private final long b;

    public dkki(dkkj dkkjVar, long j) {
        this.a = dkkjVar;
        this.b = j;
    }

    @Override // defpackage.dkhk
    public final void d(dkhi dkhiVar, String str, byte[] bArr) {
        Optional a = this.a.R.a(this.b);
        if (a.isEmpty()) {
            dkty.h(dkkj.B, "GroupSessionData is not found with sessionId %d. Cannot process conference event.", Long.valueOf(this.b));
            return;
        }
        Optional optional = ((dkrn) a.get()).b;
        if (optional.isEmpty()) {
            dkty.h(dkkj.B, "No valid conference info. Not firing conference state changed from InstantMessageSession", new Object[0]);
            return;
        }
        dkkj dkkjVar = this.a;
        if (dkkjVar.G == null) {
            dkkjVar.G = new ArrayList();
        }
        Object obj = optional.get();
        Iterator it = this.a.G.iterator();
        while (it.hasNext()) {
            Optional a2 = ((dilk) obj).d.a((String) it.next(), this.a.m);
            if (a2.isPresent() && ((dimg) a2.get()).b().isEmpty()) {
                throw new IllegalStateException("There is no endpoint present");
            }
            if (a2.isEmpty() || ((dimg) a2.get()).h == dimb.DELETED || ((dimg) a2.get()).b().isEmpty() || (((dimg) a2.get()).a() == dilt.DISCONNECTED && ((dils) ((dimg) a2.get()).b().get()).f != dilr.BOOTED)) {
                it.remove();
            }
        }
        dkkj dkkjVar2 = this.a;
        Object obj2 = optional.get();
        dkrp dkrpVar = dkkjVar2.R;
        try {
            ((dilk) obj2).c();
            dkrpVar.d();
        } catch (Exception e) {
            dkty.i(e, "Error while saving groups after resetting conference : %s", e.getMessage());
        }
        for (dkhd dkhdVar : ((dkha) this.a).g) {
            if (dkhdVar instanceof dkju) {
                ((dkju) dkhdVar).d();
            }
        }
    }

    @Override // defpackage.dkhk
    public final void q(int i, String str) {
        dkty.h(dkkj.B, "Subscription for conference failed: %d:%s", Integer.valueOf(i), str);
    }

    @Override // defpackage.dkhk
    public final void r(dkqr dkqrVar) {
        dkty.j(dkqrVar, dkkj.B, "Subscription for conference failed: %s", dkqrVar.getMessage());
    }

    @Override // defpackage.dkhk
    public final void t() {
    }

    @Override // defpackage.dkhk
    public final void u() {
    }

    @Override // defpackage.dkhk
    public final void v(dkqr dkqrVar) {
    }
}
