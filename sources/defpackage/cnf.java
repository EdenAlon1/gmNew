package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cnf {
    public long[] a = cpg.a;
    public long[] b = cnn.a;
    public int[] c = cnb.a;
    public int d;
    public int e;

    public final int a(long j) {
        int a = cne.a(j) * (-862048943);
        int i = this.d;
        int i2 = ((a ^ (a << 16)) >>> 7) & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.a;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j2 = (((-i5) >> 63) & (jArr[i4 + 1] << (64 - i5))) | (jArr[i4] >>> i5);
            long j3 = j2 ^ ((r0 & 127) * 72340172838076673L);
            for (long j4 = (~j3) & ((-72340172838076673L) + j3) & (-9187201950435737472L); j4 != 0; j4 &= (-1) + j4) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i2) & i;
                if (this.b[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final int b(long j) {
        int a = a(j);
        if (a < 0) {
            cpx.d(a.s(j, "Cannot find value for key "));
        }
        return this.c[a];
    }

    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        boolean z2;
        long[] jArr2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cnf)) {
            return false;
        }
        cnf cnfVar = (cnf) obj;
        if (cnfVar.e != this.e) {
            return false;
        }
        long[] jArr3 = this.b;
        int[] iArr = this.c;
        long[] jArr4 = this.a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i = 0;
        loop0: while (true) {
            long j = jArr4[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = i - length;
                int i3 = 0;
                while (true) {
                    int i4 = 8 - ((~i2) >>> 31);
                    if (i3 < i4) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i3;
                            z2 = z3;
                            jArr2 = jArr3;
                            long j2 = jArr2[i5];
                            int i6 = iArr[i5];
                            int a = cnfVar.a(j2);
                            if (a < 0 || i6 != cnfVar.c[a]) {
                                break loop0;
                            }
                        } else {
                            z2 = z3;
                            jArr2 = jArr3;
                        }
                        j >>= 8;
                        i3++;
                        z3 = z2;
                        jArr3 = jArr2;
                    } else {
                        z = z3;
                        jArr = jArr3;
                        if (i4 != 8) {
                            return z;
                        }
                    }
                }
            } else {
                z = z3;
                jArr = jArr3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
            jArr3 = jArr;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr2[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = i2 - length;
                int i5 = 0;
                while (true) {
                    i = 8 - ((~i4) >>> 31);
                    if (i5 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i6 = (i2 << 3) + i5;
                        i3 += iArr[i6] ^ cne.a(jArr[i6]);
                    }
                    j >>= 8;
                    i5++;
                }
                if (i != 8) {
                    return i3;
                }
            }
            if (i2 == length) {
                return i3;
            }
            i2++;
        }
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.b;
        int[] iArr = this.c;
        long[] jArr2 = this.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j = jArr2[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = i4 - length;
                    int i7 = 0;
                    while (true) {
                        i2 = 8 - ((~i6) >>> 31);
                        if (i7 >= i2) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j2 = jArr[i8];
                            int i9 = iArr[i8];
                            sb.append(j2);
                            sb.append("=");
                            sb.append(i9);
                            i5++;
                            if (i5 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i10 = i4;
                    if (i2 != 8) {
                        break;
                    }
                    i = i10;
                } else {
                    i = i4;
                }
                if (i == length) {
                    break;
                }
                i4 = i + 1;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
