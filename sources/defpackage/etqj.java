package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etqj implements etpu {
    private final etpp a;
    private final etqg b;

    public etqj(etpp etppVar) {
        etqg etqiVar;
        Provider a;
        this.a = etppVar;
        try {
            int i = etqh.b;
            a = etqr.a();
        } catch (GeneralSecurityException unused) {
            etqiVar = new etqi();
        }
        if (a == null) {
            throw new GeneralSecurityException("Conscrypt is not available.");
        }
        KeyFactory.getInstance("XDH", a);
        KeyAgreement.getInstance("XDH", a);
        etqiVar = new etqh(a);
        etqiVar.a();
        this.b = etqiVar;
    }

    private final byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] b = euhs.b(bArr2, bArr3);
        byte[] c = etqb.c(etqb.b);
        etpp etppVar = this.a;
        return etppVar.e(bArr, b, c, etppVar.a());
    }

    @Override // defpackage.etpu
    public final etpv a(byte[] bArr) {
        etqf a = this.b.a();
        byte[] bArr2 = a.a;
        byte[] bArr3 = a.b;
        return new etpv(d(this.b.b(bArr2, bArr), bArr3, bArr), bArr3);
    }

    @Override // defpackage.etpu
    public final byte[] b(byte[] bArr, etpw etpwVar) {
        return d(this.b.b(etpwVar.a.c(), bArr), bArr, etpwVar.b.c());
    }

    @Override // defpackage.etpu
    public final byte[] c() {
        if (Arrays.equals(this.a.b(), etqb.f)) {
            return etqb.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
