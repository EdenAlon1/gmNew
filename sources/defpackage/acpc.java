package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
class acpc implements ejwd<acky> {
    final /* synthetic */ acyu a;
    final /* synthetic */ acow b;

    public acpc(acow acowVar, acyu acyuVar) {
        this.a = acyuVar;
        this.b = acowVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        csjy.k("Bugle", th, "Failed to initiate gaia pairing on messages web webview");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        acky ackyVar = (acky) obj;
        ffbr ffbrVar = this.b.i;
        if (ffbrVar == null) {
            ((ensz) ((ensz) acow.b.j()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 989, "DittoWebFragmentPeer.java")).q("satelliteCommonDataService is null.");
            return;
        }
        if (((Optional) ffbrVar.b()).isEmpty()) {
            ((ensz) ((ensz) acow.b.j()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 994, "DittoWebFragmentPeer.java")).q("satelliteCommonDataService is empty.");
            return;
        }
        if (ackyVar == acky.PAIRING) {
            ((ensz) ((ensz) acow.b.h()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 999, "DittoWebFragmentPeer.java")).q("Load GAIA pairing page within Ditto WebView to authenticate account");
            this.a.d(acrz.a().appendPath("postSignIn").build().toString());
        }
        if (ackyVar == acky.REMOVE_PAIRING) {
            ((ensz) ((ensz) acow.b.h()).h("com/google/android/apps/messaging/dittosatellite/impl/DittoWebFragmentPeer$7", "onNewData", 1005, "DittoWebFragmentPeer.java")).q("Removing GAIA Pairing Session requires page reload");
            this.b.L.deleteAllData();
            this.a.d(acrz.d());
            ((aclb) ((Optional) this.b.i.b()).get()).i(acky.NOT_PAIRED).k(axnw.b(), (Executor) this.b.p.b());
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
