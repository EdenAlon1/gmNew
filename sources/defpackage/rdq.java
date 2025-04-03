package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdq extends rcq {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(a);

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rcq
    protected final Bitmap c(qxf qxfVar, Bitmap bitmap, int i, int i2) {
        return rek.c(qxfVar, bitmap, i, i2);
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        return obj instanceof rdq;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return 1572326941;
    }
}
