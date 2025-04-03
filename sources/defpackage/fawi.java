package defpackage;

import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fawi implements favp {
    private final byte[] a;
    private int b;
    private int c;

    public fawi(String str) {
        this.a = str.getBytes(StandardCharsets.UTF_8);
    }

    @Override // defpackage.favp
    public final synchronized int a(byte[] bArr, int i, int i2) {
        emxf.b(65536 - i >= i2, "Buffer length too small.");
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.b;
        int length = this.a.length;
        if (i3 == length) {
            return 0;
        }
        int min = Math.min(i2, length - i3);
        for (int i4 = 0; i4 < min; i4++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            bArr[i + i4] = bArr2[i5];
            this.b = i5 + 1;
        }
        return min;
    }

    @Override // defpackage.favp
    public final synchronized long b() {
        return this.c;
    }

    @Override // defpackage.favp
    public final synchronized long c() {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.favp, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
    }

    @Override // defpackage.favp
    public final synchronized long d() {
        return this.b;
    }

    @Override // defpackage.favp
    public final synchronized long e() {
        return this.a.length;
    }

    @Override // defpackage.favp
    public final synchronized long f(long j) {
        long min;
        min = Math.min(j, this.a.length - this.b);
        this.b = (int) (this.b + min);
        return min;
    }

    @Override // defpackage.favp
    public final synchronized void g() {
        this.c = this.b;
    }

    @Override // defpackage.favp
    public final synchronized void h() {
        this.b = this.c;
    }

    @Override // defpackage.favp
    public final synchronized boolean i() {
        return this.b < this.a.length;
    }
}
