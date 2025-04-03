package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.eipy;
import defpackage.eiqa;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExpandableItem extends Item implements View.OnClickListener {
    public boolean b;

    public ExpandableItem() {
        this.b = false;
        new eiqa(this);
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int f() {
        return R.layout.sud_items_expandable;
    }

    public final void g(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.sud_items_expand_button) {
            g(!this.b);
            ImageView imageView = (ImageView) view.findViewById(R.id.sud_items_expand_button);
            if (imageView != null) {
                if (this.b) {
                    imageView.setImageResource(R.drawable.sud_items_collapse_button_icon);
                } else {
                    imageView.setImageResource(R.drawable.sud_items_expand_button_icon);
                }
            }
        }
    }

    public ExpandableItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        new eiqa(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eipy.e);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
    }
}
