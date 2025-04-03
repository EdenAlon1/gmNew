package com.google.android.material.bottomappbar;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import defpackage.kks;
import defpackage.kkt;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class BottomAppBar extends Toolbar implements kks {
    @Override // defpackage.kks
    public final /* bridge */ /* synthetic */ kkt a() {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void s(Drawable drawable) {
        throw null;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void v(CharSequence charSequence) {
        throw null;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void x(CharSequence charSequence) {
        throw null;
    }

    /* compiled from: PG */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        public Behavior() {
            new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            new WeakReference((BottomAppBar) view);
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            throw null;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            new Rect();
        }
    }
}
