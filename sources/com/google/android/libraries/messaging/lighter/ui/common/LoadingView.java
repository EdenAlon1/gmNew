package com.google.android.libraries.messaging.lighter.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.dzyd;
import defpackage.dzyf;
import defpackage.dzyh;
import defpackage.ehdr;
import defpackage.fdql;
import defpackage.kvd;
import defpackage.kvo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class LoadingView extends LinearLayout {
    public LoadingView(Context context) {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(dzyd.a(context, fdql.i()), attributeSet);
        inflate(getContext(), R.layout.loading_view, this);
        GradientDrawable gradientDrawable = (GradientDrawable) getContext().getDrawable(R.drawable.loading_view_bg);
        gradientDrawable.setColor(ehdr.b(this, R.attr.colorSurface));
        setBackground(gradientDrawable);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dzyh.a);
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        TextView textView = (TextView) findViewById(R.id.loading_text);
        if (string == null || string.length() == 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(string);
            textView.setVisibility(0);
        }
        float dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.loading_view_elevation);
        int[] iArr = kvo.a;
        kvd.j(this, dimensionPixelSize);
        setOutlineProvider(new dzyf(getResources().getDimension(R.dimen.loading_view_background_radius)));
        setClipToOutline(false);
    }
}
