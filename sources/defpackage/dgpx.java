package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgpx extends BroadcastReceiver {
    final /* synthetic */ dgpy a;

    public dgpx(dgpy dgpyVar) {
        this.a = dgpyVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Log.isLoggable("InstanceID", 3)) {
            Log.d("InstanceID", "Received GSF callback via dynamic receiver");
        }
        this.a.d(intent);
    }
}
