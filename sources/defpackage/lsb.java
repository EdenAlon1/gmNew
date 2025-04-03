package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsb {
    public static final lsb a;
    public final engw b;

    static {
        int i = engw.d;
        a = new lsb(enou.a);
        lvf.N(0);
    }

    public lsb(List list) {
        this.b = engw.n(list);
    }

    public final boolean a() {
        return this.b.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            lsa lsaVar = (lsa) this.b.get(i2);
            boolean[] zArr = lsaVar.d;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (lsaVar.a() == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return enkr.h(this.b, ((lsb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
