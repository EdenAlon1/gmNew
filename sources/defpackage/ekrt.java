package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekrt implements ekrq {
    private final ConnectivityManager a;

    public ekrt(Context context, ConnectivityManager connectivityManager) {
        if (context.checkPermission("android.permission.INTERNET", Process.myPid(), Process.myUid()) == 0) {
            emxf.m(context.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0, "An app using the NETWORK_UNMETERED sync constraint must have the ACCESS_NETWORK_STATE permission.");
        }
        this.a = connectivityManager;
    }

    @Override // defpackage.ekrq
    public final boolean a() {
        ConnectivityManager connectivityManager = this.a;
        boolean isActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return (isActiveNetworkMetered || activeNetworkInfo == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getDetailedState() == NetworkInfo.DetailedState.BLOCKED) ? false : true;
    }
}
