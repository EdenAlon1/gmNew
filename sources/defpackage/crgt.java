package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgt {
    public final djro a;

    public crgt(djro djroVar) {
        djroVar.getClass();
        this.a = djroVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crgt) && ffkj.e(this.a, ((crgt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Tachygram(simId=" + this.a + ")";
    }
}
