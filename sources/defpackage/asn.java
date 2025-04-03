package defpackage;

import android.media.Image;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class asn implements avq {
    private final Image.Plane a;

    public asn(Image.Plane plane) {
        this.a = plane;
    }

    @Override // defpackage.avq
    public final int a() {
        return this.a.getPixelStride();
    }

    @Override // defpackage.avq
    public final int b() {
        return this.a.getRowStride();
    }

    @Override // defpackage.avq
    public final ByteBuffer c() {
        return this.a.getBuffer();
    }
}
