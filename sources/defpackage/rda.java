package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rda implements rcz {
    private final InputStream a;

    public rda(InputStream inputStream) {
        this.a = inputStream;
    }

    @Override // defpackage.rcz
    public final int a() {
        return (d() << 8) | d();
    }

    @Override // defpackage.rcz
    public final int b(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new rcy();
        }
        return i2;
    }

    @Override // defpackage.rcz
    public final long c(long j) {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.a.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else {
                if (this.a.read() == -1) {
                    break;
                }
                j2--;
            }
        }
        return j - j2;
    }

    @Override // defpackage.rcz
    public final short d() {
        int read = this.a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new rcy();
    }
}
