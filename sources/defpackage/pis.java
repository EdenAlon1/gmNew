package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pis {
    public final pic a;

    public pis() {
        this(pic.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pis) {
            return ffkj.e(this.a, ((pis) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "pis: {bounds=" + this.a + '}';
    }

    public pis(pic picVar) {
        picVar.getClass();
        this.a = picVar;
    }
}
