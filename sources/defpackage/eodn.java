package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eodn extends eocq {
    private final MessageDigest a;
    private final int b;
    private boolean c;

    public eodn(MessageDigest messageDigest, int i) {
        this.a = messageDigest;
        this.b = i;
    }

    private final void m() {
        emxf.m(!this.c, "Cannot re-use a Hasher after calling hash() on it");
    }

    @Override // defpackage.eocq
    public final void a(byte b) {
        m();
        this.a.update(b);
    }

    @Override // defpackage.eocq
    public final void b(ByteBuffer byteBuffer) {
        m();
        this.a.update(byteBuffer);
    }

    @Override // defpackage.eocq
    protected final void e(byte[] bArr, int i) {
        m();
        this.a.update(bArr, 0, i);
    }

    @Override // defpackage.eodd
    public final eodb q() {
        m();
        this.c = true;
        int i = this.b;
        if (i == this.a.getDigestLength()) {
            byte[] digest = this.a.digest();
            int i2 = eodb.b;
            return new eocy(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.a.digest(), i);
        int i3 = eodb.b;
        return new eocy(copyOf);
    }
}
