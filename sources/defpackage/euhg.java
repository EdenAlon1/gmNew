package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euhg extends euiy {
    public final int a;
    public final int b;
    private final String c;
    private final int d;
    private final int e;
    private final String f;
    private final byte[] g;

    public euhg(eufk eufkVar) {
        if (!etmj.a(1)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC streaming in FIPS-mode.");
        }
        this.g = eufkVar.b.d();
        String str = "HmacSha512";
        this.f = eufkVar.a.a.equals(eufp.a) ? "HmacSha1" : eufkVar.a.a.equals(eufp.b) ? "HmacSha256" : eufkVar.a.a.equals(eufp.c) ? "HmacSha512" : "";
        this.a = eufkVar.a.c();
        if (eufkVar.a.b.equals(eufp.a)) {
            str = "HmacSha1";
        } else if (eufkVar.a.b.equals(eufp.b)) {
            str = "HmacSha256";
        } else if (!eufkVar.a.b.equals(eufp.c)) {
            str = "";
        }
        this.c = str;
        int d = eufkVar.a.d();
        this.b = d;
        int b = eufkVar.a.b();
        this.d = b;
        this.e = b - d;
    }

    public static Cipher i() {
        return (Cipher) euil.a.a("AES/CTR/NoPadding");
    }

    public static final byte[] n(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(16);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        eujp.c(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        allocate.putInt(0);
        return allocate.array();
    }

    @Override // defpackage.euiy
    public final int c() {
        return e();
    }

    @Override // defpackage.euiy
    public final int d() {
        return this.d;
    }

    @Override // defpackage.euiy
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.euiy
    public final int f() {
        return this.e;
    }

    @Override // defpackage.euiy
    public final /* synthetic */ eujl g() {
        return new euhe(this);
    }

    @Override // defpackage.euiy
    public final /* synthetic */ eujm h(byte[] bArr) {
        return new euhf(this, bArr);
    }

    public final Mac j() {
        return (Mac) euil.b.a(this.c);
    }

    public final SecretKeySpec k(byte[] bArr) {
        return new SecretKeySpec(bArr, this.a, 32, this.c);
    }

    public final SecretKeySpec l(byte[] bArr) {
        return new SecretKeySpec(bArr, 0, this.a, "AES");
    }

    public final byte[] m(byte[] bArr, byte[] bArr2) {
        return euiw.b(this.f, this.g, bArr, bArr2, this.a + 32);
    }
}
