package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bib {
    static final Charset a = StandardCharsets.US_ASCII;
    static final String[] b = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final /* synthetic */ int g = 0;
    public final int d;
    public final int e;
    public final byte[] f;

    public bib(int i, int i2, byte[] bArr) {
        this.d = i;
        this.e = i2;
        this.f = bArr;
    }

    public static bib b(long j, ByteOrder byteOrder) {
        return c(new long[]{j}, byteOrder);
    }

    public static bib c(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[c[4] * jArr.length]);
        wrap.order(byteOrder);
        int i = 0;
        while (true) {
            int length = jArr.length;
            if (i >= length) {
                return new bib(4, length, wrap.array());
            }
            wrap.putInt((int) jArr[i]);
            i++;
        }
    }

    public final int a() {
        return c[this.d] * this.e;
    }

    public final String toString() {
        return "(" + b[this.d] + ", data length:" + this.f.length + ")";
    }
}
