package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgk implements ehgu {
    final /* synthetic */ ehgu a;
    final /* synthetic */ ExtendedFloatingActionButton b;

    public ehgk(ExtendedFloatingActionButton extendedFloatingActionButton, ehgu ehguVar) {
        this.a = ehguVar;
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.ehgu
    public final int a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        int i = extendedFloatingActionButton.v;
        if (i != -1) {
            return (i == 0 || i == -2) ? this.a.a() : i;
        }
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return this.a.a();
        }
        View view = (View) this.b.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.height == -2) {
            return this.a.a();
        }
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        int i2 = 0;
        if ((this.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams()) != null) {
            i2 = marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return (view.getHeight() - i2) - paddingTop;
    }

    @Override // defpackage.ehgu
    public final int b() {
        return this.b.q;
    }

    @Override // defpackage.ehgu
    public final int c() {
        return this.b.p;
    }

    @Override // defpackage.ehgu
    public final int d() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!(this.b.getParent() instanceof View)) {
            return this.a.d();
        }
        View view = (View) this.b.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return this.a.d();
        }
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        int i = 0;
        if ((this.b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) this.b.getLayoutParams()) != null) {
            i = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i) - paddingLeft;
    }

    @Override // defpackage.ehgu
    public final ViewGroup.LayoutParams e() {
        int i = this.b.v;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }
}
