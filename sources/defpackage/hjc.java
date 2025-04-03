package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hjc extends ffkk implements ffjm {
    final /* synthetic */ hjh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjc(hjh hjhVar) {
        super(2);
        this.a = hjhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ffrf ffrfVar;
        int i;
        Set set = (Set) obj;
        hjh hjhVar = this.a;
        synchronized (hjhVar.d) {
            if (((hiu) hjhVar.q.c()).compareTo(hiu.e) >= 0) {
                coq coqVar = hjhVar.g;
                if (set instanceof hnh) {
                    cpi cpiVar = ((hnh) set).a;
                    Object[] objArr = cpiVar.b;
                    long[] jArr = cpiVar.a;
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
                                    if ((j & 255) < 128) {
                                        Object obj3 = objArr[(i2 << 3) + i4];
                                        if (!(obj3 instanceof htn) || ((htn) obj3).k(1)) {
                                            coqVar.g(obj3);
                                        }
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
                } else {
                    for (Object obj4 : set) {
                        if (!(obj4 instanceof htn) || ((htn) obj4).k(1)) {
                            coqVar.g(obj4);
                        }
                    }
                }
                ffrfVar = hjhVar.v();
            } else {
                ffrfVar = null;
            }
        }
        if (ffrfVar != null) {
            ffrfVar.w(ffcu.a);
        }
        return ffcu.a;
    }
}
