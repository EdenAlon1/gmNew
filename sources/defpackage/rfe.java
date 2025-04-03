package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rfe implements qwv, qwq {
    protected final Drawable a;

    public rfe(Drawable drawable) {
        rkf.f(drawable);
        this.a = drawable;
    }

    @Override // defpackage.qwq
    public void d() {
        Drawable drawable = this.a;
        if (drawable instanceof BitmapDrawable) {
            ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
        } else if (drawable instanceof rfp) {
            ((rfp) drawable).a().prepareToDraw();
        }
    }

    @Override // defpackage.qwv
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Drawable c() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : constantState.newDrawable();
    }
}
