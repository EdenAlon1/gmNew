package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvdd {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/util/version/VersionUtil");
    private static final Object d = new Object();
    private static cvdd e;
    public final String a;
    public final int b;

    private cvdd(Context context) {
        int i;
        int i2 = -1;
        try {
            PackageManager packageManager = context.getPackageManager();
            try {
                i = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e2) {
                csix.p("couldn't get package info for Bugle package with name " + context.getPackageName(), e2);
                i = -1;
            }
            try {
                int i3 = packageManager.getPackageInfo("com.google.android.ims", 0).versionCode;
            } catch (PackageManager.NameNotFoundException e3) {
                ensk h = c.h();
                h.Y(ente.a, "BugleRcs");
                ((enrr) ((enrr) ((enrr) h).g(e3)).h("com/google/android/apps/messaging/shared/util/version/VersionUtil", "<init>", 73, "VersionUtil.java")).t("couldn't get package info for carrier services package with name %s", "com.google.android.ims");
            }
            i2 = i;
        } catch (NullPointerException e4) {
            ensk i4 = c.i();
            i4.Y(ente.a, "BugleRcs");
            ((enrr) ((enrr) ((enrr) i4).g(e4)).h("com/google/android/apps/messaging/shared/util/version/VersionUtil", "<init>", 'O', "VersionUtil.java")).q("found null pointer trying to get version info");
        }
        this.b = i2;
        int i5 = i2 / 1000;
        this.a = String.format(Locale.US, "%d.%d.%03d", Integer.valueOf(i5 / 10000), Integer.valueOf((i5 / 1000) % 10), Integer.valueOf(i5 % 1000));
    }

    public static cvdd a(Context context) {
        synchronized (d) {
            if (e == null) {
                e = new cvdd(context);
            }
        }
        return e;
    }

    public final String toString() {
        return this.a;
    }
}
