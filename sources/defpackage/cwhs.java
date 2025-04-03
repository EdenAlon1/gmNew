package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwhs {
    public final boolean a;
    public final doia b;

    public cwhs(boolean z, doia doiaVar) {
        this.a = z;
        this.b = doiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwhs)) {
            return false;
        }
        cwhs cwhsVar = (cwhs) obj;
        return this.a == cwhsVar.a && ffkj.e(this.b, cwhsVar.b);
    }

    public final int hashCode() {
        doia doiaVar = this.b;
        return ((true != this.a ? 1237 : 1231) * 31) + (doiaVar == null ? 0 : doiaVar.hashCode());
    }

    public final String toString() {
        return "SimSelectorRowUiData(visible=" + this.a + ", simBarUiData=" + this.b + ")";
    }

    public /* synthetic */ cwhs() {
        this(false, null);
    }
}
