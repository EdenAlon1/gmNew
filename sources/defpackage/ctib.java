package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctib {
    public static boolean a() {
        return emuz.e("GOOGLE", Build.MANUFACTURER) || emuz.e("GOOGLE", Build.BRAND);
    }

    public static boolean b() {
        return emuz.e("HUAWEI", Build.MANUFACTURER) || emuz.e("HONOR", Build.MANUFACTURER) || emuz.e("HUAWEI", Build.BRAND) || emuz.e("HONOR", Build.BRAND);
    }

    public static boolean c() {
        return emuz.e("LGE", Build.MANUFACTURER) || emuz.e("LGE", Build.BRAND);
    }

    public static boolean d() {
        return emuz.e("SAMSUNG", Build.MANUFACTURER) || emuz.e("SAMSUNG", Build.BRAND);
    }
}
