package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euho extends euiy {
    public final int a;
    private final int b;
    private final int c;
    private final String d;
    private final byte[] e;

    public euho(eufr eufrVar) {
        String str;
        this.e = eufrVar.b.d();
        if (eufrVar.a.a.equals(eufy.a)) {
            str = "HmacSha1";
        } else if (eufrVar.a.a.equals(eufy.b)) {
            str = "HmacSha256";
        } else {
            if (!eufrVar.a.a.equals(eufy.c)) {
                throw new GeneralSecurityException("Unknown HKDF algorithm ".concat(String.valueOf(String.valueOf(eufrVar.a.a))));
            }
            str = "HmacSha512";
        }
        this.d = str;
        this.a = eufrVar.a.c();
        int b = eufrVar.a.b();
        this.b = b;
        this.c = b - 16;
    }

    public static Cipher i() {
        return (Cipher) euil.a.a("AES/GCM/NoPadding");
    }

    public static GCMParameterSpec j(byte[] bArr, long j, boolean z) {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.put(bArr);
        eujp.c(allocate, j);
        allocate.put(z ? (byte) 1 : (byte) 0);
        return new GCMParameterSpec(128, allocate.array());
    }

    @Override // defpackage.euiy
    public final int c() {
        return e();
    }

    @Override // defpackage.euiy
    public final int d() {
        return this.b;
    }

    @Override // defpackage.euiy
    public final int e() {
        return this.a + 8;
    }

    @Override // defpackage.euiy
    public final int f() {
        return this.c;
    }

    @Override // defpackage.euiy
    public final /* synthetic */ eujl g() {
        return new euhm(this);
    }

    @Override // defpackage.euiy
    public final /* synthetic */ eujm h(byte[] bArr) {
        return new euhn(this, bArr);
    }

    public final SecretKeySpec k(byte[] bArr, byte[] bArr2) {
        return new SecretKeySpec(euiw.b(this.d, this.e, bArr, bArr2, this.a), "AES");
    }
}
