package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfwh extends dfwe {
    public final HashMap d = new HashMap();
    public final Context e;
    public volatile Handler f;
    public final dfyh g;
    public final long h;
    private final dfwg i;
    private final long j;
    private volatile Executor k;

    public dfwh(Context context, Looper looper) {
        dfwg dfwgVar = new dfwg(this);
        this.i = dfwgVar;
        this.e = context.getApplicationContext();
        this.f = new dgxx(looper, dfwgVar);
        this.g = dfyh.a();
        this.j = 5000L;
        this.h = 300000L;
        this.k = null;
    }

    @Override // defpackage.dfwe
    public final ConnectionResult b(dfwd dfwdVar, ServiceConnection serviceConnection, String str) {
        ConnectionResult connectionResult;
        synchronized (this.d) {
            dfwf dfwfVar = (dfwf) this.d.get(dfwdVar);
            if (dfwfVar == null) {
                dfwfVar = new dfwf(this, dfwdVar);
                dfwfVar.d(serviceConnection, serviceConnection);
                connectionResult = dfwf.c(dfwfVar, str);
                this.d.put(dfwdVar, dfwfVar);
            } else {
                this.f.removeMessages(0, dfwdVar);
                if (dfwfVar.a(serviceConnection)) {
                    throw new IllegalStateException(a.G(dfwdVar, "Trying to bind a GmsServiceConnection that was already connected before.  config="));
                }
                dfwfVar.d(serviceConnection, serviceConnection);
                int i = dfwfVar.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(dfwfVar.f, dfwfVar.d);
                } else if (i == 2) {
                    connectionResult = dfwf.c(dfwfVar, str);
                }
                connectionResult = null;
            }
            if (dfwfVar.c) {
                return ConnectionResult.a;
            }
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(-1);
            }
            return connectionResult;
        }
    }

    @Override // defpackage.dfwe
    protected final void d(dfwd dfwdVar, ServiceConnection serviceConnection) {
        synchronized (this.d) {
            dfwf dfwfVar = (dfwf) this.d.get(dfwdVar);
            if (dfwfVar == null) {
                throw new IllegalStateException(a.G(dfwdVar, "Nonexistent connection status for service config: "));
            }
            if (!dfwfVar.a(serviceConnection)) {
                throw new IllegalStateException(a.G(dfwdVar, "Trying to unbind a GmsServiceConnection  that was not bound before.  config="));
            }
            dfwfVar.a.remove(serviceConnection);
            if (dfwfVar.b()) {
                this.f.sendMessageDelayed(this.f.obtainMessage(0, dfwdVar), this.j);
            }
        }
    }
}
