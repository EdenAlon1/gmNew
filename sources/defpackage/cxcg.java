package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cxcg implements ejlr<Bundle, Void> {
    final /* synthetic */ cxch a;

    public cxcg(cxch cxchVar) {
        this.a = cxchVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        Bundle bundle = (Bundle) obj;
        this.a.H.getClass();
        String string = bundle.getString("rcs_per_sim_provisioning_id");
        string.getClass();
        ((ckaj) this.a.H.b()).i(new djro(string), bundle.getBoolean("rcs_per_sim_toggle_state"));
        if (((aupn) this.a.Y.b()).a()) {
            return;
        }
        this.a.k();
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void m(Object obj, Throwable th) {
        RcsMultiSimStatusCheckboxView b;
        Bundle bundle = (Bundle) obj;
        cxcj cxcjVar = this.a.Z;
        cxcjVar.getClass();
        String string = bundle.getString("rcs_per_sim_provisioning_id");
        string.getClass();
        djro djroVar = new djro(string);
        int i = !bundle.getBoolean("rcs_per_sim_toggle_state") ? 1 : 0;
        RcsSimStatusView l = ((cwuf) cxcjVar).h.l(djroVar);
        if (l != null && (b = l.H().b()) != null) {
            b.f(i);
        }
        ((enrr) ((enrr) ((enrr) cxch.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$3", "onFailure", (char) 511, "RcsSettingsFragmentV2Peer.java")).q("Failed to set RCS Per-Sim level");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
