package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aecy implements ejwd<List<btrw>> {
    final /* synthetic */ aedh a;

    public aecy(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (!((aube) this.a.bv.b()).a()) {
            aeaa.a.s("Loading all message annotations failed", th);
            return;
        }
        ensk j = aedh.a.j();
        j.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onError", (char) 1401, "HomeFragmentPeer.java")).q("Loading all message annotations failed");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        if (list.isEmpty()) {
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onNewData", 1391, "HomeFragmentPeer.java")).q("Data is empty");
        } else {
            ensk h2 = aedh.a.h();
            h2.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$3", "onNewData", 1394, "HomeFragmentPeer.java")).q("Set annotations will be called trigger data reload.");
            this.a.j().n(list);
        }
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
