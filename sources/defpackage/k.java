package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class k extends euzb {
    public final int a() {
        int d = d(4);
        if (d != 0) {
            return f(d);
        }
        return 0;
    }

    public final j b(int i) {
        j jVar = new j();
        int d = d(4);
        if (d == 0) {
            return null;
        }
        int c = c(e(d) + (i * 4));
        ByteBuffer byteBuffer = this.b;
        byteBuffer.getClass();
        jVar.h(c, byteBuffer);
        return jVar;
    }
}
