package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyor {
    public final engw a;

    public cyor(engw engwVar) {
        this.a = engwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyor) && ffkj.e(this.a, ((cyor) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionsUiData(actions=" + this.a + ")";
    }
}
