package defpackage;

import org.chromium.net.UrlResponseInfo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avur extends avvg {
    public final UrlResponseInfo a;
    private final eyee b;

    public avur(UrlResponseInfo urlResponseInfo, eyee eyeeVar) {
        if (urlResponseInfo == null) {
            throw new NullPointerException("Null urlResponseInfo");
        }
        this.a = urlResponseInfo;
        if (eyeeVar == null) {
            throw new NullPointerException("Null responseBody");
        }
        this.b = eyeeVar;
    }

    @Override // defpackage.avvg
    public final eyee a() {
        return this.b;
    }

    @Override // defpackage.avvg
    public final UrlResponseInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avvg) {
            avvg avvgVar = (avvg) obj;
            if (this.a.equals(avvgVar.b()) && this.b.equals(avvgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eyee eyeeVar = this.b;
        return "HttpResponse{urlResponseInfo=" + this.a.toString() + ", responseBody=" + eyeeVar.toString() + "}";
    }
}
