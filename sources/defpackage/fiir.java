package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiir implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public fiir(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.c) {
            CronetUrlRequest cronetUrlRequest = this.a;
            if (cronetUrlRequest.h()) {
                return;
            }
            cronetUrlRequest.b(0);
            try {
                CronetUrlRequest cronetUrlRequest2 = this.a;
                cronetUrlRequest2.e.onSucceeded(cronetUrlRequest2, cronetUrlRequest2.g);
            } catch (Exception e) {
                this.a.d("onSucceeded", e);
            }
            this.a.c();
        }
    }
}
