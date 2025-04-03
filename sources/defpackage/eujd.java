package defpackage;

import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eujd implements etge {
    private static final byte[] a = {0};
    private final etvo b;
    private final int c;
    private final byte[] d;
    private final byte[] e;

    public eujd(ettr ettrVar) {
        this.b = new euja(ettrVar.b.d());
        this.c = ettrVar.a.b;
        this.d = ettrVar.c.c();
        if (ettrVar.a.c.equals(ettx.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    @Override // defpackage.etge
    public final byte[] a(byte[] bArr) {
        byte[] bArr2 = this.e;
        return bArr2.length > 0 ? euhs.b(this.d, this.b.a(euhs.b(bArr, bArr2), this.c)) : euhs.b(this.d, this.b.a(bArr, this.c));
    }

    public eujd(etud etudVar) {
        String valueOf = String.valueOf(String.valueOf(etudVar.a.d));
        this.b = new eujc("HMAC".concat(valueOf), new SecretKeySpec(etudVar.b.d(), "HMAC"));
        this.c = etudVar.a.b;
        this.d = etudVar.c.c();
        if (etudVar.a.c.equals(etul.c)) {
            this.e = Arrays.copyOf(a, 1);
        } else {
            this.e = new byte[0];
        }
    }

    public eujd(etvo etvoVar, int i) {
        this.b = etvoVar;
        this.c = i;
        this.d = new byte[0];
        this.e = new byte[0];
        etvoVar.a(new byte[0], i);
    }
}
