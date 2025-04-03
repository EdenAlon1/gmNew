package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsd implements Iterable, fflg {
    public static final hsd a = new hsd(0, 0, 0, null);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    private hsd(long j, long j2, long j3, long[] jArr) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final hsd a(hsd hsdVar) {
        hsd hsdVar2 = a;
        if (hsdVar == hsdVar2) {
            return this;
        }
        if (this == hsdVar2) {
            return hsdVar2;
        }
        long j = hsdVar.d;
        long j2 = this.d;
        if (j == j2) {
            long[] jArr = hsdVar.e;
            long[] jArr2 = this.e;
            if (jArr == jArr2) {
                return new hsd((~hsdVar.b) & this.b, this.c & (~hsdVar.c), j2, jArr2);
            }
        }
        long[] jArr3 = hsdVar.e;
        hsd hsdVar3 = this;
        if (jArr3 != null) {
            for (long j3 : jArr3) {
                hsdVar3 = hsdVar3.b(j3);
            }
        }
        if (hsdVar.c != 0) {
            for (int i = 0; i < 64; i++) {
                if ((hsdVar.c & (1 << i)) != 0) {
                    hsdVar3 = hsdVar3.b(hsdVar.d + i);
                }
            }
        }
        if (hsdVar.b != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((hsdVar.b & (1 << i2)) != 0) {
                    hsdVar3 = hsdVar3.b(hsdVar.d + i2 + 64);
                }
            }
        }
        return hsdVar3;
    }

    public final hsd b(long j) {
        long[] jArr;
        int a2;
        long[] jArr2;
        long j2 = this.d;
        long j3 = j - j2;
        if (j3 >= 0 && j3 < 64) {
            long j4 = 1 << ((int) j3);
            long j5 = this.c;
            if ((j5 & j4) != 0) {
                return new hsd(this.b, j5 & (~j4), j2, this.e);
            }
        } else if (j3 >= 64 && j3 < 128) {
            long j6 = 1 << (((int) j3) - 64);
            long j7 = this.b;
            if ((j7 & j6) != 0) {
                return new hsd((~j6) & j7, this.c, j2, this.e);
            }
        } else if (j3 < 0 && (jArr = this.e) != null && (a2 = hse.a(jArr, j)) >= 0) {
            long j8 = this.b;
            long j9 = this.c;
            long j10 = this.d;
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (a2 > 0) {
                    ffdo.m(jArr, jArr3, 0, 0, a2);
                }
                if (a2 < i) {
                    ffdo.m(jArr, jArr3, a2, a2 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new hsd(j8, j9, j10, jArr2);
        }
        return this;
    }

    public final hsd c(hsd hsdVar) {
        long j;
        hsd hsdVar2 = hsdVar;
        hsd hsdVar3 = a;
        if (hsdVar2 == hsdVar3) {
            return this;
        }
        if (this == hsdVar3) {
            return hsdVar2;
        }
        long j2 = hsdVar2.d;
        long j3 = this.d;
        if (j2 == j3) {
            long[] jArr = hsdVar2.e;
            long[] jArr2 = this.e;
            if (jArr == jArr2) {
                return new hsd(hsdVar2.b | this.b, hsdVar2.c | this.c, j3, jArr2);
            }
        }
        long j4 = 64;
        int i = 0;
        if (this.e == null) {
            if (this.c != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((this.c & (1 << i2)) != 0) {
                        hsdVar2 = hsdVar2.d(this.d + i2);
                    }
                }
            }
            if (this.b != 0) {
                while (i < 64) {
                    if ((this.b & (1 << i)) != 0) {
                        hsdVar2 = hsdVar2.d(this.d + i + 64);
                    }
                    i++;
                }
            }
            return hsdVar2;
        }
        long[] jArr3 = hsdVar2.e;
        hsd hsdVar4 = this;
        if (jArr3 != null) {
            for (long j5 : jArr3) {
                hsdVar4 = hsdVar4.d(j5);
            }
        }
        if (hsdVar2.c != 0) {
            int i3 = 0;
            while (i3 < 64) {
                if ((hsdVar2.c & (1 << i3)) != 0) {
                    j = j4;
                    hsdVar4 = hsdVar4.d(hsdVar2.d + i3);
                } else {
                    j = j4;
                }
                i3++;
                j4 = j;
            }
        }
        long j6 = j4;
        if (hsdVar2.b != 0) {
            while (i < 64) {
                if ((hsdVar2.b & (1 << i)) != 0) {
                    hsdVar4 = hsdVar4.d(hsdVar2.d + i + j6);
                }
                i++;
            }
        }
        return hsdVar4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cf, code lost:
    
        if (r3 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.hsd d(long r29) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsd.d(long):hsd");
    }

    public final boolean e(long j) {
        long[] jArr;
        long j2 = j - this.d;
        if (j2 < 0 || j2 >= 64) {
            if (j2 < 64 || j2 >= 128) {
                if (j2 <= 0 && (jArr = this.e) != null && hse.a(jArr, j) >= 0) {
                    return true;
                }
            } else if (((1 << (((int) j2) - 64)) & this.b) != 0) {
                return true;
            }
        } else if (((1 << ((int) j2)) & this.c) != 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new ffnp(new hsc(this, null)).a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(ffdx.n(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
