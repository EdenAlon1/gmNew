package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fifq extends ConnectivityManager.NetworkCallback {
    LinkProperties a;
    NetworkCapabilities b;
    final /* synthetic */ NetworkChangeNotifierAutoDetect c;

    public fifq(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.c = networkChangeNotifierAutoDetect;
    }

    private final NetworkChangeNotifierAutoDetect.NetworkState a(Network network) {
        int i;
        int i2;
        boolean isPrivateDnsActive;
        String privateDnsServerName;
        int type;
        if (!this.b.hasTransport(1) && !this.b.hasTransport(5)) {
            if (this.b.hasTransport(0)) {
                NetworkInfo e = this.c.mConnectivityManagerDelegate.e(network);
                i2 = e != null ? e.getSubtype() : -1;
                i = 0;
            } else {
                if (this.b.hasTransport(3)) {
                    type = 9;
                } else if (this.b.hasTransport(2)) {
                    type = 7;
                } else if (this.b.hasTransport(4)) {
                    NetworkInfo d = this.c.mConnectivityManagerDelegate.d(network);
                    type = d != null ? d.getType() : 17;
                } else {
                    i = -1;
                    i2 = -1;
                }
                i = type;
            }
            boolean z = !this.b.hasCapability(11);
            String valueOf = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
            isPrivateDnsActive = this.a.isPrivateDnsActive();
            privateDnsServerName = this.a.getPrivateDnsServerName();
            return new NetworkChangeNotifierAutoDetect.NetworkState(true, i, i2, z, valueOf, isPrivateDnsActive, privateDnsServerName);
        }
        i = 1;
        i2 = -1;
        boolean z2 = !this.b.hasCapability(11);
        String valueOf2 = String.valueOf(NetworkChangeNotifierAutoDetect.networkToNetId(network));
        isPrivateDnsActive = this.a.isPrivateDnsActive();
        privateDnsServerName = this.a.getPrivateDnsServerName();
        return new NetworkChangeNotifierAutoDetect.NetworkState(true, i, i2, z2, valueOf2, isPrivateDnsActive, privateDnsServerName);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.a = null;
        this.b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean z;
        this.b = networkCapabilities;
        z = this.c.mRegistered;
        if (!z || this.a == null || this.b == null) {
            return;
        }
        this.c.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        boolean z;
        this.a = linkProperties;
        z = this.c.mRegistered;
        if (!z || this.a == null || this.b == null) {
            return;
        }
        this.c.connectionTypeChangedTo(a(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        boolean z;
        this.a = null;
        this.b = null;
        z = this.c.mRegistered;
        if (z) {
            this.c.connectionTypeChangedTo(new NetworkChangeNotifierAutoDetect.NetworkState(false, -1, -1, false, null, false, ""));
        }
    }
}
