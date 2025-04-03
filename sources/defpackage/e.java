package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class e extends euzb {
    public final f a(int i) {
        f fVar = new f();
        int d = d(4);
        if (d == 0) {
            return null;
        }
        int c = c(e(d) + (i * 4));
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        fVar.h(c, byteBuffer);
        return fVar;
    }
}
