package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class hni {
    public static final void a(cop copVar, Object obj, Object obj2) {
        int a = copVar.a(obj);
        boolean z = a < 0;
        Object obj3 = z ? null : copVar.c[a];
        if (obj3 != null) {
            if (obj3 instanceof coq) {
                ((coq) obj3).g(obj2);
            } else if (obj3 != obj2) {
                coq coqVar = new coq((byte[]) null);
                coqVar.g(obj3);
                coqVar.g(obj2);
                obj2 = coqVar;
            }
            obj2 = obj3;
        }
        if (!z) {
            copVar.c[a] = obj2;
            return;
        }
        int i = ~a;
        copVar.b[i] = obj;
        copVar.c[i] = obj2;
    }

    public static final void b(cop copVar, Object obj) {
        int i;
        long[] jArr = copVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
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
                        Object obj2 = copVar.b[i5];
                        Object obj3 = copVar.c[i5];
                        if (obj3 instanceof coq) {
                            obj3.getClass();
                            coq coqVar = (coq) obj3;
                            coqVar.i(obj);
                            if (!coqVar.k()) {
                            }
                            copVar.c(i5);
                        } else {
                            if (obj3 != obj) {
                            }
                            copVar.c(i5);
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public static final boolean c(cop copVar, Object obj, Object obj2) {
        Object f = copVar.f(obj);
        if (f == null) {
            return false;
        }
        if (!(f instanceof coq)) {
            if (!ffkj.e(f, obj2)) {
                return false;
            }
            copVar.b(obj);
            return true;
        }
        coq coqVar = (coq) f;
        boolean i = coqVar.i(obj2);
        if (!i || !coqVar.k()) {
            return i;
        }
        copVar.b(obj);
        return true;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
