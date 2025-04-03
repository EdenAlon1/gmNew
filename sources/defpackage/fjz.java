package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjz implements kev {
    private final long a;
    private final jzn b;
    private final ffjm c;

    public fjz(long j, jzn jznVar, ffjm ffjmVar) {
        this.a = j;
        this.b = jznVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.kev
    public final long a(kac kacVar, long j, kah kahVar, long j2) {
        ffdu ffduVar;
        Object obj;
        Object obj2;
        jzn jznVar = this.b;
        int eo = jznVar.eo(48.0f);
        int eo2 = jznVar.eo(jzt.a(this.a)) * (kahVar == kah.a ? 1 : -1);
        int eo3 = this.b.eo(jzt.b(this.a));
        int i = kacVar.b;
        int i2 = kacVar.d;
        int b = kaf.b(j2);
        int b2 = kaf.b(j) - kaf.b(j2);
        int i3 = (i2 - b) + eo2;
        int i4 = i + eo2;
        if (kahVar == kah.a) {
            Integer valueOf = Integer.valueOf(i4);
            Integer valueOf2 = Integer.valueOf(i3);
            if (kacVar.b < 0) {
                b2 = 0;
            }
            ffduVar = new ffdu(new Integer[]{valueOf, valueOf2, Integer.valueOf(b2)});
        } else {
            Integer valueOf3 = Integer.valueOf(i3);
            Integer valueOf4 = Integer.valueOf(i4);
            if (kacVar.d <= kaf.b(j)) {
                b2 = 0;
            }
            ffduVar = new ffdu(new Integer[]{valueOf3, valueOf4, Integer.valueOf(b2)});
        }
        Iterator a = ffduVar.a();
        while (true) {
            obj = null;
            if (!a.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = a.next();
            int intValue = ((Number) obj2).intValue();
            if (intValue >= 0 && intValue + kaf.b(j2) <= kaf.b(j)) {
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            i3 = num.intValue();
        }
        int max = Math.max(kacVar.e + eo3, eo);
        int i5 = kacVar.c;
        int a2 = (i5 - kaf.a(j2)) + eo3;
        Iterator a3 = new ffdu(new Integer[]{Integer.valueOf(max), Integer.valueOf(a2), Integer.valueOf((i5 - (kaf.a(j2) / 2)) + eo3), Integer.valueOf((kaf.a(j) - kaf.a(j2)) - eo)}).a();
        while (true) {
            if (!a3.hasNext()) {
                break;
            }
            Object next = a3.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= eo && intValue2 + kaf.a(j2) <= kaf.a(j) - eo) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            a2 = num2.intValue();
        }
        this.c.a(kacVar, new kac(i3, a2, kaf.b(j2) + i3, kaf.a(j2) + a2));
        return kab.a(i3, a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjz)) {
            return false;
        }
        fjz fjzVar = (fjz) obj;
        return jzt.d(this.a, fjzVar.a) && ffkj.e(this.b, fjzVar.b) && ffkj.e(this.c, fjzVar.c);
    }

    public final int hashCode() {
        return (((jzs.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) jzt.c(this.a)) + ", density=" + this.b + ", onPositionCalculated=" + this.c + ')';
    }
}
