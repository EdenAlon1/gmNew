package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import defpackage.fidr;
import defpackage.fidy;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RadioUtils {
    private static Boolean a;
    private static Boolean b;

    private RadioUtils() {
    }

    private static int getCellDataActivity() {
        int i;
        TraceEvent a2 = TraceEvent.a("RadioUtils::getCellDataActivity");
        try {
            try {
                i = ((TelephonyManager) fidy.a.getSystemService("phone")).getDataActivity();
            } catch (SecurityException unused) {
                i = -1;
            }
            if (a2 != null) {
                a2.close();
            }
            return i;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static int getCellSignalLevel() {
        SignalStrength signalStrength;
        TraceEvent a2 = TraceEvent.a("RadioUtils::getCellSignalLevel");
        try {
            int i = -1;
            try {
                signalStrength = ((TelephonyManager) fidy.a.getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    i = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (a2 != null) {
                a2.close();
            }
            return i;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private static boolean isSupported() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (a == null) {
                a = Boolean.valueOf(fidr.a(fidy.a, "android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid()) == 0);
            }
            if (a.booleanValue()) {
                if (b == null) {
                    b = Boolean.valueOf(fidr.a(fidy.a, "android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid()) == 0);
                }
                if (b.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isWifiConnected() {
        NetworkCapabilities networkCapabilities;
        TraceEvent a2 = TraceEvent.a("RadioUtils::isWifiConnected");
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) fidy.a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            boolean z = false;
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                z = networkCapabilities.hasTransport(1);
            }
            if (a2 != null) {
                a2.close();
            }
            return z;
        } catch (Throwable th) {
            if (a2 != null) {
                try {
                    a2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
