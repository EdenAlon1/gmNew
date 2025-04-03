package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dkvp {
    LinkProperties a(Network network);

    Network b();

    NetworkCapabilities c(Network network);

    NetworkInfo d();

    NetworkInfo e(Network network);

    void g(ConnectivityManager.NetworkCallback networkCallback);

    void h(ConnectivityManager.NetworkCallback networkCallback);

    Network[] i();
}
