package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rcw implements rcz {
    private final ByteBuffer a;

    public rcw(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.rcz
    public final int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.rcz
    public final int b(byte[] bArr, int i) {
        int min = Math.min(i, this.a.remaining());
        if (min == 0) {
            return -1;
        }
        this.a.get(bArr, 0, min);
        return min;
    }

    @Override // defpackage.rcz
    public final long c(long j) {
        int min = (int) Math.min(this.a.remaining(), j);
        this.a.position(this.a.position() + min);
        return min;
    }

    @Override // defpackage.rcz
    public final short d() {
        if (this.a.remaining() > 0) {
            return (short) (this.a.get() & 255);
        }
        throw new rcy();
    }
}
