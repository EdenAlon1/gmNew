package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eues implements etgi {
    private final etgi a;
    private final byte[] b;
    private final byte[] c;

    public eues(etgi etgiVar, byte[] bArr, byte[] bArr2) {
        this.a = etgiVar;
        this.b = bArr;
        this.c = bArr2;
    }

    public static byte[] b(ettd ettdVar) {
        return ettdVar.d.equals(euag.LEGACY) ? new byte[]{0} : new byte[0];
    }

    public static byte[] c(ettd ettdVar) {
        int ordinal = ettdVar.d.ordinal();
        if (ordinal == 1) {
            return etsi.b(ettdVar.e.intValue()).c();
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return etsi.a.c();
            }
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
        }
        return etsi.a(ettdVar.e.intValue()).c();
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.b;
        if (bArr3.length == 0 && this.c.length == 0) {
            this.a.a(bArr, bArr2);
            return;
        }
        if (!ettp.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        byte[] bArr4 = this.c;
        if (bArr4.length != 0) {
            bArr2 = euhs.b(bArr2, bArr4);
        }
        this.a.a(Arrays.copyOfRange(bArr, this.b.length, bArr.length), bArr2);
    }
}
