package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dihn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ diho a;

    public dihn(diho dihoVar) {
        this.a = dihoVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        dkty.d(diho.b, "onAvailable triggered.", new Object[0]);
        this.a.d(2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        dkty.d(diho.b, "onBlockedStatusChanged triggered. Blocked=%b", Boolean.valueOf(z));
        this.a.d(true != z ? 2 : 3);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        dkty.d(diho.b, "onCapabilitiesChanged triggered. NetworkCapabilities=%s", dktx.GENERIC.c(networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        dkty.d(diho.b, "onLinkPropertiesChanged triggered. LinkProperties=%s", dktx.GENERIC.c(linkProperties));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLosing(Network network, int i) {
        dkty.d(diho.b, "onLosing triggered.", new Object[0]);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        dkty.d(diho.b, "onLost triggered.", new Object[0]);
        this.a.d(4);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        dkty.d(diho.b, "onUnavailable triggered.", new Object[0]);
        this.a.d(4);
    }
}
