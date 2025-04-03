package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nnw extends nca {
    public nnw(lvc lvcVar, long j, long j2) {
        super(new nbv(), new nnv(lvcVar), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static int g(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
