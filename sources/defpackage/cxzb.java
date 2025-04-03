package defpackage;

import defpackage.cxze;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzb implements cxyp {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ cxzc b;

    public cxzb(cxzc cxzcVar, Map.Entry entry) {
        this.a = entry;
        this.b = cxzcVar;
    }

    @Override // defpackage.cxyp
    public final void a(cxyq cxyqVar) {
        ((ensz) ((ensz) cxze.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer$1$1", "onFinish", 441, "BannersFragmentPeer.java")).t("Banner shown: %s", cxze.c(this.b.b.p));
        ((akzt) this.b.b.h.b()).c("Bugle.Banners2o.Shown.Count");
        ((cxyl) this.a.getKey()).h();
        ellj.g(new cxze.c(), this.b.b.k);
        cxze cxzeVar = this.b.b;
        cxzeVar.n = false;
        if (cxzeVar.g()) {
            Iterator it = cxzeVar.b.keySet().iterator();
            while (it.hasNext()) {
                if (cxzeVar.h((cxyl) it.next())) {
                    cxzeVar.d();
                    return;
                }
            }
        }
    }

    @Override // defpackage.cxyp
    public final /* synthetic */ void b() {
    }
}
