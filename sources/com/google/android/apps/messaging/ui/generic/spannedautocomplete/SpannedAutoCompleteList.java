package com.google.android.apps.messaging.ui.generic.spannedautocomplete;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.google.android.apps.messaging.R;
import defpackage.dbwo;
import defpackage.dbwp;
import defpackage.ljn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SpannedAutoCompleteList extends LinearLayout {
    public ListView a;
    public boolean b;
    public Animation c;
    private final int d;
    private int e;
    private int f;

    public SpannedAutoCompleteList(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        int i;
        this.b = z;
        Animation animation = this.c;
        if (animation != null) {
            animation.setAnimationListener(null);
            this.c.cancel();
        }
        if (z) {
            setVisibility(0);
            this.a.setVisibility(0);
            if (this.e == 0) {
                return;
            }
        }
        int height = this.a.getHeight();
        if (z) {
            this.a.measure(0, View.MeasureSpec.makeMeasureSpec(this.e, Integer.MIN_VALUE));
            i = this.a.getMeasuredHeight();
        } else {
            i = 0;
        }
        if (height == i) {
            return;
        }
        this.a.setVerticalScrollBarEnabled(false);
        dbwo dbwoVar = new dbwo(this, height, i - height);
        this.c = dbwoVar;
        dbwoVar.setAnimationListener(new dbwp(this));
        this.c.setDuration(this.d);
        this.c.setInterpolator(new ljn());
        this.a.startAnimation(this.c);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ListView) findViewById(R.id.spanned_autocomplete_listview);
        this.f = getContext().getResources().getDisplayMetrics().heightPixels;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.e == 0) {
            Rect rect = new Rect();
            getGlobalVisibleRect(rect);
            if (rect.top > 0) {
                this.e = (this.f - rect.top) - this.a.getTop();
            }
            a(this.b);
        }
    }

    public SpannedAutoCompleteList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = getResources().getInteger(R.integer.spanned_autocomplete_fade_duration);
    }
}
