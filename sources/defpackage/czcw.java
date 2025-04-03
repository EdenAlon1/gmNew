package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czcw {
    public final engw a;

    public czcw(engw engwVar) {
        this.a = engwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czcw) && ffkj.e(this.a, ((czcw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SearchUiData(actions=" + this.a + ")";
    }
}
