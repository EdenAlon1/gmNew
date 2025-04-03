package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djkc extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ djkd b;

    public djkc(djkd djkdVar) {
        this.b = djkdVar;
    }

    private final void c() {
        NetworkInfo networkInfo;
        try {
            networkInfo = dkvo.f(this.b.a).d();
        } catch (dkvd e) {
            dkty.s(e, "Can't get active network info, missing permissions.", new Object[0]);
            networkInfo = null;
        }
        dkty.k("Connected state: [%s], networkType: [%s]", Integer.valueOf(this.b.d), networkInfo == null ? "null" : networkInfo.getTypeName());
    }

    private final void d() {
        b();
        c();
    }

    protected abstract void a();

    protected abstract void b();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        dkty.c("onAvailable triggered for default network.", new Object[0]);
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        dkty.c("onCapabilitiesChanged triggered for default network. NetworkCapabilities=%s", networkCapabilities);
        a();
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        dkty.c("onLosing triggered for default network.", new Object[0]);
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        dkty.c("onLost triggered for default network.", new Object[0]);
        d();
    }
}
