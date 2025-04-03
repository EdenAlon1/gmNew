package defpackage;

import android.content.pm.PackageManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedn {
    public static boolean a(PackageManager packageManager) {
        try {
            return packageManager.getApplicationInfo("com.samsung.app.newtrim", 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean b(String str, long j, long j2) {
        return le.A(str) && j > j2;
    }
}
