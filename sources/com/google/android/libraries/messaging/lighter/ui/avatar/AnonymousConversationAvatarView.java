package com.google.android.libraries.messaging.lighter.ui.avatar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.apps.messaging.R;
import defpackage.dzxo;
import defpackage.dzxr;
import defpackage.dzxy;
import defpackage.dzxz;
import defpackage.dzyk;
import defpackage.ehdr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AnonymousConversationAvatarView extends RelativeLayout implements dzxy {
    ImageView a;
    ImageView b;
    public int[] c;
    int d;

    public AnonymousConversationAvatarView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    @Override // defpackage.dzxy
    public final void b(int i) {
        this.d = i;
    }

    @Override // defpackage.dzys
    public final void c() {
        this.b.setImageBitmap(null);
    }

    @Override // defpackage.dzxy
    public final void d() {
        this.b.setVisibility(0);
    }

    public AnonymousConversationAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AnonymousConversationAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainTypedArray;
        dzxo.a();
        inflate(getContext(), R.layout.avatar_view_layout, this);
        this.a = (ImageView) findViewById(R.id.avatar_icon);
        this.b = (ImageView) findViewById(R.id.avatar_badge);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dzxz.a, i, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(2, dzyk.a(getContext(), 60.0f));
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            obtainTypedArray = getResources().obtainTypedArray(resourceId);
        } else {
            obtainTypedArray = getResources().obtainTypedArray(R.array.avatar_bg_colors_default_array);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        if (resourceId2 != 0) {
            getContext().getColor(resourceId2);
        } else {
            ehdr.b(this, R.attr.colorSurface);
            this.c = new int[obtainTypedArray.length()];
            for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                this.c[i2] = obtainTypedArray.getColor(i2, -7829368);
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        dzxr.a();
        int i3 = this.d;
        Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Paint paint = new Paint();
        paint.setColor(0);
        float f = i3 / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        ImageView imageView = this.a;
        int i4 = this.d;
        imageView.setImageBitmap(Bitmap.createScaledBitmap(createBitmap, i4, i4, false));
    }
}
