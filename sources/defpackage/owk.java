package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owk {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public owk(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owk)) {
            return false;
        }
        owk owkVar = (owk) obj;
        if (this.b == owkVar.b && ffkj.e(this.c, owkVar.c) && ffkj.e(this.d, owkVar.d)) {
            return ffpc.t(this.a, "index_") ? ffpc.t(owkVar.a, "index_") : ffkj.e(this.a, owkVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return ((((((ffpc.t(this.a, "index_") ? -1184239155 : this.a.hashCode()) * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String c;
        String l;
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        owo.d(this.c);
        sb.append(ffcu.a);
        sb.append("\n            |   orders = {");
        owo.c(this.d);
        sb.append(ffcu.a);
        sb.append("\n            |}\n        ");
        c = ffpc.c(sb.toString(), "|");
        l = ffno.l(ffno.i(ffpc.H(c), new ffpg()), "\n", 62);
        return l;
    }
}
