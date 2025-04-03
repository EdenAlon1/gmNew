package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euhe implements eujl {
    final /* synthetic */ euhg a;
    private SecretKeySpec b;
    private SecretKeySpec c;
    private Cipher d;
    private Mac e;
    private byte[] f;

    public euhe(euhg euhgVar) {
        this.a = euhgVar;
    }

    @Override // defpackage.eujl
    public final synchronized void a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int position = byteBuffer.position();
        byte[] n = euhg.n(this.f, i, z);
        int remaining = byteBuffer.remaining();
        int i2 = this.a.b;
        if (remaining < i2) {
            throw new GeneralSecurityException("Ciphertext too short");
        }
        int i3 = position + (remaining - i2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.limit(i3);
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        duplicate2.position(i3);
        this.e.init(this.c);
        this.e.update(n);
        this.e.update(duplicate);
        byte[] copyOf = Arrays.copyOf(this.e.doFinal(), this.a.b);
        byte[] bArr = new byte[this.a.b];
        duplicate2.get(bArr);
        if (!MessageDigest.isEqual(bArr, copyOf)) {
            throw new GeneralSecurityException("Tag mismatch");
        }
        byteBuffer.limit(i3);
        this.d.init(1, this.b, new IvParameterSpec(n));
        this.d.doFinal(byteBuffer, byteBuffer2);
    }

    @Override // defpackage.eujl
    public final synchronized void b(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() != this.a.e()) {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
        byte b = byteBuffer.get();
        euhg euhgVar = this.a;
        if (b != euhgVar.e()) {
            throw new GeneralSecurityException("Invalid ciphertext");
        }
        this.f = new byte[7];
        byte[] bArr2 = new byte[euhgVar.a];
        byteBuffer.get(bArr2);
        byteBuffer.get(this.f);
        byte[] m = this.a.m(bArr2, bArr);
        this.b = this.a.l(m);
        this.c = this.a.k(m);
        this.d = euhg.i();
        this.e = this.a.j();
    }
}
