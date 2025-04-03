package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajnb extends cpdn {
    private static final enru a = enru.c("com/google/android/apps/messaging/profile/startup/ProfilesStartupTask");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public ajnb(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
    }

    @Override // defpackage.cqor
    public final ekzz a() {
        return eleg.f("ProfilesStartupTask");
    }

    @Override // defpackage.cpdo
    public final elfl b() {
        if (!((Boolean) this.b.b()).booleanValue()) {
            ensk h = a.h();
            h.Y(ente.a, "BugleProfiles");
            ((enrr) h.h("com/google/android/apps/messaging/profile/startup/ProfilesStartupTask", "run", 36, "ProfilesStartupTask.kt")).q("Profiles full refresh disabled, not scheduling refresh");
            elfl e = elfo.e(false);
            e.getClass();
            return e;
        }
        if (((aulo) this.d.b()).a()) {
            ensk h2 = a.h();
            h2.Y(ente.a, "BugleProfiles");
            ((enrr) h2.h("com/google/android/apps/messaging/profile/startup/ProfilesStartupTask", "run", 41, "ProfilesStartupTask.kt")).q("Not running profiles startup task, using synclet");
            elfl e2 = elfo.e(false);
            e2.getClass();
            return e2;
        }
        cjxc cjxcVar = (cjxc) this.c.b();
        axol.k(cjxcVar.a, null, new cjxb(cjxcVar, null), 3);
        elfl e3 = elfo.e(true);
        e3.getClass();
        return e3;
    }

    @Override // defpackage.cpeh
    public final boolean c() {
        return true;
    }
}
