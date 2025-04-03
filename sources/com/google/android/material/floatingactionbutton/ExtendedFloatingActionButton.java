package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import defpackage.egza;
import defpackage.ehgd;
import defpackage.ehgi;
import defpackage.ehgj;
import defpackage.ehgk;
import defpackage.ehgl;
import defpackage.ehgm;
import defpackage.ehgn;
import defpackage.ehgo;
import defpackage.ehgp;
import defpackage.ehgq;
import defpackage.ehgr;
import defpackage.ehgs;
import defpackage.ehgt;
import defpackage.ehgu;
import defpackage.ehhj;
import defpackage.ehhk;
import defpackage.ehht;
import defpackage.ehiz;
import defpackage.ehow;
import defpackage.ehua;
import defpackage.kks;
import defpackage.kkt;
import defpackage.kkw;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements kks {
    public static final Property k = new ehgn(Float.class);
    public static final Property l = new ehgo(Float.class);
    public static final Property m = new ehgp(Float.class);
    public static final Property n = new ehgq(Float.class);
    public static final /* synthetic */ int w = 0;
    private final ehhj A;
    private final ehhj B;
    private final ehhj C;
    private final int D;
    private final kkt E;
    private final int F;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public ColorStateList t;
    public int u;
    public int v;
    private boolean x;
    private final ehgd y;
    private final ehhj z;

    /* compiled from: PG */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends kkt<T> {
        private Rect a;
        private final boolean b;
        private final boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.b = false;
            this.c = true;
        }

        private static boolean v(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof kkw) {
                return ((kkw) layoutParams).a instanceof BottomSheetBehavior;
            }
            return false;
        }

        private final boolean w(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.b || this.c) && ((kkw) extendedFloatingActionButton.getLayoutParams()).f == view.getId();
        }

        private final boolean x(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!w(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            ehht.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.f()) {
                u(extendedFloatingActionButton);
                return true;
            }
            t(extendedFloatingActionButton);
            return true;
        }

        private final boolean y(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!w(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((kkw) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                u(extendedFloatingActionButton);
                return true;
            }
            t(extendedFloatingActionButton);
            return true;
        }

        @Override // defpackage.kkt
        public final void a(kkw kkwVar) {
            if (kkwVar.h == 0) {
                kkwVar.h = 80;
            }
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List a = coordinatorLayout.a(extendedFloatingActionButton);
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) a.get(i2);
                if (!(view2 instanceof AppBarLayout)) {
                    if (v(view2) && y(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (x(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.j(extendedFloatingActionButton, i);
            return true;
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                x(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else if (v(view2)) {
                y(view2, extendedFloatingActionButton);
            }
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean s(View view, Rect rect) {
            return false;
        }

        protected final void t(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = ExtendedFloatingActionButton.w;
            extendedFloatingActionButton.t(true != this.c ? 0 : 3);
        }

        protected final void u(ExtendedFloatingActionButton extendedFloatingActionButton) {
            int i = ExtendedFloatingActionButton.w;
            extendedFloatingActionButton.t(true == this.c ? 2 : 1);
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehhk.b);
            this.b = obtainStyledAttributes.getBoolean(0, false);
            this.c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, null);
    }

    private final void u() {
        this.t = getTextColors();
    }

    @Override // defpackage.kks
    public final kkt a() {
        return this.E;
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    public final int n() {
        return (o() - this.e) / 2;
    }

    public final int o() {
        int i = this.D;
        if (i >= 0) {
            return i;
        }
        int min = Math.min(getPaddingStart(), getPaddingEnd());
        return min + min + this.e;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.r && TextUtils.isEmpty(getText()) && this.d != null) {
            this.r = false;
            this.z.i();
        }
    }

    public final void p() {
        t(1);
    }

    public final void q() {
        t(2);
    }

    public final void r(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public final boolean s() {
        return getVisibility() != 0 ? this.o == 2 : this.o != 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (!this.r || this.s) {
            return;
        }
        this.p = getPaddingStart();
        this.q = getPaddingEnd();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (!this.r || this.s) {
            return;
        }
        this.p = i;
        this.q = i3;
    }

    @Override // android.widget.TextView
    public final void setTextColor(int i) {
        super.setTextColor(i);
        u();
    }

    public final void t(int i) {
        ehhj ehhjVar = i != 0 ? i != 1 ? i != 2 ? this.A : this.z : this.C : this.B;
        if (ehhjVar.j()) {
            return;
        }
        if (this.x) {
            if (!isLaidOut()) {
                s();
            } else if (!isInEditMode()) {
                if (i == 2) {
                    ViewGroup.LayoutParams layoutParams = getLayoutParams();
                    if (layoutParams != null) {
                        this.u = layoutParams.width;
                        this.v = layoutParams.height;
                    } else {
                        this.u = getWidth();
                        this.v = getHeight();
                    }
                }
                measure(0, 0);
                AnimatorSet a = ehhjVar.a();
                a.addListener(new ehgm(ehhjVar));
                Iterator it = ehhjVar.d().iterator();
                while (it.hasNext()) {
                    a.addListener((Animator.AnimatorListener) it.next());
                }
                a.start();
                return;
            }
        }
        ehhjVar.i();
        ehhjVar.k();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.extendedFloatingActionButtonStyle);
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon), attributeSet, i);
        this.o = 0;
        this.x = true;
        ehgd ehgdVar = new ehgd();
        this.y = ehgdVar;
        ehgt ehgtVar = new ehgt(this, ehgdVar);
        this.B = ehgtVar;
        ehgs ehgsVar = new ehgs(this, ehgdVar);
        this.C = ehgsVar;
        this.r = true;
        this.s = false;
        Context context2 = getContext();
        this.E = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray a = ehiz.a(context2, attributeSet, ehhk.a, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, new int[0]);
        egza b = egza.b(context2, a, 5);
        egza b2 = egza.b(context2, a, 4);
        egza b3 = egza.b(context2, a, 2);
        egza b4 = egza.b(context2, a, 6);
        this.D = a.getDimensionPixelSize(0, -1);
        int i2 = a.getInt(3, 1);
        this.F = i2;
        this.p = getPaddingStart();
        this.q = getPaddingEnd();
        ehgd ehgdVar2 = new ehgd();
        ehgu ehgjVar = new ehgj(this);
        ehgu ehgkVar = new ehgk(this, ehgjVar);
        ehgu ehglVar = new ehgl(this, ehgkVar, ehgjVar);
        boolean z = true;
        if (i2 != 1) {
            ehgjVar = i2 != 2 ? ehglVar : ehgkVar;
            z = true;
        }
        ehgr ehgrVar = new ehgr(this, ehgdVar2, ehgjVar, z);
        this.A = ehgrVar;
        ehgr ehgrVar2 = new ehgr(this, ehgdVar2, new ehgi(this), false);
        this.z = ehgrVar2;
        ehgtVar.b = b;
        ehgsVar.b = b2;
        ehgrVar.b = b3;
        ehgrVar2.b = b4;
        a.recycle();
        fy(new ehow(ehow.c(context2, attributeSet, i, R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon, ehow.a)));
        u();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        u();
    }
}
