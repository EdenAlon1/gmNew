package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiiv implements Runnable {
    public ByteBuffer a;
    final /* synthetic */ CronetUrlRequest b;

    public fiiv(CronetUrlRequest cronetUrlRequest) {
        this.b = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a();
        ByteBuffer byteBuffer = this.a;
        this.a = null;
        try {
            synchronized (this.b.c) {
                CronetUrlRequest cronetUrlRequest = this.b;
                if (cronetUrlRequest.h()) {
                    return;
                }
                cronetUrlRequest.k = true;
                CronetUrlRequest cronetUrlRequest2 = this.b;
                cronetUrlRequest2.e.onReadCompleted(cronetUrlRequest2, cronetUrlRequest2.g, byteBuffer);
            }
        } catch (Exception e) {
            this.b.e(e);
        }
    }
}
