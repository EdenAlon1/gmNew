package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkvo implements dkvp {
    private static volatile dkvo b;
    public final ConnectivityManager a;

    private dkvo(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static dkvo f(Context context) {
        if (b == null) {
            synchronized (dkvo.class) {
                if (b == null) {
                    b = new dkvo(context);
                }
            }
        }
        return b;
    }

    @Override // defpackage.dkvp
    public final LinkProperties a(Network network) {
        try {
            return this.a.getLinkProperties(network);
        } catch (RuntimeException e) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dkvp
    public final Network b() {
        try {
            return this.a.getActiveNetwork();
        } catch (SecurityException e) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dkvp
    public final NetworkCapabilities c(Network network) {
        try {
            return this.a.getNetworkCapabilities(network);
        } catch (SecurityException e) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dkvp
    public final NetworkInfo d() {
        try {
            return this.a.getActiveNetworkInfo();
        } catch (SecurityException e) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
        } catch (RuntimeException e2) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e2);
        }
    }

    @Override // defpackage.dkvp
    public final NetworkInfo e(Network network) {
        try {
            return this.a.getNetworkInfo(network);
        } catch (SecurityException e) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dkvp
    public final void g(ConnectivityManager.NetworkCallback networkCallback) {
        try {
            this.a.registerDefaultNetworkCallback(networkCallback);
        } catch (SecurityException e) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }

    @Override // defpackage.dkvp
    public final void h(ConnectivityManager.NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    @Override // defpackage.dkvp
    public final Network[] i() {
        try {
            return this.a.getAllNetworks();
        } catch (SecurityException e) {
            throw new dkvd("ACCESS_NETWORK_STATE permission is missing.", e);
        }
    }
}
