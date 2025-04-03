package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkhg implements eein {
    final /* synthetic */ dkhi a;

    public dkhg(dkhi dkhiVar) {
        this.a = dkhiVar;
    }

    @Override // defpackage.eein
    public final void a(eeif eeifVar) {
        this.a.f(408, "timeout");
    }

    @Override // defpackage.eein
    public final void b(eeif eeifVar) {
        if (!eeifVar.g()) {
            this.a.f(408, "timeout");
            return;
        }
        eenl b = eeifVar.b();
        if (b == null) {
            dkty.g("SIP response is null.", new Object[0]);
            return;
        }
        int a = eeifVar.a();
        if (a == 200 || a == 202) {
            dkhi dkhiVar = this.a;
            dkhiVar.o(b);
            Iterator it = dkhiVar.a.iterator();
            while (it.hasNext()) {
                ((dkhk) it.next()).t();
            }
            return;
        }
        if (a == 403) {
            dkhi dkhiVar2 = this.a;
            if (dkhiVar2.h) {
                dkhiVar2.f(403, b.A());
                return;
            } else {
                dkhiVar2.h = true;
                dkhiVar2.l(false);
                return;
            }
        }
        if (a != 407) {
            if (a != 423) {
                this.a.f(a, b.A());
                return;
            }
            dkhi dkhiVar3 = this.a;
            try {
                dkty.k("423 response received", new Object[0]);
                String j = b.j("Min-Expires");
                dkhiVar3.e = dkhiVar3.b(dkhiVar3.c);
                dkty.k("Send second Subscribe", new Object[0]);
                String[] strArr = dkhiVar3.j;
                if (strArr == null) {
                    strArr = new String[0];
                }
                dkhiVar3.k(dkhiVar3.m.e(dkhiVar3.c(), dkhiVar3.e, j == null ? 0 : Integer.parseInt(j), dkhiVar3.b, strArr));
                return;
            } catch (Exception e) {
                dkty.i(e, "Subscription failed", new Object[0]);
                dkhiVar3.g(new dkqt(e));
                return;
            }
        }
        dkhi dkhiVar4 = this.a;
        try {
            dkty.k("407 response received", new Object[0]);
            dkhiVar4.o(b);
            dkhiVar4.d.a(b);
            dkhiVar4.e.a();
            dkty.k("Send second Subscribe", new Object[0]);
            String[] strArr2 = dkhiVar4.j;
            if (strArr2 == null) {
                strArr2 = new String[0];
            }
            eenk e2 = dkhiVar4.m.e(dkhiVar4.c(), dkhiVar4.e, 3600, dkhiVar4.b, strArr2);
            dkhiVar4.d.b(e2);
            eell eellVar = e2.y().f;
            if (eellVar == null) {
                throw new eejg("subscribe.getStackRequest().getToHeader() returned null");
            }
            eellVar.e();
            dkhiVar4.k(e2);
        } catch (Exception e3) {
            dkty.i(e3, "Subscription failed", new Object[0]);
            dkhiVar4.g(new dkqt(e3));
        }
    }

    @Override // defpackage.eein
    public final void c(eeif eeifVar) {
        this.a.f(408, "timeout");
    }
}
