package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fifx implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ fify b;

    public fifx(fify fifyVar, int i) {
        this.b = fifyVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NetworkChangeNotifierAutoDetect.Observer observer;
        observer = this.b.b.mObserver;
        observer.onConnectionTypeChanged(this.a);
    }
}
