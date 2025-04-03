package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aeoi {
    public static float a(aeod aeodVar) {
        aenz aenzVar = (aenz) aeodVar;
        View view = aenzVar.g.a;
        boolean z = true;
        if (!view.getClipToOutline()) {
            view.setClipToOutline(true);
            view.setOutlineProvider(new aeob());
        }
        float f = aenzVar.h;
        ColorStateList colorStateList = null;
        if (f != 0.0f && Math.abs(f) != view.getWidth()) {
            colorStateList = ColorStateList.valueOf(cwoj.c(view.getContext()));
        }
        view.setBackgroundTintList(colorStateList);
        aenzVar.e.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), aenzVar.d);
        float f2 = aenzVar.a.getResources().getDisplayMetrics().density;
        float f3 = 48.0f * f2;
        int i = (int) (f2 * 12.0f);
        int i2 = (int) f3;
        aenzVar.e.translate(f > 0.0f ? view.getLeft() + i : (view.getRight() - i2) - i, view.getTop() + ((view.getHeight() - i2) / 2));
        Canvas canvas = aenzVar.e;
        aeot aeotVar = aenzVar.b;
        canvas.scale(aeotVar.a(), aeotVar.a());
        aenzVar.b.d(aenzVar.c, Math.abs(f) / aenzVar.f.getWidth(), aenzVar.j);
        aenzVar.c.draw(aenzVar.e);
        view.invalidateOutline();
        if (!aenzVar.j) {
            return 0.0f;
        }
        float width = aenzVar.k * view.getWidth();
        float f4 = -width;
        boolean z2 = f < f4 || f > width;
        float f5 = aenzVar.i;
        if (f5 >= f4 && f5 <= width) {
            z = false;
        }
        if (z2 != z) {
            view.performHapticFeedback(4);
        }
        return f;
    }
}
