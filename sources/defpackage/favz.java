package defpackage;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class favz implements favp {
    private final int a;
    private final int b;
    private final InputStream c;
    private long d;
    private long e;
    private boolean f;
    private long g;

    public favz(InputStream inputStream, long j, int i) {
        if (inputStream.markSupported()) {
            this.c = inputStream;
        } else {
            this.c = new BufferedInputStream(inputStream);
        }
        this.g = j;
        this.a = i;
        i = i != Integer.MAX_VALUE ? i + 1 : i;
        this.b = i;
        this.c.mark(i);
    }

    @Override // defpackage.favp
    public final synchronized int a(byte[] bArr, int i, int i2) {
        emxf.b(65536 - i >= i2, "Cannot read into a buffer smaller than given length");
        if (i2 == 0) {
            return 0;
        }
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        int read = this.c.read(bArr, i, (int) Math.min(i2, this.a - (this.e - this.d)));
        if (read == -1) {
            long j = this.g;
            if (j == -1) {
                this.g = this.e;
            } else if (this.e < j) {
                throw new IOException("The stream ended before all expected bytes were read");
            }
            return 0;
        }
        long j2 = this.e + read;
        this.e = j2;
        long j3 = this.g;
        if (j3 != -1 && j2 > j3) {
            throw new IOException("The stream continues beyond expected size");
        }
        return read;
    }

    @Override // defpackage.favp
    public final synchronized long b() {
        return this.d;
    }

    @Override // defpackage.favp
    public final synchronized long c() {
        return this.a;
    }

    @Override // defpackage.favp, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.c.close();
    }

    @Override // defpackage.favp
    public final synchronized long d() {
        return this.e;
    }

    @Override // defpackage.favp
    public final synchronized long e() {
        return this.g;
    }

    @Override // defpackage.favp
    public final synchronized long f(long j) {
        long min = Math.min(j, this.a - (this.e - this.d));
        long j2 = 0;
        if (min == 0) {
            return 0L;
        }
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        long skip = this.c.skip(min);
        if (skip == 0) {
            if (i()) {
                do {
                    skip = this.c.skip(min);
                } while (skip == 0);
            }
            this.e += j2;
            return j2;
        }
        j2 = skip;
        this.e += j2;
        return j2;
    }

    @Override // defpackage.favp
    public final synchronized void g() {
        if (this.d != this.e) {
            this.c.mark(this.b);
        }
        this.d = this.e;
    }

    @Override // defpackage.favp
    public final synchronized void h() {
        this.e = this.d;
        this.f = true;
    }

    @Override // defpackage.favp
    public final synchronized boolean i() {
        if (this.f) {
            this.c.reset();
            this.f = false;
        }
        if (this.c.available() <= 0) {
            if (this.c.read() != -1) {
                this.c.reset();
                long j = this.e;
                long j2 = this.d;
                while (true) {
                    j -= j2;
                    if (j <= 0) {
                        break;
                    }
                    j2 = this.c.skip(j);
                }
            } else {
                this.g = this.e;
                return false;
            }
        }
        return true;
    }
}
