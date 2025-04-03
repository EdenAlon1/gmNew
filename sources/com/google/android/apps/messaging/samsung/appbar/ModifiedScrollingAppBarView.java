package com.google.android.apps.messaging.samsung.appbar;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a;
import defpackage.akmr;
import defpackage.akms;
import defpackage.akmx;
import defpackage.egzm;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.kkt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ModifiedScrollingAppBarView extends akmx implements ekhu<akmr> {
    private akmr i;
    private Context j;

    @Deprecated
    public ModifiedScrollingAppBarView(Context context) {
        super(context);
        s();
    }

    private final void s() {
        if (this.i == null) {
            try {
                this.i = ((akms) aX()).R();
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
        return akmr.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        akmr akmrVar = this.i;
        if (akmrVar != null) {
            return akmrVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // com.google.android.material.appbar.AppBarLayout, defpackage.kks
    public final kkt a() {
        super.a();
        s();
        Context context = this.i.a.getContext();
        context.getClass();
        return new ModifiedScrollingBehavior(context);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new egzm();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.j;
            if (context == null) {
                this.j = a;
                return;
            }
            boolean z = true;
            if (context != a && !ekkv.b(context)) {
                z = false;
            }
            emxf.m(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new egzm();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }

    public ModifiedScrollingAppBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModifiedScrollingAppBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ModifiedScrollingAppBarView(ekji ekjiVar) {
        super(ekjiVar);
        s();
    }
}
