package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jia {
    public static final ich a(Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return new iax(((BitmapDrawable) drawable).getBitmap());
    }

    public static final ich b(int i, hfd hfdVar) {
        Resources resources = (Resources) hfdVar.e(AndroidCompositionLocals_androidKt.c);
        hfm hfmVar = (hfm) hfdVar;
        Object R = hfmVar.R();
        if (R == hfc.a) {
            R = new TypedValue();
            hfmVar.ad(R);
        }
        TypedValue typedValue = (TypedValue) R;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        charSequence.getClass();
        boolean D = hfdVar.D(charSequence.toString());
        Object R2 = hfmVar.R();
        if (D || R2 == hfc.a) {
            R2 = a(resources, i);
            hfmVar.ad(R2);
        }
        return (ich) R2;
    }
}
