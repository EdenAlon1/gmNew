package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehim implements TypeEvaluator {
    private final Rect a;

    public ehim(Rect rect) {
        this.a = rect;
    }

    @Override // android.animation.TypeEvaluator
    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        this.a.set(rect.left + ((int) ((rect2.left - rect.left) * f)), rect.top + ((int) ((rect2.top - rect.top) * f)), rect.right + ((int) ((rect2.right - rect.right) * f)), rect.bottom + ((int) ((rect2.bottom - rect.bottom) * f)));
        return this.a;
    }
}
