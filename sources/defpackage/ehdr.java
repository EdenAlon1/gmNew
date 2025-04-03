package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.messaging.R;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehdr {
    private ehdr() {
    }

    public static int a(int i, int i2) {
        return kps.h(i, (Color.alpha(i) * i2) / PrivateKeyType.INVALID);
    }

    public static int b(View view, int i) {
        return j(view.getContext(), ehmp.c(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int c(Context context, int i, int i2) {
        Integer h = h(context, i);
        return h != null ? h.intValue() : i2;
    }

    public static int d(Context context, int i, String str) {
        return j(context, ehmp.c(context, i, str));
    }

    public static int e(Context context, int i) {
        return ehds.a(i, d(context, R.attr.colorPrimary, ehdr.class.getCanonicalName()));
    }

    public static int f(int i, int i2, float f) {
        return kps.g(kps.h(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static ColorStateList g(Context context, int i) {
        TypedValue b = ehmp.b(context, i);
        if (b == null) {
            return null;
        }
        if (b.resourceId != 0) {
            return koa.d(context, b.resourceId);
        }
        if (b.data != 0) {
            return ColorStateList.valueOf(b.data);
        }
        return null;
    }

    public static Integer h(Context context, int i) {
        TypedValue b = ehmp.b(context, i);
        if (b != null) {
            return Integer.valueOf(j(context, b));
        }
        return null;
    }

    public static boolean i(int i) {
        return i != 0 && kps.b(i) > 0.5d;
    }

    private static int j(Context context, TypedValue typedValue) {
        return typedValue.resourceId != 0 ? context.getColor(typedValue.resourceId) : typedValue.data;
    }
}
