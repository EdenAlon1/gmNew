package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avwt implements avwq {
    private final avwx a;
    private boolean b;

    public avwt(avwx avwxVar) {
        this.a = avwxVar;
    }

    @Override // defpackage.avwq
    public final elfl a() {
        if (this.b) {
            throw new avws();
        }
        this.b = true;
        return elfo.e(new avwd(engy.f("User-Agent", this.a.a())));
    }

    @Override // defpackage.avwq
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        return false;
    }
}
