package defpackage;

import org.chromium.net.NetworkChangeNotifier;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fifo implements NetworkChangeNotifierAutoDetect.Observer {
    final /* synthetic */ NetworkChangeNotifier a;

    public fifo(NetworkChangeNotifier networkChangeNotifier) {
        this.a = networkChangeNotifier;
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionCostChanged(int i) {
        this.a.notifyObserversOfConnectionCostChange(i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionSubtypeChanged(int i) {
        this.a.notifyObserversOfConnectionSubtypeChange(i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onConnectionTypeChanged(int i) {
        this.a.updateCurrentConnectionType(i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkConnect(long j, int i) {
        this.a.notifyObserversOfNetworkConnect(j, i);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkDisconnect(long j) {
        this.a.notifyObserversOfNetworkDisconnect(j);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void onNetworkSoonToDisconnect(long j) {
        this.a.notifyObserversOfNetworkSoonToDisconnect(j);
    }

    @Override // org.chromium.net.NetworkChangeNotifierAutoDetect.Observer
    public final void purgeActiveNetworkList(long[] jArr) {
        this.a.notifyObserversToPurgeActiveNetworkList(jArr);
    }
}
