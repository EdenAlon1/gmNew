package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etos implements etfq {
    private final ettb a;

    public etos(ettb ettbVar) {
        this.a = ettbVar;
        if (ettbVar.e()) {
            etsc.a.a();
            etrv.a(ettbVar);
        }
    }

    @Override // defpackage.etfq
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (etta ettaVar : this.a.c(Arrays.copyOfRange(bArr, 0, 5))) {
                try {
                    byte[] a = ((etfq) ettaVar.a).a(bArr, bArr2);
                    int i = ettaVar.c;
                    int length = bArr.length;
                    return a;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (etta ettaVar2 : this.a.d()) {
            try {
                byte[] a2 = ((etfq) ettaVar2.a).a(bArr, bArr2);
                int i2 = ettaVar2.c;
                int length2 = bArr.length;
                return a2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
