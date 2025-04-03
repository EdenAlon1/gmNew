package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhst extends fhss {
    public int a;
    public fhsz b;
    private int i;
    private int j;
    private int k;

    public fhst(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        super(i, i2, i3, i4);
        this.a = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.f = bigInteger3;
        this.g = bigInteger4;
        this.b = new fhsz(this, null, null);
        this.d = c(bigInteger);
        this.e = c(bigInteger2);
        this.h = 6;
    }

    @Override // defpackage.fhsu
    public final fhsx c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > this.a) {
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }
        int i = this.j;
        int i2 = this.k;
        return new fhsw(this.a, (i | i2) == 0 ? new int[]{this.i} : new int[]{this.i, i, i2}, new fhtb(bigInteger));
    }

    @Override // defpackage.fhsu
    protected final fhta d(fhsx fhsxVar, fhsx fhsxVar2) {
        return new fhsz(this, fhsxVar, fhsxVar2);
    }

    @Override // defpackage.fhsu
    public final fhta e() {
        return this.b;
    }

    public fhst(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }
}
