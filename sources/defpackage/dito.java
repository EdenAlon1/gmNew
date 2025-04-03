package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dito extends BroadcastReceiver {
    final /* synthetic */ ditq a;

    public dito(ditq ditqVar) {
        this.a = ditqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (this.a) {
            if (!this.a.e()) {
                dkty.q("LocalAlarmTimer is inactive, ignoring alarm (%s)!", intent.getAction());
                return;
            }
            String action = intent.getAction();
            ditp ditpVar = this.a.a;
            if (ditpVar == null || !ditpVar.b.equals(action)) {
                dkty.q("Warning, unexpected alarm (%s) for %s", action, this.a.a);
            } else {
                ditq ditqVar = this.a;
                Thread thread = ditqVar.a.a;
                ditqVar.c();
                thread.start();
            }
        }
    }
}
