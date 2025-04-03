package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbty implements ahrc {
    private static final enru a = enru.c("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged");
    private final ffbr b;

    public dbty(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.b = ffbrVar;
    }

    @Override // defpackage.ahrc
    public final void a(eisx eisxVar) {
        if (!adhu.a()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged", "execute", 21, "GaiaPairingOnDelayedAccountChanged.kt")).q("Skip GaiaPairingOnDelayedAccountChanged as the Bugle flags are off");
            return;
        }
        if (!adhu.b()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged", "execute", 24, "GaiaPairingOnDelayedAccountChanged.kt")).q("Skip GaiaPairingOnDelayedAccountChanged as the GaiaPairing flag is off");
        } else if (((Optional) this.b.b()).isEmpty()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/ui/gaia/GaiaPairingOnDelayedAccountChanged", "execute", 27, "GaiaPairingOnDelayedAccountChanged.kt")).q("Skip GaiaPairingOnDelayedAccountChanged as the module is missing");
        } else {
            axnw.h(((bzjz) ((Optional) this.b.b()).get()).d(eisxVar));
        }
    }
}
