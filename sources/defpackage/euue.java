package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euue implements Runnable {
    public final FirebaseInstanceId a;
    final ExecutorService b = eutj.a();
    private final long c;
    private final PowerManager.WakeLock d;

    public euue(FirebaseInstanceId firebaseInstanceId, long j) {
        this.a = firebaseInstanceId;
        this.c = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.d = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    final Context a() {
        return this.a.d.a();
    }

    final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseInstanceId firebaseInstanceId;
        if (euua.a().b(a())) {
            this.d.acquire();
        }
        try {
            try {
                boolean z = true;
                this.a.m(true);
                if (this.a.e.b() != 0) {
                    euua a = euua.a();
                    Context a2 = a();
                    if (a.b == null) {
                        if (a2.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                            z = false;
                        }
                        a.b = Boolean.valueOf(z);
                    }
                    if (!a.a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
                    }
                    if (!a.b.booleanValue() || b()) {
                        if (this.a.q(this.a.c())) {
                            try {
                                firebaseInstanceId = this.a;
                            } catch (IOException e) {
                                String message = e.getMessage();
                                if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                                    if (e.getMessage() != null) {
                                        throw e;
                                    }
                                    Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
                                }
                                Log.w("FirebaseInstanceId", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
                            } catch (SecurityException unused) {
                                Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
                            }
                            if (firebaseInstanceId.i(eutt.e(firebaseInstanceId.d), "*") == null) {
                                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                                this.a.o(this.c);
                            } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                Log.d("FirebaseInstanceId", "Token successfully retrieved");
                            }
                        }
                        this.a.m(false);
                    } else {
                        euud euudVar = new euud(this);
                        if (FirebaseInstanceId.p()) {
                            Log.d("FirebaseInstanceId", "Connectivity change received registered");
                        }
                        euudVar.a.a().registerReceiver(euudVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    }
                } else {
                    this.a.m(false);
                }
            } catch (IOException e2) {
                Log.e("FirebaseInstanceId", "Topic sync or token retrieval failed on hard failure exceptions: " + e2.getMessage() + ". Won't retry the operation.");
                this.a.m(false);
            }
        } finally {
            if (euua.a().b(a())) {
                this.d.release();
            }
        }
    }
}
