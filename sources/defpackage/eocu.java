package defpackage;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eocu extends ByteArrayOutputStream {
    public eocu(int i) {
        super(i);
    }

    final int a() {
        return this.count;
    }

    final void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (this.count + remaining > this.buf.length) {
            this.buf = Arrays.copyOf(this.buf, this.count + remaining);
        }
        byteBuffer.get(this.buf, this.count, remaining);
        this.count += remaining;
    }

    final byte[] c() {
        return this.buf;
    }
}
