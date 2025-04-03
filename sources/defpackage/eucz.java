package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eucz implements etgi {
    private final ettb a;

    public eucz(ettb ettbVar) {
        this.a = ettbVar;
        if (ettbVar.e()) {
            etsc.a.a();
            etrv.a(ettbVar);
        }
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("signature too short");
        }
        for (etta ettaVar : this.a.c(Arrays.copyOf(bArr, 5))) {
            try {
                ((etgi) ettaVar.a).a(bArr, bArr2);
                int i = ettaVar.c;
                int length = bArr2.length;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (etta ettaVar2 : this.a.d()) {
            try {
                ((etgi) ettaVar2.a).a(bArr, bArr2);
                int i2 = ettaVar2.c;
                int length2 = bArr2.length;
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
