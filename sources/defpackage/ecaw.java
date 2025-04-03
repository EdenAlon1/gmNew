package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecaw implements TypeEvaluator {
    private final RectF a;

    public ecaw(RectF rectF) {
        this.a = rectF;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        RectF rectF = (RectF) obj;
        RectF rectF2 = (RectF) obj2;
        this.a.top = rectF.top + ((rectF2.top - rectF.top) * f);
        this.a.left = rectF.left + ((rectF2.left - rectF.left) * f);
        this.a.right = rectF.right + ((rectF2.right - rectF.right) * f);
        this.a.bottom = rectF.bottom + (f * (rectF2.bottom - rectF.bottom));
        return this.a;
    }
}
