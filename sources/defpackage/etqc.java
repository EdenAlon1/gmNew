package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqc implements etfq {
    private final etfq a;
    private final byte[] b;

    public etqc(etfq etfqVar, byte[] bArr) {
        this.a = etfqVar;
        this.b = bArr;
    }

    @Override // defpackage.etfq
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(bArr, bArr2);
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid ciphertext (output prefix mismatch)");
        }
        byte[] bArr4 = this.b;
        return this.a.a(Arrays.copyOfRange(bArr, bArr4.length, bArr.length), bArr2);
    }
}
