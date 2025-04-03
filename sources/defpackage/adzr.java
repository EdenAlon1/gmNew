package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adzr implements adzq {
    private static final enru a = enru.c("com/google/android/apps/messaging/home/ConversationListRootFragmentPeerDelegate");
    private final ea b;
    private final eisx c;

    public adzr(ea eaVar, eisx eisxVar) {
        this.b = eaVar;
        this.c = eisxVar;
    }

    @Override // defpackage.adzq
    public final ea a() {
        ea h = this.b.I().h("home_fragment_tag");
        if ((h instanceof adzz) && ((adzz) h).aF()) {
            return h;
        }
        return null;
    }

    @Override // defpackage.adzq
    public final void b() {
        ensk h = a.h();
        h.Y(ente.a, "ConversationListRootFragmentPeerDelegate");
        ((enrr) h.h("com/google/android/apps/messaging/home/ConversationListRootFragmentPeerDelegate", "attachNewHomeFragment", 32, "ConversationListRootFragmentPeerDelegate.kt")).q("Adding a new home fragment");
        adzz a2 = adzz.a(this.c);
        cg cgVar = new cg(this.b.I());
        cgVar.x(R.id.home_fragment_container, a2, "home_fragment_tag");
        cgVar.c();
    }

    @Override // defpackage.adzq
    public final void c() {
        ea a2 = a();
        if (a2 != null) {
            cg cgVar = new cg(this.b.I());
            cgVar.n(a2);
            cgVar.c();
        }
        this.b.I().an();
    }
}
