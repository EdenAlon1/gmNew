package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegd {
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eegp a(java.io.InputStream r13) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eegd.a(java.io.InputStream):eegp");
    }

    private static void b(InputStream inputStream, byte[] bArr, int i) {
        int i2 = 0;
        while (i2 < i) {
            try {
                i2 += inputStream.read(bArr, i2, i - i2);
            } catch (IndexOutOfBoundsException e) {
                throw new IOException("Invalid ID length", e);
            }
        }
    }
}
