package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcv extends rcq {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rcq
    protected final Bitmap c(qxf qxfVar, Bitmap bitmap, int i, int i2) {
        Paint paint = rek.a;
        int min = Math.min(i, i2);
        float f = min;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f2 = width * max;
        float f3 = max * height;
        float f4 = (f - f2) / 2.0f;
        float f5 = (f - f3) / 2.0f;
        RectF rectF = new RectF(f4, f5, f2 + f4, f3 + f5);
        Bitmap d = rek.d(qxfVar, bitmap);
        Bitmap a = qxfVar.a(min, min, rek.a(bitmap));
        a.setHasAlpha(true);
        rek.c.lock();
        float f6 = f / 2.0f;
        try {
            Canvas canvas = new Canvas(a);
            canvas.drawCircle(f6, f6, f6, rek.a);
            canvas.drawBitmap(d, (Rect) null, rectF, rek.b);
            rek.f(canvas);
            rek.c.unlock();
            if (!d.equals(bitmap)) {
                qxfVar.d(d);
            }
            return a;
        } catch (Throwable th) {
            rek.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        return obj instanceof rcv;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return 1101716364;
    }
}
