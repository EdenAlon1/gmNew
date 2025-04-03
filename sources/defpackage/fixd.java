package defpackage;

import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixd {
    private byte[] b = new byte[32];
    public int a = 0;

    private final void i(int i) {
        byte[] bArr = this.b;
        int length = bArr.length;
        int i2 = this.a;
        if (length - i2 >= i) {
            return;
        }
        int i3 = length + length;
        int i4 = i + i2;
        if (i3 < i4) {
            i3 = i4;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        this.b = bArr2;
    }

    private static final void j(long j, int i) {
        if (j < 0 || j > (1 << i)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(j);
            stringBuffer.append(" out of range for ");
            stringBuffer.append(i);
            stringBuffer.append(" bit value");
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public final void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public final void b(byte[] bArr, int i, int i2) {
        i(i2);
        System.arraycopy(bArr, i, this.b, this.a, i2);
        this.a += i2;
    }

    public final void c(byte[] bArr) {
        int length = bArr.length;
        if (length > 255) {
            throw new IllegalArgumentException("Invalid counted string");
        }
        i(length + 1);
        byte[] bArr2 = this.b;
        int i = this.a;
        this.a = i + 1;
        bArr2[i] = (byte) length;
        b(bArr, 0, length);
    }

    public final void d(int i) {
        j(i, 16);
        i(2);
        byte[] bArr = this.b;
        int i2 = this.a;
        int i3 = i2 + 1;
        this.a = i3;
        bArr[i2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        this.a = i2 + 2;
        bArr[i3] = (byte) (i & PrivateKeyType.INVALID);
    }

    public final void e(int i, int i2) {
        j(i, 16);
        if (i2 > this.a - 2) {
            throw new IllegalArgumentException("cannot write past end of data");
        }
        byte[] bArr = this.b;
        bArr[i2] = (byte) ((i >>> 8) & PrivateKeyType.INVALID);
        bArr[i2 + 1] = (byte) (i & PrivateKeyType.INVALID);
    }

    public final void f(long j) {
        j(j, 32);
        i(4);
        byte[] bArr = this.b;
        int i = this.a;
        int i2 = i + 1;
        this.a = i2;
        bArr[i] = (byte) ((j >>> 24) & 255);
        int i3 = i + 2;
        this.a = i3;
        bArr[i2] = (byte) ((j >>> 16) & 255);
        int i4 = i + 3;
        this.a = i4;
        bArr[i3] = (byte) ((j >>> 8) & 255);
        this.a = i + 4;
        bArr[i4] = (byte) (j & 255);
    }

    public final void g(int i) {
        j(i, 8);
        i(1);
        byte[] bArr = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        bArr[i2] = (byte) (i & PrivateKeyType.INVALID);
    }

    public final byte[] h() {
        int i = this.a;
        byte[] bArr = new byte[i];
        System.arraycopy(this.b, 0, bArr, 0, i);
        return bArr;
    }
}
