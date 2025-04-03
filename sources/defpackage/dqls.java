package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqls {
    public final dqmn a;
    public final dqlx b;

    public dqls(dqmn dqmnVar, dqlx dqlxVar) {
        dqmnVar.getClass();
        dqlxVar.getClass();
        this.a = dqmnVar;
        this.b = dqlxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqls)) {
            return false;
        }
        dqls dqlsVar = (dqls) obj;
        return ffkj.e(this.a, dqlsVar.a) && ffkj.e(this.b, dqlsVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftController(textController=" + this.a + ", attachmentsController=" + this.b + ")";
    }
}
