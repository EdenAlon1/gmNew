package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axnc {
    public static void a(Context context, Intent intent) {
        intent.setPackage("com.google.android.apps.wearable.numbersync");
        intent.putExtra("com.google.android.apps.messaging.cloudsync.extra.SECURITY_PENDING_INTENT", PendingIntent.getBroadcast(context, 0, new Intent(), ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS)));
        context.sendBroadcast(intent);
    }
}
