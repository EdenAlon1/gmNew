package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aibt {
    public final engw a;
    public final boolean b;

    public aibt(engw engwVar) {
        this.a = engwVar;
        this.b = engwVar.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aibt) && ffkj.e(this.a, ((aibt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderIndexUiData(headers=" + this.a + ")";
    }
}
