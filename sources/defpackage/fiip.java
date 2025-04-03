package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiip implements Runnable {
    final /* synthetic */ film a;
    final /* synthetic */ String b;
    final /* synthetic */ CronetUrlRequest c;

    public fiip(CronetUrlRequest cronetUrlRequest, film filmVar, String str) {
        this.c = cronetUrlRequest;
        this.a = filmVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.a();
        synchronized (this.c.c) {
            CronetUrlRequest cronetUrlRequest = this.c;
            if (cronetUrlRequest.h()) {
                return;
            }
            cronetUrlRequest.b = true;
            try {
                CronetUrlRequest cronetUrlRequest2 = this.c;
                cronetUrlRequest2.e.onRedirectReceived(cronetUrlRequest2, this.a, this.b);
            } catch (Exception e) {
                this.c.e(e);
            }
        }
    }
}
