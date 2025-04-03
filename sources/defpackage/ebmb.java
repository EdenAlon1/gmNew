package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebmb extends BroadcastReceiver {
    final /* synthetic */ ecau a;

    public ebmb(ecau ecauVar) {
        this.a = ecauVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            this.a.hw();
        }
    }
}
