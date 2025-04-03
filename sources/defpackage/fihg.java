package defpackage;

import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fihg implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;

    public fihg(CronetBidirectionalStream cronetBidirectionalStream) {
        this.a = cronetBidirectionalStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.l) {
            CronetBidirectionalStream cronetBidirectionalStream = this.a;
            if (cronetBidirectionalStream.g()) {
                return;
            }
            cronetBidirectionalStream.q = 2;
            try {
                CronetBidirectionalStream cronetBidirectionalStream2 = this.a;
                cronetBidirectionalStream2.b.onResponseHeadersReceived(cronetBidirectionalStream2, cronetBidirectionalStream2.s);
            } catch (Exception e) {
                this.a.e(e);
            }
        }
    }
}
