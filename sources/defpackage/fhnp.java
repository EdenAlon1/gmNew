package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnp implements fhmv {
    public final fhnv a;
    public final fhmt b = new fhmt();
    public boolean c;

    public fhnp(fhnv fhnvVar) {
        this.a = fhnvVar;
    }

    @Override // defpackage.fhmv
    public final void B(long j) {
        if (!E(j)) {
            throw new EOFException();
        }
    }

    @Override // defpackage.fhmv
    public final void C(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            fhmt fhmtVar = this.b;
            if (fhmtVar.b == 0 && this.a.b(fhmtVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.b.b);
            this.b.C(min);
            j -= min;
        }
    }

    @Override // defpackage.fhmv
    public final boolean D() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fhmt fhmtVar = this.b;
        return fhmtVar.D() && this.a.b(fhmtVar, 8192L) == -1;
    }

    @Override // defpackage.fhmv
    public final boolean E(long j) {
        fhmt fhmtVar;
        if (j < 0) {
            throw new IllegalArgumentException(a.s(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            fhmtVar = this.b;
            if (fhmtVar.b >= j) {
                return true;
            }
        } while (this.a.b(fhmtVar, 8192L) != -1);
        return false;
    }

    @Override // defpackage.fhmv
    public final byte[] F() {
        this.b.N(this.a);
        return this.b.F();
    }

    @Override // defpackage.fhmv
    public final byte[] G(long j) {
        B(j);
        return this.b.G(j);
    }

    @Override // defpackage.fhmv
    public final void I(fhnt fhntVar) {
        while (this.a.b(this.b, 8192L) != -1) {
            long h = this.b.h();
            if (h > 0) {
                fhntVar.id(this.b, h);
            }
        }
        fhmt fhmtVar = this.b;
        long j = fhmtVar.b;
        if (j > 0) {
            fhntVar.id(fhmtVar, j);
        }
    }

    @Override // defpackage.fhnv
    public final fhnx a() {
        return this.a.a();
    }

    @Override // defpackage.fhnv
    public final long b(fhmt fhmtVar, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.s(j, "byteCount < 0: "));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fhmt fhmtVar2 = this.b;
        if (fhmtVar2.b == 0 && this.a.b(fhmtVar2, 8192L) == -1) {
            return -1L;
        }
        return this.b.b(fhmtVar, Math.min(j, this.b.b));
    }

    public final int c() {
        B(4L);
        int f = this.b.f();
        int i = f >>> 24;
        int i2 = 16711680 & f;
        int i3 = 65280 & f;
        return ((f & PrivateKeyType.INVALID) << 24) | i | (i2 >>> 8) | (i3 << 8);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.fhnv
    public final void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.close();
        this.b.A();
    }

    @Override // defpackage.fhmv
    public final byte d() {
        B(1L);
        return this.b.d();
    }

    public final long e() {
        return h((byte) 0, Long.MAX_VALUE);
    }

    @Override // defpackage.fhmv
    public final int f() {
        B(4L);
        return this.b.f();
    }

    @Override // defpackage.fhmv
    public final int g(fhnh fhnhVar) {
        fhnhVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int a = fhnz.a(this.b, fhnhVar, true);
            if (a != -2) {
                if (a != -1) {
                    this.b.C(fhnhVar.b[a].b());
                    return a;
                }
            } else if (this.a.b(this.b, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    public final long h(byte b, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long j2 = 0;
        while (j2 < j) {
            byte b2 = b;
            long j3 = j;
            long i = this.b.i(b2, j2, j3);
            if (i != -1) {
                return i;
            }
            fhmt fhmtVar = this.b;
            long j4 = fhmtVar.b;
            if (j4 >= j3 || this.a.b(fhmtVar, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, j4);
            b = b2;
            j = j3;
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015c A[SYNTHETIC] */
    @Override // defpackage.fhmv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(defpackage.fhmx r19) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhnp.j(fhmx):long");
    }

    @Override // defpackage.fhmv
    public final InputStream k() {
        return new fhno(this);
    }

    @Override // defpackage.fhmv
    public final String o() {
        return p(Long.MAX_VALUE);
    }

    @Override // defpackage.fhmv
    public final String p(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(a.s(j, "limit < 0: "));
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long h = h((byte) 10, j2);
        if (h != -1) {
            return fhnz.b(this.b, h);
        }
        if (j2 < Long.MAX_VALUE && E(j2) && this.b.c((-1) + j2) == 13 && E(1 + j2) && this.b.c(j2) == 10) {
            return fhnz.b(this.b, j2);
        }
        fhmt fhmtVar = new fhmt();
        fhmt fhmtVar2 = this.b;
        fhmtVar2.H(fhmtVar, 0L, Math.min(32L, fhmtVar2.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b.b, j) + " content=" + fhmtVar.t().d() + "…");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        fhmt fhmtVar = this.b;
        if (fhmtVar.b == 0 && this.a.b(fhmtVar, 8192L) == -1) {
            return -1;
        }
        return this.b.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // defpackage.fhmv
    public final fhmx u(long j) {
        B(j);
        return this.b.u(j);
    }

    @Override // defpackage.fhmv
    public final short y() {
        B(2L);
        return this.b.y();
    }
}
