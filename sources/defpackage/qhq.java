package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhq {
    public static final qhq a = new qhq("COMPOSITION");
    public qhr b;
    private final List c;

    private qhq(qhq qhqVar) {
        this.c = new ArrayList(qhqVar.c);
        this.b = qhqVar.b;
    }

    private final boolean g() {
        return ((String) this.c.get(this.c.size() - 1)).equals("**");
    }

    private static final boolean h(String str) {
        return "__container".equals(str);
    }

    public final int a(String str, int i) {
        if (h(str)) {
            return 0;
        }
        if (((String) this.c.get(i)).equals("**")) {
            return (i != this.c.size() + (-1) && ((String) this.c.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final qhq b(String str) {
        qhq qhqVar = new qhq(this);
        qhqVar.c.add(str);
        return qhqVar;
    }

    public final qhq c(qhr qhrVar) {
        qhq qhqVar = new qhq(this);
        qhqVar.b = qhrVar;
        return qhqVar;
    }

    public final boolean d(String str, int i) {
        if (i >= this.c.size()) {
            return false;
        }
        int size = this.c.size() - 1;
        String str2 = (String) this.c.get(i);
        if (!str2.equals("**")) {
            return (i == size || (i == this.c.size() + (-2) && g())) && (str2.equals(str) || str2.equals("*"));
        }
        if (i == size) {
            return true;
        }
        int i2 = i + 1;
        if (((String) this.c.get(i2)).equals(str)) {
            if (i != this.c.size() - 2) {
                return i == this.c.size() + (-3) && g();
            }
            return true;
        }
        if (i2 < this.c.size() - 1) {
            return false;
        }
        return ((String) this.c.get(i2)).equals(str);
    }

    public final boolean e(String str, int i) {
        if (h(str)) {
            return true;
        }
        if (i >= this.c.size()) {
            return false;
        }
        return ((String) this.c.get(i)).equals(str) || ((String) this.c.get(i)).equals("**") || ((String) this.c.get(i)).equals("*");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        qhq qhqVar = (qhq) obj;
        if (!this.c.equals(qhqVar.c)) {
            return false;
        }
        qhr qhrVar = this.b;
        return qhrVar != null ? qhrVar.equals(qhqVar.b) : qhqVar.b == null;
    }

    public final boolean f(String str, int i) {
        return "__container".equals(str) || i < this.c.size() + (-1) || ((String) this.c.get(i)).equals("**");
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        qhr qhrVar = this.b;
        return hashCode + (qhrVar != null ? qhrVar.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        qhr qhrVar = this.b;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(valueOf);
        sb.append(",resolved=");
        sb.append(qhrVar != null);
        sb.append("}");
        return sb.toString();
    }

    public qhq(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
