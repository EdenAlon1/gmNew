package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cxcf implements ejlr<Integer, Void> {
    final /* synthetic */ cxch a;

    public cxcf(cxch cxchVar) {
        this.a = cxchVar;
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void c(Object obj, Object obj2) {
        cmip b = cmip.b(((Integer) obj).intValue());
        b.getClass();
        cxch cxchVar = this.a;
        cxchVar.r.getClass();
        cxchVar.H.getClass();
        cxchVar.h.getClass();
        cxcj cxcjVar = cxchVar.Z;
        cxcjVar.getClass();
        ((cwuf) cxcjVar).a.G(true);
        boolean equals = b.equals(cmip.TOGGLE_STATE_ENABLED);
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.ims.provisioning.engine.bugle_enabled_rcs_from_preference", equals);
        ((ckds) this.a.r.b()).M(bundle);
        ((ckaj) this.a.H.b()).h(equals);
        if (djai.W()) {
            ((enrr) ((enrr) cxch.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$2", "onSuccess", 456, "RcsSettingsFragmentV2Peer.java")).t("enableMoSmsNumberDiscovery %s", Boolean.valueOf(equals));
            this.a.h.f(equals);
        }
        this.a.i();
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void m(Object obj, Throwable th) {
        ((enrr) ((enrr) ((enrr) cxch.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$2", "onFailure", (char) 465, "RcsSettingsFragmentV2Peer.java")).q("Failed to set RCS Global Toggle");
        cxcj cxcjVar = this.a.Z;
        cxcjVar.getClass();
        ((cwuf) cxcjVar).a.G(true);
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
