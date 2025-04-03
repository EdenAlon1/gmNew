package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebos {
    public static float a(DisplayMetrics displayMetrics, int i) {
        return i * displayMetrics.density;
    }

    public static int b(DisplayMetrics displayMetrics, int i) {
        return (int) a(displayMetrics, i);
    }

    public static boolean c(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterialTheme, R.attr.colorPrimaryGoogle});
        boolean z = false;
        try {
            if (obtainStyledAttributes.getBoolean(0, false)) {
                if (obtainStyledAttributes.hasValue(1)) {
                    z = true;
                }
            }
            return z;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
