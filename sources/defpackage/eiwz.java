package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import com.android.vcard.VCardConfig;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eiwz {
    public static final enru d = enru.c("com/google/apps/tiktok/account/api/controller/Config");

    public static eiwy d() {
        eiwv eiwvVar = new eiwv();
        eiwvVar.c(false);
        eiwvVar.d(ejgm.class);
        eiwvVar.a = null;
        return eiwvVar;
    }

    public static eiwy e(Activity activity) {
        if (!h()) {
            Intent intent = activity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((enrr) ((enrr) d.j()).h("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 88, "Config.java")).t("External config used on invalid activity: %s", activity.getClass());
            }
        }
        eiwy d2 = d();
        d2.c(true);
        return d2;
    }

    public static eiwy f(Activity activity) {
        if (!h()) {
            Intent intent = activity.getIntent();
            if (!intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 268468224) == 0 && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                ((enrr) ((enrr) d.j()).h("com/google/apps/tiktok/account/api/controller/Config", "forLauncherActivity", 62, "Config.java")).t("Launcher config used on invalid activity: %s", activity.getClass());
            }
        }
        eiwy d2 = d();
        d2.c(true);
        return d2;
    }

    public static eiwz g(Activity activity) {
        emxf.m(eiuy.d(activity.getIntent()), "Account missing");
        return d().a();
    }

    public static boolean h() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public abstract engw a();

    public abstract engw b();

    public abstract boolean c();
}
