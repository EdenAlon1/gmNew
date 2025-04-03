package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdgi extends bdgj {
    public final awwp a;

    public bdgi(awwp awwpVar) {
        if (awwpVar == null) {
            throw new NullPointerException("Null value");
        }
        this.a = awwpVar;
    }

    @Override // defpackage.bdgj
    public final awwp a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdgj) {
            return this.a.equals(((bdgj) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RcsGroupJoinStatus{value=" + this.a.toString() + "}";
    }
}
