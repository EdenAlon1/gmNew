package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etps implements etfq {
    private static final byte[] a = new byte[0];
    private final etpw b;
    private final etpu c;
    private final etpq d;
    private final int e;
    private final byte[] f;
    private final etpp g;

    private etps(etpw etpwVar, etpu etpuVar, etpp etppVar, etpq etpqVar, int i, eujt eujtVar) {
        this.b = etpwVar;
        this.c = etpuVar;
        this.g = etppVar;
        this.d = etpqVar;
        this.e = i;
        this.f = eujtVar.c();
    }

    public static etfq b(etoc etocVar) {
        int i;
        etob c = etocVar.c();
        etpu d = etpt.d(c.a);
        etpp e = etpt.e(c.b);
        etpq c2 = etpt.c(c.c);
        etnz etnzVar = c.a;
        if (etnzVar.equals(etnz.f)) {
            i = 32;
        } else if (etnzVar.equals(etnz.a)) {
            i = 65;
        } else if (etnzVar.equals(etnz.b)) {
            i = 97;
        } else {
            if (!etnzVar.equals(etnz.c)) {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            i = 133;
        }
        int i2 = i;
        etnz etnzVar2 = etocVar.c().a;
        if (etnzVar2.equals(etnz.f) || etnzVar2.equals(etnz.a) || etnzVar2.equals(etnz.b) || etnzVar2.equals(etnz.c)) {
            return new etps(new etpw(eujt.b(etocVar.b.d()), etocVar.a.b), d, e, c2, i2, etocVar.f());
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    @Override // defpackage.etfq
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.f;
        int length2 = bArr3.length + this.e;
        if (length < length2) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.f.length, length2);
        etpw etpwVar = this.b;
        etpu etpuVar = this.c;
        etpp etppVar = this.g;
        etpq etpqVar = this.d;
        etpr b = etpr.b(etqb.a, copyOfRange, etpuVar.b(copyOfRange, etpwVar), etpuVar, etppVar, etpqVar, bArr4);
        byte[] bArr5 = a;
        return b.a.c(b.b, b.a(), bArr, length2, bArr5);
    }
}
