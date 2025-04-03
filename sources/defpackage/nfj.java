package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nfj implements nfh {
    @Override // defpackage.nfh
    public final lrb a(nfi nfiVar) {
        ByteBuffer byteBuffer = nfiVar.d;
        lti.f(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        lti.a(z);
        return b(nfiVar, byteBuffer);
    }

    protected abstract lrb b(nfi nfiVar, ByteBuffer byteBuffer);
}
