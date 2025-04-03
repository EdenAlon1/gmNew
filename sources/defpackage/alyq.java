package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alyq implements alyw {
    private final alxz a;

    public alyq(alxz alxzVar) {
        alxzVar.getClass();
        this.a = alxzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alyq) && ffkj.e(this.a, ((alyq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PreviewSummary(content=" + this.a + ")";
    }
}
