package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxci implements ejxk {
    final /* synthetic */ cxch a;

    public cxci(cxch cxchVar) {
        this.a = cxchVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ((enrr) ((enrr) ((enrr) cxch.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$GetRcsDefaultOnLoadedCallback", "onLoadError", (char) 565, "RcsSettingsFragmentV2Peer.java")).q("Error loading RCS default on data");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cmem cmemVar = (cmem) obj;
        if (!(djai.z() && djai.ac()) && dimo.b() && this.a.N.b()) {
            cxch cxchVar = this.a;
            boolean z = true;
            if (cmemVar != cmem.LEGAL_FYI_SEEN && (!djai.J() || cmemVar != cmem.OOB_CONSENT)) {
                z = false;
            }
            cxchVar.j = z;
            ((enrr) ((enrr) cxch.a.h()).h("com/google/android/apps/messaging/ui/appsettings/RcsSettingsFragmentV2Peer$GetRcsDefaultOnLoadedCallback", "onLoaded", 551, "RcsSettingsFragmentV2Peer.java")).t("onRcsDefaultOnLoaded, hasRcsDefaultOnConsent: %s", Boolean.valueOf(this.a.j));
            if (((aupn) this.a.Y.b()).a()) {
                ((cmgr) this.a.Q.b()).k();
            } else {
                this.a.k();
            }
            this.a.g();
            this.a.i();
        }
    }
}
