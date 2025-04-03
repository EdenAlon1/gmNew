package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvrd {
    public static final dvrc a(Context context, evzm evzmVar, boolean z) {
        if (!z) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorPrimary, R.attr.colorOnPrimary, R.attr.colorSecondary, R.attr.colorSurface, R.attr.colorOnSurface, R.attr.colorOnSurfaceVariant, android.R.attr.colorBackground, R.attr.colorOutline});
        int color = obtainStyledAttributes.getColor(0, b(R.color.gm3_default_color_primary, R.color.gm3_dark_default_color_primary, context, evzmVar));
        int color2 = obtainStyledAttributes.getColor(1, b(R.color.gm3_default_color_on_primary, R.color.gm3_dark_default_color_on_primary, context, evzmVar));
        int color3 = obtainStyledAttributes.getColor(2, b(R.color.gm3_default_color_secondary, R.color.gm3_dark_default_color_secondary, context, evzmVar));
        int color4 = obtainStyledAttributes.getColor(3, b(R.color.gm3_default_color_surface, R.color.gm3_dark_default_color_surface, context, evzmVar));
        int color5 = obtainStyledAttributes.getColor(4, b(R.color.gm3_default_color_on_surface, R.color.gm3_dark_default_color_on_surface, context, evzmVar));
        int color6 = obtainStyledAttributes.getColor(5, b(R.color.gm3_default_color_on_surface_variant, R.color.gm3_dark_default_color_on_surface_variant, context, evzmVar));
        int color7 = obtainStyledAttributes.getColor(6, b(R.color.gm3_default_color_background, R.color.gm3_dark_default_color_background, context, evzmVar));
        int color8 = obtainStyledAttributes.getColor(7, b(R.color.gm3_default_color_outline, R.color.gm3_dark_default_color_outline, context, evzmVar));
        obtainStyledAttributes.recycle();
        return new dvra(color, color2, color3, color4, dwej.SURFACE_1.a(context), dwej.SURFACE_2.a(context), dwej.SURFACE_3.a(context), dwej.SURFACE_4.a(context), dwej.SURFACE_5.a(context), color5, color6, color7, color8);
    }

    private static final int b(int i, int i2, Context context, evzm evzmVar) {
        if (true == evzmVar.equals(evzm.DARK)) {
            i = i2;
        }
        return context.getColor(i);
    }
}
