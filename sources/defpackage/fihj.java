package defpackage;

import org.chromium.net.CronetException;
import org.chromium.net.impl.CronetBidirectionalStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fihj implements Runnable {
    final /* synthetic */ CronetException a;
    final /* synthetic */ CronetBidirectionalStream b;

    public fihj(CronetBidirectionalStream cronetBidirectionalStream, CronetException cronetException) {
        this.b = cronetBidirectionalStream;
        this.a = cronetException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
