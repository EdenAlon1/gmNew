package defpackage;

import org.chromium.net.impl.CronetUrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiis implements Runnable {
    final /* synthetic */ CronetUrlRequest a;

    public fiis(CronetUrlRequest cronetUrlRequest) {
        this.a = cronetUrlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            CronetUrlRequest cronetUrlRequest = this.a;
            cronetUrlRequest.e.onCanceled(cronetUrlRequest, cronetUrlRequest.g);
        } catch (Exception e) {
            this.a.d("onCanceled", e);
        }
        this.a.c();
    }
}
