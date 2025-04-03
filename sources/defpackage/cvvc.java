package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvc {
    public final amar a;
    public final int b;

    public cvvc(amar amarVar, int i) {
        this.a = amarVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvvc)) {
            return false;
        }
        cvvc cvvcVar = (cvvc) obj;
        return ffkj.e(this.a, cvvcVar.a) && this.b == cvvcVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "PagedContactEntry(entry=" + this.a + ", position=" + this.b + ")";
    }
}
