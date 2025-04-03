package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kyv {
    public static float a(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kyu.a(edgeEffect);
        }
        return 0.0f;
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return kyu.b(edgeEffect, f, f2);
        }
        kyt.a(edgeEffect, f, f2);
        return f;
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? kyu.c(context, attributeSet) : new EdgeEffect(context);
    }
}
