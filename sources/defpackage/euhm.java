package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euhm implements eujl {
    final /* synthetic */ euho a;
    private SecretKeySpec b;
    private Cipher c;
    private byte[] d;

    public euhm(euho euhoVar) {
        this.a = euhoVar;
    }

    @Override // defpackage.eujl
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        this.c.init(2, this.b, euho.j(this.d, i, z));
        this.c.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.eujl
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() != this.a.e()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        byte b = byteBuffer.get();
        euho euhoVar = this.a;
        if (b != euhoVar.e()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.d = new byte[7];
        byte[] bArr2 = new byte[euhoVar.a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.d);
        this.b = this.a.k(bArr2, bArr);
        this.c = euho.i();
    }
}
