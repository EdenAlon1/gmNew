package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgpv {
    public final Context a;
    public final ScheduledExecutorService b;
    private dgpq c;
    private int d;

    public dgpv(Context context) {
        dgxv dgxvVar = dgxw.a;
        ScheduledExecutorService a = dgxv.a(new dfze("MessengerIpcClient"));
        this.c = new dgpq(this);
        this.d = 1;
        this.a = context.getApplicationContext();
        this.b = a;
    }

    public final synchronized int a() {
        int i;
        i = this.d;
        this.d = i + 1;
        return i;
    }

    public final synchronized dhre b(dgps dgpsVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Queueing ".concat(dgpsVar.toString()));
        }
        if (!this.c.f(dgpsVar)) {
            dgpq dgpqVar = new dgpq(this);
            this.c = dgpqVar;
            dgpqVar.f(dgpsVar);
        }
        return dgpsVar.b.a;
    }
}
