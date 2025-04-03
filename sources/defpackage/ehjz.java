package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Path;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjz {
    public static TimeInterpolator a(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!d(valueOf, "cubic-bezier") && !d(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (d(valueOf, "cubic-bezier")) {
            String[] split = c(valueOf, "cubic-bezier").split(",");
            int length = split.length;
            if (length == 4) {
                return new PathInterpolator(b(split, 0), b(split, 1), b(split, 2), b(split, 3));
            }
            throw new IllegalArgumentException(a.h(length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: "));
        }
        if (!d(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(String.valueOf(valueOf)));
        }
        String c = c(valueOf, "path");
        Path path = new Path();
        try {
            kpw.a(kpw.b(c), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(String.valueOf(c)), e);
        }
    }

    private static float b(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    private static String c(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    private static boolean d(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }
}
