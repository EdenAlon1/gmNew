package com.google.android.apps.messaging.samsung.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ModifiedScrollingBehavior extends AppBarLayout.Behavior {
    private final Scroller c;
    private boolean d;

    public ModifiedScrollingBehavior(Context context) {
        this.c = new Scroller(context);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.kkt
    public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        c(coordinatorLayout, (AppBarLayout) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.kkt
    public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        d(coordinatorLayout, (AppBarLayout) view, view2, i, i2, i3, i4, i5, iArr);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.kkt
    public final /* bridge */ /* synthetic */ void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        e(coordinatorLayout, (AppBarLayout) view, view2, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.kkt
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
    }

    @Override // defpackage.kkt
    public final /* bridge */ /* synthetic */ boolean o(View view, View view2, float f) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        appBarLayout.getClass();
        view2.getClass();
        if (view2.canScrollVertically(-1)) {
            this.d = false;
            return false;
        }
        Scroller scroller = this.c;
        scroller.fling(0, I(), 0, (int) (-f), 0, 0, -appBarLayout.h(), 0);
        this.d = (scroller.getFinalY() == 0 || scroller.getFinalY() == (-appBarLayout.h())) ? false : true;
        scroller.abortAnimation();
        if (this.d) {
            appBarLayout.m(f < 0.0f);
        }
        return this.d;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: t */
    public final void c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        appBarLayout.getClass();
        view.getClass();
        iArr.getClass();
        if (i3 == 0 || !this.d) {
            super.c(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: u */
    public final void d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        appBarLayout.getClass();
        view.getClass();
        iArr.getClass();
        if (i5 == 0 || !this.d) {
            super.d(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: v */
    public final void e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        appBarLayout.getClass();
        view.getClass();
        if (i == 0 || !this.d) {
            super.e(coordinatorLayout, appBarLayout, view, i);
            if (i != 1) {
                return;
            }
        }
        this.d = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: w */
    public final boolean i(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        appBarLayout.getClass();
        view.getClass();
        view2.getClass();
        if (i2 == 0 || !this.d) {
            return super.i(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifiedScrollingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.c = new Scroller(context);
    }
}
