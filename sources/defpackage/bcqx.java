package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bcqx {
    public final boolean a;
    public final bcqw b;

    public bcqx(boolean z, bcqw bcqwVar) {
        this.a = z;
        this.b = bcqwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcqx)) {
            return false;
        }
        bcqx bcqxVar = (bcqx) obj;
        return this.a == bcqxVar.a && ffkj.e(this.b, bcqxVar.b);
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RemoteParticipantsSearchResult(hasSelfAmongRemoteParticipants=" + this.a + ", remoteParticipants=" + this.b + ")";
    }
}
