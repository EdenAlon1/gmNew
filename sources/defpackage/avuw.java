package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avuw implements avwb {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public avuw(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    @Override // defpackage.avwb
    public final /* bridge */ /* synthetic */ avwa a(String str, UrlRequest.Callback callback) {
        errl errlVar = (errl) this.a.b();
        errlVar.getClass();
        ((avut) this.c.b()).getClass();
        str.getClass();
        callback.getClass();
        return new avuv(errlVar, this.b, str, callback);
    }
}
