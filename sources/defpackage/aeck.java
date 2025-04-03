package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeck implements ejxk {
    final /* synthetic */ aedh a;

    public aeck(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        if (((aube) this.a.bv.b()).a()) {
            ensk j = aedh.a.j();
            j.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$1", "onLoadError", (char) 1182, "HomeFragmentPeer.java")).q("Data-source error encountered while receiving information about a GAIA-related error.");
        } else {
            csjb e = aeaa.a.e();
            e.I("Data-source error encountered while receiving information about a GAIA-related error.");
            e.s(th);
        }
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cgdh cgdhVar = (cgdh) obj;
        if (adhu.a()) {
            cgdc cgdcVar = (cgdc) this.a.an.b();
            aedh aedhVar = this.a;
            eisx eisxVar = aedhVar.al;
            eisxVar.getClass();
            if (!(cgdhVar instanceof cgdg)) {
                ((enrr) cgdc.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "showDialogOnAuthFailureForAccount", 96, "GaiaAuthCheckHelper.kt")).q("Gaia auth check found no UserRecoverableError");
                return;
            }
            cgdg cgdgVar = (cgdg) cgdhVar;
            if (!ffkj.e(eisxVar, cgdgVar.a) || ((cgdo) cgdcVar.c.b()).a(eisxVar)) {
                ((enrr) cgdc.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "showDialogOnAuthFailureForAccount", 91, "GaiaAuthCheckHelper.kt")).t("Gaia auth check found UserRecoverableError, but skipped showing dialog. Account match: [%b]", Boolean.valueOf(ffkj.e(eisxVar, cgdgVar.a)));
                return;
            }
            adzz adzzVar = aedhVar.b;
            ((enrr) cgdc.a.h().h("com/google/android/apps/messaging/shared/gaia/dataservice/GaiaAuthCheckHelper", "showDialogOnAuthFailureForAccount", 71, "GaiaAuthCheckHelper.kt")).q("Gaia auth check found UserRecoverableError, showing dialog");
            ea h = adzzVar.I().h("GaiaAuthFailureDialogFragment");
            ((cgdo) cgdcVar.c.b()).a.put(eisxVar.a(), true);
            if (h == null) {
                int i = cgdt.g;
                cgds.a(cgdgVar.b, 1).t(adzzVar.I(), "GaiaAuthFailureDialogFragment");
            } else {
                cg cgVar = new cg(adzzVar.I());
                cgVar.q(h);
                cgVar.c();
            }
        }
    }
}
