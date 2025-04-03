package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwm {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public bwm(ByteBuffer byteBuffer, bvx bvxVar, int i, int i2) {
        byteBuffer.rewind();
        int limit = byteBuffer.limit() - byteBuffer.position();
        bwf bwfVar = (bwf) bvxVar;
        if (limit == bwfVar.a) {
            this.a = i;
            this.b = i2;
            this.c = byteBuffer;
            this.d = bwfVar.b;
            return;
        }
        throw new IllegalStateException("Byte buffer size is not match with packet info: " + limit + " != " + bwfVar.a);
    }
}
