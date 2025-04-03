package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evan implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ SettableFuture b;
    final /* synthetic */ UrlRequest c;

    public evan(int i, SettableFuture settableFuture, UrlRequest urlRequest) {
        this.a = i;
        this.b = settableFuture;
        this.c = urlRequest;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((ensz) evau.a.n().h("com/google/frameworks/client/data/android/HttpClientImpl$1", "run", 165, "HttpClientImpl.java")).x("[%d] HTTP request complete, cancelled=%b", this.a, this.b.isCancelled());
        if (this.b.isCancelled()) {
            this.c.cancel();
        }
    }
}
