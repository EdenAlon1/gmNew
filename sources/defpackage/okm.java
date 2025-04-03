package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class okm {
    public final List a;
    public final Integer b;
    public final int c;
    private final ojd d;

    public okm(List list, Integer num, ojd ojdVar, int i) {
        this.a = list;
        this.b = num;
        this.d = ojdVar;
        this.c = i;
    }

    public final oki a(int i) {
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((oki) it.next()).b.isEmpty()) {
                int i2 = i - this.c;
                int i3 = 0;
                while (i3 < ffdx.e(this.a) && i2 > ffdx.e(((oki) this.a.get(i3)).b)) {
                    i2 -= ((oki) this.a.get(i3)).b.size();
                    i3++;
                }
                return i2 < 0 ? (oki) ffdx.K(this.a) : (oki) this.a.get(i3);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof okm)) {
            return false;
        }
        okm okmVar = (okm) obj;
        return ffkj.e(this.a, okmVar.a) && ffkj.e(this.b, okmVar.b) && ffkj.e(this.d, okmVar.d) && this.c == okmVar.c;
    }

    public final int hashCode() {
        Integer num = this.b;
        return this.a.hashCode() + (num != null ? num.hashCode() : 0) + this.d.hashCode() + this.c;
    }

    public final String toString() {
        return "PagingState(pages=" + this.a + ", anchorPosition=" + this.b + ", config=" + this.d + ", leadingPlaceholderCount=" + this.c + ')';
    }
}
