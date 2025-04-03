package defpackage;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class euhf implements eujm {
    final /* synthetic */ euhg a;
    private final SecretKeySpec b;
    private final SecretKeySpec c;
    private final Cipher d = euhg.i();
    private final Mac e;
    private final byte[] f;
    private final ByteBuffer g;
    private long h;

    public euhf(euhg euhgVar, byte[] bArr) {
        this.a = euhgVar;
        this.h = 0L;
        this.e = euhgVar.j();
        this.h = 0L;
        byte[] b = ettg.b(euhgVar.a);
        byte[] b2 = ettg.b(7);
        this.f = b2;
        ByteBuffer allocate = ByteBuffer.allocate(euhgVar.e());
        this.g = allocate;
        allocate.put((byte) euhgVar.e());
        allocate.put(b);
        allocate.put(b2);
        allocate.flip();
        byte[] m = euhgVar.m(b, bArr);
        this.b = euhgVar.l(m);
        this.c = euhgVar.k(m);
    }

    @Override // defpackage.eujm
    public final ByteBuffer a() {
        return this.g.asReadOnlyBuffer();
    }

    @Override // defpackage.eujm
    public final synchronized void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        byte[] bArr = this.f;
        int position = byteBuffer3.position();
        byte[] n = euhg.n(bArr, this.h, false);
        this.d.init(1, this.b, new IvParameterSpec(n));
        this.h++;
        this.d.update(byteBuffer, byteBuffer3);
        this.d.doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer duplicate = byteBuffer3.duplicate();
        duplicate.flip();
        duplicate.position(position);
        this.e.init(this.c);
        this.e.update(n);
        this.e.update(duplicate);
        byteBuffer3.put(this.e.doFinal(), 0, this.a.b);
    }

    @Override // defpackage.eujm
    public final synchronized void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = this.f;
        int position = byteBuffer2.position();
        byte[] n = euhg.n(bArr, this.h, true);
        this.d.init(1, this.b, new IvParameterSpec(n));
        this.h++;
        this.d.doFinal(byteBuffer, byteBuffer2);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        duplicate.flip();
        duplicate.position(position);
        this.e.init(this.c);
        this.e.update(n);
        this.e.update(duplicate);
        byteBuffer2.put(this.e.doFinal(), 0, this.a.b);
    }
}
