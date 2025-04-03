package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppn extends ppq {
    public final pot a;

    public ppn(pot potVar) {
        this.a = potVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ppn) obj).a);
    }

    public final int hashCode() {
        return 3447634 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }

    public ppn() {
        this(pot.a);
    }
}
