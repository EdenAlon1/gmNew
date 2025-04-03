package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akpr extends akpu {
    private final akqx a;

    public akpr(akqx akqxVar) {
        if (akqxVar == null) {
            throw new NullPointerException("Null dialogParameters");
        }
        this.a = akqxVar;
    }

    @Override // defpackage.akpu
    public final akqx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akpu) {
            return this.a.equals(((akpu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ScheduledIconClickEvent{dialogParameters=" + this.a.toString() + "}";
    }
}
