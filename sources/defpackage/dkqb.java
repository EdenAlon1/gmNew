package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.ims.service.JibeService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkqb extends BroadcastReceiver {
    private Context a = null;
    private dkqi b = null;

    private static boolean c(Context context) {
        if (dkuy.d(context) || dkuy.e(context)) {
            return true;
        }
        dkty.o("Skip using TelephonyChangeReceiver: it cannot start services", new Object[0]);
        return false;
    }

    public final synchronized void a() {
        Context context = this.a;
        if (context == null) {
            dkty.g("TelephonyChangeReceiver is not registered.", new Object[0]);
            return;
        }
        lpf.a(context).c(this);
        this.a = null;
        this.b = null;
    }

    public final synchronized void b(Context context, Intent intent, dkqi dkqiVar) {
        if (this.a != null && this.b != null) {
            dkty.g("TelephonyChangeReceiver is already registered.", new Object[0]);
            return;
        }
        if (c(context)) {
            this.a = context;
            this.b = dkqiVar;
            koa.g(context, this, dkpw.s());
            if (intent != null) {
                onReceive(context, intent);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dkty.c("TelephonyChangeReceiver triggered.", new Object[0]);
        String action = intent.getAction();
        if (!"com.google.android.ims.SIM_LOADED".equals(action) && !"com.google.android.ims.SIM_ABSENT".equals(action)) {
            dkty.k("Unexpected intent: %s", intent);
            return;
        }
        if (c(context)) {
            dkty.o("Sending SIM state to JibeService in Bugle", new Object[0]);
            if (this.b != null) {
                dktn dktnVar = JibeService.a;
                String action2 = intent.getAction();
                if ("com.google.android.ims.SIM_LOADED".equals(action2)) {
                    dkty.p(JibeService.a, "SIM state changed: loaded", new Object[0]);
                    JibeService.a(context, action2, null);
                } else if ("com.google.android.ims.SIM_ABSENT".equals(action2)) {
                    dkty.p(JibeService.a, "SIM state changed: absent", new Object[0]);
                    JibeService.a(context, action2, intent.getExtras());
                }
            }
        }
    }
}
