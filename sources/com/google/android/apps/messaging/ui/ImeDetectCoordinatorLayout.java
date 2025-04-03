package com.google.android.apps.messaging.ui;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import defpackage.cskc;
import defpackage.cwpa;
import defpackage.cwpf;
import defpackage.cwpg;
import defpackage.tam;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ImeDetectCoordinatorLayout extends cwpa {
    private static final cskc l = cskc.g("Bugle", "ImeDetectCoordinatorLayout");
    public cwpg j;
    public tam k;
    private cwpf m;
    private ViewTreeObserver n;

    public ImeDetectCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        if (!(context instanceof Activity)) {
            l.n("has to be in an activity to listen IME height changes");
            return;
        }
        Activity activity = (Activity) context;
        Window window = activity.getWindow();
        if (window == null) {
            l.n("Activity does not have a window");
            return;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            l.n("Window does not have a decor view");
            return;
        }
        ViewTreeObserver viewTreeObserver = decorView.getViewTreeObserver();
        this.n = viewTreeObserver;
        if (viewTreeObserver == null) {
            l.n("Decor View does not have a ViewTreeObserver");
        }
        cwpf a = this.j.a(activity, decorView, this.k.a);
        this.m = a;
        this.n.addOnGlobalLayoutListener(a);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        cwpf cwpfVar = this.m;
        if (cwpfVar == null || (viewTreeObserver = this.n) == null) {
            l.n("cannot remove OnGlobalLayoutListener");
        } else {
            viewTreeObserver.removeOnGlobalLayoutListener(cwpfVar);
        }
    }
}
