package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fihf implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ CronetBidirectionalStream b;

    public fihf(CronetBidirectionalStream cronetBidirectionalStream, boolean z) {
        this.b = cronetBidirectionalStream;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.l) {
            CronetBidirectionalStream cronetBidirectionalStream = this.b;
            if (cronetBidirectionalStream.g()) {
                return;
            }
            cronetBidirectionalStream.m = this.a;
            cronetBidirectionalStream.q = 2;
            try {
                if (!CronetBidirectionalStream.f(cronetBidirectionalStream.c)) {
                    CronetBidirectionalStream cronetBidirectionalStream2 = this.b;
                    if (cronetBidirectionalStream2.m) {
                        cronetBidirectionalStream2.r = 10;
                        CronetBidirectionalStream cronetBidirectionalStream3 = this.b;
                        cronetBidirectionalStream3.b.onStreamReady(cronetBidirectionalStream3);
                        return;
                    }
                }
                CronetBidirectionalStream cronetBidirectionalStream32 = this.b;
                cronetBidirectionalStream32.b.onStreamReady(cronetBidirectionalStream32);
                return;
            } catch (Exception e) {
                this.b.e(e);
                return;
            }
            this.b.r = 8;
        }
    }
}
