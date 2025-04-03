package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egaa {
    private final ConnectivityManager a;

    public egaa(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
