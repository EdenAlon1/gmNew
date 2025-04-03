package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebo implements ipn, ebj {
    public final hus a;
    private final dxi b;

    public ebo(dxi dxiVar, hus husVar) {
        this.b = dxiVar;
        this.a = husVar;
    }

    @Override // defpackage.ipn
    public final int a(iny inyVar, List list, int i) {
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
                int min2 = Math.min(inxVar.b(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, inxVar.a(min2));
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
                i2 = Math.max(i2, inxVar2.a(round != Integer.MAX_VALUE ? Math.round(round * a2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.ipn
    public final int b(iny inyVar, List list, int i) {
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
            int b = inxVar.b(i);
            if (a == 0.0f) {
                i3 += b;
            } else if (a > 0.0f) {
                f += a;
                i2 = Math.max(i2, Math.round(b / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.ipn
    public final int c(iny inyVar, List list, int i) {
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
                int min2 = Math.min(inxVar.b(Alert.DURATION_SHOW_INDEFINITELY), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i2 = Math.max(i2, inxVar.c(min2));
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
                i2 = Math.max(i2, inxVar2.c(round != Integer.MAX_VALUE ? Math.round(round * a2) : Integer.MAX_VALUE));
            }
        }
        return i2;
    }

    @Override // defpackage.ipn
    public final int d(iny inyVar, List list, int i) {
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
            int d = inxVar.d(i);
            if (a == 0.0f) {
                i3 += d;
            } else if (a > 0.0f) {
                f += a;
                i2 = Math.max(i2, Math.round(d / a));
            }
        }
        return Math.round(i2 * f) + i3 + ((list.size() - 1) * eo);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo a;
        a = ebk.a(this, jzk.d(j), jzk.c(j), jzk.b(j), jzk.a(j), ipqVar.eo(this.b.a()), ipqVar, list, new iqk[list.size()], 0, list.size(), null, 0);
        return a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebo)) {
            return false;
        }
        ebo eboVar = (ebo) obj;
        return ffkj.e(this.b, eboVar.b) && ffkj.e(this.a, eboVar.a);
    }

    @Override // defpackage.ebj
    public final int f(iqk iqkVar) {
        return iqkVar.b;
    }

    @Override // defpackage.ebj
    public final int g(iqk iqkVar) {
        return iqkVar.a;
    }

    @Override // defpackage.ebj
    public final void h(int i, int[] iArr, int[] iArr2, ipq ipqVar) {
        this.b.b(ipqVar, i, iArr, ipqVar.q(), iArr2);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.ebj
    public final long i(int i, int i2, int i3, boolean z) {
        return ebm.b(z, i, i2, i3);
    }

    @Override // defpackage.ebj
    public final ipo j(iqk[] iqkVarArr, ipq ipqVar, int[] iArr, int i, int i2, int[] iArr2, int i3, int i4, int i5) {
        ipo ei;
        ei = ipqVar.ei(i, i2, ffem.a, new ebn(iqkVarArr, this, i2, iArr));
        return ei;
    }

    public final String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.b + ", verticalAlignment=" + this.a + ')';
    }
}
