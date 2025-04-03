package com.google.android.apps.xeno.libraries.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import defpackage.detg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class CircularImageView extends ImageView {
    private static final ImageView.ScaleType a = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config b = Bitmap.Config.ARGB_8888;
    private final RectF c;
    private final RectF d;
    private final Matrix e;
    private final Paint f;
    private final Paint g;
    private int h;
    private int i;
    private Bitmap j;
    private BitmapShader k;
    private int l;
    private int m;
    private float n;
    private float o;
    private ColorFilter p;
    private boolean q;
    private boolean r;
    private boolean s;

    public CircularImageView(Context context) {
        super(context);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Matrix();
        this.f = new Paint();
        this.g = new Paint();
        this.h = -16777216;
        this.i = 0;
        a();
    }

    private final void a() {
        super.setScaleType(a);
        this.q = true;
        if (this.r) {
            b();
            this.r = false;
        }
    }

    private final void b() {
        float width;
        float height;
        if (!this.q) {
            this.r = true;
            return;
        }
        Bitmap bitmap = this.j;
        if (bitmap == null) {
            return;
        }
        this.k = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        this.f.setAntiAlias(true);
        this.f.setShader(this.k);
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setAntiAlias(true);
        this.g.setColor(this.h);
        this.g.setStrokeWidth(this.i);
        this.m = this.j.getHeight();
        this.l = this.j.getWidth();
        float f = 0.0f;
        this.d.set(0.0f, 0.0f, getWidth(), getHeight());
        this.o = Math.min((this.d.height() - this.i) / 2.0f, (this.d.width() - this.i) / 2.0f);
        this.c.set(this.d);
        if (!this.s) {
            RectF rectF = this.c;
            float f2 = this.i;
            rectF.inset(f2, f2);
        }
        this.n = Math.min(this.c.height() / 2.0f, this.c.width() / 2.0f);
        this.e.set(null);
        if (this.l * this.c.height() > this.c.width() * this.m) {
            width = this.c.height() / this.m;
            f = (this.c.width() - (this.l * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = this.c.width() / this.l;
            height = (this.c.height() - (this.m * width)) * 0.5f;
        }
        this.e.setScale(width, width);
        this.e.postTranslate(((int) (f + 0.5f)) + this.c.left, ((int) (height + 0.5f)) + this.c.top);
        this.k.setLocalMatrix(this.e);
        invalidate();
    }

    private static final Bitmap c(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = drawable instanceof ColorDrawable ? Bitmap.createBitmap(2, 2, b) : Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return a;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.n, this.f);
        if (this.i != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.o, this.g);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override // android.widget.ImageView
    public final void setAdjustViewBounds(boolean z) {
        if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView
    public final void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.p) {
            return;
        }
        this.p = colorFilter;
        this.f.setColorFilter(colorFilter);
        invalidate();
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.j = bitmap;
        b();
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.j = c(drawable);
        b();
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        this.j = c(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.j = c(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != a) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Matrix();
        this.f = new Paint();
        this.g = new Paint();
        this.h = -16777216;
        this.i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, detg.a, i, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.h = obtainStyledAttributes.getColor(0, -16777216);
        this.s = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        a();
    }
}
