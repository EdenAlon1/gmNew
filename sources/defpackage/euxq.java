package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euxq extends BroadcastReceiver {
    public euxr a;

    public euxq(euxr euxrVar) {
        this.a = euxrVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        euxr euxrVar = this.a;
        if (euxrVar != null && euxrVar.c()) {
            if (euxr.b()) {
                Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
            }
            euxr euxrVar2 = this.a;
            FirebaseMessaging firebaseMessaging = euxrVar2.a;
            FirebaseMessaging.k(euxrVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
