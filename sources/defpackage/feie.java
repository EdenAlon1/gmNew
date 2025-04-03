package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feie implements fevx {
    public final ByteBuffer a;

    public feie(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.fevx
    public final int a() {
        return this.a.position();
    }

    @Override // defpackage.fevx
    public final int b() {
        return this.a.remaining();
    }

    @Override // defpackage.fevx
    public final void c(byte b) {
        this.a.put(b);
    }

    @Override // defpackage.fevx
    public final void d(byte[] bArr, int i, int i2) {
        this.a.put(bArr, i, i2);
    }
}
