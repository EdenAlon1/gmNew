package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rct extends rcq {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rcq
    protected final Bitmap c(qxf qxfVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        Paint paint = rek.a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = i2;
        float f4 = i;
        float f5 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f = f3 / bitmap.getHeight();
            f2 = 0.0f;
            f5 = (f4 - (bitmap.getWidth() * f)) * 0.5f;
        } else {
            float width = f4 / bitmap.getWidth();
            float height = (f3 - (bitmap.getHeight() * width)) * 0.5f;
            f = width;
            f2 = height;
        }
        matrix.setScale(f, f);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f2 + 0.5f));
        Bitmap a = qxfVar.a(i, i2, rek.b(bitmap));
        rek.g(bitmap, a);
        rek.e(bitmap, a, matrix);
        return a;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        return obj instanceof rct;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return -599754482;
    }
}
