package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhuk extends fhum {
    protected static final short c(int i) {
        return (short) ((i >>> 21) ^ ((((i >>> 9) & 4088) ^ ((i & 4095) ^ (i >>> 12))) ^ ((i >>> 18) & 56)));
    }

    protected static final short d(short s) {
        return c(fhti.a(s));
    }

    @Override // defpackage.fhum
    public final short a(short s) {
        short b = b(d(s), s);
        short b2 = b(d(d(b)), b);
        return d(b(d(b(d(d(b(d(d(d(d(b2)))), b2))), b)), s));
    }

    @Override // defpackage.fhum
    public final short b(short s, short s2) {
        int i = (s2 & 1) * s;
        for (int i2 = 1; i2 < 12; i2++) {
            i ^= ((1 << i2) & s2) * s;
        }
        return c(i);
    }
}
