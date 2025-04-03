package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hig {
    public final List a;
    public final int b;
    public int c;
    public final List d;
    public final cnw e;
    public final ffbz f;

    public hig(List list, int i) {
        this.a = list;
        this.b = i;
        if (i < 0) {
            hih.a("Invalid start index");
        }
        this.d = new ArrayList();
        cnw cnwVar = new cnw((byte[]) null);
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            hha hhaVar = (hha) this.a.get(i3);
            cnwVar.f(hhaVar.c, new hgu(i3, i2, hhaVar.d));
            i2 += hhaVar.d;
        }
        this.e = cnwVar;
        this.f = ffca.a(new hif(this));
    }

    public final int a(hha hhaVar) {
        hgu hguVar = (hgu) this.e.a(hhaVar.c);
        if (hguVar != null) {
            return hguVar.b;
        }
        return -1;
    }

    public final int b(hha hhaVar) {
        hgu hguVar = (hgu) this.e.a(hhaVar.c);
        return hguVar != null ? hguVar.c : hhaVar.d;
    }

    public final void c(hha hhaVar, int i) {
        this.e.f(hhaVar.c, new hgu(-1, i, 0));
    }

    public final boolean d(int i, int i2) {
        int i3;
        int i4;
        hgu hguVar = (hgu) this.e.a(i);
        if (hguVar == null) {
            return false;
        }
        int i5 = hguVar.b;
        int i6 = i2 - hguVar.c;
        hguVar.c = i2;
        if (i6 == 0) {
            return true;
        }
        cnw cnwVar = this.e;
        Object[] objArr = cnwVar.c;
        long[] jArr = cnwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i8 = i7 - length;
                int i9 = 0;
                while (true) {
                    i3 = 8 - ((~i8) >>> 31);
                    if (i9 >= i3) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        hgu hguVar2 = (hgu) objArr[(i7 << 3) + i9];
                        if (hguVar2.b >= i5 && !ffkj.e(hguVar2, hguVar) && (i4 = hguVar2.b + i6) >= 0) {
                            hguVar2.b = i4;
                        }
                    }
                    j >>= 8;
                    i9++;
                }
                if (i3 != 8) {
                    return true;
                }
            }
            if (i7 == length) {
                return true;
            }
            i7++;
        }
    }

    public final void e(hha hhaVar) {
        this.d.add(hhaVar);
    }
}
