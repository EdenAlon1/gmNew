package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etpd implements etpg {
    private final ethf a;
    private final int b;

    public etpd(ethf ethfVar) {
        this.a = ethfVar;
        this.b = ethfVar.a + ethfVar.b;
    }

    private final etfk d(byte[] bArr) {
        byte[] copyOf = Arrays.copyOf(bArr, this.a.a);
        ethf ethfVar = this.a;
        int i = ethfVar.a;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, ethfVar.b + i);
        return euig.c(etgw.a(this.a, eujv.c(copyOf), eujv.c(copyOfRange), null));
    }

    @Override // defpackage.etpg
    public final int a() {
        return this.b;
    }

    @Override // defpackage.etpg
    public final byte[] b(byte[] bArr, byte[] bArr2, int i) {
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return d(bArr).a(Arrays.copyOfRange(bArr2, i, length), etph.a);
    }

    @Override // defpackage.etpg
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        return euhs.b(bArr2, bArr3, d(bArr).b(bArr4, etph.a));
    }
}
