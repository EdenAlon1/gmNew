package defpackage;

import android.content.Context;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmp {
    public static int a(Context context, int i, int i2) {
        TypedValue b = b(context, i);
        return (b == null || b.type != 16) ? i2 : b.data;
    }

    public static TypedValue b(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static TypedValue c(Context context, int i, String str) {
        TypedValue b = b(context, i);
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static boolean d(Context context, int i, boolean z) {
        TypedValue b = b(context, i);
        return (b == null || b.type != 18) ? z : b.data != 0;
    }

    public static int e(Context context, String str) {
        return c(context, R.attr.materialCalendarStyle, str).data;
    }
}
