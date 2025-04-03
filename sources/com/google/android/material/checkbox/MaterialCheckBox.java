package com.google.android.material.checkbox;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import defpackage.akb$$ExternalSyntheticApiModelOutline0;
import defpackage.ehcy;
import defpackage.ehda;
import defpackage.ehdr;
import defpackage.ehfy;
import defpackage.ehjg;
import defpackage.ku;
import defpackage.pbt;
import defpackage.pbv;
import defpackage.pby;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int a = 2132151503;
    private static final int[] f = {R.attr.state_indeterminate};
    private static final int[] g = {R.attr.state_error};
    private static final int[][] h = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private static final int i = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    public ColorStateList b;
    ColorStateList c;
    public int[] d;
    public CompoundButton.OnCheckedChangeListener e;
    private final LinkedHashSet j;
    private ColorStateList k;
    private boolean l;
    private boolean m;
    private boolean n;
    private CharSequence o;
    private Drawable p;
    private Drawable q;
    private boolean r;
    private PorterDuff.Mode s;
    private int t;
    private boolean u;
    private CharSequence v;
    private final pby w;
    private final pbt x;

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    private final void c() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        pby pbyVar;
        Animator.AnimatorListener animatorListener;
        this.p = ehfy.h(this.p, this.b, getButtonTintMode());
        this.q = ehfy.h(this.q, this.c, this.s);
        if (this.r) {
            pby pbyVar2 = this.w;
            if (pbyVar2 != null) {
                pbt pbtVar = this.x;
                if (pbtVar != null) {
                    Drawable drawable = pbyVar2.e;
                    if (drawable != null) {
                        pby.c((AnimatedVectorDrawable) drawable, pbtVar);
                    }
                    ArrayList arrayList = pbyVar2.c;
                    if (arrayList != null) {
                        arrayList.remove(pbtVar);
                        if (pbyVar2.c.size() == 0 && (animatorListener = pbyVar2.b) != null) {
                            pbyVar2.a.c.removeListener(animatorListener);
                            pbyVar2.b = null;
                        }
                    }
                }
                pby pbyVar3 = this.w;
                pbt pbtVar2 = this.x;
                if (pbtVar2 != null) {
                    Drawable drawable2 = pbyVar3.e;
                    if (drawable2 != null) {
                        pby.b((AnimatedVectorDrawable) drawable2, pbtVar2);
                    } else {
                        if (pbyVar3.c == null) {
                            pbyVar3.c = new ArrayList();
                        }
                        if (!pbyVar3.c.contains(pbtVar2)) {
                            pbyVar3.c.add(pbtVar2);
                            if (pbyVar3.b == null) {
                                pbyVar3.b = new pbv(pbyVar3);
                            }
                            pbyVar3.a.c.addListener(pbyVar3.b);
                        }
                    }
                }
            }
            Drawable drawable3 = this.p;
            if ((drawable3 instanceof AnimatedStateListDrawable) && (pbyVar = this.w) != null) {
                ((AnimatedStateListDrawable) drawable3).addTransition(R.id.checked, R.id.unchecked, pbyVar, false);
                ((AnimatedStateListDrawable) this.p).addTransition(R.id.indeterminate, R.id.unchecked, this.w, false);
            }
        }
        Drawable drawable4 = this.p;
        if (drawable4 != null && (colorStateList2 = this.b) != null) {
            drawable4.setTintList(colorStateList2);
        }
        Drawable drawable5 = this.q;
        if (drawable5 != null && (colorStateList = this.c) != null) {
            drawable5.setTintList(colorStateList);
        }
        super.setButtonDrawable(ehfy.c(this.p, this.q, -1, -1));
        refreshDrawableState();
    }

    private final void d() {
        if (Build.VERSION.SDK_INT < 30 || this.v != null) {
            return;
        }
        int i2 = this.t;
        super.setStateDescription(i2 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i2 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate));
    }

    public final void f(int i2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.t != i2) {
            this.t = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            d();
            if (this.u) {
                return;
            }
            this.u = true;
            LinkedHashSet linkedHashSet = this.j;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    ((ehcy) it.next()).a();
                }
            }
            if (this.t != 2 && (onCheckedChangeListener = this.e) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager m144m = akb$$ExternalSyntheticApiModelOutline0.m144m(getContext().getSystemService(akb$$ExternalSyntheticApiModelOutline0.m148m()));
            if (m144m != null) {
                m144m.notifyValueChanged(this);
            }
            this.u = false;
        }
    }

    @Override // android.widget.CompoundButton
    public final Drawable getButtonDrawable() {
        return this.p;
    }

    @Override // android.widget.CompoundButton
    public final ColorStateList getButtonTintList() {
        return this.b;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.t == 1;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && this.b == null && this.c == null) {
            this.l = true;
            if (this.k == null) {
                int[][] iArr = h;
                int length = iArr.length;
                int b = ehdr.b(this, R.attr.colorControlActivated);
                int b2 = ehdr.b(this, R.attr.colorError);
                int b3 = ehdr.b(this, R.attr.colorSurface);
                int b4 = ehdr.b(this, R.attr.colorOnSurface);
                this.k = new ColorStateList(iArr, new int[]{ehdr.f(b3, b2, 1.0f), ehdr.f(b3, b, 1.0f), ehdr.f(b3, b4, 0.54f), ehdr.f(b3, b4, 0.38f), ehdr.f(b3, b4, 0.38f)});
            }
            setButtonTintList(this.k);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (this.t == 2) {
            mergeDrawableStates(onCreateDrawableState, f);
        }
        if (this.n) {
            mergeDrawableStates(onCreateDrawableState, g);
        }
        this.d = ehfy.g(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.m || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int i2 = true == ehjg.k(this) ? -1 : 1;
        int width = getWidth() - buttonDrawable.getIntrinsicWidth();
        int save = canvas.save();
        int i3 = (width / 2) * i2;
        canvas.translate(i3, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + i3, bounds.top, bounds.right + i3, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.n) {
            accessibilityNodeInfo.setText(String.valueOf(accessibilityNodeInfo.getText()) + ", " + String.valueOf(this.o));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ehda)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ehda ehdaVar = (ehda) parcelable;
        super.onRestoreInstanceState(ehdaVar.getSuperState());
        f(ehdaVar.a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        ehda ehdaVar = new ehda(super.onSaveInstanceState());
        ehdaVar.a = this.t;
        return ehdaVar;
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(int i2) {
        setButtonDrawable(ku.a(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintList(ColorStateList colorStateList) {
        if (this.b == colorStateList) {
            return;
        }
        this.b = colorStateList;
        c();
    }

    @Override // android.widget.CompoundButton
    public final void setButtonTintMode(PorterDuff.Mode mode) {
        hl(mode);
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void setChecked(boolean z) {
        f(z ? 1 : 0);
    }

    @Override // android.widget.CompoundButton
    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.e = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final void setStateDescription(CharSequence charSequence) {
        this.v = charSequence;
        if (charSequence == null) {
            d();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        f(!isChecked() ? 1 : 0);
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // android.support.v7.widget.AppCompatCheckBox, android.widget.CompoundButton
    public final void setButtonDrawable(Drawable drawable) {
        this.p = drawable;
        this.r = false;
        c();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.a
            android.content.Context r8 = defpackage.ehua.a(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.j = r8
            android.content.Context r8 = r7.getContext()
            pby r0 = new pby
            r0.<init>(r8)
            android.content.res.Resources r1 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            java.util.WeakHashMap r2 = defpackage.kpp.a
            r2 = 2131232166(0x7f0805a6, float:1.8080434E38)
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r2, r8)
            android.graphics.drawable.Drawable$Callback r1 = r0.d
            r8.setCallback(r1)
            pbx r1 = new pbx
            android.graphics.drawable.Drawable$ConstantState r2 = r8.getConstantState()
            r1.<init>(r2)
            r0.e = r8
            r7.w = r0
            ehcx r8 = new ehcx
            r8.<init>(r7)
            r7.x = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r8 = r7.getButtonDrawable()
            r7.p = r8
            android.content.res.ColorStateList r8 = r7.b
            r6 = 0
            if (r8 != 0) goto L63
            android.content.res.ColorStateList r8 = super.getButtonTintList()
            if (r8 == 0) goto L62
            android.content.res.ColorStateList r8 = super.getButtonTintList()
            goto L63
        L62:
            r8 = r6
        L63:
            r7.b = r8
            r7.hm()
            int[] r2 = defpackage.ehdb.a
            r8 = 0
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            yt r9 = defpackage.ehiz.b(r0, r1, r2, r3, r4, r5)
            r10 = 2
            android.graphics.drawable.Drawable r10 = r9.h(r10)
            r7.q = r10
            android.graphics.drawable.Drawable r10 = r7.p
            r1 = 1
            if (r10 == 0) goto Lae
            boolean r10 = defpackage.ehiz.e(r0)
            if (r10 == 0) goto Lae
            int r10 = r9.f(r8, r8)
            int r2 = r9.f(r1, r8)
            int r3 = com.google.android.material.checkbox.MaterialCheckBox.i
            if (r10 != r3) goto Lae
            if (r2 != 0) goto Lae
            super.setButtonDrawable(r6)
            r10 = 2131232165(0x7f0805a5, float:1.8080432E38)
            android.graphics.drawable.Drawable r10 = defpackage.ku.a(r0, r10)
            r7.p = r10
            r7.r = r1
            android.graphics.drawable.Drawable r10 = r7.q
            if (r10 != 0) goto Lae
            r10 = 2131232167(0x7f0805a7, float:1.8080436E38)
            android.graphics.drawable.Drawable r10 = defpackage.ku.a(r0, r10)
            r7.q = r10
        Lae:
            r10 = 3
            android.content.res.ColorStateList r10 = defpackage.ehmq.d(r0, r9, r10)
            r7.c = r10
            r10 = 4
            r0 = -1
            int r10 = r9.c(r10, r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = defpackage.ehjg.c(r10, r0)
            r7.s = r10
            r10 = 10
            boolean r10 = r9.p(r10, r8)
            r7.l = r10
            r10 = 6
            boolean r10 = r9.p(r10, r1)
            r7.m = r10
            r10 = 9
            boolean r10 = r9.p(r10, r8)
            r7.n = r10
            r10 = 8
            java.lang.CharSequence r10 = r9.m(r10)
            r7.o = r10
            r10 = 7
            boolean r0 = r9.q(r10)
            if (r0 == 0) goto Lf0
            int r8 = r9.c(r10, r8)
            r7.f(r8)
        Lf0:
            r9.o()
            r7.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
