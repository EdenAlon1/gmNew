package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djjg implements djkh {
    final /* synthetic */ djji a;

    public djjg(djji djjiVar) {
        this.a = djjiVar;
    }

    @Override // defpackage.djkh
    public final void g(dilc dilcVar) {
        dkty.d(this.a.l, "Handling registration failed", new Object[0]);
        this.a.g(dilcVar);
        djjw djjwVar = this.a.b;
        if (dilcVar == dilc.RECONFIGURATION_REQUIRED && !Objects.isNull(djjwVar)) {
            dkty.d(this.a.l, "Stopping ImsRegistrationController. Reconfiguration is required.", new Object[0]);
            djjwVar.j(dilcVar);
        }
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            ((djkh) it.next()).g(dilcVar);
        }
    }

    @Override // defpackage.djkh
    public final void h() {
        dkty.d(this.a.l, "Handling registration successful", new Object[0]);
        this.a.d.f();
        this.a.h.onImsModuleStarted();
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            ((djkh) it.next()).h();
        }
    }

    @Override // defpackage.djkh
    public final void i(dilc dilcVar) {
        dkty.d(this.a.l, "Handling registration terminated", new Object[0]);
        this.a.d.g(dilcVar);
        if (((Boolean) djji.a.a()).booleanValue()) {
            this.a.h(dilcVar);
        } else if (this.a.j.get()) {
            this.a.h(dilcVar);
        }
        Iterator it = this.a.t.iterator();
        while (it.hasNext()) {
            ((djkh) it.next()).i(dilcVar);
        }
    }
}
