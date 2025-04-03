package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkls extends dkgm {
    public final CopyOnWriteArrayList g;
    public final ffbr h;
    public dklv i;
    public dkgf j;
    public dkwz k;
    public final ctvb l;
    public final dkib m;
    public final dkxc n;
    public final dkyp o;
    public final dkhk p;
    public final dklq q;

    public dkls(djjr djjrVar, dkhc dkhcVar, ffbr ffbrVar, ctvb ctvbVar, dkib dkibVar, dkur dkurVar, dkxc dkxcVar, dkyp dkypVar) {
        super(djjrVar, dkhcVar, dkurVar);
        this.g = new CopyOnWriteArrayList();
        this.q = new dklq(this);
        this.p = new dklr(this);
        this.h = ffbrVar;
        this.l = ctvbVar;
        this.m = dkibVar;
        this.n = dkxcVar;
        this.o = dkypVar;
    }

    @Override // defpackage.dkgm
    protected final void e() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((dklu) it.next()).c();
        }
    }

    @Override // defpackage.dkgm
    protected final void f() {
        if (((djji) this.a).g.p().mUsePresence) {
            return;
        }
        if (!djak.q()) {
            dkty.c("Capability Discovery via Presence is disabled by Google.", new Object[0]);
        } else if (this.a.b().h().mPresenceDiscovery) {
            return;
        } else {
            dkty.c("Capability Discovery via Presence is disabled by configuration.", new Object[0]);
        }
        dkty.c("Presence is disabled by configuration! Stopping PresenceService...", new Object[0]);
        k(dilc.UNKNOWN);
    }

    @Override // defpackage.dkgm
    protected final void g(dilc dilcVar) {
        if (dilcVar.b()) {
            dkty.c("Skipping call to unsubscribe due to %s", dilcVar);
            return;
        }
        try {
            dklv dklvVar = this.i;
            if (dklvVar == null) {
                return;
            }
            try {
                if (dklvVar.k == 0) {
                    this.i = null;
                } else {
                    dklvVar.n();
                }
            } catch (Exception e) {
                throw new dklt("Error while sending presence un-subscription ", e);
            }
        } catch (dklt e2) {
            dkty.i(e2, "Error while unsubscribing: %s", e2.getMessage());
        }
    }

    @Override // defpackage.dkgm
    public final void n() {
    }

    @Override // defpackage.dkgm
    public final void o() {
    }
}
