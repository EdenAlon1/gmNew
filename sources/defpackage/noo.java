package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noo {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long b(luv luvVar, int i, int i2) {
        luvVar.K(i);
        if (luvVar.b() < 5) {
            return -9223372036854775807L;
        }
        int e = luvVar.e();
        if ((8388608 & e) != 0 || ((e >> 8) & 8191) != i2 || (e & 32) == 0 || luvVar.j() < 7 || luvVar.b() < 7 || (luvVar.j() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        luvVar.F(bArr, 0, 6);
        long j = bArr[0];
        long j2 = bArr[1];
        long j3 = bArr[2];
        long j4 = bArr[3] & 255;
        return ((j & 255) << 25) | ((j2 & 255) << 17) | ((j3 & 255) << 9) | (j4 + j4) | ((bArr[4] & 255) >> 7);
    }
}
