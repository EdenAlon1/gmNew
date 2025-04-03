package defpackage;

import android.util.Base64;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avwh implements avwq {
    private final djry a;
    private final avwx b;
    private int c = 0;

    public avwh(djry djryVar, avwx avwxVar) {
        this.a = djryVar;
        this.b = avwxVar;
    }

    @Override // defpackage.avwq
    public final elfl a() {
        if (this.c >= 2) {
            throw new avws();
        }
        enhv enhvVar = new enhv();
        enhvVar.h("User-Agent", this.b.a());
        if (this.c > 0) {
            InstantMessageConfiguration o = ((djtp) this.a.m().orElseThrow()).o();
            enhvVar.h("Authorization", "Basic ".concat(String.valueOf(Base64.encodeToString((o.mFtHttpContentServerUser + ":" + o.mFtHttpContentServerPassword).getBytes(), 2))));
        }
        this.c++;
        return elfo.e(new avwd(enhvVar.f()));
    }

    @Override // defpackage.avwq
    public final boolean b(UrlResponseInfo urlResponseInfo) {
        int httpStatusCode = urlResponseInfo.getHttpStatusCode();
        return this.c < 2 ? httpStatusCode == 401 : httpStatusCode != 200;
    }
}
