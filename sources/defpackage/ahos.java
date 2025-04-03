package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahos {
    public static final cskc a = cskc.g("Bugle", "GoogleLocationSettingHelper");
    public static final Uri b = Uri.parse("content://com.google.settings/partner");
    private static Boolean c = null;

    public static synchronized boolean a(Context context) {
        boolean booleanValue;
        synchronized (ahos.class) {
            if (c == null) {
                c = Boolean.valueOf(context.getPackageManager().resolveActivity(new Intent("com.google.android.gsf.GOOGLE_APPS_LOCATION_SETTINGS"), 65536) != null);
            }
            booleanValue = c.booleanValue();
        }
        return booleanValue;
    }
}
