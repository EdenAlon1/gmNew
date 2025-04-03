package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpz {
    public static final kqh a;
    public static final cnq b;

    static {
        ozg.a("TypefaceCompat static init");
        if (Build.VERSION.SDK_INT >= 29) {
            a = new kqd();
        } else if (Build.VERSION.SDK_INT >= 28) {
            a = new kqc();
        } else {
            a = new kqb();
        }
        b = new cnq(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface d = a.d(context, resources, i, str, i3);
        if (d != null) {
            b.d(b(resources, i, str, i2, i3), d);
        }
        return d;
    }

    public static String b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }

    public static Typeface c(Context context, krt[] krtVarArr, int i) {
        ozg.a("TypefaceCompat.createFromFontInfo");
        try {
            return a.b(context, krtVarArr, i);
        } finally {
            Trace.endSection();
        }
    }
}
