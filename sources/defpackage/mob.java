package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mob extends lss {
    private static final int e = Float.floatToIntBits(Float.NaN);

    private static void o(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == e) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // defpackage.lsr
    public final void f(ByteBuffer byteBuffer) {
        ByteBuffer k;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.b.d;
        if (i2 == 21) {
            k = k((i / 3) * 4);
            while (position < limit) {
                o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), k);
                position += 3;
            }
        } else if (i2 == 22) {
            k = k(i);
            while (position < limit) {
                int i3 = byteBuffer.get(position) & 255;
                int i4 = (byteBuffer.get(position + 1) & 255) << 8;
                o(i3 | i4 | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), k);
                position += 4;
            }
        } else if (i2 == 1342177280) {
            k = k((i / 3) * 4);
            while (position < limit) {
                o(((byteBuffer.get(position + 2) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k);
                position += 3;
            }
        } else {
            if (i2 != 1610612736) {
                throw new IllegalStateException();
            }
            k = k(i);
            while (position < limit) {
                int i5 = byteBuffer.get(position + 3) & 255;
                int i6 = (byteBuffer.get(position + 2) & 255) << 8;
                o(i5 | i6 | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position) & 255) << 24), k);
                position += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        k.flip();
    }

    @Override // defpackage.lss
    public final lsp j(lsp lspVar) {
        int i = lspVar.d;
        int i2 = lvf.a;
        if (i == 21 || i == 1342177280 || i == 22 || i == 1610612736) {
            return new lsp(lspVar.b, lspVar.c, 4);
        }
        if (i == 4) {
            return lsp.a;
        }
        throw new lsq(lspVar);
    }
}
