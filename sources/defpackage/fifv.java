package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fifv implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ fify b;

    public fifv(fify fifyVar, long j) {
        this.b = fifyVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onNetworkSoonToDisconnect(this.a);
    }
}
