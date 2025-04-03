package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import org.chromium.base.TraceEvent;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fify extends ConnectivityManager.NetworkCallback {
    public Network a;
    public final /* synthetic */ NetworkChangeNotifierAutoDetect b;

    public fify(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.b = networkChangeNotifierAutoDetect;
    }

    private final boolean a(Network network, NetworkCapabilities networkCapabilities) {
        if (b(network) || networkCapabilities == null) {
            return true;
        }
        if (!networkCapabilities.hasTransport(4)) {
            return false;
        }
        fifr unused = this.b.mConnectivityManagerDelegate;
        return !fifr.h(network);
    }

    private final boolean b(Network network) {
        Network network2 = this.a;
        return (network2 == null || network2.equals(network)) ? false : true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        Network network2;
        TraceEvent a = TraceEvent.a("NetworkChangeNotifierCallback::onAvailable");
        try {
            NetworkCapabilities c = this.b.mConnectivityManagerDelegate.c(network);
            if (!a(network, c)) {
                boolean z = c.hasTransport(4) && ((network2 = this.a) == null || !network.equals(network2));
                if (z) {
                    this.a = network;
                }
                this.b.runOnThread(new fift(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), this.b.mConnectivityManagerDelegate.a(network), z));
            }
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a == null) {
                throw th;
            }
            try {
                a.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        TraceEvent a = TraceEvent.a("NetworkChangeNotifierCallback::onCapabilitiesChanged");
        try {
            if (!a(network, networkCapabilities)) {
                this.b.runOnThread(new fifu(this, NetworkChangeNotifierAutoDetect.networkToNetId(network), this.b.mConnectivityManagerDelegate.a(network)));
            }
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        TraceEvent a = TraceEvent.a("NetworkChangeNotifierCallback::onLosing");
        try {
            if (!a(network, this.b.mConnectivityManagerDelegate.c(network))) {
                this.b.runOnThread(new fifv(this, NetworkChangeNotifierAutoDetect.networkToNetId(network)));
            }
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        TraceEvent a = TraceEvent.a("NetworkChangeNotifierCallback::onLost");
        try {
            if (!b(network)) {
                this.b.runOnThread(new fifw(this, network));
                if (this.a != null) {
                    this.a = null;
                    for (Network network2 : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this.b.mConnectivityManagerDelegate, network)) {
                        onAvailable(network2);
                    }
                    this.b.updateCurrentNetworkState();
                    this.b.runOnThread(new fifx(this, this.b.getCurrentNetworkState().getConnectionType()));
                }
            }
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
