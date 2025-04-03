package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhh extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ rhi a;

    public rhh(rhi rhiVar) {
        this.a = rhiVar;
    }

    private final void a(boolean z) {
        rkh.k(new rhg(this, z));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        a(false);
    }
}
