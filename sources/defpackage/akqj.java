package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akqj extends akra {
    private final akqx a;

    public akqj(akqx akqxVar) {
        this.a = akqxVar;
    }

    @Override // defpackage.akra
    public final akqx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akra) {
            return this.a.equals(((akra) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledMessageEditEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
