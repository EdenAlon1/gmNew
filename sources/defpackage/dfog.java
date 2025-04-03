package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfog {
    private static dfog c;
    public final Context a;
    public final ScheduledExecutorService b;
    private dfoa d = new dfoa(this);
    private int e = 1;

    public dfog(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = scheduledExecutorService;
        this.a = context.getApplicationContext();
    }

    public static synchronized dfog b(Context context) {
        dfog dfogVar;
        synchronized (dfog.class) {
            if (c == null) {
                dgxv dgxvVar = dgxw.a;
                c = new dfog(context, dgxv.a(new dfze("MessengerIpcClient")));
            }
            dfogVar = c;
        }
        return dfogVar;
    }

    public final synchronized int a() {
        int i;
        i = this.e;
        this.e = i + 1;
        return i;
    }

    public final dhre c(int i, Bundle bundle) {
        return d(new dfoc(a(), i, bundle));
    }

    public final synchronized dhre d(dfod dfodVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(dfodVar.toString()));
        }
        if (!this.d.e(dfodVar)) {
            dfoa dfoaVar = new dfoa(this);
            this.d = dfoaVar;
            dfoaVar.e(dfodVar);
        }
        return dfodVar.b.a;
    }
}
