package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqv extends ffkk implements ffjm {
    public static final hqv a = new hqv();

    public hqv() {
        super(2);
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        int i;
        hra hraVar = (hra) obj2;
        Map map = hraVar.b;
        cop copVar = hraVar.c;
        Object[] objArr = copVar.b;
        Object[] objArr2 = copVar.c;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = i2 - length;
                    int i4 = 0;
                    while (true) {
                        i = 8 - ((~i3) >>> 31);
                        if (i4 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            hraVar.a((hrc) objArr2[i5], map, objArr[i5]);
                        }
                        j >>= 8;
                        i4++;
                    }
                    if (i != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }
}
