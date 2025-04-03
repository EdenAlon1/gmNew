package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rcu extends rcq {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(a);

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rcq
    protected final Bitmap c(qxf qxfVar, Bitmap bitmap, int i, int i2) {
        Paint paint = rek.a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return rek.c(qxfVar, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        return obj instanceof rcu;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return -670243078;
    }
}
