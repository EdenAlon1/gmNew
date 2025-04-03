package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyio extends cyiv {
    private final engw a;
    private final boolean b;
    private final boolean c;

    public cyio(engw engwVar, boolean z, boolean z2) {
        if (engwVar == null) {
            throw new NullPointerException("Null spamParticipants");
        }
        this.a = engwVar;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.cyiv
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.cyiv
    public final boolean b() {
        return this.c;
    }

    @Override // defpackage.cyiv
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyiv) {
            cyiv cyivVar = (cyiv) obj;
            if (enkr.h(this.a, cyivVar.a()) && this.b == cyivVar.c() && this.c == cyivVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        return "SpamBannerLoadedData{spamParticipants=" + this.a.toString() + ", groupConversation=" + this.b + ", bannerEligible=" + this.c + "}";
    }
}
