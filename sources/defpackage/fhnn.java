package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhnn implements fhmu {
    public final fhnt a;
    public final fhmt b = new fhmt();
    public boolean c;

    public fhnn(fhnt fhntVar) {
        this.a = fhntVar;
    }

    @Override // defpackage.fhmu
    public final void K(fhmx fhmxVar) {
        fhmxVar.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.K(fhmxVar);
        c();
    }

    @Override // defpackage.fhmu
    public final void M(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.M(bArr, i, i2);
        c();
    }

    @Override // defpackage.fhmu
    public final void P(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.O(i);
        c();
    }

    @Override // defpackage.fhmu
    public final void R(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.Q(i);
        c();
    }

    @Override // defpackage.fhmu
    public final void S(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fhmt fhmtVar = this.b;
        fhnq x = fhmtVar.x(2);
        byte[] bArr = x.a;
        int i2 = x.c;
        bArr[i2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i2 + 1] = (byte) (i & PrivateKeyType.INVALID);
        x.c = i2 + 2;
        fhmtVar.b += 2;
        c();
    }

    @Override // defpackage.fhmu
    public final void Y(byte[] bArr) {
        bArr.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.Y(bArr);
        c();
    }

    @Override // defpackage.fhnt
    public final fhnx a() {
        return this.a.a();
    }

    @Override // defpackage.fhmu
    public final void aa(String str) {
        str.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.aa(str);
        c();
    }

    public final void c() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long h = this.b.h();
        if (h > 0) {
            this.a.id(this.b, h);
        }
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, defpackage.fhnt
    public final void close() {
        Throwable th;
        if (this.c) {
            return;
        }
        try {
            fhmt fhmtVar = this.b;
            long j = fhmtVar.b;
            th = null;
            if (j > 0) {
                this.a.id(fhmtVar, j);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.a.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.fhmu, defpackage.fhnt, java.io.Flushable
    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        fhmt fhmtVar = this.b;
        long j = fhmtVar.b;
        if (j > 0) {
            this.a.id(fhmtVar, j);
        }
        this.a.flush();
    }

    @Override // defpackage.fhnt
    public final void id(fhmt fhmtVar, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.id(fhmtVar, j);
        c();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.fhmu
    public final fhmt q() {
        return this.b;
    }

    @Override // defpackage.fhmu
    public final fhmt r() {
        return this.b;
    }

    @Override // defpackage.fhmu
    public final fhmu s(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.b.Z(j);
        c();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.a + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int write = this.b.write(byteBuffer);
        c();
        return write;
    }
}
