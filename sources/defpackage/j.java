package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class j extends euzb {
    public final byte a() {
        int d = d(4);
        if (d != 0) {
            return this.b.get(d + this.a);
        }
        return (byte) 0;
    }

    public final m b() {
        m mVar = new m();
        int d = d(6);
        if (d == 0) {
            return null;
        }
        int c = c(d + this.a);
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        mVar.h(c, byteBuffer);
        return mVar;
    }
}
