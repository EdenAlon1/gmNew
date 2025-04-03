package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crkj extends rcq {
    private static final byte[] b = "com.google.android.apps.messaging.shared.ui.glide.HorizontalFlip".getBytes(a);

    @Override // defpackage.qtp
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.rcq
    protected final Bitmap c(qxf qxfVar, Bitmap bitmap, int i, int i2) {
        return rek.i(bitmap, 2);
    }

    @Override // defpackage.qtp
    public final boolean equals(Object obj) {
        return obj instanceof crkj;
    }

    @Override // defpackage.qtp
    public final int hashCode() {
        return -1018665206;
    }
}
