package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.ims.util.common.RcsIntents;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkuk {
    private static final dktn a = new dktn("EngineBroadcaster");
    private static final diyy b = dizd.a(183130774);

    public static void a(Context context, Intent intent, dkuj dkujVar) {
        b(context, intent, "com.google.android.apps.messaging.shared.receiver.IncomingRcsEventReceiver", dkujVar);
    }

    public static void b(Context context, Intent intent, String str, dkuj dkujVar) {
        String action = intent.getAction();
        dkty.l(a, "Broadcasting provisioning intent %s to Bugle with extras %s from source %s", action, dktx.GENERIC.c(intent.getExtras()), dkujVar.E);
        dkty.w(7, 3, "Broadcasting %s, %s", action, dkty.a(String.valueOf(intent.getExtras())));
        intent.putExtra("pending_intent", ((Boolean) b.a()).booleanValue() ? PendingIntent.getBroadcast(context, 0, intent, ctie.a(1073741824)) : PendingIntent.getBroadcast(context, 0, intent, 0));
        if (RcsIntents.ACTION_DEBUG_OPTION_RESET_RCS_CONFIG_RESPONSE.equals(action)) {
            intent.setPackage("com.google.android.apps.messaging");
        } else {
            intent.setComponent(new ComponentName("com.google.android.apps.messaging", str));
        }
        context.sendBroadcast(intent);
    }

    public static void c(Context context, String str, Bundle bundle, dkuj dkujVar) {
        Intent intent = new Intent(str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        a(context, intent, dkujVar);
    }
}
