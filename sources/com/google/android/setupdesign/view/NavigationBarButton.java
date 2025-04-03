package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import defpackage.eirh;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class NavigationBarButton extends Button {
    public NavigationBarButton(Context context) {
        super(context);
        a();
    }

    private final void a() {
        if (isInEditMode()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        for (int i = 0; i < compoundDrawablesRelative.length; i++) {
            Drawable drawable = compoundDrawablesRelative[i];
            if (drawable != null) {
                compoundDrawablesRelative[i] = eirh.a(drawable);
            }
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    private final void b() {
        ColorStateList textColors = getTextColors();
        if (textColors != null) {
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable drawable = compoundDrawables[0];
            Drawable drawable2 = compoundDrawables[1];
            Drawable drawable3 = compoundDrawables[2];
            Drawable drawable4 = compoundDrawables[3];
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            Drawable[] drawableArr = {drawable, drawable2, drawable3, drawable4, compoundDrawablesRelative[0], compoundDrawablesRelative[2]};
            for (int i = 0; i < 6; i++) {
                Drawable drawable5 = drawableArr[i];
                if (drawable5 instanceof eirh) {
                    eirh eirhVar = (eirh) drawable5;
                    eirhVar.a = textColors;
                    if (eirhVar.b()) {
                        eirhVar.invalidateSelf();
                    }
                }
            }
            invalidate();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = eirh.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = eirh.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = eirh.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = eirh.a(drawable4);
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            drawable = eirh.a(drawable);
        }
        if (drawable2 != null) {
            drawable2 = eirh.a(drawable2);
        }
        if (drawable3 != null) {
            drawable3 = eirh.a(drawable3);
        }
        if (drawable4 != null) {
            drawable4 = eirh.a(drawable4);
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public final void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        b();
    }

    public NavigationBarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
