package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.eipy;
import defpackage.eiqc;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SectionItem extends ItemGroup {
    private final Item d;

    public SectionItem() {
        SectionHeaderItem sectionHeaderItem = new SectionHeaderItem();
        this.d = sectionHeaderItem;
        sectionHeaderItem.h(false);
        h(sectionHeaderItem);
    }

    private final void i() {
        if (this.d.d) {
            if (a() == 1) {
                this.d.h(false);
            }
        } else if (a() > 0) {
            Item item = this.d;
            if (item.c != null) {
                item.h(true);
            }
        }
    }

    @Override // com.google.android.setupdesign.items.ItemGroup
    public final void f(eiqc eiqcVar, int i) {
        super.f(eiqcVar, i);
        i();
    }

    @Override // com.google.android.setupdesign.items.ItemGroup
    public final void g(eiqc eiqcVar, int i) {
        super.g(eiqcVar, i);
        i();
    }

    public final void h(eiqc eiqcVar) {
        this.c = true;
        this.b.add(eiqcVar);
        ((AbstractItemHierarchy) eiqcVar).a.add(this);
        if (eiqcVar.a() > 0) {
            e(super.b(eiqcVar));
        }
        i();
    }

    public SectionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eipy.r);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        SectionHeaderItem sectionHeaderItem = new SectionHeaderItem();
        this.d = sectionHeaderItem;
        sectionHeaderItem.c = text;
        sectionHeaderItem.b();
        sectionHeaderItem.h(false);
        h(sectionHeaderItem);
    }
}
