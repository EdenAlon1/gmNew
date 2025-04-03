package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etov implements etfr {
    final ettb a;

    public etov(ettb ettbVar) {
        this.a = ettbVar;
        if (ettbVar.e()) {
            etsc.a.a();
            etrv.a(ettbVar);
        }
    }

    @Override // defpackage.etfr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        etta ettaVar = this.a.a;
        if (ettaVar == null) {
            throw new GeneralSecurityException("keyset without primary key");
        }
        byte[] a = ((etfr) ettaVar.a).a(bArr, bArr2);
        int i = this.a.a.c;
        int length = bArr.length;
        return a;
    }
}
