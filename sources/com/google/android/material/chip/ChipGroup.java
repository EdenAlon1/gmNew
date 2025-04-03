package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.messaging.R;
import defpackage.ehdi;
import defpackage.ehdj;
import defpackage.ehdk;
import defpackage.ehdl;
import defpackage.ehdm;
import defpackage.ehhm;
import defpackage.ehhy;
import defpackage.ehib;
import defpackage.ehiz;
import defpackage.ehua;
import defpackage.kxs;
import defpackage.kxu;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ChipGroup extends ehhy {
    public final ehhm a;
    public ehdj b;
    private int g;
    private int h;
    private final int i;
    private final ehdl j;

    public ChipGroup(Context context) {
        this(context, null);
    }

    public final int a() {
        return this.a.a();
    }

    public final boolean b(int i) {
        return getChildAt(i).getVisibility() == 0;
    }

    public final boolean c() {
        return this.a.c;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof ehdk);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ehdk();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ehdk(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.i;
        if (i != -1) {
            ehhm ehhmVar = this.a;
            ehib ehibVar = (ehib) ehhmVar.a.get(Integer.valueOf(i));
            if (ehibVar != null && ehhmVar.d(ehibVar)) {
                ehhmVar.c();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        kxu kxuVar = new kxu(accessibilityNodeInfo);
        if (this.e) {
            i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if ((getChildAt(i2) instanceof Chip) && b(i2)) {
                    i++;
                }
            }
        } else {
            i = -1;
        }
        kxuVar.t(kxs.a(this.f, i, true != c() ? 2 : 1));
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.a = onHierarchyChangeListener;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ehdk(layoutParams);
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, i);
        ehhm ehhmVar = new ehhm();
        this.a = ehhmVar;
        this.j = new ehdl(this);
        TypedArray a = ehiz.a(getContext(), attributeSet, ehdm.b, i, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = a.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = a.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.g != dimensionPixelOffset2) {
            this.g = dimensionPixelOffset2;
            this.d = dimensionPixelOffset2;
            requestLayout();
        }
        int dimensionPixelOffset3 = a.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.h != dimensionPixelOffset3) {
            this.h = dimensionPixelOffset3;
            this.c = dimensionPixelOffset3;
            requestLayout();
        }
        this.e = a.getBoolean(5, false);
        boolean z = a.getBoolean(6, false);
        if (ehhmVar.c != z) {
            ehhmVar.c = z;
            boolean isEmpty = ehhmVar.b.isEmpty();
            Iterator it = ehhmVar.a.values().iterator();
            while (it.hasNext()) {
                ehhmVar.e((ehib) it.next(), false);
            }
            if (!isEmpty) {
                ehhmVar.c();
            }
        }
        this.a.d = a.getBoolean(4, false);
        this.i = a.getResourceId(0, -1);
        a.recycle();
        this.a.e = new ehdi(this);
        super.setOnHierarchyChangeListener(this.j);
        setImportantForAccessibility(1);
    }
}
