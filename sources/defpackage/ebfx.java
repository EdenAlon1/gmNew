package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebfx {
    public static Drawable a(Context context, int i, int i2) {
        Drawable a = ebor.a(context, R.drawable.badge_exclamation_vd, i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        ebor.c(shapeDrawable, i2);
        return new LayerDrawable(new Drawable[]{shapeDrawable, a});
    }
}
