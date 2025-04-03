package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiiq implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public fiiq(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a();
        synchronized (this.a.c) {
            CronetUrlRequest cronetUrlRequest = this.a;
            if (cronetUrlRequest.h()) {
                return;
            }
            cronetUrlRequest.k = true;
            try {
                CronetUrlRequest cronetUrlRequest2 = this.a;
                cronetUrlRequest2.e.onResponseStarted(cronetUrlRequest2, cronetUrlRequest2.g);
            } catch (Exception e) {
                this.a.e(e);
            }
        }
    }
}
