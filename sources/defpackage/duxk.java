package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duxk {
    private final enhk a = enoz.a;

    public final boolean equals(Object obj) {
        if (obj instanceof duxk) {
            return ennc.m(this.a, ((duxk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("SessionInfo@%x : %s", Integer.valueOf(hashCode()), this.a);
    }
}
