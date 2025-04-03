package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmoe implements djry {
    private static final entd a = entd.c("BugleRcsProvisioning");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider");
    private final ffbr c;
    private final ffbr d;
    private final djsz e;

    public cmoe(ffbr ffbrVar, ffbr ffbrVar2, djsz djszVar) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = djszVar;
    }

    @Override // defpackage.djry
    public final Optional i(djrm djrmVar) {
        return j(djrn.a(djrmVar).a);
    }

    @Override // defpackage.djry
    public final Optional j(String str) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 102, "CachedRcsConfigurationProvider.java")).t("CachedRcsConfiguration getConfiguration for simId:[%s]", dktx.SIM_ID.c(str));
        Optional optional = (Optional) ((cmog) this.c.b()).get(str);
        if (optional == null) {
            ensk j = b.j();
            j.Y(ente.a, "BugleRcsProvisioning");
            enrr enrrVar = (enrr) j;
            enrrVar.aa(ensy.FULL);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 107, "CachedRcsConfigurationProvider.java")).q("Failed to get RCS configuration from the cached provider, configuration is null.");
        } else if (optional.isEmpty()) {
            ensk j2 = b.j();
            j2.Y(ente.a, "BugleRcsProvisioning");
            enrr enrrVar2 = (enrr) j2;
            enrrVar2.aa(ensy.FULL);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcsprovisioning/cache/CachedRcsConfigurationProvider", "getConfiguration", 110, "CachedRcsConfigurationProvider.java")).q("Failed to get RCS configuration from the cached provider, configuration is empty.");
        }
        optional.getClass();
        return optional;
    }

    @Override // defpackage.djry
    public final Optional k(djrj djrjVar) {
        return this.e.h(djrjVar).flatMap(new cmod(this));
    }

    @Override // defpackage.djry
    public final Optional l(int i) {
        return this.e.q(i).flatMap(new cmod(this));
    }

    @Override // defpackage.djry
    public final Optional m() {
        return j(((dkpp) this.d.b()).l());
    }
}
