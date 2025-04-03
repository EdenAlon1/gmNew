package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqyz implements ctbj {
    final /* synthetic */ aqza a;

    public aqyz(aqza aqzaVar) {
        this.a = aqzaVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        Optional i = ((cort) this.a.g.b()).i(this.a.d);
        if (i.isPresent() && (((cosz) i.get()).b & 1) != 0) {
            djrv djrvVar = (djrv) this.a.f.b();
            String str = ((cosz) i.get()).c;
            aqza aqzaVar = this.a;
            djrvVar.r(str, aqzaVar.e, aqzaVar.c);
            return;
        }
        ensk j = aqza.a.j();
        j.Y(ente.a, "BugleSelfIdentity");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.t, Integer.valueOf(this.a.d));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/rcs/SubscriptionRcsAvailabilitySupplier$1", "onFirstRegister", 133, "SubscriptionRcsAvailabilitySupplier.java")).q("Not able to setup RCS availability listener since there is no available SIM ID for the subscription ID.");
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ((djrv) this.a.f.b()).u(this.a.e);
    }
}
