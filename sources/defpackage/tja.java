package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tja implements ahrc {
    public static final enru a = enru.c("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;

    public tja(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    @Override // defpackage.ahrc
    public final void a(eisx eisxVar) {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) h.h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged", "execute", 34, "FiSignInPromoOnDelayedAccountChanged.kt")).q("FiSignInPromoOnDelayedAccountChanged gets triggered");
        if (!((Boolean) ((cfup) csgj.r.get()).e()).booleanValue()) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleCms");
            ((enrr) h2.h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged", "execute", 36, "FiSignInPromoOnDelayedAccountChanged.kt")).q("Skip FiSignInPromoOnDelayedAccountChanged as the flag is off");
        } else if (((Optional) ((fbbb) this.b).a).isEmpty()) {
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "BugleCms");
            ((enrr) h3.h("com/google/android/apps/messaging/cloudstore/fi/signinpromo/FiSignInPromoOnDelayedAccountChanged", "execute", 39, "FiSignInPromoOnDelayedAccountChanged.kt")).q("Skip FiSignInPromoOnDelayedAccountChanged as the module is missing");
        } else {
            Object b = this.e.b();
            b.getClass();
            axol.k((ffsk) b, null, new tiz(this, eisxVar, null), 3);
        }
    }
}
