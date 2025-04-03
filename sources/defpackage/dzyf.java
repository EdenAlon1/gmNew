package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzyf extends ViewOutlineProvider {
    private final float a;

    public dzyf(float f) {
        this.a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(view.getPaddingStart(), view.getPaddingTop(), view.getWidth() - view.getPaddingEnd(), view.getHeight() - view.getPaddingBottom(), this.a);
    }
}
