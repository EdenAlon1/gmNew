package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rhj {
    private static volatile rhj b;
    final Set a = new HashSet();
    private boolean c;
    private final rhi d;

    private rhj(Context context) {
        this.d = new rhi(new rjy(new rhe(context)), new rhf(this));
    }

    static rhj a(Context context) {
        if (b == null) {
            synchronized (rhj.class) {
                if (b == null) {
                    b = new rhj(context.getApplicationContext());
                }
            }
        }
        return b;
    }

    final synchronized void b(rgj rgjVar) {
        this.a.add(rgjVar);
        if (!this.c && !this.a.isEmpty()) {
            rhi rhiVar = this.d;
            boolean z = true;
            rhiVar.a = ((ConnectivityManager) rhiVar.c.a()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) rhiVar.c.a()).registerDefaultNetworkCallback(rhiVar.d);
            } catch (RuntimeException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e);
                }
                z = false;
            }
            this.c = z;
        }
    }

    final synchronized void c(rgj rgjVar) {
        this.a.remove(rgjVar);
        if (this.c && this.a.isEmpty()) {
            rhi rhiVar = this.d;
            ((ConnectivityManager) rhiVar.c.a()).unregisterNetworkCallback(rhiVar.d);
            this.c = false;
        }
    }
}
