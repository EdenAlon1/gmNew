package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkik implements eein {
    final /* synthetic */ dkil a;
    private final dkht b;
    private final eehr c;
    private final String d;
    private boolean e;
    private final long f;

    public dkik(dkil dkilVar, long j, dkht dkhtVar, eehr eehrVar, String str) {
        this.a = dkilVar;
        this.f = j;
        this.b = dkhtVar;
        this.c = eehrVar;
        this.d = str;
    }

    private final void d() {
        try {
            dkil dkilVar = this.a;
            long j = this.f;
            String str = this.d;
            dkilVar.m.remove(str);
            Iterator it = dkilVar.g.iterator();
            while (it.hasNext()) {
                ((dkic) it.next()).l(j, str);
            }
        } catch (Exception e) {
            dkty.i(e, "Error while calling listeners: %s", e.getMessage());
        }
    }

    @Override // defpackage.eein
    public final void a(eeif eeifVar) {
        dkty.k("OPTIONS response aborted", new Object[0]);
        d();
    }

    @Override // defpackage.eein
    public final void b(eeif eeifVar) {
        int a = eeifVar.a();
        if (a == 200 || a == 202) {
            eenj eenjVar = eeifVar.b;
            dkil dkilVar = this.a;
            dkht b = dkilVar.p.b(eenjVar, dkilVar.r());
            dkil.u(b, eeifVar);
            if (((Boolean) dkil.i.a()).booleanValue() && eenjVar != null) {
                eehk eehkVar = dkut.a;
                eekv e = eenjVar.a.e("P-Asserted-Identity");
                String str = null;
                if (e != null) {
                    Iterator it = e.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        eeku eekuVar = (eeku) it.next();
                        try {
                            String a2 = eekuVar.a();
                            String str2 = eekuVar.c;
                            a2.getClass();
                            eeit eeitVar = eehk.b(a2).b;
                            if (eeitVar != null && eeitVar.l()) {
                                String eeitVar2 = eeitVar.toString();
                                if (dkut.v(eeitVar2)) {
                                    str = eeitVar2.substring(4);
                                    break;
                                }
                            }
                        } catch (eeje e2) {
                            dkty.j(e2, dkut.b, "Error while parsing remote uri for bot: %s", e2.getMessage());
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    b.j = Optional.of(str);
                }
            }
            if (eenjVar != null) {
                boolean w = eenjVar.w();
                b.d = true;
                boolean z = (b.y() || b.C() || b.K()) && !w;
                b.c = z;
                if (z) {
                    b.e = dkvj.a().longValue();
                }
            }
            this.a.v(this.f, this.d, b);
            return;
        }
        if (a != 404) {
            if (a != 480) {
                if (a != 604) {
                    if (a == 407) {
                        if (this.e) {
                            d();
                            return;
                        }
                        this.e = true;
                        this.a.k.a(eeifVar.b());
                        this.c.a();
                        try {
                            dkil dkilVar2 = this.a;
                            eehy eehyVar = ((eehz) dkilVar2.l).a;
                            eenk s = dkilVar2.f.s(eehyVar, this.c);
                            dkhz.e(s.b(), this.b, this.a.r());
                            dkhz.d(s, this.b, this.a.r());
                            this.a.k.b(s);
                            eehyVar.k(s, this);
                            return;
                        } catch (eejg e3) {
                            dkty.i(e3, "Error while sending SIP message", new Object[0]);
                            d();
                            return;
                        }
                    }
                    if (a != 408) {
                        dkty.q("Received unknown response status to OPTIONS call: %d", Integer.valueOf(a));
                        d();
                        return;
                    }
                }
            }
            dkil dkilVar3 = this.a;
            dkht b2 = dkilVar3.p.b(eeifVar.b, dkilVar3.r());
            if (b2.z()) {
                b2 = new ImsCapabilities(this.a.n.c(this.d));
            }
            b2.c = false;
            b2.d = true;
            if (!this.a.a.d().mImCapAlwaysOn) {
                dkty.c("480 received with IM_CAP_ALWAYS_ON disabled!", new Object[0]);
                b2 = this.a.o.a();
                b2.c = false;
                b2.d = false;
            }
            dkil.u(b2, eeifVar);
            this.a.v(this.f, this.d, b2);
            return;
        }
        dkht a3 = this.a.o.a();
        a3.c = false;
        a3.d = false;
        dkil.u(a3, eeifVar);
        this.a.v(this.f, this.d, a3);
    }

    @Override // defpackage.eein
    public final void c(eeif eeifVar) {
        dkty.k("OPTIONS response timeout", new Object[0]);
        d();
    }
}
