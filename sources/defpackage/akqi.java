package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akqi extends akqz {
    private final akqx a;

    public akqi(akqx akqxVar) {
        this.a = akqxVar;
    }

    @Override // defpackage.akqz
    public final akqx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqz) {
            return this.a.equals(((akqz) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageEditConfirmedEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
