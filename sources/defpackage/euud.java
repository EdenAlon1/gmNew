package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euud extends BroadcastReceiver {
    public euue a;

    public euud(euue euueVar) {
        this.a = euueVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        euue euueVar = this.a;
        if (euueVar != null && euueVar.b()) {
            if (FirebaseInstanceId.p()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            euue euueVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = euueVar2.a;
            FirebaseInstanceId.r(euueVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
