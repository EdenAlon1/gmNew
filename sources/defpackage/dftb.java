package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dftb implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ dftc b;

    public dftb(dftc dftcVar, ConnectionResult connectionResult) {
        this.a = connectionResult;
        this.b = dftcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dftc dftcVar = this.b;
        dfsz dfszVar = (dfsz) dftcVar.d.l.get(dftcVar.b);
        if (dfszVar == null) {
            return;
        }
        ConnectionResult connectionResult = this.a;
        if (!connectionResult.b()) {
            dfszVar.onConnectionFailed(connectionResult);
            return;
        }
        dftc dftcVar2 = this.b;
        dftcVar2.c = true;
        if (dftcVar2.a.h()) {
            this.b.e();
            return;
        }
        try {
            dfqr dfqrVar = this.b.a;
            dfqrVar.o(null, dfqrVar.k());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            this.b.a.n("Failed to get service from broker.");
            dfszVar.onConnectionFailed(new ConnectionResult(10));
        }
    }
}
