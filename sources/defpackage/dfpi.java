package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfpi extends dfpj {
    private static final Object e = new Object();
    public static final dfpi a = new dfpi();
    public static final int b = dfpj.c;

    public final Dialog a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return f(activity, i, new dfvw(j(activity, i, "d"), activity, i2), onCancelListener);
    }

    public final void b(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof eg) {
                fr a2 = ((eg) activity).a();
                dfqh dfqhVar = new dfqh();
                dfwv.o(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                dfqhVar.ag = dialog;
                if (onCancelListener != null) {
                    dfqhVar.ah = onCancelListener;
                }
                dfqhVar.s(a2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        dfpe dfpeVar = new dfpe();
        dfwv.o(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        dfpeVar.a = dialog;
        if (onCancelListener != null) {
            dfpeVar.b = onCancelListener;
        }
        dfpeVar.show(fragmentManager, str);
    }

    public final void c(Context context, int i) {
        g(context, i, k(context, i, "n"));
    }

    public final boolean d(Activity activity, int i, int i2) {
        return e(activity, i, i2, null);
    }

    public final boolean e(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a(activity, i, i2, onCancelListener);
        if (a2 == null) {
            return false;
        }
        b(activity, a2, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final Dialog f(Context context, int i, dfvy dfvyVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(dfvt.c(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String b2 = dfvt.b(context, i);
        if (b2 != null) {
            builder.setPositiveButton(b2, dfvyVar);
        }
        String d = dfvt.d(context, i);
        if (d != null) {
            builder.setTitle(d);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void g(Context context, int i, PendingIntent pendingIntent) {
        int i2;
        String d;
        NotificationChannel notificationChannel;
        CharSequence name;
        int i3;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i), null), new IllegalArgumentException());
        if (i == 18) {
            new dfph(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            d = dfvt.f(context, "common_google_play_services_resolution_required_title");
            i2 = 6;
        } else {
            i2 = i;
            d = dfvt.d(context, i);
        }
        if (d == null) {
            d = context.getResources().getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_ticker);
        }
        String e2 = (i2 == 6 || i2 == 19) ? dfvt.e(context, "common_google_play_services_resolution_required_text", dfvt.a(context)) : dfvt.c(context, i2);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        dfwv.n(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        kml kmlVar = new kml(context, (String) null);
        kmlVar.x = true;
        kmlVar.g(true);
        kmlVar.i(d);
        kme kmeVar = new kme();
        kmeVar.e(e2);
        kmlVar.u(kmeVar);
        boolean a2 = dfyn.a(context);
        int i4 = R.drawable.stat_sys_warning;
        if (a2) {
            dfwv.i(true);
            int i5 = context.getApplicationInfo().icon;
            if (i5 != 0) {
                i4 = i5;
            }
            kmlVar.r(i4);
            kmlVar.l = 2;
            if (dfyn.c(context)) {
                kmlVar.d(com.google.android.apps.messaging.R.drawable.common_full_open_on_phone, resources.getString(com.google.android.apps.messaging.R.string.common_open_on_phone), pendingIntent);
            } else {
                kmlVar.g = pendingIntent;
            }
        } else {
            kmlVar.r(R.drawable.stat_sys_warning);
            kmlVar.w(resources.getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_ticker));
            kmlVar.y(System.currentTimeMillis());
            kmlVar.g = pendingIntent;
            kmlVar.h(e2);
        }
        dfwv.i(true);
        synchronized (e) {
        }
        notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.google.android.apps.messaging.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else {
            name = notificationChannel.getName();
            if (!string.contentEquals(name)) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        kmlVar.F = "com.google.android.gms.availability";
        Notification a3 = kmlVar.a();
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            dfqf.c.set(false);
            i3 = 10436;
        } else {
            i3 = 39789;
        }
        notificationManager.notify(i3, a3);
    }
}
