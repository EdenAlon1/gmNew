package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wde extends wdl {
    private final bcxq a;

    public wde(bcxq bcxqVar) {
        if (bcxqVar == null) {
            throw new NullPointerException("Null sim");
        }
        this.a = bcxqVar;
    }

    @Override // defpackage.wdl
    public final bcxq a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wdl) {
            return this.a.equals(((wdl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SimPickedEvent{sim=" + this.a.toString() + "}";
    }
}
