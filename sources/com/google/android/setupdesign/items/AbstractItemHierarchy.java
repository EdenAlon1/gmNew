package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import defpackage.a;
import defpackage.eipy;
import defpackage.eiqc;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class AbstractItemHierarchy implements eiqc {
    public final ArrayList a = new ArrayList();

    public AbstractItemHierarchy() {
    }

    public final void c(int i) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", a.h(i, "notifyItemRangeChanged: Invalid position="));
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ItemGroup itemGroup = (ItemGroup) arrayList.get(i2);
            int b = itemGroup.b(this);
            if (b >= 0) {
                itemGroup.c(b + i);
            } else {
                Log.e("ItemGroup", "Unexpected child change ".concat(toString()));
            }
        }
    }

    public final void d(int i) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", a.h(i, "notifyItemRangeInserted: Invalid position="));
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ItemGroup) arrayList.get(i2)).f(this, i);
        }
    }

    public final void e(int i) {
        if (i < 0) {
            Log.w("AbstractItemHierarchy", a.h(i, "notifyItemRangeInserted: Invalid position="));
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ItemGroup) arrayList.get(i2)).g(this, i);
        }
    }

    public AbstractItemHierarchy(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eipy.a);
        obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
    }
}
