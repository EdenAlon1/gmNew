package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aedc implements ejwd<List<String>> {
    final /* synthetic */ aedh a;

    public aedc(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (((aube) this.a.bv.b()).a()) {
            ensk i = aedh.a.i();
            i.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$5", "onError", (char) 1494, "HomeFragmentPeer.java")).q("HomeFragmentPeer: getBugleDbBlockedDestinations SubscriptionMixin failed");
        } else {
            csjb b = aeaa.a.b();
            b.I("HomeFragmentPeer: getBugleDbBlockedDestinations SubscriptionMixin failed");
            b.s(th);
        }
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list != null) {
            this.a.aV.clear();
            this.a.aV.addAll(list);
            this.a.z();
        }
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
