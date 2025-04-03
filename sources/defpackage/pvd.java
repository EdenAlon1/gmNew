package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pvd extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ ffud a;
    final /* synthetic */ ffxe b;

    public pvd(ffud ffudVar, ffxe ffxeVar) {
        this.a = ffudVar;
        this.b = ffxeVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        this.a.t(null);
        ppt.c().a(pvq.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.b.b(puy.a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        this.a.t(null);
        ppt.c().a(pvq.a, "NetworkRequestConstraintController onLost callback");
        this.b.b(new puz(7));
    }
}
