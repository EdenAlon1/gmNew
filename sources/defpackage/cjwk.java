package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwk {
    public final cjwj a;
    public final cjwl b;

    public cjwk(cjwj cjwjVar, cjwl cjwlVar) {
        cjwjVar.getClass();
        this.a = cjwjVar;
        this.b = cjwlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjwk)) {
            return false;
        }
        cjwk cjwkVar = (cjwk) obj;
        return this.a == cjwkVar.a && ffkj.e(this.b, cjwkVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cjwl cjwlVar = this.b;
        return hashCode + (cjwlVar == null ? 0 : cjwlVar.hashCode());
    }

    public final String toString() {
        return "SelfProfileSharingConstraints(sharingAbility=" + this.a + ", sharingData=" + this.b + ")";
    }
}
