package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class moc extends lss {
    public int e;
    public int f;
    public long g;
    private boolean h;
    private int i;
    private byte[] j = lvf.c;
    private int k;

    @Override // defpackage.lss, defpackage.lsr
    public final long a(long j) {
        return j - lvf.v(this.f + this.e, this.b.b);
    }

    @Override // defpackage.lss, defpackage.lsr
    public final ByteBuffer c() {
        int i;
        if (super.i() && (i = this.k) > 0) {
            k(i).put(this.j, 0, this.k).flip();
            this.k = 0;
        }
        return super.c();
    }

    @Override // defpackage.lsr
    public final void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.i);
        this.g += min / this.b.e;
        this.i -= min;
        byteBuffer.position(position + min);
        if (this.i <= 0) {
            int i2 = i - min;
            int length = (this.k + i2) - this.j.length;
            ByteBuffer k = k(length);
            int d = lvf.d(length, 0, this.k);
            k.put(this.j, 0, d);
            int d2 = lvf.d(length - d, 0, i2);
            byteBuffer.limit(byteBuffer.position() + d2);
            k.put(byteBuffer);
            byteBuffer.limit(limit);
            int i3 = i2 - d2;
            int i4 = this.k - d;
            this.k = i4;
            byte[] bArr = this.j;
            System.arraycopy(bArr, d, bArr, 0, i4);
            byteBuffer.get(this.j, this.k, i3);
            this.k += i3;
            k.flip();
        }
    }

    @Override // defpackage.lss, defpackage.lsr
    public final boolean i() {
        return super.i() && this.k == 0;
    }

    @Override // defpackage.lss
    public final lsp j(lsp lspVar) {
        if (lspVar.d != 2) {
            throw new lsq(lspVar);
        }
        this.h = true;
        return (this.e == 0 && this.f == 0) ? lsp.a : lspVar;
    }

    @Override // defpackage.lss
    protected final void l() {
        if (this.h) {
            this.h = false;
            int i = this.f;
            int i2 = this.b.e;
            this.j = new byte[i * i2];
            this.i = this.e * i2;
        }
        this.k = 0;
    }

    @Override // defpackage.lss
    protected final void m() {
        if (this.h) {
            if (this.k > 0) {
                this.g += r0 / this.b.e;
            }
            this.k = 0;
        }
    }

    @Override // defpackage.lss
    protected final void n() {
        this.j = lvf.c;
    }
}
