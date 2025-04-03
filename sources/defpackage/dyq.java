package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyq implements ipn, ebj {
    public final hun a;
    private final dxq b;

    public dyq(dxq dxqVar, hun hunVar) {
        this.b = dxqVar;
        this.a = hunVar;
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
        int eo = inyVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            inx inxVar = (inx) list.get(i4);
            float a = ebi.a(ebi.b(inxVar));
            int a2 = inxVar.a(i);
            if (a == 0.0f) {
                i3 += a2;
            } else if (a > 0.0f) {
                f += a;
                i2 = Math.max(i2, Math.round(a2 / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
        int eo = inyVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * eo, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            inx inxVar = (inx) list.get(i3);
            float a = ebi.a(ebi.b(inxVar));
            if (a == 0.0f) {
                int min2 = Math.min(inxVar.a(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, inxVar.b(min2));
            } else if (a > 0.0f) {
                f += a;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            inx inxVar2 = (inx) list.get(i4);
            float a2 = ebi.a(ebi.b(inxVar2));
            if (a2 > 0.0f) {
                i2 = Math.max(i2, inxVar2.b(round != Integer.MAX_VALUE ? Math.round(round * a2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
        int eo = inyVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        float f = 0.0f;
        for (int i4 = 0; i4 < size; i4++) {
            inx inxVar = (inx) list.get(i4);
            float a = ebi.a(ebi.b(inxVar));
            int c = inxVar.c(i);
            if (a == 0.0f) {
                i3 += c;
            } else if (a > 0.0f) {
                f += a;
                i2 = Math.max(i2, Math.round(c / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
        int eo = inyVar.eo(this.b.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * eo, i);
        int size = list.size();
        int i2 = 0;
        float f = 0.0f;
        for (int i3 = 0; i3 < size; i3++) {
            inx inxVar = (inx) list.get(i3);
            float a = ebi.a(ebi.b(inxVar));
            if (a == 0.0f) {
                int min2 = Math.min(inxVar.a(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, inxVar.d(min2));
            } else if (a > 0.0f) {
                f += a;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            inx inxVar2 = (inx) list.get(i4);
            float a2 = ebi.a(ebi.b(inxVar2));
            if (a2 > 0.0f) {
                i2 = Math.max(i2, inxVar2.d(round != Integer.MAX_VALUE ? Math.round(round * a2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo a;
        a = ebk.a(this, jzk.c(j), jzk.d(j), jzk.a(j), jzk.b(j), ipqVar.eo(this.b.a()), ipqVar, list, new iqk[list.size()], 0, list.size(), null, 0);
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyq)) {
            return false;
        }
        dyq dyqVar = (dyq) obj;
        return ffkj.e(this.b, dyqVar.b) && ffkj.e(this.a, dyqVar.a);
    }

    @Override // defpackage.ebj
    public final int f(iqk iqkVar) {
        return iqkVar.a;
    }

    @Override // defpackage.ebj
    public final int g(iqk iqkVar) {
        return iqkVar.b;
    }

    @Override // defpackage.ebj
    public final void h(int i, int[] iArr, int[] iArr2, ipq ipqVar) {
        this.b.b(ipqVar, i, iArr, iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.ebj
    public final long i(int i, int i2, int i3, boolean z) {
        int i4 = dyo.a;
        return !z ? jzl.d(0, i3, i, i2) : jzj.a(0, i3, i, i2);
    }

    @Override // defpackage.ebj
    public final ipo j(iqk[] iqkVarArr, ipq ipqVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        ipo ei;
        ei = ipqVar.ei(i2, i, ffem.a, new dyp(iqkVarArr, this, i2, ipqVar, iArr));
        return ei;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.b + ", horizontalAlignment=" + this.a + ')';
    }
}
