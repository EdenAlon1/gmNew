package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkqa extends BroadcastReceiver {
    private static final dktn c = new dktn("ShutdownReceiver");
    static boolean a = false;
    private static final dkqa d = new dkqa();
    private static dket e = null;
    public static final diyy b = diyv.b("catch_unregistering_shutdown_receiver_error");

    public static synchronized void a(Context context, dket dketVar) {
        synchronized (dkqa.class) {
            dketVar.getClass();
            e = dketVar;
            if (a) {
                return;
            }
            context.registerReceiver(d, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
            a = true;
        }
    }

    public static synchronized void b(Context context) {
        synchronized (dkqa.class) {
            if (a) {
                if (((Boolean) b.a()).booleanValue()) {
                    try {
                        context.unregisterReceiver(d);
                    } catch (IllegalArgumentException e2) {
                        dkty.j(e2, c, "ShutdownReceiver unregisterReceiver failed", new Object[0]);
                    }
                } else {
                    context.unregisterReceiver(d);
                }
                a = false;
            }
            e = null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((String) Optional.ofNullable(intent.getAction()).orElse("")).equals("android.intent.action.ACTION_SHUTDOWN")) {
            dkty.c("ShutdownReceiver SHUTDOWN received - closing down Jibe service", new Object[0]);
            dket dketVar = e;
            if (dketVar != null) {
                dketVar.shutdown();
            }
            b(context);
        }
    }
}
