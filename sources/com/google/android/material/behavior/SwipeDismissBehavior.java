package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ehap;
import defpackage.ehaq;
import defpackage.ehqs;
import defpackage.kkt;
import defpackage.kvo;
import defpackage.kxr;
import defpackage.laa;
import defpackage.lab;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SwipeDismissBehavior<V extends View> extends kkt<V> {
    public lab a;
    public boolean b;
    public ehqs f;
    private boolean g;
    public int c = 2;
    public float d = 0.0f;
    public float e = 0.5f;
    private final laa h = new ehap(this);

    public static float u(float f) {
        return Math.min(Math.max(0.0f, f), 1.0f);
    }

    @Override // defpackage.kkt
    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.k(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.g = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        if (z) {
            if (this.a == null) {
                this.a = lab.b(coordinatorLayout, this.h);
            }
            if (!this.b && this.a.i(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.kkt
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (view.getImportantForAccessibility() != 0) {
            return false;
        }
        view.setImportantForAccessibility(1);
        kvo.n(view, 1048576);
        if (!t(view)) {
            return false;
        }
        kvo.y(view, kxr.h, new ehaq(this));
        return false;
    }

    @Override // defpackage.kkt
    public final boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.a == null) {
            return false;
        }
        if (this.b && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.a.e(motionEvent);
        return true;
    }

    public boolean t(View view) {
        return true;
    }
}
