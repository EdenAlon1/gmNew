package com.google.android.libraries.hats20.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.messaging.R;
import defpackage.dukk;
import defpackage.dulg;
import defpackage.dulh;
import defpackage.euke;
import defpackage.pcj;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class StarRatingBar extends View {
    public int a;
    public dulg b;
    private AccessibilityManager c;
    private Bitmap d;
    private Bitmap e;
    private Paint f;
    private int g;

    public StarRatingBar(Context context) {
        super(context);
        this.a = 11;
        b(context);
    }

    private final float a() {
        return (((getWidth() - getPaddingLeft()) - getPaddingRight()) - this.d.getWidth()) / (this.a - 1);
    }

    private final void b(Context context) {
        this.c = (AccessibilityManager) context.getSystemService("accessibility");
        this.d = d(context, R.drawable.ic_star_grey600_24dp);
        this.e = d(context, R.drawable.ic_star_border_grey600_24dp);
        Paint paint = new Paint(5);
        this.f = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    private final void c(int i) {
        if (i <= 0 || i > this.a || i == this.g) {
            return;
        }
        this.g = i;
        invalidate();
        dulg dulgVar = this.b;
        if (dulgVar != null) {
            int i2 = this.g;
            euke eukeVar = dulgVar.b;
            dulgVar.c.a(dulgVar.a, i2, eukeVar.b);
            dulh dulhVar = dulgVar.c.a;
            if (dulhVar != null) {
                dulhVar.a(i2);
            }
        }
        if (this.c.isEnabled()) {
            sendAccessibilityEvent(4);
        }
    }

    private static final Bitmap d(Context context, int i) {
        pcj b = pcj.b(context.getResources(), i, null);
        Bitmap createBitmap = Bitmap.createBitmap(b.getIntrinsicWidth(), b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        b.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        b.draw(canvas);
        return createBitmap;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        int i = 0;
        while (i < this.a) {
            canvas.drawBitmap(i < this.g ? this.d : this.e, getPaddingLeft() + (i * a()), getPaddingTop(), this.f);
            i++;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 21) {
            c(this.g - 1);
            return true;
        }
        if (i != 22) {
            return super.onKeyDown(i, keyEvent);
        }
        c(this.g + 1);
        return true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize((this.a * this.d.getWidth()) + getPaddingLeft() + getPaddingRight(), i), resolveSize(this.d.getHeight() + getPaddingTop() + getPaddingBottom(), i2));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        dukk dukkVar = (dukk) parcelable;
        super.onRestoreInstanceState(dukkVar.getSuperState());
        this.a = dukkVar.a;
        this.g = dukkVar.b;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        dukk dukkVar = new dukk(super.onSaveInstanceState());
        dukkVar.a = this.a;
        dukkVar.b = this.g;
        return dukkVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action != 0 && action != 2) {
            return false;
        }
        float x = motionEvent.getX();
        motionEvent.getY();
        float a = a();
        float paddingLeft = getPaddingLeft() + (this.d.getWidth() / 2.0f) + (a / 2.0f);
        int i = 1;
        while (paddingLeft < x && i < this.a) {
            paddingLeft += a;
            i++;
        }
        c(i);
        return true;
    }

    public StarRatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 11;
        b(context);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 11;
        b(context);
    }

    public StarRatingBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = 11;
        b(context);
    }
}
