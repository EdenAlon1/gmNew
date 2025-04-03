package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddb {
    public final cyb a;
    public final cym b;
    public final int c = 0;

    public ddb(cyb cybVar, cym cymVar) {
        this.a = cybVar;
        this.b = cymVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ddb)) {
            return false;
        }
        ddb ddbVar = (ddb) obj;
        if (!ffkj.e(this.a, ddbVar.a) || !ffkj.e(this.b, ddbVar.b)) {
            return false;
        }
        int i = ddbVar.c;
        return true;
    }

    public final int hashCode() {
        return ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.a + ", easing=" + this.b + ", arcMode=ArcMode(value=0))";
    }
}
