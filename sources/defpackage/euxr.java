package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxr implements Runnable {
    public final FirebaseMessaging a;
    final ExecutorService b = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new dfze("firebase-iid-executor"));
    private final long c;
    private final PowerManager.WakeLock d;

    public euxr(FirebaseMessaging firebaseMessaging, long j) {
        this.a = firebaseMessaging;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean b() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    final Context a() {
        return this.a.d;
    }

    final boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (euxl.a().c(a())) {
            this.d.acquire();
        }
        try {
            try {
                boolean z = true;
                this.a.f(true);
                if (this.a.g.f()) {
                    euxl a = euxl.a();
                    Context a2 = a();
                    if (a.b == null) {
                        if (a2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        a.b = Boolean.valueOf(z);
                    }
                    if (!a.a.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                    }
                    if (!a.b.booleanValue() || c()) {
                        try {
                        } catch (IOException e) {
                            String message = e.getMessage();
                            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                                if (e.getMessage() != null) {
                                    throw e;
                                }
                                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                            }
                            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                        } catch (SecurityException unused) {
                            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
                        }
                        if (this.a.c() == null) {
                            Log.e("FirebaseMessaging", "Token retrieval failed: null");
                            this.a.h(this.c);
                        } else {
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Token successfully retrieved");
                            }
                            this.a.f(false);
                        }
                    } else {
                        euxq euxqVar = new euxq(this);
                        if (b()) {
                            Log.d("FirebaseMessaging", "Connectivity change received registered");
                        }
                        euxqVar.a.a().registerReceiver(euxqVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    }
                } else {
                    this.a.f(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.f(false);
            }
        } finally {
            if (euxl.a().c(a())) {
                this.d.release();
            }
        }
    }
}
