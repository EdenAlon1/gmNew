package defpackage;

import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkko implements Runnable {
    final /* synthetic */ dkkq a;

    public dkko(dkkq dkkqVar) {
        this.a = dkkqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dkkq dkkqVar;
        String[] strArr;
        while (!this.a.s) {
            try {
                dkjt dkjtVar = (dkjt) this.a.r.take();
                try {
                    dkkqVar = this.a;
                    strArr = (String[]) Collection.EL.toArray(new dkjd(dkkqVar.t.mMessageTech, dkjtVar.t).c(true), new IntFunction() { // from class: dkkn
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i) {
                            dktn dktnVar = dkkq.g;
                            return new String[i];
                        }
                    });
                } catch (eejg | IOException unused) {
                    this.a.u(dkjtVar, 50);
                }
                if (dkjtVar == null) {
                    throw new IllegalArgumentException("Message must not be null");
                }
                dkty.w(3, 3, "Pager message sending with messageid=%s", dkjtVar.k);
                String str = dkjtVar.b;
                if (Objects.isNull(str)) {
                    throw new IllegalArgumentException("Message receiver must not be null");
                }
                djjr djjrVar = dkkqVar.a;
                eehy q = dkkqVar.q();
                String s = dkkqVar.s(str);
                eehr eehrVar = new eehr(eehy.w(), 1, s, djjrVar.e(), s, q.q());
                dkty.l(dkkq.g, "Send first pager message", new Object[0]);
                eenk c = dkkqVar.f.c(dkkqVar.q(), eehrVar, dkjtVar.h, dkkq.y(dkjtVar), dkjtVar.b(), Optional.ofNullable(null));
                if (dkjtVar.a == dkjs.DISPOSITION_NOTIFICATION) {
                    dkty.w(5, 3, "Pager message created with messageid=%s", dkjtVar.k);
                }
                try {
                    dkut.u(c, dkjtVar.e, strArr);
                    if (dizg.E()) {
                        dkjd dkjdVar = new dkjd(dkkqVar.t.mMessageTech, dkjtVar.t);
                        Optional empty = !dkjdVar.e() ? Optional.empty() : dkjdVar.f() ? Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.msg") : Optional.of("urn:urn-7:3gpp-service.ims.icsi.oma.cpm.session");
                        if (empty.isPresent()) {
                            try {
                                c.s("P-Preferred-Service", (String) empty.get());
                            } catch (eeje e) {
                                dkty.r(dkkq.g, "Unable to add P-Preferred-Service.", new Object[0]);
                                throw new eejg("Unable to add P-Preferred-Service.", e);
                            }
                        }
                    }
                    dkkqVar.q().k(c, new dkkp(dkkqVar, dkjtVar, eehrVar));
                } catch (eeje e2) {
                    dkty.r(dkkq.g, "Unable to add appId!", new Object[0]);
                    e2.printStackTrace();
                }
            } catch (InterruptedException unused2) {
                dkty.d(dkkq.g, "Waiting for new pager mode messages got interrupted!", new Object[0]);
                return;
            }
        }
    }
}
