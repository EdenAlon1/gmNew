package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayya extends ayyl {
    public final epvj a;
    private final epvy b;

    public ayya(epvj epvjVar, epvy epvyVar) {
        if (epvjVar == null) {
            throw new NullPointerException("Null conversationInfo");
        }
        this.a = epvjVar;
        if (epvyVar == null) {
            throw new NullPointerException("Null conversationInfoForAnonymousLogger");
        }
        this.b = epvyVar;
    }

    @Override // defpackage.ayyl
    public final epvj a() {
        return this.a;
    }

    @Override // defpackage.ayyl
    public final epvy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayyl) {
            ayyl ayylVar = (ayyl) obj;
            if (this.a.equals(ayylVar.a()) && this.b.equals(ayylVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        epvy epvyVar = this.b;
        return "AnonymizedConversation{conversationInfo=" + this.a.toString() + ", conversationInfoForAnonymousLogger=" + epvyVar.toString() + "}";
    }
}
