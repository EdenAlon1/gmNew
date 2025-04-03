package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abvy extends abwi {
    public final engw a;

    public abvy(engw engwVar) {
        this.a = engwVar;
    }

    @Override // defpackage.abwi
    public final engw a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abwi) {
            return enkr.h(this.a, ((abwi) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DonationConversation{messages=" + String.valueOf(this.a) + "}";
    }
}
