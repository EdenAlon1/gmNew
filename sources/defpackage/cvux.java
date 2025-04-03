package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvux {
    public final engw a;
    public final boolean b;

    public cvux(engw engwVar) {
        this.a = engwVar;
        this.b = engwVar.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvux) && ffkj.e(this.a, ((cvux) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HeaderIndexUiData(headers=" + this.a + ")";
    }
}
