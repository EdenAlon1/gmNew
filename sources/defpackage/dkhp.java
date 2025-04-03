package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkhp {
    public final dkha a;
    public final djjr b;
    public final ffbr c;
    public final dkur d;
    public int e;
    public long f;

    public dkhp(dkha dkhaVar, djjr djjrVar, ffbr ffbrVar, dkur dkurVar) {
        this.a = dkhaVar;
        this.b = djjrVar;
        this.c = ffbrVar;
        this.d = dkurVar;
    }

    private static final eelj d() {
        eelj eeljVar = new eelj();
        eeljVar.e(1800);
        eeljVar.f("uas");
        return eeljVar;
    }

    public final void a(eehr eehrVar, eenk eenkVar) {
        dkty.k("Handling session refresh request", new Object[0]);
        try {
            eehy eehyVar = ((eehz) this.c).a;
            if (!"INVITE".equals(eenkVar.z())) {
                if ("UPDATE".equals(eenkVar.z())) {
                    eenl h = this.d.h(eenkVar, eehrVar.d, BasePaymentResult.ERROR_REQUEST_FAILED);
                    c(eehrVar, eenkVar, h);
                    eehyVar.l(h);
                    return;
                }
                return;
            }
            eenl g = this.d.g(eehyVar, eehrVar, eenkVar);
            dkut.u(g, this.a.x(), this.a.al());
            c(eehrVar, eenkVar, g);
            eeif l = eehyVar.l(g);
            l.h(30);
            if (l.f()) {
                dkty.k("ACK request received", new Object[0]);
            } else {
                dkty.g("No ACK received for INVITE", new Object[0]);
                this.a.o(new dkqr(408, "Timeout"), 1, 1);
            }
        } catch (Exception e) {
            dkty.i(e, "Sending response failed: %s", e.getMessage());
            this.a.o(new dkqr(408, "Timeout"), 1, 1);
        }
    }

    final void b(eehr eehrVar, eenl eenlVar) {
        eelj eeljVar = (eelj) eenlVar.a.d("Session-Expires");
        if (eeljVar == null) {
            return;
        }
        this.e = eeljVar.a;
        this.f = System.currentTimeMillis();
        String b = eeljVar.b();
        if (!TextUtils.isEmpty(b)) {
            eehrVar.w = b;
        }
        dkty.c("Starting session refresh timer! Interval: %d role: %s", Integer.valueOf(this.e), b);
        dkha dkhaVar = this.a;
        dkhaVar.i.c(dkhaVar);
        if ("uac".equals(b)) {
            dkha dkhaVar2 = this.a;
            dkhaVar2.i.h(dkhaVar2, this.e, true);
        } else {
            dkha dkhaVar3 = this.a;
            dkhaVar3.i.h(dkhaVar3, this.e, false);
        }
    }

    final void c(eehr eehrVar, eenk eenkVar, eenl eenlVar) {
        eelj d;
        String j = eenkVar.j("Supported");
        if (j == null || !j.contains("timer")) {
            d = d();
        } else {
            eelj eeljVar = (eelj) eenkVar.a.d("Session-Expires");
            if (eeljVar == null) {
                d = d();
            } else {
                eelj eeljVar2 = new eelj();
                eeljVar2.e(eeljVar.a);
                String b = eeljVar.b();
                if (b == null || "uas".equals(b)) {
                    eeljVar2.f("uas");
                } else {
                    eeljVar2.f("uac");
                }
                d = eeljVar2;
            }
        }
        String b2 = d.b();
        if (!TextUtils.isEmpty(b2)) {
            eehrVar.w = b2;
        }
        dkha dkhaVar = this.a;
        dkhaVar.i.c(dkhaVar);
        this.e = d.a;
        this.f = System.currentTimeMillis();
        dkty.c("Starting session refresh timer! Interval: %d role: %s", Integer.valueOf(this.e), d.b());
        if ("uas".equals(d.b())) {
            dkha dkhaVar2 = this.a;
            dkhaVar2.i.h(dkhaVar2, d.a, true);
        } else {
            dkha dkhaVar3 = this.a;
            dkhaVar3.i.h(dkhaVar3, d.a, false);
        }
        eenlVar.a.k(d);
    }
}
