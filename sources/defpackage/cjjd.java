package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjjd implements crid {
    public final cjjc a;
    public final ffbr b;
    public cjgv c;

    public cjjd(cjjc cjjcVar, ffbr ffbrVar) {
        this.a = cjjcVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        this.a.setSelected(z);
        cjgv cjgvVar = this.c;
        if (cjgvVar != null) {
            if (z) {
                ColorStateList d = koa.d(this.a.getContext(), R.color.message_image_selected_tint_selector);
                if (d != null) {
                    int defaultColor = d.getDefaultColor();
                    cjgvVar.c().setColorFilter(defaultColor);
                    cjgvVar.b().setColorFilter(defaultColor);
                }
            } else {
                cjgvVar.c().clearColorFilter();
                cjgvVar.b().clearColorFilter();
            }
            Drawable mutate = cjgvVar.a().getBackground().mutate();
            mutate.getClass();
            GradientDrawable gradientDrawable = (GradientDrawable) mutate;
            gradientDrawable.setCornerRadii(fArr);
            gradientDrawable.setColor(cxqh.c(this.a.getContext(), z));
        }
    }
}
