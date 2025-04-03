package defpackage;

import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Timer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeim extends eeig {
    public final dktn a;
    public final eeji b;
    public final eeno c;
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final Timer f = new Timer();
    public final diod g;
    public eehw h;
    private final enip i;
    private final Map j;
    private final eenz k;

    public eeim(eeno eenoVar, dktn dktnVar, diod diodVar, eeji eejiVar, Collection collection) {
        eeij eeijVar = new eeij(this);
        this.k = eeijVar;
        this.c = eenoVar;
        this.a = dktnVar;
        this.b = eejiVar;
        this.g = diodVar;
        eenoVar.k(eeijVar);
        this.j = DesugarCollections.synchronizedMap(new HashMap());
        this.i = enip.o(collection);
    }

    @Override // defpackage.eeig
    public final eeif a(eenj eenjVar, eein eeinVar) {
        eeif eeifVar;
        eelv eelvVar = eenjVar.a;
        eekg eekgVar = eelvVar.g;
        String v = eekgVar == null ? null : (eelvVar.t() && "INVITE".equals(eekgVar.e())) ? eelvVar.v("ACK", 2) : eeif.j(eelvVar);
        dkty.d(this.a, "Created a transaction context for transaction id: %s", v);
        if (v == null) {
            dkty.q("Transaction id is null.", new Object[0]);
            eeifVar = null;
        } else {
            eeifVar = new eeif(v, eenjVar, eeinVar);
        }
        if (eeifVar == null) {
            return null;
        }
        this.j.put(eeifVar.c, eeifVar);
        return eeifVar;
    }

    @Override // defpackage.eeig
    public final eeno b() {
        return this.c;
    }

    @Override // defpackage.eeig
    public final void c() {
        try {
            eeno eenoVar = this.c;
            if (eenoVar != null) {
                eenoVar.l();
                dkty.d(this.a, "SIP transport was terminated", new Object[0]);
            }
        } catch (RuntimeException e) {
            dkty.j(e, this.a, "Can't close SIP transport properly", new Object[0]);
        }
    }

    @Override // defpackage.eeig
    public final void d(eelv eelvVar) {
        Optional empty;
        try {
            eeno eenoVar = this.c;
            if (eenoVar == null) {
                throw new eejg("SipTransport is null");
            }
            eenoVar.i(eelvVar);
            diod diodVar = this.g;
            eeno eenoVar2 = this.c;
            if (eelvVar.s()) {
                diodVar.c(new eenk((eelw) eelvVar), Optional.empty(), 1, 4, eenoVar2);
                return;
            }
            if (eelvVar.t()) {
                eenl eenlVar = new eenl((eelx) eelvVar);
                String d = eenlVar.d();
                if (d != null) {
                    synchronized (diodVar.b) {
                        Iterator it = diodVar.b.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                empty = Optional.empty();
                                break;
                            }
                            eenj eenjVar = (eenj) it.next();
                            if (d.equals(eenjVar.d()) && eenjVar.a() == eenlVar.a()) {
                                empty = Optional.of(eenjVar);
                                break;
                            }
                        }
                    }
                } else {
                    empty = Optional.empty();
                }
                diodVar.c(eenlVar, empty, 1, 4, eenoVar2);
            }
        } catch (eejg e) {
            dkty.g("Can't send message: %s", e.getMessage());
            throw e;
        }
    }

    @Override // defpackage.eeig
    public final void e(eehw eehwVar) {
        this.h = eehwVar;
    }

    public final eeif f(String str) {
        return (eeif) this.j.get(str);
    }

    public final void g(eelv eelvVar) {
        String j = eeif.j(eelvVar);
        dkty.c("Getting transaction context for transaction id: %s", j);
        if (j == null) {
            dkty.g("Transaction id is null.", new Object[0]);
            return;
        }
        eeif f = f(j);
        if (f != null) {
            dkty.c("Transaction context found for transaction id: %s", j);
            if (eelvVar.t()) {
                eekg eekgVar = eelvVar.g;
                if (eekgVar == null) {
                    dkty.g("CSeqHeader is null.", new Object[0]);
                } else {
                    eenl eenlVar = new eenl((eelx) eelvVar);
                    if (eenlVar.y() < 200) {
                        dkty.k("Provisional response received - resetting transaction timer", new Object[0]);
                        int y = eenlVar.y();
                        if (y == 100 || y == 180 || y == 183) {
                            f.e = System.currentTimeMillis();
                        }
                    } else if (f.b == null) {
                        dkty.k("First response received", new Object[0]);
                        f.e(eenlVar);
                    } else if (eekgVar.e().equals("INVITE")) {
                        dkty.k("Second response received - sending ACK again", new Object[0]);
                        eenj eenjVar = f.a;
                        if (eenjVar == null) {
                            dkty.g("Not sending SIP message as it's null.", new Object[0]);
                        } else {
                            try {
                                eelw eelwVar = (eelw) eenjVar.a;
                                eelx z = eenlVar.z();
                                eekk eekkVar = (eekk) z.c().f();
                                eeit d = (z.w() >= 300 || eekkVar == null) ? eehk.d(eelwVar.w().c()) : eehk.d(eekkVar.a.b.c());
                                String h = z.h();
                                if (h == null) {
                                    throw new eeje("Response Call Identifier is null.");
                                }
                                eekh b = eene.b(h);
                                eekg eekgVar2 = z.g;
                                if (eekgVar2 == null) {
                                    throw new eeje("Response CSeqHeader is null.");
                                }
                                eekg a = eene.a(eekgVar2.b(), "ACK");
                                eekt eektVar = z.e;
                                eell eellVar = z.f;
                                if (eektVar == null || eellVar == null) {
                                    throw new eeje("From or To headers are null.");
                                }
                                eelw a2 = eehq.a(d, "ACK", b, a, eektVar, eellVar, eelwVar.g().a, eene.h(75));
                                int i = engw.d;
                                engr engrVar = new engr();
                                Iterator it = z.j("Record-Route").iterator();
                                while (it.hasNext()) {
                                    eeld eeldVar = (eeld) ((eeku) it.next());
                                    eelg eelgVar = new eelg(eeldVar.a);
                                    if (eeldVar.m()) {
                                        Iterator<eejc> it2 = eeldVar.e.iterator();
                                        while (it2.hasNext()) {
                                            eelgVar.e.e((eejc) it2.next().clone());
                                        }
                                    }
                                    engrVar.h(eelgVar);
                                }
                                Iterator<E> it3 = engrVar.g().a().iterator();
                                while (it3.hasNext()) {
                                    a2.k((eelg) it3.next());
                                }
                                d(new eenk(a2).a);
                            } catch (Exception e) {
                                dkty.g("Can't send message: %s", e.getMessage());
                            }
                        }
                    }
                }
            } else if ("ACK".equals(eelvVar.i())) {
                f.e(new eenk((eelw) eelvVar));
            }
        }
        synchronized (this.j) {
            dkty.c("Checking %d transactions for expiry", Integer.valueOf(this.j.size()));
            Iterator it4 = this.j.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                eeif eeifVar = (eeif) entry.getValue();
                if (System.currentTimeMillis() - eeifVar.e >= eeifVar.f) {
                    dkty.c("Transaction: %s expired. Removing transaction...", entry.getKey());
                    it4.remove();
                }
            }
            dkty.c("Transactions after cleanup: %d", Integer.valueOf(this.j.size()));
        }
    }

    public final boolean h(eelv eelvVar) {
        if (!this.e.contains(eelvVar.u(1))) {
            return false;
        }
        if (eelvVar.t()) {
            eelx eelxVar = (eelx) eelvVar;
            eekg eekgVar = eelxVar.g;
            if (eelxVar.z() && eekgVar != null && "INVITE".equals(eekgVar.e())) {
                return false;
            }
        }
        return true;
    }

    public final boolean i(eelv eelvVar) {
        if (eelvVar.u(1) == null) {
            dkty.d(this.a, "Not checking duplicate for msgs with null context id", new Object[0]);
            return false;
        }
        if (eelvVar.r()) {
            dkty.d(this.a, "Not checking duplicate for keep alive msgs", new Object[0]);
            return false;
        }
        if (eelvVar.s()) {
            eelw eelwVar = (eelw) eelvVar;
            if (this.i.contains(eelwVar.i())) {
                dkty.d(this.a, "Not checking duplicate for %s", eelwVar.i());
                return false;
            }
        }
        if (eelvVar.t()) {
            eenl eenlVar = new eenl((eelx) eelvVar);
            if (eenlVar.y() >= 100 && eenlVar.y() <= 199) {
                return false;
            }
        }
        return true;
    }
}
