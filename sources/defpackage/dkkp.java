package defpackage;

import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkkp implements eein {
    final /* synthetic */ dkkq a;
    private final dkjt b;
    private final eehr c;

    public dkkp(dkkq dkkqVar, dkjt dkjtVar, eehr eehrVar) {
        this.a = dkkqVar;
        this.b = dkjtVar;
        this.c = eehrVar;
    }

    @Override // defpackage.eein
    public final void a(eeif eeifVar) {
        this.a.u(this.b, 5);
    }

    @Override // defpackage.eein
    public final void b(eeif eeifVar) {
        String k;
        int a = eeifVar.a();
        eenl b = eeifVar.b();
        if (b == null) {
            dkty.h(dkkq.g, "SIP response is null.", new Object[0]);
            return;
        }
        if (a == 200 || a == 202) {
            dkkq dkkqVar = this.a;
            dkjt dkjtVar = this.b;
            Iterator it = dkkqVar.q.iterator();
            while (it.hasNext()) {
                ((dkjz) it.next()).b(dkjtVar);
            }
            return;
        }
        if (a == 407) {
            dkty.l(dkkq.g, "407 response received", new Object[0]);
            this.a.i.a(b);
            this.c.a();
            dkty.l(dkkq.g, "Send second MESSAGE", new Object[0]);
            try {
                byte[] y = dkkq.y(this.b);
                dkkq dkkqVar2 = this.a;
                dkur dkurVar = dkkqVar2.f;
                eehy q = dkkqVar2.q();
                eehr eehrVar = this.c;
                dkjt dkjtVar2 = this.b;
                eenk c = dkurVar.c(q, eehrVar, dkjtVar2.h, y, dkjtVar2.b(), Optional.empty());
                this.a.i.b(c);
                this.a.q().s(c);
                return;
            } catch (eejg | IOException e) {
                dkty.h(dkkq.g, "Unable to send second MESSAGE", new Object[0]);
                e.printStackTrace();
                return;
            }
        }
        if (a == 403) {
            this.a.u(this.b, dkkq.p(a));
            djjw djjwVar = ((djji) this.a.a).b;
            if (Objects.isNull(djjwVar)) {
                dkty.h(dkkq.g, "Reregistration required by registration controller not initialized", new Object[0]);
                return;
            } else {
                djjwVar.h(dilc.REREGISTRATION_REQUIRED, a);
                return;
            }
        }
        if (a != 404) {
            this.a.u(this.b, dkkq.p(a));
            return;
        }
        dkty.d(dkkq.g, "Remote user is not RCS user.", new Object[0]);
        String str = this.c.h;
        if (str != null && (k = dkut.k(str, this.a.j)) != null) {
            dkib dkibVar = this.a.m;
            ImsCapabilities imsCapabilities = new ImsCapabilities(dkibVar.b);
            imsCapabilities.c = false;
            imsCapabilities.d = false;
            dkibVar.e(k, imsCapabilities);
        }
        this.a.u(this.b, dkkq.p(a));
    }

    @Override // defpackage.eein
    public final void c(eeif eeifVar) {
        this.a.u(this.b, 3);
    }
}
