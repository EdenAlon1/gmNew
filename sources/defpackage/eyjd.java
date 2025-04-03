package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyjd {
    public static final eyjd a = new eyjd(0, new int[0], new Object[0], false);
    public int b;
    public int[] c;
    public Object[] d;
    public int e;
    private boolean f;

    private eyjd(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    static eyjd b(eyjd eyjdVar, eyjd eyjdVar2) {
        int i = eyjdVar.b + eyjdVar2.b;
        int[] copyOf = Arrays.copyOf(eyjdVar.c, i);
        System.arraycopy(eyjdVar2.c, 0, copyOf, eyjdVar.b, eyjdVar2.b);
        Object[] copyOf2 = Arrays.copyOf(eyjdVar.d, i);
        System.arraycopy(eyjdVar2.d, 0, copyOf2, eyjdVar.b, eyjdVar2.b);
        return new eyjd(i, copyOf, copyOf2, true);
    }

    public final int a() {
        int X;
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            int i4 = this.c[i3];
            int a2 = eyjt.a(i4);
            int b = eyjt.b(i4);
            if (b == 0) {
                X = eyer.X(a2, ((Long) this.d[i3]).longValue());
            } else if (b == 1) {
                ((Long) this.d[i3]).longValue();
                X = eyer.aq(a2);
            } else if (b == 2) {
                X = eyer.B(a2, (eyee) this.d[i3]);
            } else if (b == 3) {
                int U = eyer.U(a2);
                X = U + U + ((eyjd) this.d[i3]).a();
            } else {
                if (b != 5) {
                    throw new IllegalStateException(new eygt());
                }
                ((Integer) this.d[i3]).intValue();
                X = eyer.ap(a2);
            }
            i2 += X;
        }
        this.e = i2;
        return i2;
    }

    final void c() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void d(int i) {
        int[] iArr = this.c;
        if (i > iArr.length) {
            int i2 = this.b;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.c = Arrays.copyOf(iArr, i);
            this.d = Arrays.copyOf(this.d, i);
        }
    }

    public final void e() {
        if (this.f) {
            this.f = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof eyjd)) {
            return false;
        }
        eyjd eyjdVar = (eyjd) obj;
        int i = this.b;
        if (i == eyjdVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = eyjdVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.d;
                    Object[] objArr2 = eyjdVar.d;
                    int i3 = this.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    final void f(int i, Object obj) {
        c();
        d(this.b + 1);
        int[] iArr = this.c;
        int i2 = this.b;
        iArr[i2] = i;
        this.d[i2] = obj;
        this.b = i2 + 1;
    }

    final boolean g(int i, eyel eyelVar) {
        int m;
        c();
        int b = eyjt.b(i);
        if (b == 0) {
            f(i, Long.valueOf(eyelVar.p()));
            return true;
        }
        if (b == 1) {
            f(i, Long.valueOf(eyelVar.o()));
            return true;
        }
        if (b == 2) {
            f(i, eyelVar.w());
            return true;
        }
        if (b != 3) {
            if (b == 4) {
                eyelVar.P();
                return false;
            }
            if (b != 5) {
                throw new eygt();
            }
            f(i, Integer.valueOf(eyelVar.g()));
            return true;
        }
        eyjd eyjdVar = new eyjd();
        do {
            m = eyelVar.m();
            if (m == 0) {
                break;
            }
        } while (eyjdVar.g(m, eyelVar));
        eyelVar.z(eyjt.c(eyjt.a(i), 4));
        f(i, eyjdVar);
        return true;
    }

    public final void h(eyes eyesVar) {
        if (this.b != 0) {
            for (int i = 0; i < this.b; i++) {
                int i2 = this.c[i];
                Object obj = this.d[i];
                int b = eyjt.b(i2);
                int a2 = eyjt.a(i2);
                if (b == 0) {
                    eyesVar.j(a2, ((Long) obj).longValue());
                } else if (b == 1) {
                    eyesVar.f(a2, ((Long) obj).longValue());
                } else if (b == 2) {
                    eyesVar.b(a2, (eyee) obj);
                } else if (b == 3) {
                    eyesVar.a.u(a2, 3);
                    ((eyjd) obj).h(eyesVar);
                    eyesVar.a.u(a2, 4);
                } else {
                    if (b != 5) {
                        throw new RuntimeException(new eygt());
                    }
                    eyesVar.e(a2, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = i + 527;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.d;
        int i7 = this.b;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public eyjd() {
        this(0, new int[8], new Object[8], true);
    }
}
