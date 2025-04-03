package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dypz extends dyqm {
    private final dzsi a;

    public dypz(dzsi dzsiVar) {
        this.a = dzsiVar;
    }

    @Override // defpackage.dyqm
    public final dzsi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyqm) {
            return this.a.equals(((dyqm) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetUserPropertiesResult{userProperties=" + this.a.toString() + "}";
    }
}
