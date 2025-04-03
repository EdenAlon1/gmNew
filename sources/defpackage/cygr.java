package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cygr extends cygs {
    private final bctw a;
    private final boolean b;
    private final buxm c;

    public cygr(bctw bctwVar, boolean z, buxm buxmVar) {
        if (bctwVar == null) {
            throw new NullPointerException("Null conversationParticipantData");
        }
        this.a = bctwVar;
        this.b = z;
        if (buxmVar == null) {
            throw new NullPointerException("Null messagesTableQuery");
        }
        this.c = buxmVar;
    }

    @Override // defpackage.cygs
    public final bctw a() {
        return this.a;
    }

    @Override // defpackage.cygs
    public final buxm b() {
        return this.c;
    }

    @Override // defpackage.cygs
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cygs) {
            cygs cygsVar = (cygs) obj;
            if (this.a.equals(cygsVar.a()) && this.b == cygsVar.c() && this.c.equals(cygsVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        buxm buxmVar = this.c;
        return "PremiumSmsLoadedData{conversationParticipantData=" + this.a.toString() + ", bannerEligible=" + this.b + ", messagesTableQuery=" + buxmVar.toString() + "}";
    }
}
