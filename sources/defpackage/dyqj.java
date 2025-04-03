package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqj extends dyqx {
    private final dzsi a;

    public dyqj(dzsi dzsiVar) {
        this.a = dzsiVar;
    }

    @Override // defpackage.dyqx
    public final dzsi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqx) {
            return this.a.equals(((dyqx) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SetUserPropertiesResult{userProperties=" + this.a.toString() + "}";
    }
}
