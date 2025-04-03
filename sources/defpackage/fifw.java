package defpackage;

import android.net.Network;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fifw implements Runnable {
    final /* synthetic */ Network a;
    final /* synthetic */ fify b;

    public fifw(fify fifyVar, Network network) {
        this.b = fifyVar;
        this.a = network;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        Network network = this.a;
        observer = this.b.b.mObserver;
        observer.onNetworkDisconnect(NetworkChangeNotifierAutoDetect.networkToNetId(network));
    }
}
