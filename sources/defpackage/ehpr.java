package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpr extends ehpt {
    final SideSheetBehavior a;

    public ehpr(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.ehpt
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.ehpt
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // defpackage.ehpt
    public final int c() {
        int d = d();
        SideSheetBehavior sideSheetBehavior = this.a;
        return Math.max(0, (d - sideSheetBehavior.f) - sideSheetBehavior.i);
    }

    @Override // defpackage.ehpt
    public final int d() {
        return this.a.g;
    }

    @Override // defpackage.ehpt
    public final int e() {
        return this.a.g;
    }

    @Override // defpackage.ehpt
    public final int f() {
        return c();
    }

    @Override // defpackage.ehpt
    public final int g(View view) {
        return view.getLeft() - this.a.i;
    }

    @Override // defpackage.ehpt
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // defpackage.ehpt
    public final int i() {
        return 0;
    }

    @Override // defpackage.ehpt
    public final void j(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.rightMargin = i;
    }

    @Override // defpackage.ehpt
    public final void k(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.a.g;
        if (i <= i3) {
            marginLayoutParams.rightMargin = i3 - i;
        }
    }

    @Override // defpackage.ehpt
    public final boolean l(float f) {
        return f < 0.0f;
    }

    @Override // defpackage.ehpt
    public final boolean m(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // defpackage.ehpt
    public final boolean n(float f, float f2) {
        return ehpu.a(f, f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.ehpt
    public final boolean o(View view, float f) {
        return Math.abs(((float) view.getRight()) + (f * this.a.e)) > 0.5f;
    }

    @Override // defpackage.ehpt
    public final void p() {
        c();
    }
}
