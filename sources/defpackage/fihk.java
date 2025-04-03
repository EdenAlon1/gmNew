package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fihk implements Runnable {
    public ByteBuffer a;
    public boolean b;
    final /* synthetic */ CronetBidirectionalStream c;

    public fihk(CronetBidirectionalStream cronetBidirectionalStream) {
        this.c = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            ByteBuffer byteBuffer = this.a;
            this.a = null;
            synchronized (this.c.l) {
                CronetBidirectionalStream cronetBidirectionalStream = this.c;
                if (cronetBidirectionalStream.g()) {
                    return;
                }
                boolean z = false;
                if (this.b) {
                    cronetBidirectionalStream.q = 4;
                    if (cronetBidirectionalStream.r == 10) {
                        z = true;
                    }
                } else {
                    cronetBidirectionalStream.q = 2;
                }
                CronetBidirectionalStream cronetBidirectionalStream2 = this.c;
                cronetBidirectionalStream2.b.onReadCompleted(cronetBidirectionalStream2, cronetBidirectionalStream2.s, byteBuffer, this.b);
                if (z) {
                    this.c.c();
                }
            }
        } catch (Exception e) {
            this.c.e(e);
        }
    }
}
