package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czhc extends czlo {
    private final bcse a;

    public czhc(bcse bcseVar) {
        this.a = bcseVar;
    }

    @Override // defpackage.czlo
    public final bcse a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof czlo) {
            return this.a.equals(((czlo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CheckOptionsClickEvent{conversationMessageData=" + this.a.toString() + "}";
    }
}
