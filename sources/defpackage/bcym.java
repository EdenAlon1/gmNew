package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcym {
    public static final enip a = enip.v(8, 9, 18, 19, 22, 24, 106, 107, 111, 112, 110, 113, 114);
    public final ffbr b;

    public bcym(ffbr ffbrVar) {
        this.b = ffbrVar;
    }

    public static boolean b(int i) {
        return a.contains(Integer.valueOf(i));
    }

    public static boolean c(boolean z, int i) {
        return !z && i >= 100;
    }

    public static boolean d(boolean z, int i) {
        return !c(z, i);
    }

    public static boolean e(int i) {
        return i == 110 || i == 106 || i == 112;
    }

    public static boolean f(boolean z, boolean z2, int i, boolean z3) {
        if (z) {
            return false;
        }
        return !z3 || d(z2, i);
    }

    public final String a(String str, String str2, String str3) {
        return !TextUtils.isEmpty(str) ? str : !TextUtils.isEmpty(str2) ? str2 : emxe.b(cuxh.b(str3));
    }
}
