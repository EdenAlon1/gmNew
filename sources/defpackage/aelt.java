package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelt extends aelw {
    private final enip a;
    private final boolean b;

    public aelt(enip enipVar, boolean z) {
        if (enipVar == null) {
            throw new NullPointerException("Null changedViewParts");
        }
        this.a = enipVar;
        this.b = z;
    }

    @Override // defpackage.aelw
    public final enip a() {
        return this.a;
    }

    @Override // defpackage.aelw
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aelw) {
            aelw aelwVar = (aelw) obj;
            if (this.a.equals(aelwVar.a()) && this.b == aelwVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationListChangePayload{changedViewParts=" + this.a.toString() + ", shouldRecalculate=" + this.b + "}";
    }
}
