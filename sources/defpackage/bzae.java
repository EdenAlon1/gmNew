package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzae extends cniz {
    final /* synthetic */ bzaf a;

    public bzae(bzaf bzafVar) {
        this.a = bzafVar;
    }

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.a.e.b("BatteryLevelReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        int j;
        String action = intent.getAction();
        boolean i = bzaf.i(intent);
        boolean equals = "android.intent.action.BATTERY_LOW".equals(action);
        bzaf bzafVar = this.a;
        if (equals) {
            bzafVar.a(!i);
            return;
        }
        if ("android.intent.action.BATTERY_OKAY".equals(action)) {
            bzafVar.a(false);
            return;
        }
        if ("android.intent.action.ACTION_POWER_CONNECTED".equals(action)) {
            bzafVar.a(false);
        } else {
            if (!"android.intent.action.ACTION_POWER_DISCONNECTED".equals(action) || (j = bzaf.j(intent)) < 0) {
                return;
            }
            bzafVar.a(j < 15);
        }
    }
}
