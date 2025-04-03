package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjm implements ahrc {
    private final ffbr a;

    public adjm(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    @Override // defpackage.ahrc
    public final void a(eisx eisxVar) {
        if (adhu.a()) {
            cgdc cgdcVar = (cgdc) this.a.b();
            if (((cgdo) cgdcVar.c.b()).b.contains(Integer.valueOf(eisxVar.a()))) {
                ((enrr) cgdc.a.e().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "queueGaiaAuthCheck", 29, "GaiaAuthCheckHelper.kt")).q("Gaia auth check not queued; already successful");
                return;
            }
            if (((cgdo) cgdcVar.c.b()).a(eisxVar)) {
                ((enrr) cgdc.a.e().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "queueGaiaAuthCheck", 33, "GaiaAuthCheckHelper.kt")).q("Gaia auth check not queued; dialog already shown");
                return;
            }
            ((enrr) cgdc.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "queueGaiaAuthCheck", 37, "GaiaAuthCheckHelper.kt")).q("Gaia auth check queued");
            cgdn cgdnVar = cgdcVar.b;
            cdvw cdvwVar = (cdvw) cdvx.a.createBuilder();
            int a = eisxVar.a();
            cdvwVar.copyOnWrite();
            cdvx cdvxVar = (cdvx) cdvwVar.instance;
            cdvxVar.b |= 1;
            cdvxVar.c = a;
            cdvx cdvxVar2 = (cdvx) cdvwVar.build();
            cetp cetpVar = new cetp();
            cetpVar.b = eisxVar.toString();
            ((cevh) cgdnVar.a.b()).g(ceyr.h("gaia_auth_check_result", cdvxVar2, cetpVar.a()));
        }
    }
}
