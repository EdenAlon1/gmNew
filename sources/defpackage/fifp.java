package defpackage;

import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fifp implements Runnable {
    final /* synthetic */ NetworkChangeNotifierAutoDetect a;

    public fifp(NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect) {
        this.a = networkChangeNotifierAutoDetect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        z = this.a.mIgnoreNextBroadcast;
        if (z) {
            this.a.mIgnoreNextBroadcast = false;
        } else {
            this.a.connectionTypeChanged();
        }
    }
}
