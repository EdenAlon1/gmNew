package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avus implements avvz {
    private final UrlRequest a;

    public avus(UrlRequest urlRequest) {
        this.a = urlRequest;
    }

    @Override // defpackage.avvz
    public final void a() {
        this.a.cancel();
    }

    @Override // defpackage.avvz
    public final void b() {
        this.a.start();
    }
}
