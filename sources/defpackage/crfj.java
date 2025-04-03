package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crfj extends crfl {
    public final crce a;

    public crfj(crce crceVar) {
        this.a = crceVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crfj) && ffkj.e(this.a, ((crfj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Response(fileUploadResult=" + this.a + ")";
    }
}
