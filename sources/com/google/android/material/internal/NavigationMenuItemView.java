package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import defpackage.ehhz;
import defpackage.ehii;
import defpackage.ktb;
import defpackage.kvo;
import defpackage.og;
import defpackage.or;
import defpackage.tz;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationMenuItemView extends ehhz implements or {
    private static final int[] e = {R.attr.state_checked};
    public boolean c;
    boolean d;
    private int f;
    private final CheckedTextView g;
    private FrameLayout h;
    private og i;
    private final ktb j;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    @Override // defpackage.or
    public final og a() {
        return this.i;
    }

    @Override // defpackage.or
    public final boolean e() {
        return false;
    }

    @Override // defpackage.or
    public final void f(og ogVar) {
        StateListDrawable stateListDrawable;
        this.i = ogVar;
        int i = ogVar.a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(true != ogVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(e, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        boolean isCheckable = ogVar.isCheckable();
        refreshDrawableState();
        if (this.c != isCheckable) {
            this.c = isCheckable;
            this.j.e(this.g, 2048);
        }
        boolean isChecked = ogVar.isChecked();
        refreshDrawableState();
        this.g.setChecked(isChecked);
        CheckedTextView checkedTextView = this.g;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (isChecked && this.d) ? 1 : 0);
        setEnabled(ogVar.isEnabled());
        this.g.setText(ogVar.e);
        Drawable icon = ogVar.getIcon();
        if (icon != null) {
            int i2 = this.f;
            icon.setBounds(0, 0, i2, i2);
        }
        this.g.setCompoundDrawablesRelative(icon, null, null, null);
        View actionView = ogVar.getActionView();
        if (actionView != null) {
            if (this.h == null) {
                this.h = (FrameLayout) ((ViewStub) findViewById(com.google.android.apps.messaging.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (actionView.getParent() != null) {
                ((ViewGroup) actionView.getParent()).removeView(actionView);
            }
            this.h.removeAllViews();
            this.h.addView(actionView);
        }
        setContentDescription(ogVar.m);
        setTooltipText(ogVar.n);
        og ogVar2 = this.i;
        if (ogVar2.e == null && ogVar2.getIcon() == null && this.i.getActionView() != null) {
            this.g.setVisibility(8);
            FrameLayout frameLayout = this.h;
            if (frameLayout != null) {
                tz tzVar = (tz) frameLayout.getLayoutParams();
                tzVar.width = -1;
                this.h.setLayoutParams(tzVar);
                return;
            }
            return;
        }
        this.g.setVisibility(0);
        FrameLayout frameLayout2 = this.h;
        if (frameLayout2 != null) {
            tz tzVar2 = (tz) frameLayout2.getLayoutParams();
            tzVar2.width = -2;
            this.h.setLayoutParams(tzVar2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        og ogVar = this.i;
        if (ogVar != null && ogVar.isCheckable() && ogVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, e);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        ehii ehiiVar = new ehii(this);
        this.j = ehiiVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.google.android.apps.messaging.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f = context.getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.google.android.apps.messaging.R.id.design_menu_item_text);
        this.g = checkedTextView;
        kvo.p(checkedTextView, ehiiVar);
    }
}
