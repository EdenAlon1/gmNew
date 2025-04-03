package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elkb extends Drawable {
    public long a;
    public long b;
    public ekzx c;
    private final float d;
    private final Paint e;
    private final Paint f;
    private final int g;
    private final int h;
    private final int i;

    public elkb(Context context) {
        Resources resources = context.getResources();
        this.d = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.g = resources.getColor(R.color.quantum_lightblue500);
        this.h = resources.getColor(R.color.quantum_orange500);
        this.i = resources.getColor(R.color.quantum_googred300);
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        paint.setColor(resources.getColor(R.color.quantum_grey300));
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float max;
        Rect bounds = getBounds();
        canvas.drawRect(bounds, this.e);
        if (this.b == 0) {
            this.f.setColor(this.i);
        } else if (this.c.k) {
            this.f.setColor(this.h);
        } else {
            this.f.setColor(this.g);
        }
        long j = this.a;
        long j2 = this.b;
        if (j == j2) {
            f = bounds.left;
            max = bounds.right;
        } else {
            int width = bounds.width();
            long j3 = j2 - j;
            f = (this.c.f * width) / j3;
            max = Math.max(this.d + f, ((r7 + r6.h) * r9) / j3);
        }
        canvas.drawRect(bounds.left + f, bounds.top, bounds.left + max, bounds.bottom, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f.setColorFilter(colorFilter);
    }
}
