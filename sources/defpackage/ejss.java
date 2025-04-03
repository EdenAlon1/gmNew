package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejss extends ejsy {
    public final ejsz a;

    public ejss(ejsz ejszVar) {
        this.a = ejszVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejss) && ffkj.e(this.a, ((ejss) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(cause=" + this.a + ")";
    }
}
