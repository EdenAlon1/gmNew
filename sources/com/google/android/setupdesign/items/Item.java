package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eipy;
import defpackage.eiqf;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class Item extends AbstractItem implements eiqf {
    public CharSequence c;
    public boolean d;

    public Item() {
        this.d = true;
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.eiqc
    public final int a() {
        return this.d ? 1 : 0;
    }

    protected int f() {
        return R.layout.sud_items_default;
    }

    public final void h(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (z) {
            e(0);
        } else {
            d(0);
        }
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eipy.o);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.getDrawable(0);
        this.c = obtainStyledAttributes.getText(4);
        obtainStyledAttributes.getText(5);
        obtainStyledAttributes.getText(6);
        obtainStyledAttributes.getResourceId(2, f());
        this.d = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.getColor(8, 0);
        obtainStyledAttributes.getInt(7, 16);
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.eiqf
    public final void i() {
    }
}
