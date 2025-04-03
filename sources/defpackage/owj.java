package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owj {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public owj(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owj)) {
            return false;
        }
        owj owjVar = (owj) obj;
        if (ffkj.e(this.a, owjVar.a) && ffkj.e(this.b, owjVar.b) && ffkj.e(this.c, owjVar.c) && ffkj.e(this.d, owjVar.d)) {
            return ffkj.e(this.e, owjVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        String c;
        String l;
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        owo.d(ffdx.ag(this.d));
        sb.append(ffcu.a);
        sb.append("\n            |   referenceColumnNames = {");
        owo.c(ffdx.ag(this.e));
        sb.append(ffcu.a);
        sb.append("\n            |}\n        ");
        c = ffpc.c(sb.toString(), "|");
        l = ffno.l(ffno.i(ffpc.H(c), new ffpg()), "\n", 62);
        return l;
    }
}
