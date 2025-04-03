package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qmo implements qmp {
    private final ByteBuffer a;

    public qmo(ByteBuffer byteBuffer) {
        this.a = byteBuffer.slice();
    }

    @Override // defpackage.qmp
    public final long a() {
        return this.a.capacity();
    }

    @Override // defpackage.qmp
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (this.a) {
            int i2 = (int) j;
            this.a.position(i2);
            this.a.limit(i2 + i);
            slice = this.a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
