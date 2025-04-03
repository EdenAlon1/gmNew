package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpp extends ehpt {
    final SideSheetBehavior a;

    public ehpp(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.ehpt
    public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.ehpt
    public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // defpackage.ehpt
    public final int c() {
        SideSheetBehavior sideSheetBehavior = this.a;
        return Math.max(0, sideSheetBehavior.h + sideSheetBehavior.i);
    }

    @Override // defpackage.ehpt
    public final int d() {
        SideSheetBehavior sideSheetBehavior = this.a;
        return (-sideSheetBehavior.f) - sideSheetBehavior.i;
    }

    @Override // defpackage.ehpt
    public final int e() {
        return this.a.i;
    }

    @Override // defpackage.ehpt
    public final int f() {
        return -this.a.f;
    }

    @Override // defpackage.ehpt
    public final int g(View view) {
        return view.getRight() + this.a.i;
    }

    @Override // defpackage.ehpt
    public final int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // defpackage.ehpt
    public final int i() {
        return 1;
    }

    @Override // defpackage.ehpt
    public final void j(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.leftMargin = i;
    }

    @Override // defpackage.ehpt
    public final void k(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        if (i <= this.a.g) {
            marginLayoutParams.leftMargin = i2;
        }
    }

    @Override // defpackage.ehpt
    public final boolean l(float f) {
        return f > 0.0f;
    }

    @Override // defpackage.ehpt
    public final boolean m(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // defpackage.ehpt
    public final boolean n(float f, float f2) {
        return ehpu.a(f, f2) && Math.abs(f) > 500.0f;
    }

    @Override // defpackage.ehpt
    public final boolean o(View view, float f) {
        return Math.abs(((float) view.getLeft()) + (f * this.a.e)) > 0.5f;
    }

    @Override // defpackage.ehpt
    public final void p() {
        c();
    }
}
