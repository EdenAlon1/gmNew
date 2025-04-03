package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class docp implements docq {
    public final int a;
    private final docy b;

    public docp(docy docyVar, int i) {
        this.b = docyVar;
        this.a = i;
    }

    @Override // defpackage.docq
    public final docy a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof docp)) {
            return false;
        }
        docp docpVar = (docp) obj;
        return ffkj.e(this.b, docpVar.b) && this.a == docpVar.a;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VerticalRichCardMedia(media=");
        sb.append(this.b);
        sb.append(", size=");
        int i = this.a;
        sb.append((Object) (i != 112 ? i != 168 ? i != 264 ? "null" : "Tall" : "Medium" : "Short"));
        sb.append(")");
        return sb.toString();
    }
}
