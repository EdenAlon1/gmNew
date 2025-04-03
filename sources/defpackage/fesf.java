package defpackage;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fesf extends feil {
    final ByteBuffer a;

    public fesf(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        this.a = byteBuffer;
    }

    @Override // defpackage.feil, defpackage.fesc
    public final void b() {
        this.a.mark();
    }

    @Override // defpackage.feil, defpackage.fesc
    public final void c() {
        this.a.reset();
    }

    @Override // defpackage.feil, defpackage.fesc
    public final boolean d() {
        return true;
    }

    @Override // defpackage.fesc
    public final int e() {
        a(1);
        return this.a.get() & 255;
    }

    @Override // defpackage.fesc
    public final int f() {
        return this.a.remaining();
    }

    @Override // defpackage.fesc
    public final /* bridge */ /* synthetic */ fesc g(int i) {
        a(i);
        ByteBuffer byteBuffer = this.a;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(byteBuffer.position() + i);
        this.a.position(this.a.position() + i);
        return new fesf(duplicate);
    }

    @Override // defpackage.fesc
    public final void i(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        a(remaining);
        ByteBuffer byteBuffer2 = this.a;
        int limit = byteBuffer2.limit();
        this.a.limit(byteBuffer2.position() + remaining);
        byteBuffer.put(this.a);
        this.a.limit(limit);
    }

    @Override // defpackage.fesc
    public final void j(OutputStream outputStream, int i) {
        a(i);
        if (!this.a.hasArray()) {
            byte[] bArr = new byte[i];
            this.a.get(bArr);
            outputStream.write(bArr);
        } else {
            ByteBuffer byteBuffer = this.a;
            outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), i);
            ByteBuffer byteBuffer2 = this.a;
            byteBuffer2.position(byteBuffer2.position() + i);
        }
    }

    @Override // defpackage.fesc
    public final void k(byte[] bArr, int i, int i2) {
        a(i2);
        this.a.get(bArr, i, i2);
    }

    @Override // defpackage.fesc
    public final void l(int i) {
        a(i);
        this.a.position(this.a.position() + i);
    }
}
