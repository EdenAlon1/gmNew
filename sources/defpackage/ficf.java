package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficf extends fhqo {
    public int b;
    public byte[] c;

    public ficf(int i, byte[] bArr) {
        super(true);
        int i2;
        int length = bArr.length;
        if (i == 5) {
            i2 = 5224;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.h(i, "unknown security category: "));
            }
            i2 = 12392;
        }
        if (length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.b = i;
        this.c = fics.c(bArr);
    }
}
