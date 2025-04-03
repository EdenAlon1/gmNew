package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pwn extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ pwo a;

    public pwn(pwo pwoVar) {
        this.a = pwoVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        ppt c = ppt.c();
        String str = pwp.a;
        Objects.toString(networkCapabilities);
        c.a(str, "Network capabilities changed: ".concat(networkCapabilities.toString()));
        this.a.f(Build.VERSION.SDK_INT >= 28 ? new pvh(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : pwp.a(this.a.e));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        ppt.c().a(pwp.a, "Network connection lost");
        pwo pwoVar = this.a;
        pwoVar.f(pwp.a(pwoVar.e));
    }
}
