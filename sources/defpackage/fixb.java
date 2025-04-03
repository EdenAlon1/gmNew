package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fixb {
    public final ByteBuffer a;
    public int b = -1;
    public int c = -1;

    public fixb(byte[] bArr) {
        this.a = ByteBuffer.wrap(bArr);
    }

    private final void k(int i) {
        if (i > d()) {
            throw new fjan("end of input");
        }
    }

    public final int a() {
        return this.a.position();
    }

    public final int b() {
        k(2);
        return (char) this.a.getShort();
    }

    public final int c() {
        k(1);
        return this.a.get() & 255;
    }

    public final int d() {
        return this.a.remaining();
    }

    public final long e() {
        k(4);
        return this.a.getInt() & 4294967295L;
    }

    public final void f(byte[] bArr, int i, int i2) {
        k(i2);
        this.a.get(bArr, i, i2);
    }

    public final void g(int i) {
        ByteBuffer byteBuffer = this.a;
        if (i > byteBuffer.capacity() - byteBuffer.position()) {
            throw new IllegalArgumentException("cannot set active region past end of input");
        }
        ByteBuffer byteBuffer2 = this.a;
        byteBuffer2.limit(byteBuffer2.position() + i);
    }

    public final byte[] h() {
        int d = d();
        byte[] bArr = new byte[d];
        this.a.get(bArr, 0, d);
        return bArr;
    }

    public final byte[] i(int i) {
        k(i);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        return bArr;
    }

    public final byte[] j() {
        return i(c());
    }
}
