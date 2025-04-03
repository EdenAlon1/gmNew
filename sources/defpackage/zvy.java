package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvy extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zvz a;

    public zvy(zvz zvzVar) {
        this.a = zvzVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        this.a.d.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.d.set(false);
    }
}
