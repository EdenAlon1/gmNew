package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pci extends Drawable.ConstantState {
    private final Drawable.ConstantState a;

    public pci(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        pcj pcjVar = new pcj();
        pcjVar.e = (VectorDrawable) this.a.newDrawable();
        return pcjVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        pcj pcjVar = new pcj();
        pcjVar.e = (VectorDrawable) this.a.newDrawable(resources);
        return pcjVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        pcj pcjVar = new pcj();
        pcjVar.e = (VectorDrawable) this.a.newDrawable(resources, theme);
        return pcjVar;
    }
}
