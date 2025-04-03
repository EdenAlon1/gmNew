package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eipy;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class IllustrationItem extends Item {
    IllustrationItem() {
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int f() {
        return R.layout.sud_illustration_item;
    }

    public IllustrationItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eipy.l);
        obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }
}
