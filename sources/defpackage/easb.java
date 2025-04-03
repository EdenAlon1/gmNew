package defpackage;

import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class easb {
    public static boolean a(Context context, String str) {
        return koa.c(context, str) == 0;
    }

    public static boolean b(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean d(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 26;
    }

    public static boolean e(Context context) {
        return kqq.b() && context.getApplicationInfo().targetSdkVersion >= 33;
    }
}
