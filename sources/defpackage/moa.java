package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class moa extends lss {
    public boolean e;
    public long f;
    private int g;
    private int h;
    private byte[] j;
    private byte[] m;
    private int i = 0;
    private int k = 0;
    private int l = 0;

    public moa() {
        lti.a(true);
        this.j = lvf.c;
        this.m = lvf.c;
    }

    private final int o(int i) {
        int i2 = this.g;
        return (i / i2) * i2;
    }

    private final int p(int i) {
        int q = ((q(2000000L) - this.i) * this.g) - (this.j.length >> 1);
        lti.c(q >= 0);
        return o((int) Math.min((i * 0.2f) + 0.5f, q));
    }

    private final int q(long j) {
        return (int) ((j * this.b.b) / 1000000);
    }

    private static int r(byte b, byte b2) {
        return (b << 8) | (b2 & 255);
    }

    private final void s(boolean z) {
        int i;
        int i2;
        int i3 = this.l;
        int length = this.j.length;
        if (i3 != length) {
            if (!z) {
                return;
            } else {
                z = true;
            }
        }
        if (this.i == 0) {
            if (z) {
                t(i3, 3);
                i2 = i3;
            } else {
                lti.c(i3 >= (length >> 1));
                i2 = this.j.length >> 1;
                t(i2, 0);
            }
            i = i2;
        } else {
            int i4 = length >> 1;
            int i5 = i3 - i4;
            if (z) {
                int p = p(i5) + (this.j.length >> 1);
                t(p, 2);
                int i6 = i4 + i5;
                i = p;
                i2 = i6;
            } else {
                int p2 = p(i5);
                t(p2, 1);
                i = p2;
                i2 = i5;
            }
        }
        lti.d(i2 % this.g == 0, a.h(i2, "bytesConsumed is not aligned to frame size: %s"));
        lti.c(i3 >= i);
        this.l -= i2;
        int i7 = this.k + i2;
        this.k = i7;
        this.k = i7 % this.j.length;
        this.i = this.i + (i / this.g);
        this.f += (i2 - i) / r2;
    }

    private final void t(int i, int i2) {
        int i3;
        if (i == 0) {
            return;
        }
        lti.a(this.l >= i);
        if (i2 == 2) {
            int i4 = this.k;
            int i5 = this.l;
            int i6 = i4 + i5;
            byte[] bArr = this.j;
            int length = bArr.length;
            if (i6 <= length) {
                System.arraycopy(bArr, i6 - i, this.m, 0, i);
            } else {
                int i7 = i5 - (length - i4);
                if (i7 >= i) {
                    System.arraycopy(bArr, i7 - i, this.m, 0, i);
                } else {
                    int i8 = i - i7;
                    System.arraycopy(bArr, length - i8, this.m, 0, i8);
                    System.arraycopy(this.j, 0, this.m, i8, i7);
                }
            }
        } else {
            int i9 = this.k;
            int i10 = i9 + i;
            byte[] bArr2 = this.j;
            int length2 = bArr2.length;
            if (i10 <= length2) {
                System.arraycopy(bArr2, i9, this.m, 0, i);
            } else {
                int i11 = length2 - i9;
                System.arraycopy(bArr2, i9, this.m, 0, i11);
                System.arraycopy(this.j, 0, this.m, i11, i - i11);
            }
        }
        lti.b(i % this.g == 0, a.h(i, "sizeToOutput is not aligned to frame size: "));
        lti.c(this.k < this.j.length);
        byte[] bArr3 = this.m;
        lti.b(i % this.g == 0, a.h(i, "byteOutput size is not aligned to frame size "));
        if (i2 != 3) {
            for (int i12 = 0; i12 < i; i12 += 2) {
                int i13 = i12 + 1;
                int r = r(bArr3[i13], bArr3[i12]);
                if (i2 == 0) {
                    i3 = ((((i12 * 1000) / (i - 1)) * (-90)) / 1000) + 100;
                } else {
                    i3 = 10;
                    if (i2 == 2) {
                        i3 = 10 + (((90000 * i12) / (i - 1)) / 1000);
                    }
                }
                int i14 = (r * i3) / 100;
                if (i14 >= 32767) {
                    bArr3[i12] = -1;
                    bArr3[i13] = Byte.MAX_VALUE;
                } else if (i14 <= -32768) {
                    bArr3[i12] = 0;
                    bArr3[i13] = Byte.MIN_VALUE;
                } else {
                    bArr3[i12] = (byte) (i14 & PrivateKeyType.INVALID);
                    bArr3[i13] = (byte) (i14 >> 8);
                }
            }
        }
        k(i).put(bArr3, 0, i).flip();
    }

    private static final boolean u(byte b, byte b2) {
        return Math.abs(r(b, b2)) > 1024;
    }

    @Override // defpackage.lsr
    public final void f(ByteBuffer byteBuffer) {
        int limit;
        int i;
        int position;
        while (byteBuffer.hasRemaining() && !this.d.hasRemaining()) {
            if (this.h != 0) {
                lti.c(this.k < this.j.length);
                int limit2 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    } else {
                        if (u(byteBuffer.get(position2), byteBuffer.get(position2 - 1))) {
                            int i2 = this.g;
                            limit = i2 * (position2 / i2);
                            break;
                        }
                        position2 += 2;
                    }
                }
                int position3 = limit - byteBuffer.position();
                int i3 = this.k;
                int i4 = this.l;
                int i5 = i3 + i4;
                int length = this.j.length;
                if (i5 < length) {
                    i = length - i5;
                } else {
                    i5 = i4 - (length - i3);
                    i = i3 - i5;
                }
                int min = Math.min(position3, i);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.j, i5, min);
                int i6 = this.l + min;
                this.l = i6;
                lti.c(i6 <= this.j.length);
                boolean z = limit < limit2 && position3 < i;
                s(z);
                if (z) {
                    this.h = 0;
                    this.i = 0;
                }
                byteBuffer.limit(limit2);
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.j.length));
                int limit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit4 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else {
                        if (u(byteBuffer.get(limit4), byteBuffer.get(limit4 - 1))) {
                            int i7 = this.g;
                            position = ((limit4 / i7) * i7) + i7;
                            break;
                        }
                        limit4 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.h = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // defpackage.lss, defpackage.lsr
    public final boolean h() {
        return super.h() && this.e;
    }

    @Override // defpackage.lss
    protected final lsp j(lsp lspVar) {
        if (lspVar.d == 2) {
            return lspVar.b == -1 ? lsp.a : lspVar;
        }
        throw new lsq(lspVar);
    }

    @Override // defpackage.lss
    public final void l() {
        if (h()) {
            int i = this.b.c;
            this.g = i + i;
            int o = o(q(100000L) / 2);
            int i2 = o + o;
            if (this.j.length != i2) {
                this.j = new byte[i2];
                this.m = new byte[i2];
            }
        }
        this.h = 0;
        this.f = 0L;
        this.i = 0;
        this.k = 0;
        this.l = 0;
    }

    @Override // defpackage.lss
    public final void m() {
        if (this.l > 0) {
            s(true);
            this.i = 0;
        }
    }

    @Override // defpackage.lss
    public final void n() {
        this.e = false;
        this.j = lvf.c;
        this.m = lvf.c;
    }
}
