package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fifu implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ fify c;

    public fifu(fify fifyVar, long j, int i) {
        this.c = fifyVar;
        this.a = j;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.c.b.mObserver;
        observer.onNetworkConnect(this.a, this.b);
    }
}
