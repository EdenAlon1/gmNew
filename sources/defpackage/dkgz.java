package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkgz extends Thread {
    final /* synthetic */ dkha a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkgz(dkha dkhaVar) {
        super("SessionUpdate");
        this.a = dkhaVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        dkha dkhaVar;
        eehy v;
        eenk eenkVar;
        int s;
        try {
            try {
                dkhaVar = this.a;
                try {
                    v = dkhaVar.v();
                    eenkVar = dkhaVar.l.i;
                    eenkVar.getClass();
                    dkty.l(dkha.f, "Updating session as terminating, invitation state = %s", Integer.valueOf(dkhaVar.n));
                    s = dkhaVar.s();
                } catch (Exception e) {
                    dkty.j(e, dkha.f, "Session initiation has failed", new Object[0]);
                    dkhaVar.L(new dkqs(e));
                }
            } catch (Exception e2) {
                dkty.j(e2, dkha.f, "Error while updating session: %s", e2.getMessage());
            }
            if (s != 2 && s != 0) {
                dkhaVar.D(null);
                dkhaVar.l.r = null;
                dkty.l(dkha.f, "Send 200 OK", new Object[0]);
                eenl f = dkhaVar.A.f(v, dkhaVar.l);
                if (f == null) {
                    dkty.h(dkha.f, "Error generating 200 OK to INVITE.", new Object[0]);
                    dkhaVar.n(9, 55);
                } else {
                    dkut.u(f, dkhaVar.x(), dkhaVar.al());
                    dkhaVar.v.c(dkhaVar.l, eenkVar, f);
                    Iterator it = dkhaVar.g.iterator();
                    while (it.hasNext()) {
                        try {
                            ((dkhd) it.next()).p();
                        } catch (Exception e3) {
                            dkty.j(e3, dkha.f, "handleSessionUpdating: Call to listener failed with error: ", new Object[0]);
                        }
                    }
                    eeif l = v.l(f);
                    l.h(30);
                    if (l.f()) {
                        dkty.l(dkha.f, "ACK request received", new Object[0]);
                        eehr eehrVar = dkhaVar.l;
                        eehrVar.s = eehrVar.t;
                        Iterator it2 = dkhaVar.g.iterator();
                        while (it2.hasNext()) {
                            try {
                                ((dkhd) it2.next()).o();
                            } catch (Exception e4) {
                                dkty.j(e4, dkha.f, "handleSessionUpdated: Call to listener failed with error", new Object[0]);
                            }
                        }
                    } else {
                        dkty.d(dkha.f, "No ACK received for INVITE", new Object[0]);
                        Iterator it3 = dkhaVar.g.iterator();
                        while (it3.hasNext()) {
                            try {
                                ((dkhd) it3.next()).s();
                            } catch (Exception e5) {
                                dkty.j(e5, dkha.f, "handleSessionUpdateFailed: Call to listener failed with error", new Object[0]);
                            }
                        }
                    }
                }
            }
            dkty.d(dkha.f, "Session has been rejected on timeout", new Object[0]);
            eehr eehrVar2 = dkhaVar.l;
            eehrVar2.t = null;
            dkhaVar.aq(eenkVar, eehrVar2.d, 11);
        } finally {
            this.a.s = null;
        }
    }
}
