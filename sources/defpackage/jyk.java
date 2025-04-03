package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyk {
    public static final jyk a = new jyk(0);
    public static final jyk b = new jyk(1);
    public static final jyk c = new jyk(2);
    public final int d;

    public jyk(int i) {
        this.d = i;
    }

    public final boolean a(jyk jykVar) {
        int i = this.d;
        return (jykVar.d | i) == i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jyk) && this.d == ((jyk) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        if (this.d == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.d & b.d) != 0) {
            arrayList.add("Underline");
        }
        if ((this.d & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String) arrayList.get(0)));
        }
        return "TextDecoration[" + kau.d(arrayList, ", ", null, 62) + ']';
    }
}
