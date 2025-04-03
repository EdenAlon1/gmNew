package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsd {
    private final ConnectivityManager a;

    public egsd(Context context) {
        Object systemService = context.getSystemService((Class<Object>) ConnectivityManager.class);
        systemService.getClass();
        this.a = (ConnectivityManager) systemService;
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }
}
