package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csnw extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ csny a;

    public csnw(csny csnyVar) {
        this.a = csnyVar;
    }

    private final void a() {
        this.a.a.F(cnok.e);
        if (!this.a.a.H() || this.a.a.s.get()) {
            return;
        }
        int i = this.a.a.t.get();
        if (i == -1 || i == 4 || i == 5) {
            this.a.a.E(cnol.a, "onNoDataConnection");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        if (((ausa) this.a.a.w.b()).a()) {
            this.a.a.D("onAvailable");
        }
        this.a.a.G(network);
        if (!((ausa) this.a.a.w.b()).a()) {
            if (((cnok) this.a.a.q.get()).equals(cnok.b)) {
                this.a.a.E(cnol.b, "onAvailable");
            } else if (((cnok) this.a.a.r.get()).equals(cnok.b) && ((cnok) this.a.a.q.get()).a()) {
                this.a.a.E(cnol.d, "onAvailable");
            }
            if (((ausa) this.a.a.w.b()).a() && this.a.a.H()) {
                this.a.a.E(cnol.e, "onAvailable");
                return;
            }
            return;
        }
        if (this.a.a.q.get() == cnok.c && this.a.a.H() && !this.a.a.s.get()) {
            ensk h = csoa.c.h();
            h.Y(ente.a, "BugleConnectivity");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer$1", "onAvailable", 1058, "ConnectivityUtilImpl.java")).q("Active cellular network. Ignoring due to eligible for manual satellite.");
            this.a.a.E(cnol.a, "onAvailable");
            return;
        }
        if (((cnok) this.a.a.q.get()).equals(cnok.b)) {
            this.a.a.E(cnol.b, "onAvailable");
        } else if (((cnok) this.a.a.r.get()).equals(cnok.b) && ((cnok) this.a.a.q.get()).a()) {
            this.a.a.E(cnol.d, "onAvailable");
        }
        if (((ausa) this.a.a.w.b()).a() && this.a.a.H()) {
            this.a.a.E(cnol.e, "onAvailable");
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        if (((ausa) this.a.a.w.b()).a()) {
            this.a.a.D("onLost");
            a();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        if (((ausa) this.a.a.w.b()).a()) {
            this.a.a.D("onUnavailable");
            a();
        }
    }
}
