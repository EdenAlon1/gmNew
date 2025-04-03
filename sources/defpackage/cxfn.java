package defpackage;

import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cxfn implements ejwd<List<cxet>> {
    final /* synthetic */ ProgressBar a;
    final /* synthetic */ TextView b;
    final /* synthetic */ cxfr c;

    public cxfn(cxfr cxfrVar, ProgressBar progressBar, TextView textView) {
        this.a = progressBar;
        this.b = textView;
        this.c = cxfrVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ((ensz) ((ensz) ((ensz) cxfr.a.j()).g(th)).h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$3", "onError", (char) 240, "SimMessagesV2FragmentPeer.java")).q("SimMessagesActivity: subscription failure");
        this.a.setVisibility(8);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        this.a.setVisibility(8);
        this.b.setVisibility(true == list.isEmpty() ? 0 : 8);
        this.c.m.m(list);
    }

    @Override // defpackage.ejwd
    public final void hB() {
        ((ensz) cxfr.a.n().h("com/google/android/apps/messaging/ui/appsettings/SimMessagesV2FragmentPeer$3", "onPending", 246, "SimMessagesV2FragmentPeer.java")).q("SimMessagesActivity: data onPending");
        this.a.setVisibility(0);
        this.b.setVisibility(8);
    }
}
