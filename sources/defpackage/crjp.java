package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crjp {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/ui/business/BusinessActionIntents");
    private final Context b;

    public crjp(Context context) {
        this.b = context;
    }

    public final Intent a(String str) {
        if (!str.startsWith("tel:")) {
            str = "tel:".concat(String.valueOf(str));
        }
        return new Intent("android.intent.action.DIAL").setData(Uri.parse(str));
    }

    public final Intent b(Uri uri) {
        return new Intent("android.intent.action.VIEW").setData(uri);
    }

    public final Intent c(String str) {
        return new Intent("android.intent.action.VIEW", Uri.parse(str));
    }

    public final boolean d(Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        if (intent != null && (queryIntentActivities = this.b.getPackageManager().queryIntentActivities(intent, 0)) != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.exported) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e(Intent intent) {
        if (d(intent)) {
            intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            this.b.startActivity(intent);
            return true;
        }
        ensk j = a.j();
        j.Y(ente.a, "Bugle");
        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/ui/business/BusinessActionIntents", "tryLaunchBusinessActionIntent", 59, "BusinessActionIntents.java")).t("Failed to launch business action intent: %s", intent.getAction());
        return false;
    }
}
