package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uce implements ejxk {
    final /* synthetic */ ucd a;

    public uce(ucd ucdVar) {
        this.a = ucdVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ((ensz) ((ensz) ((ensz) ucd.a.j()).g(th)).h("com/google/android/apps/messaging/conversation/draft/DraftEditorFragmentPeer$RcsEnabledGlobalCallback", "onLoadError", (char) 1306, "DraftEditorFragmentPeer.java")).q("Error loading RCS enabled data");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            this.a.z.H().c.J = ((Boolean) optional.get()).booleanValue();
        }
    }
}
