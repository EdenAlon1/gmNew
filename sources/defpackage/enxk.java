package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxk {
    public final InputStream a;

    public enxk(InputStream inputStream) {
        this.a = inputStream;
    }

    public final byte a() {
        return enxj.a(this.a);
    }

    public final double b() {
        InputStream inputStream = this.a;
        return Double.longBitsToDouble(((enxj.a(inputStream) & 255) << 56) | (enxj.a(inputStream) & 255) | ((enxj.a(inputStream) & 255) << 8) | ((enxj.a(inputStream) & 255) << 16) | ((enxj.a(inputStream) & 255) << 24) | ((enxj.a(inputStream) & 255) << 32) | ((enxj.a(inputStream) & 255) << 40) | ((enxj.a(inputStream) & 255) << 48));
    }

    public final int c() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    public final int d() {
        return (int) e();
    }

    public final long e() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((enxj.a(this.a) & 128) == 0) {
                return j;
            }
        }
        throw new IOException("Malformed varint.");
    }
}
