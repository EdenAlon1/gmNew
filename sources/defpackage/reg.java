package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class reg extends rcq {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(a);
    private final int c;

    public reg(int i) {
        rkf.b(i > 0, "roundingRadius must be greater than 0.");
        this.c = i;
    }

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.rcq
    protected final Bitmap c(qxf qxfVar, Bitmap bitmap, int i, int i2) {
        int i3 = this.c;
        boolean z = i3 > 0;
        Paint paint = rek.a;
        rkf.b(z, "roundingRadius must be greater than 0.");
        Bitmap.Config a = rek.a(bitmap);
        Bitmap d = rek.d(qxfVar, bitmap);
        Bitmap a2 = qxfVar.a(d.getWidth(), d.getHeight(), a);
        a2.setHasAlpha(true);
        BitmapShader bitmapShader = new BitmapShader(d, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, a2.getWidth(), a2.getHeight());
        rek.c.lock();
        try {
            Canvas canvas = new Canvas(a2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
            rek.f(canvas);
            rek.c.unlock();
            if (!d.equals(bitmap)) {
                qxfVar.d(d);
            }
            return a2;
        } catch (Throwable th) {
            rek.c.unlock();
            throw th;
        }
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        return (obj instanceof reg) && this.c == ((reg) obj).c;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return rkh.e(-569625254, rkh.d(this.c));
    }
}
