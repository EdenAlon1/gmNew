package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eehw {
    final /* synthetic */ eehy a;

    public eehw(eehy eehyVar) {
        this.a = eehyVar;
    }

    public final void a(eelv eelvVar) {
        eehy eehyVar = this.a;
        if (eelvVar.r()) {
            int i = eelvVar.l;
            eehp eehpVar = eehyVar.b;
            if (eehpVar == null) {
                dkty.q("Keep alive listener is null", new Object[0]);
                return;
            } else if (i == 3) {
                eehpVar.e();
                return;
            } else {
                eehpVar.f();
                return;
            }
        }
        try {
            if (eelvVar.s()) {
                eenk eenkVar = new eenk((eelw) eelvVar);
                dkty.w(25, 3, "SIP request received with method=%s and callid=%s", eenkVar.z(), eenkVar.d());
                if (((Boolean) dinr.h.a()).booleanValue()) {
                    dkty.c("\n%s", eenkVar.n());
                }
                dkty.l(eehyVar.a(), "Notifying %d SIP listener(s) about %s request for %s", Integer.valueOf(eehyVar.a.size()), eenkVar.z(), eenkVar.d());
                Iterator it = eehyVar.a.iterator();
                while (it.hasNext()) {
                    ((eehs) it.next()).f(eenkVar);
                }
                return;
            }
            eenl eenlVar = new eenl((eelx) eelvVar);
            dkty.w(25, 3, "SIP response received with code=%s and callid=%s", Integer.valueOf(eenlVar.y()), eenlVar.d());
            if (((Boolean) dinr.h.a()).booleanValue()) {
                dkty.c("\n%s", eenlVar.n());
            }
            dkty.l(eehyVar.a(), "Notifying %d SIP listener(s) about %d %s response for %s (CallId=%s)", Integer.valueOf(eehyVar.a.size()), Integer.valueOf(eenlVar.y()), eenlVar.A(), eenlVar.z().i(), eenlVar.d());
            Iterator it2 = eehyVar.a.iterator();
            while (it2.hasNext()) {
                ((eehs) it2.next()).g(eenlVar);
            }
        } catch (Exception e) {
            dkty.g("Can't process incoming message: %s", e.getMessage());
        }
    }
}
