package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppp extends ppq {
    public final pot a;

    public ppp(pot potVar) {
        this.a = potVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ppp) obj).a);
    }

    public final int hashCode() {
        return 3447696 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public ppp() {
        this(pot.a);
    }
}
