package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fihl implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;
    private ByteBuffer b;
    private final boolean c;

    public fihl(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z) {
        this.a = cronetBidirectionalStream;
        this.b = byteBuffer;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ByteBuffer byteBuffer = this.b;
            this.b = null;
            synchronized (this.a.l) {
                CronetBidirectionalStream cronetBidirectionalStream = this.a;
                if (cronetBidirectionalStream.g()) {
                    return;
                }
                boolean z = false;
                if (this.c) {
                    cronetBidirectionalStream.r = 10;
                    if (cronetBidirectionalStream.q == 4) {
                        z = true;
                    }
                }
                CronetBidirectionalStream cronetBidirectionalStream2 = this.a;
                cronetBidirectionalStream2.b.onWriteCompleted(cronetBidirectionalStream2, cronetBidirectionalStream2.s, byteBuffer, this.c);
                if (z) {
                    this.a.c();
                }
            }
        } catch (Exception e) {
            this.a.e(e);
        }
    }
}
