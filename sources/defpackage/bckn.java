package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckn {
    public final String a;
    public final dtzj b;

    public bckn(String str) {
        this.a = str;
        this.b = new dtzq("$V", new Object[]{str});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bckn) && ffkj.e(this.a, ((bckn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TableNameExpression(tableName=" + this.a + ")";
    }
}
