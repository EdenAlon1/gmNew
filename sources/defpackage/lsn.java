package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsn {
    public static boolean a(lsp lspVar) {
        if (lspVar.b == -1 || lspVar.c == -1) {
            return false;
        }
        int i = lspVar.d;
        return i == 2 || i == 4;
    }

    public static void b(ByteBuffer byteBuffer, lsp lspVar, ByteBuffer byteBuffer2, lsp lspVar2, lsu lsuVar, int i, boolean z) {
        int i2 = lspVar.d;
        int i3 = lspVar2.d;
        int i4 = lsuVar.a;
        float[] fArr = new float[i4];
        int i5 = lsuVar.b;
        float[] fArr2 = new float[i5];
        for (int i6 = 0; i6 < i; i6++) {
            boolean z2 = i3 == 2;
            if (z) {
                int position = byteBuffer2.position();
                for (int i7 = 0; i7 < i5; i7++) {
                    fArr2[i7] = c(byteBuffer2, z2, z2);
                }
                byteBuffer2.position(position);
            }
            for (int i8 = 0; i8 < i4; i8++) {
                fArr[i8] = c(byteBuffer, i2 == 2, z2);
            }
            for (int i9 = 0; i9 < i5; i9++) {
                for (int i10 = 0; i10 < i4; i10++) {
                    fArr2[i9] = fArr2[i9] + (fArr[i10] * lsuVar.a(i10, i9));
                }
                if (z2) {
                    byteBuffer2.putShort((short) lvf.a(fArr2[i9], -32768.0f, 32767.0f));
                } else {
                    byteBuffer2.putFloat(lvf.a(fArr2[i9], -1.0f, 1.0f));
                }
                fArr2[i9] = 0.0f;
            }
        }
    }

    private static float c(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return byteBuffer.getShort();
            }
            float f = byteBuffer.getFloat();
            return lvf.a(f * (f >= 0.0f ? 32767 : 32768), -32768.0f, 32767.0f);
        }
        if (!z) {
            return byteBuffer.getFloat();
        }
        short s = byteBuffer.getShort();
        return s / (s >= 0 ? 32767 : 32768);
    }
}
