package defpackage;

import defpackage.cxze;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzd implements cxyp {
    final /* synthetic */ cxze a;

    public cxzd(cxze cxzeVar) {
        this.a = cxzeVar;
    }

    @Override // defpackage.cxyp
    public final void a(cxyq cxyqVar) {
        ((ensz) ((ensz) cxze.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/BannersFragmentPeer$2", "onFinish", 466, "BannersFragmentPeer.java")).t("Current banner dismissed: %s", cxze.c(this.a.p));
        ((akzt) this.a.h.b()).c("Bugle.Banners2o.Dismissed.Count");
        cxyl cxylVar = this.a.p;
        cxylVar.getClass();
        cxylVar.g();
        cxyqVar.b();
        cxze cxzeVar = this.a;
        cxzeVar.o = null;
        cxzeVar.p = null;
        ellj.g(new cxze.a(), cxzeVar.k);
        cxze cxzeVar2 = this.a;
        cxzeVar2.n = false;
        cxzeVar2.f();
    }

    @Override // defpackage.cxyp
    public final /* synthetic */ void b() {
    }
}
