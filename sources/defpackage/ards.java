package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ards implements ardt {
    public final ardr a;

    public ards(ardr ardrVar) {
        this.a = ardrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ards) && ffkj.e(this.a, ((ards) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Unavailable(reason=" + this.a + ")";
    }
}
