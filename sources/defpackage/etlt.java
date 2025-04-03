package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etlt implements etfk {
    private final etfk a;
    private final byte[] b;

    public etlt(etfk etfkVar, byte[] bArr) {
        this.a = etfkVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.b = bArr;
    }

    public static etfk c(etfk etfkVar, eujt eujtVar) {
        return new etlt(etfkVar, eujtVar.c());
    }

    @Override // defpackage.etfk
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0) {
            return this.a.a(bArr, null);
        }
        if (ettp.e(bArr3, bArr)) {
            return this.a.a(Arrays.copyOfRange(bArr, 5, bArr.length), null);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    @Override // defpackage.etfk
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        return bArr3.length == 0 ? this.a.b(bArr, null) : euhs.b(bArr3, this.a.b(bArr, null));
    }
}
