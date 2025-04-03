package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lxz extends lxs {
    public lqc b;
    public final lxv c = new lxv();
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    private final int h;

    static {
        lqx.b("media3.decoder");
    }

    public lxz(int i) {
        this.h = i;
    }

    private final ByteBuffer k(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new lxy(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    @Override // defpackage.lxs
    public void eO() {
        super.eO();
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final void h(int i) {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = k(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (capacity >= i2) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer k = k(i2);
        k.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            k.put(byteBuffer);
        }
        this.d = k;
    }

    public final void i() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean j() {
        return eQ(1073741824);
    }
}
