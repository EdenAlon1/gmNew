package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.net.Socket;
import org.chromium.base.TraceEvent;
import org.chromium.net.NetworkChangeNotifierAutoDetect;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fifr {
    public final ConnectivityManager a;

    fifr() {
        this.a = null;
    }

    public static final boolean h(Network network) {
        boolean z;
        Socket socket = new Socket();
        try {
            TraceEvent a = TraceEvent.a("StrictModeContext.allowAllVmPolicies");
            try {
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                fiel fielVar = new fiel(null, vmPolicy);
                if (a != null) {
                    a.close();
                }
                try {
                    network.bindSocket(socket);
                    fielVar.close();
                    z = true;
                } catch (Throwable th) {
                    try {
                        fielVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                if (a != null) {
                    try {
                        a.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException unused) {
            z = false;
        } catch (Throwable th5) {
            try {
                socket.close();
            } catch (IOException unused2) {
            }
            throw th5;
        }
        try {
            socket.close();
        } catch (IOException unused3) {
        }
        return z;
    }

    public final int a(Network network) {
        NetworkInfo d = d(network);
        if (d == null || !d.isConnected()) {
            return 6;
        }
        return NetworkChangeNotifierAutoDetect.convertToConnectionType(d.getType(), d.getSubtype());
    }

    public final Network b() {
        String str;
        Network activeNetwork = this.a.getActiveNetwork();
        if (activeNetwork == null) {
            NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            for (Network network : NetworkChangeNotifierAutoDetect.getAllNetworksFiltered(this, null)) {
                NetworkInfo e = e(network);
                if (e != null && (e.getType() == activeNetworkInfo.getType() || e.getType() == 17)) {
                    if (activeNetwork != null && Build.VERSION.SDK_INT >= 29) {
                        if (e.getDetailedState() != NetworkInfo.DetailedState.CONNECTING) {
                            NetworkInfo e2 = e(activeNetwork);
                            if (e2 != null && e2.getDetailedState() == NetworkInfo.DetailedState.CONNECTING) {
                                activeNetwork = null;
                            }
                        }
                    }
                    if (activeNetwork != null) {
                        str = NetworkChangeNotifierAutoDetect.TAG;
                        Log.e("cn_".concat(String.valueOf(str)), "There should not be multiple connected networks of the same type. At least as of Android Marshmallow this is not supported. If this becomes supported this assertion may trigger.");
                    }
                    activeNetwork = network;
                }
            }
        }
        return activeNetwork;
    }

    public final NetworkCapabilities c(Network network) {
        for (int i = 0; i < 2; i++) {
            try {
                return this.a.getNetworkCapabilities(network);
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    final NetworkInfo d(Network network) {
        NetworkInfo e = e(network);
        return (e == null || e.getType() != 17) ? e : this.a.getActiveNetworkInfo();
    }

    final NetworkInfo e(Network network) {
        try {
            try {
                return this.a.getNetworkInfo(network);
            } catch (NullPointerException unused) {
                return null;
            }
        } catch (NullPointerException unused2) {
            return this.a.getNetworkInfo(network);
        }
    }

    public final void f(ConnectivityManager.NetworkCallback networkCallback) {
        this.a.unregisterNetworkCallback(networkCallback);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.chromium.net.NetworkChangeNotifierAutoDetect.NetworkState g() {
        /*
            r13 = this;
            android.net.Network r0 = r13.b()
            android.net.NetworkInfo r1 = r13.d(r0)
            r2 = 0
            if (r1 != 0) goto Ld
        Lb:
            r1 = r2
            goto L20
        Ld:
            boolean r3 = r1.isConnected()
            if (r3 != 0) goto L20
            android.net.NetworkInfo$DetailedState r1 = r1.getDetailedState()
            android.net.NetworkInfo$DetailedState r3 = android.net.NetworkInfo.DetailedState.BLOCKED
            if (r1 == r3) goto L1c
            goto Lb
        L1c:
            org.chromium.base.ApplicationStatus.getStateForApplication()
            goto Lb
        L20:
            if (r1 != 0) goto L30
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r3 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            r8 = 0
            r9 = 0
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            java.lang.String r10 = ""
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        L30:
            r3 = 1
            if (r0 == 0) goto L84
            android.net.NetworkCapabilities r2 = r13.c(r0)
            r4 = 0
            if (r2 == 0) goto L44
            r5 = 11
            boolean r2 = r2.hasCapability(r5)
            if (r2 != 0) goto L44
            r9 = r3
            goto L45
        L44:
            r9 = r4
        L45:
            org.chromium.net.DnsStatus r2 = org.chromium.net.AndroidNetworkLibrary.a(r0)
            if (r2 != 0) goto L65
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r5 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            int r7 = r1.getType()
            int r8 = r1.getSubtype()
            long r0 = org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(r0)
            java.lang.String r10 = java.lang.String.valueOf(r0)
            r11 = 0
            java.lang.String r12 = ""
            r6 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L65:
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r5 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            int r7 = r1.getType()
            int r8 = r1.getSubtype()
            long r0 = org.chromium.net.NetworkChangeNotifierAutoDetect.networkToNetId(r0)
            java.lang.String r10 = java.lang.String.valueOf(r0)
            boolean r11 = r2.getPrivateDnsActive()
            java.lang.String r12 = r2.getPrivateDnsServerName()
            r6 = 1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
        L84:
            int r0 = r1.getType()
            if (r0 != r3) goto Lba
            java.lang.String r0 = r1.getExtraInfo()
            if (r0 == 0) goto Lb3
            java.lang.String r0 = r1.getExtraInfo()
            java.lang.String r3 = ""
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto Lb3
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r3 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            int r5 = r1.getType()
            int r6 = r1.getSubtype()
            java.lang.String r8 = r1.getExtraInfo()
            r9 = 0
            java.lang.String r10 = ""
            r4 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
        Lb3:
            r1.getType()
            r1.getSubtype()
            throw r2
        Lba:
            org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState r4 = new org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState
            int r6 = r1.getType()
            int r7 = r1.getSubtype()
            r10 = 0
            java.lang.String r11 = ""
            r5 = 1
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fifr.g():org.chromium.net.NetworkChangeNotifierAutoDetect$NetworkState");
    }

    public fifr(Context context) {
        this.a = (ConnectivityManager) context.getSystemService("connectivity");
    }
}
