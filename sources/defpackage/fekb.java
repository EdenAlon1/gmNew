package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fekb implements fekd {
    @Override // defpackage.feke
    public final /* bridge */ /* synthetic */ int a(fesc fescVar, int i, Object obj, int i2) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + i);
        fescVar.i(byteBuffer);
        byteBuffer.limit(limit);
        return 0;
    }
}
