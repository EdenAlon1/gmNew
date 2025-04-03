package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffdv extends ffds {
    public static final int A(long[] jArr) {
        jArr.getClass();
        return jArr.length - 1;
    }

    public static final int B(Object[] objArr) {
        objArr.getClass();
        return objArr.length - 1;
    }

    public static final int C(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final int D(Object[] objArr, Object obj) {
        objArr.getClass();
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (ffkj.e(obj, objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final int E(int[] iArr) {
        int z = ffdo.z(iArr);
        int i = iArr[0];
        if (z > 0) {
            int i2 = 1;
            while (true) {
                int i3 = iArr[i2];
                if (i < i3) {
                    i = i3;
                }
                if (i2 == z) {
                    break;
                }
                i2++;
            }
        }
        return i;
    }

    public static final Iterable F(Object[] objArr) {
        objArr.getClass();
        return objArr.length == 0 ? ffel.a : new ffdt(objArr);
    }

    public static final Object G(Object[] objArr) {
        objArr.getClass();
        if (objArr.length != 0) {
            return objArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final Object H(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static final Object I(Object[] objArr, int i) {
        objArr.getClass();
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static final List J(Object[] objArr) {
        objArr.getClass();
        ArrayList arrayList = new ArrayList();
        ffdo.Q(objArr, arrayList);
        return arrayList;
    }

    public static final List K(float[] fArr) {
        int length = fArr.length;
        if (length == 0) {
            return ffel.a;
        }
        if (length == 1) {
            return ffdx.g(Float.valueOf(fArr[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static final List L(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        return length != 0 ? length != 1 ? ffdo.M(objArr) : ffdx.g(objArr[0]) : ffel.a;
    }

    public static final List M(Object[] objArr) {
        objArr.getClass();
        return new ArrayList(new ffdm(objArr, false));
    }

    public static final Set N(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return ffen.a;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(ffew.a(length));
        ffdo.S(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static final ffmj O(int[] iArr) {
        return new ffmj(0, ffdo.z(iArr));
    }

    public static final boolean P(Object[] objArr, Object obj) {
        return ffdo.D(objArr, obj) >= 0;
    }

    public static final void Q(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            if (obj != null) {
                collection.add(obj);
            }
        }
    }

    public static /* synthetic */ String R(Object[] objArr, CharSequence charSequence, int i) {
        if (1 == (i & 1)) {
            charSequence = ", ";
        }
        charSequence.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append(charSequence);
            }
            ffpc.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static final void S(Object[] objArr, Collection collection) {
        for (Object obj : objArr) {
            collection.add(obj);
        }
    }

    public static final int x(int[] iArr) {
        iArr.getClass();
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int y(float[] fArr) {
        return fArr.length - 1;
    }

    public static final int z(int[] iArr) {
        return iArr.length - 1;
    }
}
