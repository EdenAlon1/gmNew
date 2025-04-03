package defpackage;

import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fihh implements Runnable {
    final /* synthetic */ UrlResponseInfo.HeaderBlock a;
    final /* synthetic */ CronetBidirectionalStream b;

    public fihh(CronetBidirectionalStream cronetBidirectionalStream, UrlResponseInfo.HeaderBlock headerBlock) {
        this.b = cronetBidirectionalStream;
        this.a = headerBlock;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.l) {
            if (this.b.g()) {
                return;
            }
            try {
                CronetBidirectionalStream cronetBidirectionalStream = this.b;
                cronetBidirectionalStream.b.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.s, this.a);
            } catch (Exception e) {
                this.b.e(e);
            }
        }
    }
}
