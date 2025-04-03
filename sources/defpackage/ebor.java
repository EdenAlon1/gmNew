package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebor {
    public static Drawable a(Context context, int i, int i2) {
        Drawable a = ku.a(context, i);
        c(a, i2);
        return a;
    }

    public static int b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.actionBarItemBackground});
        try {
            return obtainStyledAttributes.getResourceId(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void c(Drawable drawable, int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        boolean z = true;
        if (!efbd.g() && drawable.getCallback() != null) {
            z = false;
        }
        emxf.m(z, "Tinting drawables with callback from background thread might trigger UI code on the background thread.");
        drawable.mutate().setTintList(valueOf);
    }
}
