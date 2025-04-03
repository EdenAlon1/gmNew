package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euxw extends BroadcastReceiver {
    final /* synthetic */ euxx a;
    private euxx b;

    public euxw(euxx euxxVar, euxx euxxVar2) {
        this.a = euxxVar;
        this.b = euxxVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        euxx euxxVar = this.b;
        if (euxxVar != null && euxxVar.a()) {
            if (euxx.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            euxx euxxVar2 = this.b;
            euxxVar2.b.b(euxxVar2, 0L);
            context.unregisterReceiver(this);
            this.b = null;
        }
    }
}
