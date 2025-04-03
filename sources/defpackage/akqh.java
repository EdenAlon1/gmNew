package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akqh extends akqs {
    private final akqx a;

    public akqh(akqx akqxVar) {
        this.a = akqxVar;
    }

    @Override // defpackage.akqs
    public final akqx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akqs) {
            return this.a.equals(((akqs) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageDeleteEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
