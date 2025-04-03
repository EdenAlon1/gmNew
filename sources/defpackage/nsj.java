package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nsj {
    public final lsp a;
    public final AtomicLong b;
    private final ByteBuffer c;

    public nsj(lsp lspVar) {
        this.a = lspVar;
        ByteBuffer order = ByteBuffer.allocateDirect(lspVar.e * 1024).order(ByteOrder.nativeOrder());
        this.c = order;
        order.flip();
        this.b = new AtomicLong();
    }

    public final ByteBuffer a() {
        ByteBuffer byteBuffer = this.c;
        long j = this.b.get();
        if (!byteBuffer.hasRemaining()) {
            this.c.clear();
            if (j < this.c.capacity()) {
                this.c.limit((int) j);
            }
            this.b.addAndGet(-this.c.remaining());
        }
        return this.c;
    }

    public final boolean b() {
        return this.c.hasRemaining() || this.b.get() > 0;
    }
}
