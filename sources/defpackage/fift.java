package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fift implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ fify d;

    public fift(fify fifyVar, long j, int i, boolean z) {
        this.d = fifyVar;
        this.a = j;
        this.b = i;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        NetworkChangeNotifierAutoDetect.Observer observer2;
        NetworkChangeNotifierAutoDetect.Observer observer3;
        observer = this.d.b.mObserver;
        observer.onNetworkConnect(this.a, this.b);
        if (this.c) {
            fify fifyVar = this.d;
            int i = this.b;
            observer2 = fifyVar.b.mObserver;
            observer2.onConnectionTypeChanged(i);
            fify fifyVar2 = this.d;
            long j = this.a;
            observer3 = fifyVar2.b.mObserver;
            observer3.purgeActiveNetworkList(new long[]{j});
        }
    }
}
