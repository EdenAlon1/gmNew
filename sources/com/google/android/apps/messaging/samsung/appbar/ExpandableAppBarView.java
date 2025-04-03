package com.google.android.apps.messaging.samsung.appbar;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.a;
import defpackage.akmn;
import defpackage.akmo;
import defpackage.akmv;
import defpackage.akmw;
import defpackage.egzr;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.ellv;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.ffkj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandableAppBarView extends akmw implements ekhu, ellv {
    private akmn g;
    private final TypedArray h;
    private Context i;

    @Deprecated
    public ExpandableAppBarView(Context context) {
        super(context);
        this.h = null;
        l();
    }

    private final akmn k() {
        l();
        return this.g;
    }

    private final void l() {
        if (this.g == null) {
            try {
                this.g = ((akmo) aX()).Q();
                TypedArray typedArray = this.h;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof ekke)) {
                    throw new IllegalStateException(a.L(this));
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return akmn.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        akmn akmnVar = this.g;
        if (akmnVar != null) {
            return akmnVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.ellv
    public final TypedArray a() {
        return this.h;
    }

    @Override // defpackage.egzt, android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new egzr();
    }

    @Override // defpackage.egzt, android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new egzr(layoutParams);
    }

    @Override // defpackage.egzt, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View findViewById;
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.i;
            if (context == null) {
                this.i = a;
            } else {
                emxf.m(context == a || ekkv.b(context), "onAttach called multiple times with different parent Contexts");
            }
        }
        akmn k = k();
        ViewParent parent = k.b.getParent();
        View view = null;
        k.d = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
        int i = k.e;
        if (i != -1 && (findViewById = k.b.findViewById(i)) != null) {
            while (true) {
                Object parent2 = findViewById.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                if (ffkj.e(parent2, k.b)) {
                    view = findViewById;
                    break;
                }
                findViewById = (View) parent2;
            }
        }
        k.f = view;
        k.c = k.b.getLayoutParams().height == -2;
        k.a();
    }

    @Override // defpackage.egzt, android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        akmn k = k();
        configuration.getClass();
        k.a();
    }

    @Override // defpackage.egzt, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        akmn k = k();
        if (k.c) {
            k.b.getLayoutParams().height = -2;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // defpackage.egzt, android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new egzr();
    }

    public ExpandableAppBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context.obtainStyledAttributes(attributeSet, akmv.a);
    }

    public ExpandableAppBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = context.obtainStyledAttributes(attributeSet, akmv.a, i, 0);
    }

    public ExpandableAppBarView(ekji ekjiVar) {
        super(ekjiVar);
        this.h = null;
        l();
    }
}
