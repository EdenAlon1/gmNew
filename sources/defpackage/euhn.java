package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euhn implements eujm {
    private final SecretKeySpec a;
    private final Cipher b = euho.i();
    private final byte[] c;
    private final ByteBuffer d;
    private long e;

    public euhn(euho euhoVar, byte[] bArr) {
        this.e = 0L;
        this.e = 0L;
        byte[] b = ettg.b(euhoVar.a);
        byte[] b2 = ettg.b(7);
        this.c = b2;
        ByteBuffer allocate = ByteBuffer.allocate(euhoVar.e());
        this.d = allocate;
        allocate.put((byte) euhoVar.e());
        allocate.put(b);
        allocate.put(b2);
        allocate.flip();
        this.a = euhoVar.k(b, bArr);
    }

    @Override // defpackage.eujm
    public final ByteBuffer a() {
        return this.d.asReadOnlyBuffer();
    }

    @Override // defpackage.eujm
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        this.b.init(1, this.a, euho.j(this.c, this.e, false));
        this.e++;
        if (!byteBuffer2.hasRemaining()) {
            this.b.doFinal(byteBuffer, byteBuffer3);
        } else {
            this.b.update(byteBuffer, byteBuffer3);
            this.b.doFinal(byteBuffer2, byteBuffer3);
        }
    }

    @Override // defpackage.eujm
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.b.init(1, this.a, euho.j(this.c, this.e, true));
        this.e++;
        this.b.doFinal(byteBuffer, byteBuffer2);
    }
}
