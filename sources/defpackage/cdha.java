package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdha extends BroadcastReceiver {
    final /* synthetic */ cdgz a;

    public cdha(cdgz cdgzVar) {
        this.a = cdgzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (action == null || !action.equals("android.intent.action.SCREEN_ON")) {
            return;
        }
        ensk h = cdgz.a.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/delayedincrementalbackup/DelayedIncrementalWorkHandler$IdlenessTracker", "onReceive", 176, "DelayedIncrementalWorkHandler.kt")).q("During delayed incremental worker, screen turned on");
        ffud ffudVar = this.a.g;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
    }
}
