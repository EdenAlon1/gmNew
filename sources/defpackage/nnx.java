package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nnx {
    public boolean c;
    public boolean d;
    public boolean e;
    public final lvc a = new lvc(0);
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public final luv b = new luv();

    public static long a(luv luvVar) {
        int i = luvVar.b;
        if (luvVar.b() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        luvVar.F(bArr, 0, 9);
        luvVar.K(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j = b;
        long j2 = b2;
        long j3 = (248 & j2) >> 3;
        long j4 = (bArr[1] & 255) << 20;
        long j5 = (j2 & 3) << 13;
        return j5 | j4 | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    public static final int c(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void b(ncp ncpVar) {
        this.b.H(lvf.c);
        this.c = true;
        ncpVar.k();
    }
}
