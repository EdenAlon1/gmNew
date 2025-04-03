package com.google.android.libraries.messaging.lighter.ui.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.messaging.R;
import defpackage.dzpb;
import defpackage.dzxr;
import defpackage.dzxu;
import defpackage.dzxv;
import defpackage.dzxx;
import defpackage.dzxz;
import defpackage.dzyd;
import defpackage.dzyk;
import defpackage.ehdr;
import defpackage.fdql;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ContactAvatarView extends RelativeLayout implements dzxv {
    public ImageView a;
    public int[] b;
    public int c;
    public int d;
    public Bitmap e;
    private final dzxu f;

    public ContactAvatarView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.dzxv
    public final void b(dzpb dzpbVar) {
        Bitmap b = this.f.b(dzpbVar, this.d, new dzxx(this));
        this.e = b;
        this.a.setImageBitmap(b);
    }

    @Override // defpackage.dzys
    public final void c() {
        this.e = null;
    }

    public ContactAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(dzyd.a(context, fdql.i()), attributeSet, i);
        TypedArray obtainTypedArray;
        this.f = dzxu.a();
        inflate(getContext(), R.layout.avatar_view_layout, this);
        this.a = (ImageView) findViewById(R.id.avatar_icon);
        setClickable(true);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dzxz.b, i, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, dzyk.a(getContext(), 60.0f));
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            obtainTypedArray = getResources().obtainTypedArray(resourceId);
        } else {
            obtainTypedArray = getResources().obtainTypedArray(R.array.avatar_bg_colors_default_array);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            this.c = getContext().getColor(resourceId2);
        } else {
            this.c = ehdr.b(this, R.attr.colorSurface);
        }
        this.b = new int[obtainTypedArray.length()];
        for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
            this.b[i2] = obtainTypedArray.getColor(i2, -7829368);
        }
        obtainTypedArray.recycle();
        obtainStyledAttributes.recycle();
        dzxr.a();
    }
}
