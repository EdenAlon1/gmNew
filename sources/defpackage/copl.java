package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class copl implements copk {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public copl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
    }

    private final String b() {
        try {
            return ((dkpp) this.c.b()).m().substring(0, 3);
        } catch (StringIndexOutOfBoundsException e) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "getMcc", ']', "SimChangeManagerImpl.java")).q("failed to obtain mcc");
            return "";
        }
    }

    private final String c() {
        try {
            return ((dkpp) this.c.b()).m().substring(3);
        } catch (StringIndexOutOfBoundsException e) {
            ensk j = a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "getMnc", 'f', "SimChangeManagerImpl.java")).q("failed to obtain mnc");
            return "";
        }
    }

    @Override // defpackage.copk
    @Deprecated
    public final void a(Context context) {
        if (((Optional) this.b.b()).isPresent()) {
            String l = ((dkpp) this.c.b()).l();
            if (b().isEmpty() || c().isEmpty()) {
                ensk j = a.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "handleSimLoaded", 67, "SimChangeManagerImpl.java")).q("SimChangeReceiver: SimInfo is invalid");
            } else if (l.isEmpty()) {
                ensk j2 = a.j();
                j2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/sim/SimChangeManagerImpl", "handleSimLoaded", 69, "SimChangeManagerImpl.java")).q("SimChangeReceiver: simId is invalid");
            } else {
                ((cguc) this.h.b()).a(engw.r(l));
            }
        }
        ((cfud) this.d.b()).b(context, cuae.PHENOTYPE_REGISTRATION_TRIGGER_SIM_CHANGE);
        ((ckge) ((csjk) this.e.b()).a()).o(ckgb.NO_HINT);
        ((bzef) this.f.b()).i();
        ((bavz) this.g.b()).b().K();
    }
}
