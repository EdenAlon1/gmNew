package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuvc {
    public final String a;

    public cuvc(String str) {
        this.a = str;
        if (((Boolean) ((cfup) cubs.z.get()).e()).booleanValue() && ffpc.J(str)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuvc) && ffkj.e(this.a, ((cuvc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleParticipantIdWrapper(participantId=" + this.a + ")";
    }
}
