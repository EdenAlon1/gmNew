package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatTextView;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.a;
import defpackage.egyv;
import defpackage.ehdr;
import defpackage.ehhs;
import defpackage.ehht;
import defpackage.ehir;
import defpackage.ehis;
import defpackage.ehjg;
import defpackage.ehjz;
import defpackage.ehmp;
import defpackage.ehmq;
import defpackage.ehoi;
import defpackage.ehon;
import defpackage.ehop;
import defpackage.ehou;
import defpackage.ehow;
import defpackage.ehsl;
import defpackage.ehsm;
import defpackage.ehsn;
import defpackage.ehsx;
import defpackage.ehsz;
import defpackage.ehtc;
import defpackage.ehte;
import defpackage.ehtg;
import defpackage.ehth;
import defpackage.ehtk;
import defpackage.ehtp;
import defpackage.ehtr;
import defpackage.ehts;
import defpackage.ehtt;
import defpackage.ehtu;
import defpackage.ehtv;
import defpackage.ehty;
import defpackage.kps;
import defpackage.kse;
import defpackage.kvo;
import defpackage.ozs;
import defpackage.pav;
import defpackage.qu;
import defpackage.td;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ int s = 0;
    private static final int[][] t = {new int[]{R.attr.state_pressed}, new int[0]};
    private int A;
    private int B;
    private int C;
    private ColorStateList D;
    private int E;
    private ozs F;
    private ozs G;
    private ColorStateList H;
    private ColorStateList I;
    private ColorStateList J;
    private ColorStateList K;
    private boolean L;
    private CharSequence M;
    private ehop N;
    private ehop O;
    private StateListDrawable P;
    private boolean Q;
    private ehop R;
    private ehop S;
    private ehow T;
    private boolean U;
    private final int V;
    private int W;
    public final ehtp a;
    private ValueAnimator aA;
    private boolean aB;
    private boolean aC;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private final Rect af;
    private final Rect ag;
    private final RectF ah;
    private Drawable ai;
    private int aj;
    private Drawable ak;
    private int al;
    private Drawable am;
    private ColorStateList an;
    private ColorStateList ao;
    private int ap;
    private int aq;
    private int ar;
    private ColorStateList as;
    private int at;
    private int au;
    private int av;
    private int aw;
    private int ax;
    private boolean ay;
    private boolean az;
    public final ehtc b;
    public EditText c;
    public final ehth d;
    public boolean e;
    public int f;
    public boolean g;
    public TextView h;
    public CharSequence i;
    public boolean j;
    public TextView k;
    public boolean l;
    public int m;
    public final LinkedHashSet n;
    public int o;
    public boolean p;
    public final ehhs q;
    public boolean r;
    private final FrameLayout u;
    private final int v;
    private CharSequence w;
    private int x;
    private int y;
    private int z;

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private final int E() {
        if (this.L) {
            int i = this.m;
            if (i == 0) {
                return (int) this.q.c();
            }
            if (i == 2) {
                if (ac()) {
                    return (int) (this.q.c() / 2.0f);
                }
                ehhs ehhsVar = this.q;
                return Math.max(0, (int) (ehhsVar.c() - (ehhsVar.b() / 2.0f)));
            }
        }
        return 0;
    }

    private final int F(int i, boolean z) {
        int a;
        if (z) {
            if (f() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingLeft();
        } else {
            if (e() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingLeft();
        }
        return i + a;
    }

    private final int G(int i, boolean z) {
        int a;
        if (z) {
            if (e() != null) {
                a = this.a.a();
            }
            a = this.c.getCompoundPaddingRight();
        } else {
            if (f() != null) {
                a = this.b.a();
            }
            a = this.c.getCompoundPaddingRight();
        }
        return i - a;
    }

    private final Rect H(Rect rect) {
        if (this.c == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.ag;
        boolean k = ehjg.k(this);
        rect2.bottom = rect.bottom;
        int i = this.m;
        if (i == 1) {
            rect2.left = F(rect.left, k);
            rect2.top = rect.top + this.W;
            rect2.right = G(rect.right, k);
            return rect2;
        }
        if (i != 2) {
            rect2.left = F(rect.left, k);
            rect2.top = getPaddingTop();
            rect2.right = G(rect.right, k);
            return rect2;
        }
        rect2.left = rect.left + this.c.getPaddingLeft();
        rect2.top = rect.top - E();
        rect2.right = rect.right - this.c.getPaddingRight();
        return rect2;
    }

    private final Drawable I() {
        if (this.O == null) {
            this.O = K(true);
        }
        return this.O;
    }

    private final ozs J() {
        ozs ozsVar = new ozs();
        ozsVar.b = ehmp.a(getContext(), com.google.android.apps.messaging.R.attr.motionDurationShort2, 87);
        ozsVar.c = ehjz.a(getContext(), com.google.android.apps.messaging.R.attr.motionEasingLinearInterpolator, egyv.a);
        return ozsVar;
    }

    private final ehop K(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_shape_corner_size_small_component);
        EditText editText = this.c;
        float dimensionPixelOffset2 = editText instanceof ehtk ? ((ehtk) editText).b : getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        float f = true != z ? 0.0f : dimensionPixelOffset;
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ehou ehouVar = new ehou();
        ehouVar.f(f);
        ehouVar.h(f);
        ehouVar.b(dimensionPixelOffset);
        ehouVar.d(dimensionPixelOffset);
        ehow ehowVar = new ehow(ehouVar);
        EditText editText2 = this.c;
        ehop F = ehop.F(getContext(), dimensionPixelOffset2, editText2 instanceof ehtk ? ((ehtk) editText2).c : null);
        F.fy(ehowVar);
        ehon ehonVar = F.q;
        if (ehonVar.j == null) {
            ehonVar.j = new Rect();
        }
        F.q.j.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        F.invalidateSelf();
        return F;
    }

    private final void L() {
        if (this.c == null || this.m != 1) {
            return;
        }
        if (!ac()) {
            EditText editText = this.c;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.q.c() + this.v), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            return;
        }
        if (ehmq.g(getContext())) {
            EditText editText2 = this.c;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_2_0_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ehmq.f(getContext())) {
            EditText editText3 = this.c;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_top), this.c.getPaddingEnd(), getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    private final void M() {
        ehop ehopVar = this.N;
        if (ehopVar == null) {
            return;
        }
        ehow G = ehopVar.G();
        ehow ehowVar = this.T;
        if (G != ehowVar) {
            this.N.fy(ehowVar);
        }
        if (this.m == 2 && aa()) {
            this.N.T(this.aa, this.ad);
        }
        int i = this.ae;
        if (this.m == 1) {
            i = kps.g(this.ae, ehdr.c(getContext(), com.google.android.apps.messaging.R.attr.colorSurface, 0));
        }
        this.ae = i;
        this.N.O(ColorStateList.valueOf(i));
        ehop ehopVar2 = this.R;
        if (ehopVar2 != null && this.S != null) {
            if (aa()) {
                ehopVar2.O(this.c.isFocused() ? ColorStateList.valueOf(this.ap) : ColorStateList.valueOf(this.ad));
                this.S.O(ColorStateList.valueOf(this.ad));
            }
            invalidate();
        }
        x();
    }

    private final void N() {
        if (ab()) {
            ((ehsn) this.N).a(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private final void O() {
        TextView textView = this.k;
        if (textView == null || !this.j) {
            return;
        }
        textView.setText((CharSequence) null);
        pav.b(this.u, this.G);
        this.k.setVisibility(4);
    }

    private final void P() {
        int i = this.m;
        if (i == 0) {
            this.N = null;
            this.R = null;
            this.S = null;
        } else if (i == 1) {
            this.N = new ehop(this.T);
            this.R = new ehop();
            this.S = new ehop();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(a.B(i, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.L || (this.N instanceof ehsn)) {
                this.N = new ehop(this.T);
            } else {
                ehow ehowVar = this.T;
                int i2 = ehsn.b;
                if (ehowVar == null) {
                    ehowVar = new ehow();
                }
                this.N = new ehsm(new ehsl(ehowVar, new RectF()));
            }
            this.R = null;
            this.S = null;
        }
        x();
        A();
        if (this.m == 1) {
            if (ehmq.g(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ehmq.f(getContext())) {
                this.W = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        L();
        if (this.m != 0) {
            W();
        }
        EditText editText = this.c;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.m;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(I());
                    return;
                }
                if (i3 == 1) {
                    if (this.P == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.P = stateListDrawable;
                        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, I());
                        this.P.addState(new int[0], K(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.P);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void Q() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Q():void");
    }

    private static void R(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                R((ViewGroup) childAt, z);
            }
        }
    }

    private final void S(boolean z) {
        if (this.j == z) {
            return;
        }
        if (z) {
            TextView textView = this.k;
            if (textView != null) {
                this.u.addView(textView);
                this.k.setVisibility(0);
            }
        } else {
            TextView textView2 = this.k;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.k = null;
        }
        this.j = z;
    }

    private final void T() {
        if (this.h != null) {
            EditText editText = this.c;
            v(editText == null ? null : editText.getText());
        }
    }

    private final void U() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.h;
        if (textView != null) {
            t(textView, this.g ? this.B : this.C);
            if (!this.g && (colorStateList2 = this.H) != null) {
                this.h.setTextColor(colorStateList2);
            }
            if (!this.g || (colorStateList = this.I) == null) {
                return;
            }
            this.h.setTextColor(colorStateList);
        }
    }

    private final void V() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.J;
        if (colorStateList2 == null) {
            colorStateList2 = ehdr.g(getContext(), com.google.android.apps.messaging.R.attr.colorControlActivated);
        }
        EditText editText = this.c;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.c.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((C() || (this.h != null && this.g)) && (colorStateList = this.K) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    private final void W() {
        if (this.m != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.u.getLayoutParams();
            int E = E();
            if (E != layoutParams.topMargin) {
                layoutParams.topMargin = E;
                this.u.requestLayout();
            }
        }
    }

    private final void X(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.c;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.c;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.an;
        if (colorStateList2 != null) {
            this.q.n(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.an;
            this.q.n(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.ax) : this.ax));
        } else if (C()) {
            ehhs ehhsVar = this.q;
            TextView textView2 = this.d.h;
            ehhsVar.n(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.g && (textView = this.h) != null) {
            this.q.n(textView.getTextColors());
        } else if (z4 && (colorStateList = this.ao) != null) {
            this.q.r(colorStateList);
        }
        if (z3 || !this.ay || (isEnabled() && z4)) {
            if (z2 || this.p) {
                ValueAnimator valueAnimator = this.aA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.aA.cancel();
                }
                if (z && this.az) {
                    g(1.0f);
                } else {
                    this.q.A(1.0f);
                }
                this.p = false;
                if (ab()) {
                    Q();
                }
                Y();
                this.a.b(false);
                this.b.e(false);
                return;
            }
            return;
        }
        if (z2 || !this.p) {
            ValueAnimator valueAnimator2 = this.aA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.aA.cancel();
            }
            if (z && this.az) {
                g(0.0f);
            } else {
                this.q.A(0.0f);
            }
            if (ab() && !((ehsn) this.N).a.x.isEmpty()) {
                N();
            }
            this.p = true;
            O();
            this.a.b(true);
            this.b.e(true);
        }
    }

    private final void Y() {
        EditText editText = this.c;
        z(editText == null ? null : editText.getText());
    }

    private final void Z(boolean z, boolean z2) {
        int defaultColor = this.as.getDefaultColor();
        int colorForState = this.as.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.as.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            defaultColor = colorForState2;
        } else if (z2) {
            defaultColor = colorForState;
        }
        this.ad = defaultColor;
    }

    private final boolean aa() {
        return this.aa >= 0 && this.ad != 0;
    }

    private final boolean ab() {
        return this.L && !TextUtils.isEmpty(this.M) && (this.N instanceof ehsn);
    }

    private final boolean ac() {
        return this.q.q == 1;
    }

    private final boolean ad() {
        return this.m == 1 && this.c.getMinLines() <= 1;
    }

    static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    public final void A() {
        int i;
        TextView textView;
        int i2;
        EditText editText;
        EditText editText2;
        if (this.N == null || this.m == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.c) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.c) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.ad = this.ax;
        } else if (!C()) {
            if (!this.g || (textView = this.h) == null) {
                i = z2 ? this.ar : z ? this.aq : this.ap;
            } else if (this.as != null) {
                Z(z2, z);
            } else {
                i = textView.getCurrentTextColor();
            }
            this.ad = i;
        } else if (this.as != null) {
            Z(z2, z);
        } else {
            this.ad = a();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        ehtc ehtcVar = this.b;
        ehtcVar.o();
        ehte.c(ehtcVar.a, ehtcVar.b, ehtcVar.c);
        ehtcVar.f();
        if (ehtcVar.c().u()) {
            if (!ehtcVar.a.C() || ehtcVar.b() == null) {
                ehte.b(ehtcVar.a, ehtcVar.d, ehtcVar.f, ehtcVar.g);
            } else {
                Drawable mutate = ehtcVar.b().mutate();
                mutate.setTint(ehtcVar.a.a());
                ehtcVar.d.setImageDrawable(mutate);
            }
        }
        this.a.c();
        if (this.m == 2) {
            int i3 = this.aa;
            if (z2 && isEnabled()) {
                i2 = this.ac;
                this.aa = i2;
            } else {
                i2 = this.ab;
                this.aa = i2;
            }
            if (i2 != i3 && ab() && !this.p) {
                N();
                Q();
            }
        }
        if (this.m == 1) {
            if (isEnabled()) {
                this.ae = (!z || z2) ? z2 ? this.av : this.at : this.aw;
            } else {
                this.ae = this.au;
            }
        }
        M();
    }

    public final boolean B() {
        return this.d.n;
    }

    public final boolean C() {
        ehth ehthVar = this.d;
        return (ehthVar.e != 1 || ehthVar.h == null || TextUtils.isEmpty(ehthVar.f)) ? false : true;
    }

    public final boolean D() {
        boolean z;
        if (this.c == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((this.a.c.getDrawable() != null || (e() != null && this.a.a.getVisibility() == 0)) && this.a.getMeasuredWidth() > 0) {
            int measuredWidth = this.a.getMeasuredWidth() - this.c.getPaddingLeft();
            if (this.ai == null || this.aj != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.ai = colorDrawable;
                this.aj = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.c.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.ai;
            if (drawable != drawable2) {
                this.c.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.ai != null) {
                Drawable[] compoundDrawablesRelative2 = this.c.getCompoundDrawablesRelative();
                this.c.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.ai = null;
                z = true;
            }
            z = false;
        }
        if ((this.b.s() || ((this.b.q() && this.b.r()) || this.b.h != null)) && this.b.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.b.i.getMeasuredWidth() - this.c.getPaddingRight();
            ehtc ehtcVar = this.b;
            if (ehtcVar.s()) {
                checkableImageButton = ehtcVar.b;
            } else if (ehtcVar.q() && ehtcVar.r()) {
                checkableImageButton = ehtcVar.d;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart();
            }
            Drawable[] compoundDrawablesRelative3 = this.c.getCompoundDrawablesRelative();
            Drawable drawable3 = this.ak;
            if (drawable3 != null && this.al != measuredWidth2) {
                this.al = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.ak, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.ak = colorDrawable2;
                this.al = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.ak;
            if (drawable4 != drawable5) {
                this.am = drawable4;
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.ak != null) {
            Drawable[] compoundDrawablesRelative4 = this.c.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.ak) {
                this.c.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.am, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.ak = null;
            return z2;
        }
        return z;
    }

    public final int a() {
        TextView textView = this.d.h;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 16;
        this.u.addView(view, layoutParams2);
        this.u.setLayoutParams(layoutParams);
        W();
        EditText editText = (EditText) view;
        if (this.c != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.b.e != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.c = editText;
        int i2 = this.x;
        if (i2 != -1) {
            p(i2);
        } else {
            q(this.z);
        }
        int i3 = this.y;
        if (i3 != -1) {
            n(i3);
        } else {
            o(this.A);
        }
        this.Q = false;
        P();
        u(new ehtv(this));
        ehhs ehhsVar = this.q;
        Typeface typeface = this.c.getTypeface();
        boolean G = ehhsVar.G(typeface);
        boolean H = ehhsVar.H(typeface);
        if (G || H) {
            ehhsVar.l();
        }
        this.q.z(this.c.getTextSize());
        ehhs ehhsVar2 = this.q;
        float letterSpacing = this.c.getLetterSpacing();
        if (ehhsVar2.n != letterSpacing) {
            ehhsVar2.n = letterSpacing;
            ehhsVar2.l();
        }
        int gravity = this.c.getGravity();
        this.q.s((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
        this.q.y(gravity);
        this.o = editText.getMinimumHeight();
        this.c.addTextChangedListener(new ehts(this, editText));
        if (this.an == null) {
            this.an = this.c.getHintTextColors();
        }
        if (this.L) {
            if (TextUtils.isEmpty(this.M)) {
                CharSequence hint = this.c.getHint();
                this.w = hint;
                m(hint);
                this.c.setHint((CharSequence) null);
            }
            this.l = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            V();
        }
        if (this.h != null) {
            v(this.c.getText());
        }
        w();
        this.d.b();
        this.a.bringToFront();
        this.b.bringToFront();
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((ehsz) it.next()).a(this);
        }
        this.b.p();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        X(false, true);
    }

    public final CharSequence c() {
        ehth ehthVar = this.d;
        if (ehthVar.g) {
            return ehthVar.f;
        }
        return null;
    }

    public final CharSequence d() {
        if (this.L) {
            return this.M;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        AutofillId autofillId;
        EditText editText = this.c;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.w != null) {
            boolean z = this.l;
            this.l = false;
            CharSequence hint = editText.getHint();
            this.c.setHint(this.w);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.c.setHint(hint);
                this.l = z;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.u.getChildCount());
        for (int i2 = 0; i2 < this.u.getChildCount(); i2++) {
            View childAt = this.u.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.c) {
                newChild.setHint(d());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.r = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.r = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        ehop ehopVar;
        super.draw(canvas);
        if (this.L) {
            this.q.h(canvas);
        }
        if (this.S == null || (ehopVar = this.R) == null) {
            return;
        }
        ehopVar.draw(canvas);
        if (this.c.isFocused()) {
            Rect bounds = this.S.getBounds();
            Rect bounds2 = this.R.getBounds();
            float f = this.q.a;
            int centerX = bounds2.centerX();
            bounds.left = egyv.b(centerX, bounds2.left, f);
            bounds.right = egyv.b(centerX, bounds2.right, f);
            this.S.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        if (this.aB) {
            return;
        }
        this.aB = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        ehhs ehhsVar = this.q;
        boolean I = ehhsVar != null ? ehhsVar.I(drawableState) : false;
        if (this.c != null) {
            y(isLaidOut() && isEnabled());
        }
        w();
        A();
        if (I) {
            invalidate();
        }
        this.aB = false;
    }

    public final CharSequence e() {
        return this.a.b;
    }

    public final CharSequence f() {
        return this.b.h;
    }

    final void g(float f) {
        if (this.q.a == f) {
            return;
        }
        if (this.aA == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.aA = valueAnimator;
            valueAnimator.setInterpolator(ehjz.a(getContext(), com.google.android.apps.messaging.R.attr.motionEasingEmphasizedInterpolator, egyv.b));
            this.aA.setDuration(ehmp.a(getContext(), com.google.android.apps.messaging.R.attr.motionDurationMedium4, 167));
            this.aA.addUpdateListener(new ehtu(this));
        }
        this.aA.setFloatValues(this.q.a, f);
        this.aA.start();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.c;
        return editText != null ? editText.getBaseline() + getPaddingTop() + E() : super.getBaseline();
    }

    public final void h(int i) {
        if (this.ae != i) {
            this.ae = i;
            this.at = i;
            this.av = i;
            this.aw = i;
            M();
        }
    }

    public final void i(boolean z) {
        this.b.l(z);
    }

    public final void j(CharSequence charSequence) {
        if (!this.d.g) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                k(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.d.d();
            return;
        }
        ehth ehthVar = this.d;
        ehthVar.c();
        ehthVar.f = charSequence;
        ehthVar.h.setText(charSequence);
        int i = ehthVar.d;
        if (i != 1) {
            ehthVar.e = 1;
        }
        ehthVar.l(i, ehthVar.e, ehthVar.m(ehthVar.h, charSequence));
    }

    public final void k(boolean z) {
        ehth ehthVar = this.d;
        if (ehthVar.g == z) {
            return;
        }
        ehthVar.c();
        if (z) {
            ehthVar.h = new AppCompatTextView(ehthVar.a);
            ehthVar.h.setId(com.google.android.apps.messaging.R.id.textinput_error);
            ehthVar.h.setTextAlignment(5);
            ehthVar.h(ehthVar.k);
            ehthVar.i(ehthVar.l);
            ehthVar.g(ehthVar.i);
            ehthVar.f(ehthVar.j);
            ehthVar.h.setVisibility(4);
            ehthVar.a(ehthVar.h, 0);
        } else {
            ehthVar.d();
            ehthVar.e(ehthVar.h, 0);
            ehthVar.h = null;
            ehthVar.b.w();
            ehthVar.b.A();
        }
        ehthVar.g = z;
    }

    public final void l(boolean z) {
        ehth ehthVar = this.d;
        if (ehthVar.n == z) {
            return;
        }
        ehthVar.c();
        if (z) {
            ehthVar.o = new AppCompatTextView(ehthVar.a);
            ehthVar.o.setId(com.google.android.apps.messaging.R.id.textinput_helper_text);
            ehthVar.o.setTextAlignment(5);
            ehthVar.o.setVisibility(4);
            ehthVar.o.setAccessibilityLiveRegion(1);
            ehthVar.j(ehthVar.p);
            ehthVar.k(ehthVar.q);
            ehthVar.a(ehthVar.o, 1);
            ehthVar.o.setAccessibilityDelegate(new ehtg(ehthVar));
        } else {
            ehthVar.c();
            int i = ehthVar.d;
            if (i == 2) {
                ehthVar.e = 0;
            }
            ehthVar.l(i, ehthVar.e, ehthVar.m(ehthVar.o, ""));
            ehthVar.e(ehthVar.o, 1);
            ehthVar.o = null;
            ehthVar.b.w();
            ehthVar.b.A();
        }
        ehthVar.n = z;
    }

    public final void m(CharSequence charSequence) {
        if (this.L) {
            if (!TextUtils.equals(charSequence, this.M)) {
                this.M = charSequence;
                this.q.D(charSequence);
                if (!this.p) {
                    Q();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    public final void n(int i) {
        this.y = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public final void o(int i) {
        this.A = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.aC = false;
        if (this.c != null) {
            int max = Math.max(this.b.getMeasuredHeight(), this.a.getMeasuredHeight());
            if (this.c.getMeasuredHeight() < max) {
                this.c.setMinimumHeight(max);
                z = true;
            }
        }
        boolean D = D();
        if (z || D) {
            this.c.post(new Runnable() { // from class: ehtq
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.c.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float d;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.c;
        if (editText != null) {
            Rect rect = this.af;
            ehht.a(this, editText, rect);
            if (this.R != null) {
                this.R.setBounds(rect.left, rect.bottom - this.ab, rect.right, rect.bottom);
            }
            if (this.S != null) {
                this.S.setBounds(rect.left, rect.bottom - this.ac, rect.right, rect.bottom);
            }
            if (this.L) {
                this.q.z(this.c.getTextSize());
                int gravity = this.c.getGravity();
                this.q.s((gravity & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH) | 48);
                this.q.y(gravity);
                this.q.o(H(rect));
                ehhs ehhsVar = this.q;
                if (this.c == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.ag;
                if (ac()) {
                    d = this.q.e();
                } else {
                    d = r8.i * this.q.d();
                }
                rect2.left = rect.left + this.c.getCompoundPaddingLeft();
                if (ad()) {
                    compoundPaddingTop = (int) (rect.centerY() - (d / 2.0f));
                } else {
                    int i5 = 0;
                    if (this.m == 0 && !ac()) {
                        i5 = (int) (this.q.e() / 2.0f);
                    }
                    compoundPaddingTop = (rect.top + this.c.getCompoundPaddingTop()) - i5;
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.c.getCompoundPaddingRight();
                rect2.bottom = ad() ? (int) (rect2.top + d) : rect.bottom - this.c.getCompoundPaddingBottom();
                ehhsVar.t(rect2.left, rect2.top, rect2.right, rect2.bottom);
                this.q.l();
                if (!ab() || this.p) {
                    return;
                }
                Q();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        if (!this.aC) {
            this.b.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.aC = true;
        }
        if (this.k != null && (editText = this.c) != null) {
            this.k.setGravity(editText.getGravity());
            this.k.setPadding(this.c.getCompoundPaddingLeft(), this.c.getCompoundPaddingTop(), this.c.getCompoundPaddingRight(), this.c.getCompoundPaddingBottom());
        }
        this.b.p();
        if (ac()) {
            return;
        }
        int measuredWidth = (this.c.getMeasuredWidth() - this.c.getCompoundPaddingLeft()) - this.c.getCompoundPaddingRight();
        ehhs ehhsVar = this.q;
        ehhsVar.i(ehhsVar.m);
        float f = measuredWidth;
        ehhsVar.s = ehhsVar.g(ehhsVar.r, ehhsVar.m, ehhsVar.k, f * (ehhsVar.g / ehhsVar.f), ehhsVar.l).getHeight();
        ehhsVar.j(ehhsVar.m);
        ehhsVar.t = ehhsVar.g(ehhsVar.q, ehhsVar.m, ehhsVar.k, f, ehhsVar.l).getHeight();
        Rect rect = this.af;
        ehht.a(this, this.c, rect);
        this.q.o(H(rect));
        W();
        L();
        if (this.c == null) {
            return;
        }
        ehhs ehhsVar2 = this.q;
        int i3 = ehhsVar2.t;
        float e = i3 != -1 ? i3 : ehhsVar2.e();
        float f2 = 0.0f;
        if (this.i != null) {
            TextPaint textPaint = new TextPaint(129);
            textPaint.set(this.k.getPaint());
            textPaint.setTextSize(this.k.getTextSize());
            textPaint.setTypeface(((AppCompatTextView) this.k).d);
            textPaint.setLetterSpacing(this.k.getLetterSpacing());
            try {
                ehis ehisVar = new ehis(this.i, textPaint, measuredWidth);
                ehisVar.e = getLayoutDirection() == 1;
                ehisVar.d = true;
                ehisVar.b(this.k.getLineSpacingExtra(), this.k.getLineSpacingMultiplier());
                ehisVar.g = new ehtr(this);
                f2 = ehisVar.a().getHeight() + (this.m == 1 ? this.q.c() + this.W + this.v : 0.0f);
            } catch (ehir e2) {
                Log.e("TextInputLayout", e2.getCause().getMessage(), e2);
            }
        }
        float max = Math.max(e, f2);
        if (this.c.getMeasuredHeight() < max) {
            this.c.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ehty)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ehty ehtyVar = (ehty) parcelable;
        super.onRestoreInstanceState(ehtyVar.d);
        j(ehtyVar.a);
        if (ehtyVar.b) {
            post(new ehtt(this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.U) {
            float a = this.T.f.a(this.ah);
            float a2 = this.T.g.a(this.ah);
            float a3 = this.T.i.a(this.ah);
            float a4 = this.T.h.a(this.ah);
            ehow ehowVar = this.T;
            ehoi ehoiVar = ehowVar.b;
            ehoi ehoiVar2 = ehowVar.c;
            ehoi ehoiVar3 = ehowVar.e;
            ehoi ehoiVar4 = ehowVar.d;
            ehou ehouVar = new ehou();
            ehouVar.e(ehoiVar2);
            ehouVar.g(ehoiVar);
            ehouVar.a(ehoiVar4);
            ehouVar.c(ehoiVar3);
            ehouVar.f(a2);
            ehouVar.h(a);
            ehouVar.b(a4);
            ehouVar.d(a3);
            ehow ehowVar2 = new ehow(ehouVar);
            this.U = z;
            ehop ehopVar = this.N;
            if (ehopVar == null || ehopVar.G() == ehowVar2) {
                return;
            }
            this.T = ehowVar2;
            M();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ehty ehtyVar = new ehty(super.onSaveInstanceState());
        if (C()) {
            ehtyVar.a = c();
        }
        ehtc ehtcVar = this.b;
        boolean z = false;
        if (ehtcVar.q() && ehtcVar.d.a) {
            z = true;
        }
        ehtyVar.b = z;
        return ehtyVar;
    }

    public final void p(int i) {
        this.x = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public final void q(int i) {
        this.z = i;
        EditText editText = this.c;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public final void r(int i) {
        this.E = i;
        TextView textView = this.k;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public final void s(ColorStateList colorStateList) {
        if (this.D != colorStateList) {
            this.D = colorStateList;
            TextView textView = this.k;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        R(this, z);
        super.setEnabled(z);
    }

    public final void t(TextView textView, int i) {
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        textView.setTextAppearance(com.google.android.apps.messaging.R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(getContext().getColor(com.google.android.apps.messaging.R.color.design_error));
    }

    public final void u(ehtv ehtvVar) {
        EditText editText = this.c;
        if (editText != null) {
            kvo.p(editText, ehtvVar);
        }
    }

    public final void v(Editable editable) {
        int b = b(editable);
        boolean z = this.g;
        int i = this.f;
        if (i == -1) {
            this.h.setText(String.valueOf(b));
            this.h.setContentDescription(null);
            this.g = false;
        } else {
            this.g = b > i;
            Context context = getContext();
            TextView textView = this.h;
            int i2 = this.f;
            int i3 = true != this.g ? com.google.android.apps.messaging.R.string.character_counter_content_description : com.google.android.apps.messaging.R.string.character_counter_overflowed_content_description;
            Integer valueOf = Integer.valueOf(b);
            textView.setContentDescription(context.getString(i3, valueOf, Integer.valueOf(i2)));
            if (z != this.g) {
                U();
            }
            this.h.setText(kse.a().b(getContext().getString(com.google.android.apps.messaging.R.string.character_counter_pattern, valueOf, Integer.valueOf(this.f))));
        }
        if (this.c == null || z == this.g) {
            return;
        }
        y(false);
        A();
        w();
    }

    public final void w() {
        Drawable background;
        TextView textView;
        EditText editText = this.c;
        if (editText == null || this.m != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        Rect rect = td.a;
        Drawable mutate = background.mutate();
        if (C()) {
            mutate.setColorFilter(qu.b(a(), PorterDuff.Mode.SRC_IN));
        } else if (this.g && (textView = this.h) != null) {
            mutate.setColorFilter(qu.b(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.c.refreshDrawableState();
        }
    }

    public final void x() {
        Drawable drawable;
        EditText editText = this.c;
        if (editText == null || this.N == null) {
            return;
        }
        if ((this.Q || editText.getBackground() == null) && this.m != 0) {
            EditText editText2 = this.c;
            if (!(editText2 instanceof AutoCompleteTextView) || ehsx.a(editText2)) {
                drawable = this.N;
            } else {
                int b = ehdr.b(this.c, com.google.android.apps.messaging.R.attr.colorControlHighlight);
                int i = this.m;
                if (i == 2) {
                    Context context = getContext();
                    ehop ehopVar = this.N;
                    int[][] iArr = t;
                    int d = ehdr.d(context, com.google.android.apps.messaging.R.attr.colorSurface, "TextInputLayout");
                    ehop ehopVar2 = new ehop(ehopVar.G());
                    int f = ehdr.f(b, d, 0.1f);
                    ehopVar2.O(new ColorStateList(iArr, new int[]{f, 0}));
                    ehopVar2.setTint(d);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{f, d});
                    ehop ehopVar3 = new ehop(ehopVar.G());
                    ehopVar3.setTint(-1);
                    drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, ehopVar2, ehopVar3), ehopVar});
                } else if (i == 1) {
                    ehop ehopVar4 = this.N;
                    int i2 = this.ae;
                    drawable = new RippleDrawable(new ColorStateList(t, new int[]{ehdr.f(b, i2, 0.1f), i2}), ehopVar4, ehopVar4);
                } else {
                    drawable = null;
                }
            }
            this.c.setBackground(drawable);
            this.Q = true;
        }
    }

    public final void y(boolean z) {
        X(z, false);
    }

    public final void z(Editable editable) {
        if (b(editable) != 0 || this.p) {
            O();
            return;
        }
        if (this.k == null || !this.j || TextUtils.isEmpty(this.i)) {
            return;
        }
        this.k.setText(this.i);
        pav.b(this.u, this.F);
        this.k.setVisibility(0);
        this.k.bringToFront();
        announceForAccessibility(this.i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.messaging.R.attr.textInputStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x044b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
