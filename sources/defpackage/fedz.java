package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fedz extends feau {
    public final feau a;
    public final Context b;
    public final ConnectivityManager c;
    private final Object d = new Object();
    private Runnable e;

    public fedz(feau feauVar, Context context) {
        this.a = feauVar;
        this.b = context;
        if (context == null) {
            this.c = null;
            return;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.c = connectivityManager;
        try {
            if (connectivityManager != null) {
                fedx fedxVar = new fedx(this);
                connectivityManager.registerDefaultNetworkCallback(fedxVar);
                this.e = new fedv(this, fedxVar);
            } else {
                fedy fedyVar = new fedy(this);
                context.registerReceiver(fedyVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.e = new fedw(this, fedyVar);
            }
        } catch (SecurityException e) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    @Override // defpackage.fdxk
    public final fdxo a(febs febsVar, fdxj fdxjVar) {
        return this.a.a(febsVar, fdxjVar);
    }

    @Override // defpackage.fdxk
    public final String b() {
        return this.a.b();
    }

    @Override // defpackage.feau
    public final feau d() {
        synchronized (this.d) {
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
                this.e = null;
            }
        }
        return this.a.d();
    }

    @Override // defpackage.feau
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.feau
    public final boolean f(TimeUnit timeUnit) {
        return this.a.f(timeUnit);
    }

    @Override // defpackage.feau
    public final fdyc g() {
        return this.a.g();
    }
}
