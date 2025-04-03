package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvlk extends cvll {
    private final Optional a;
    private final boolean b;

    public cvlk(Optional optional, boolean z) {
        if (optional == null) {
            throw new NullPointerException("Null signatureData");
        }
        this.a = optional;
        this.b = z;
    }

    @Override // defpackage.cvll
    public final Optional a() {
        return this.a;
    }

    @Override // defpackage.cvll
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvll) {
            cvll cvllVar = (cvll) obj;
            if (this.a.equals(cvllVar.a()) && this.b == cvllVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "SignatureBannerData{signatureData=" + this.a.toString() + ", shouldShowBanner=" + this.b + "}";
    }
}
