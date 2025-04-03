package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsv extends ejsy {
    public final ejsz a;

    public ejsv(ejsz ejszVar) {
        this.a = ejszVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejsv) && ffkj.e(this.a, ((ejsv) obj).a);
    }

    public final int hashCode() {
        ejsz ejszVar = this.a;
        if (ejszVar == null) {
            return 0;
        }
        return ejszVar.hashCode();
    }

    public final String toString() {
        return "Reading(cause=" + this.a + ")";
    }
}
