package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mna extends lss {
    public int[] e;
    private int[] f;

    @Override // defpackage.lsr
    public final void f(ByteBuffer byteBuffer) {
        int[] iArr = this.f;
        lti.f(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer k = k(((limit - position) / this.b.e) * this.c.e);
        while (position < limit) {
            for (int i : iArr) {
                k.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.b.e;
        }
        byteBuffer.position(limit);
        k.flip();
    }

    @Override // defpackage.lss
    public final lsp j(lsp lspVar) {
        int[] iArr = this.e;
        if (iArr == null) {
            return lsp.a;
        }
        if (lspVar.d != 2) {
            throw new lsq(lspVar);
        }
        boolean z = lspVar.c != iArr.length;
        int i = 0;
        while (true) {
            int length = iArr.length;
            if (i >= length) {
                return z ? new lsp(lspVar.b, length, 2) : lsp.a;
            }
            int i2 = iArr[i];
            if (i2 >= lspVar.c) {
                throw new lsq(lspVar);
            }
            z |= i2 != i;
            i++;
        }
    }

    @Override // defpackage.lss
    protected final void l() {
        this.f = this.e;
    }

    @Override // defpackage.lss
    protected final void n() {
        this.f = null;
        this.e = null;
    }
}
