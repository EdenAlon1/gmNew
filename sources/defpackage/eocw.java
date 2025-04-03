package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eocw extends eocs {
    private final ByteBuffer a;

    protected eocw() {
        emxf.a(true);
        this.a = ByteBuffer.allocate(23).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void n() {
        this.a.flip();
        while (this.a.remaining() >= 16) {
            e(this.a);
        }
        this.a.compact();
    }

    private final void o() {
        if (this.a.remaining() < 8) {
            n();
        }
    }

    private final void p(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() <= this.a.remaining()) {
            this.a.put(byteBuffer);
            o();
            return;
        }
        int position = 16 - this.a.position();
        for (int i = 0; i < position; i++) {
            this.a.put(byteBuffer.get());
        }
        n();
        while (byteBuffer.remaining() >= 16) {
            e(byteBuffer);
        }
        this.a.put(byteBuffer);
    }

    protected abstract eodb b();

    @Override // defpackage.eodd
    public final void c(byte b) {
        this.a.put(b);
        o();
    }

    @Override // defpackage.eocs
    public final void d(char c) {
        this.a.putChar(c);
        o();
    }

    protected abstract void e(ByteBuffer byteBuffer);

    @Override // defpackage.eocs, defpackage.eodd
    public final void f(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        try {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            p(byteBuffer);
        } finally {
            byteBuffer.order(order);
        }
    }

    @Override // defpackage.eocs, defpackage.eodd
    public final void g(byte[] bArr, int i) {
        p(ByteBuffer.wrap(bArr, 0, i).order(ByteOrder.LITTLE_ENDIAN));
    }

    protected void m(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.eodd
    public final eodb q() {
        n();
        this.a.flip();
        if (this.a.remaining() > 0) {
            m(this.a);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.limit());
        }
        return b();
    }
}
