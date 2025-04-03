package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpr {
    private static final byte[] d = new byte[0];
    public final etpq a;
    public final byte[] b;
    public final byte[] c;
    private final BigInteger e;
    private final byte[] f;
    private BigInteger g = BigInteger.ZERO;

    private etpr(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, etpq etpqVar) {
        this.c = bArr;
        this.b = bArr2;
        this.f = bArr3;
        this.e = bigInteger;
        this.a = etpqVar;
    }

    static etpr b(byte[] bArr, byte[] bArr2, byte[] bArr3, etpu etpuVar, etpp etppVar, etpq etpqVar, byte[] bArr4) {
        byte[] c = etpuVar.c();
        byte[] b = etppVar.b();
        byte[] b2 = etpqVar.b();
        byte[] bArr5 = etqb.a;
        byte[] b3 = euhs.b(etqb.m, c, b, b2);
        byte[] bArr6 = etqb.l;
        byte[] bArr7 = d;
        byte[] b4 = euhs.b(bArr, etppVar.d(bArr6, bArr7, "psk_id_hash", b3), etppVar.d(etqb.l, bArr4, "info_hash", b3));
        byte[] d2 = etppVar.d(bArr3, bArr7, "secret", b3);
        return new etpr(bArr2, etppVar.c(d2, b4, "key", b3, etpqVar.a()), etppVar.c(d2, b4, "base_nonce", b3, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), etpqVar);
    }

    public final synchronized byte[] a() {
        byte[] c;
        c = euhs.c(this.f, etqq.b(this.g, 12));
        if (this.g.compareTo(this.e) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.g = this.g.add(BigInteger.ONE);
        return c;
    }
}
