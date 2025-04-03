package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebnr {
    public static float a(Context context, int i) {
        return e(context, i).getDimension(context.getResources().getDisplayMetrics());
    }

    public static int b(Context context, int i) {
        return context.getResources().getColor(d(context, i));
    }

    public static int c(Context context, int i) {
        return TypedValue.complexToDimensionPixelSize(e(context, i).data, context.getResources().getDisplayMetrics());
    }

    public static int d(Context context, int i) {
        return e(context, i).resourceId;
    }

    public static TypedValue e(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        throw new IllegalStateException("Attribute not available.");
    }

    public static boolean f(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.isMaterial3Theme});
        try {
            return obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
