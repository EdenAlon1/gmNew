package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cegu implements cegx {
    public final Exception a;

    public cegu(Exception exc) {
        exc.getClass();
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cegu) && ffkj.e(this.a, ((cegu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HaltRestore(failure=" + this.a + ")";
    }
}
