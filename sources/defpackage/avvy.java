package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avvy implements avwb {
    private final ffbr a;

    public avvy(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.avwb
    public final /* bridge */ /* synthetic */ avwa a(String str, UrlRequest.Callback callback) {
        avvw avvwVar = (avvw) this.a.b();
        avvwVar.getClass();
        str.getClass();
        callback.getClass();
        return new avvx(avvwVar, str, callback);
    }
}
