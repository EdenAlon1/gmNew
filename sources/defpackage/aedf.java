package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aedf implements ejwd<Optional<clze>> {
    final /* synthetic */ aedh a;

    public aedf(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        if (((aube) this.a.bv.b()).a()) {
            ensk j = aedh.a.j();
            j.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$8", "onError", (char) 1625, "HomeFragmentPeer.java")).q("SubscriptionCallback: Failed to load PhoneNumberInputUIEvents");
        } else {
            csjb e = aeaa.a.e();
            e.I("SubscriptionCallback: Failed to load PhoneNumberInputUIEvents");
            e.A("message", th.getMessage());
            e.r();
        }
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            if (!((aube) this.a.bv.b()).a()) {
                aeaa.a.m("SubscriptionCallback: Not triggering PhoneNumberInput popup");
                return;
            }
            ensk e = aedh.a.e();
            e.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/home/HomeFragmentPeer$8", "onNewData", 1582, "HomeFragmentPeer.java")).q("SubscriptionCallback: Not triggering PhoneNumberInput popup");
            return;
        }
        int ordinal = ((clze) optional.get()).ordinal();
        if (ordinal == 2) {
            this.a.av.e(6);
            if (!((aube) this.a.bv.b()).a()) {
                aeaa.a.m("SubscriptionCallback: Showing PhoneNumber Input popup");
                return;
            }
            ensk e2 = aedh.a.e();
            e2.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/home/HomeFragmentPeer$8", "onNewData", 1593, "HomeFragmentPeer.java")).q("SubscriptionCallback: Showing PhoneNumber Input popup");
            return;
        }
        if (ordinal == 3 && !((aunk) this.a.by.b()).a()) {
            ((akvg) this.a.G.b()).aa(this.a.b.fe());
            if (!((aube) this.a.bv.b()).a()) {
                aeaa.a.m("SubscriptionCallback: Showing PhoneNumber Input fullscreen");
                return;
            }
            ensk e3 = aedh.a.e();
            e3.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/home/HomeFragmentPeer$8", "onNewData", 1608, "HomeFragmentPeer.java")).q("SubscriptionCallback: Showing PhoneNumber Input fullscreen");
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
