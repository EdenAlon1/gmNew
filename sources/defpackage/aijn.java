package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijn implements aihs {
    public final aijp a;

    public aijn(aijp aijpVar) {
        this.a = aijpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aijn) && ffkj.e(this.a, ((aijn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Conversation(arguments=" + this.a + ")";
    }
}
