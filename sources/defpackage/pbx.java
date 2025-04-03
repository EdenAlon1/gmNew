package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pbx extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public pbx(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        pby pbyVar = new pby();
        pbyVar.e = this.a.newDrawable();
        pbyVar.e.setCallback(pbyVar.d);
        return pbyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        pby pbyVar = new pby();
        pbyVar.e = this.a.newDrawable(resources);
        pbyVar.e.setCallback(pbyVar.d);
        return pbyVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        pby pbyVar = new pby();
        pbyVar.e = this.a.newDrawable(resources, theme);
        pbyVar.e.setCallback(pbyVar.d);
        return pbyVar;
    }
}
