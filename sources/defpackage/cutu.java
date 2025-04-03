package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cutu {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker");
    public final ffbr b;
    public final ffbr c;
    private final ffsk d;

    public cutu(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.d = ffskVar;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    public final void a() {
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleSpam");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker", "getAccountIdAndCheckSpatulaSettings", 42, "SpatulaSettingsChecker.kt")).q("Retrieving account id and checking Spatula settings.");
        if (((cutv) this.c.b()).a() == null) {
            axol.k(this.d, null, new cutt(this, null), 3);
            return;
        }
        ensk h2 = enruVar.h();
        h2.Y(ente.a, "BugleSpam");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker", "getAccountIdAndCheckSpatulaSettings", 47, "SpatulaSettingsChecker.kt")).q("Last used SpatulaSettings is already initialized.");
    }

    public final boolean b() {
        cutr a2;
        ensk h = a.h();
        h.Y(ente.a, "BugleSpam");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/spam/spatula/SpatulaSettingsChecker", "isSpatulaEnabled", 26, "SpatulaSettingsChecker.kt")).q("Checking if spatula is enabled.");
        if (!cubs.f() || (a2 = ((cutv) this.c.b()).a()) == null) {
            return false;
        }
        return a2.a;
    }
}
