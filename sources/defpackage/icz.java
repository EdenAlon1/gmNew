package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icz {
    @ffbs
    public static final Rect a(iam iamVar) {
        float f = iamVar.e;
        float f2 = iamVar.d;
        return new Rect((int) iamVar.b, (int) iamVar.c, (int) f2, (int) f);
    }

    public static final Rect b(kac kacVar) {
        return new Rect(kacVar.b, kacVar.c, kacVar.d, kacVar.e);
    }

    public static final RectF c(iam iamVar) {
        return new RectF(iamVar.b, iamVar.c, iamVar.d, iamVar.e);
    }

    public static final iam d(Rect rect) {
        return new iam(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final iam e(RectF rectF) {
        return new iam(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
