package defpackage;

import android.R;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.RemoteActionCompat;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ewuq {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Intent e;
    public final int f;

    public ewuq(String str, String str2, String str3, String str4, Intent intent, int i) {
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("titleWithEntity and titleWithoutEntity should not be both null");
        }
        this.a = str;
        this.b = str2;
        str3.getClass();
        this.c = str3;
        this.d = str4;
        intent.getClass();
        this.e = intent;
        this.f = i;
    }

    static /* synthetic */ CharSequence a(ewuq ewuqVar) {
        return !TextUtils.isEmpty(ewuqVar.b) ? ewuqVar.b : ewuqVar.a;
    }

    private final RemoteActionCompat c(Context context, Intent intent, IconCompat iconCompat, boolean z, ResolveInfo resolveInfo) {
        Bundle bundle;
        String str;
        ActivityOptions pendingIntentCreatorBackgroundActivityStartMode;
        String str2 = null;
        if (Build.VERSION.SDK_INT > 34) {
            pendingIntentCreatorBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentCreatorBackgroundActivityStartMode(1);
            bundle = pendingIntentCreatorBackgroundActivityStartMode.toBundle();
        } else {
            bundle = null;
        }
        PendingIntent activity = PendingIntent.getActivity(context, this.f, intent, 201326592, bundle);
        CharSequence a = a(this);
        if (TextUtils.isEmpty(a)) {
            ewuo.a("Custom titleChooser return null, fallback to the default titleChooser");
            a = a(this);
        }
        PackageManager packageManager = context.getPackageManager();
        if (!TextUtils.isEmpty(this.d)) {
            if (resolveInfo != null && resolveInfo.activityInfo != null && !"android".equals(resolveInfo.activityInfo.packageName) && resolveInfo.activityInfo.applicationInfo != null) {
                str2 = packageManager.getApplicationLabel(resolveInfo.activityInfo.applicationInfo).toString();
            }
            if (!TextUtils.isEmpty(str2)) {
                str = String.format(this.d, str2);
                RemoteActionCompat remoteActionCompat = new RemoteActionCompat(iconCompat, a, str, activity);
                remoteActionCompat.f = z;
                return remoteActionCompat;
            }
        }
        str = this.c;
        RemoteActionCompat remoteActionCompat2 = new RemoteActionCompat(iconCompat, a, str, activity);
        remoteActionCompat2.f = z;
        return remoteActionCompat2;
    }

    public final ewup b(Context context) {
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(this.e, 65536);
        IconCompat iconCompat = null;
        if (resolveActivity == null || resolveActivity.activityInfo == null) {
            if ("android.intent.action.VIEW".equals(this.e.getAction())) {
                String scheme = this.e.getScheme();
                if (emxb.a(scheme, "http") || emxb.a(scheme, "https")) {
                    return new ewup(new Intent(this.e), c(context, this.e, IconCompat.h(context, R.drawable.ic_menu_more), false, resolveActivity));
                }
            }
            ewuo.a("resolveInfo or activityInfo is null");
            return null;
        }
        ActivityInfo activityInfo = resolveActivity.activityInfo;
        if (!activityInfo.exported || (activityInfo.permission != null && koa.c(context, activityInfo.permission) != 0)) {
            String valueOf = String.valueOf(String.valueOf(resolveActivity.activityInfo));
            int i = ewuo.a;
            Log.d("androidtc", "No permission to access: ".concat(valueOf));
            return null;
        }
        String str = resolveActivity.activityInfo.packageName;
        String str2 = resolveActivity.activityInfo.name;
        if (str == null || str2 == null) {
            ewuo.a("packageName or className is null");
            return null;
        }
        Intent intent = new Intent(this.e);
        boolean z = false;
        if (!"android".equals(str)) {
            intent.setComponent(new ComponentName(str, str2));
            if (resolveActivity.activityInfo.getIconResource() != 0) {
                try {
                    iconCompat = IconCompat.h(context.createPackageContext(str, 0), resolveActivity.activityInfo.getIconResource());
                } catch (PackageManager.NameNotFoundException e) {
                    int i2 = ewuo.a;
                    Log.e("androidtc", "createIconFromPackage: failed to create package context", e);
                }
                z = true;
            }
        }
        if (iconCompat == null) {
            iconCompat = IconCompat.h(context, R.drawable.ic_menu_more);
        }
        return new ewup(intent, c(context, intent, iconCompat, z, resolveActivity));
    }
}
