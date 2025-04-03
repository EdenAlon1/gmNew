package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmoi {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho");

    public static void a(Context context, int i, int i2) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (ctid.h) {
            Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_STATUS");
            c(intent, i, i2);
            ensk h = a.h();
            h.Y(ente.a, "BugleRcsProvisioning");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTycho", 58, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Status");
            if (csjc.h()) {
                context.sendBroadcast(intent);
                return;
            }
            makeBasic = BroadcastOptions.makeBasic();
            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
            bundle = shareIdentityEnabled.toBundle();
            context.sendBroadcast(intent, null, bundle);
        }
    }

    public static void b(Context context, int i, int i2) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (ctid.h) {
            Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_SCHEDULED_STATUS");
            intent.putExtra("provisioning_scheduled_status", i - 1);
            intent.putExtra("sub_id", i2);
            intent.setPackage("com.google.android.apps.tycho");
            ensk h = a.h();
            h.Y(ente.a, "BugleRcsProvisioning");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTychoAboutProvisioningScheduled", 83, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Scheduled Status");
            if (csjc.h()) {
                context.sendBroadcast(intent);
                return;
            }
            makeBasic = BroadcastOptions.makeBasic();
            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
            bundle = shareIdentityEnabled.toBundle();
            context.sendBroadcast(intent, null, bundle);
        }
    }

    public static void c(Intent intent, int i, int i2) {
        intent.putExtra("provisioning_status", i - 1);
        intent.putExtra("sub_id", i2);
        intent.setPackage("com.google.android.apps.tycho");
    }
}
