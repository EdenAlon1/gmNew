package defpackage;

import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hkr extends ffkk implements ffjm {
    final /* synthetic */ ffwm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkr(ffwm ffwmVar) {
        super(2);
        this.a = ffwmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Set set = (Set) obj;
        if (set instanceof hnh) {
            cpi cpiVar = ((hnh) set).a;
            Object[] objArr = cpiVar.b;
            long[] jArr = cpiVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = i - length;
                        int i3 = 0;
                        while (true) {
                            int i4 = 8 - ((~i2) >>> 31);
                            if (i3 < i4) {
                                if ((255 & j) < 128) {
                                    Object obj3 = objArr[(i << 3) + i3];
                                    if (!(obj3 instanceof htn) || ((htn) obj3).k(4)) {
                                        break loop0;
                                    }
                                }
                                j >>= 8;
                                i3++;
                            } else if (i4 != 8) {
                                break;
                            }
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        } else if (!(set instanceof Collection) || !set.isEmpty()) {
            for (Object obj4 : set) {
                if ((obj4 instanceof htn) && !((htn) obj4).k(4)) {
                }
                this.a.b(set);
            }
        }
        return ffcu.a;
    }
}
