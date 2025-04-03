package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bll {
    public static RectF a(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    public static RectF b(RectF rectF, float f) {
        float f2 = f + f;
        return new RectF(rectF.left, f2 - rectF.bottom, rectF.right, f2 - rectF.top);
    }
}
