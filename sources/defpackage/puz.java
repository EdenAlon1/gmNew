package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class puz extends pva {
    public final int a;

    public puz(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof puz) && this.a == ((puz) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.a + ')';
    }
}
