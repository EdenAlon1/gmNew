package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ficg extends fhqo {
    public int b;
    public byte[] c;

    public ficg(int i, byte[] bArr) {
        super(false);
        int i2;
        if (i == 5) {
            i2 = 14880;
        } else {
            if (i != 6) {
                throw new IllegalArgumentException(a.h(i, "unknown security category: "));
            }
            i2 = 38432;
        }
        if (bArr.length != i2) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.b = i;
        this.c = fics.c(bArr);
    }
}
