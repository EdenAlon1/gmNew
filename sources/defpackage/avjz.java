package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class avjz {
    public static String a(Context context) {
        if (ctid.d) {
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("android.provider.Telephony.SMS_CB_RECEIVED"), 1048576);
            if (resolveActivity == null) {
                avka.a.r("getDefaultCellBroadcastReceiverPackageName: no package found");
                return "com.android.cellbroadcastreceiver";
            }
            String str = resolveActivity.activityInfo.applicationInfo.packageName;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "com.android.cellbroadcastreceiver";
    }
}
