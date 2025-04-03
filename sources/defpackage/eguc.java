package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eguc {
    public final String a;
    public final boolean b;

    public eguc(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eguc)) {
            return false;
        }
        eguc egucVar = (eguc) obj;
        return ffkj.e(this.a, egucVar.a) && this.b == egucVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "UpdatedPhotoState(updatedPhotoUrl=" + this.a + ", updatedIsMonogram=" + this.b + ")";
    }
}
