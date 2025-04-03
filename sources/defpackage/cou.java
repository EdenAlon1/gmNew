package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cou {
    public long[] a = cpg.a;
    public Object[] b = cpu.c;
    public float[] c = cms.a;
    public int d;
    public int e;

    public final int c(Object obj) {
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int i2 = this.d;
        int i3 = hashCode * (-862048943);
        int i4 = (i3 ^ (i3 << 16)) >>> 7;
        while (true) {
            int i5 = i4 & i2;
            long[] jArr = this.a;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = (((-i7) >> 63) & (jArr[i6 + 1] << (64 - i7))) | (jArr[i6] >>> i7);
            long j2 = j ^ ((r1 & 127) * 72340172838076673L);
            for (long j3 = (~j2) & ((-72340172838076673L) + j2) & (-9187201950435737472L); j3 != 0; j3 &= (-1) + j3) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i2;
                if (ffkj.e(this.b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i += 8;
            i4 = i5 + i;
        }
    }

    public final boolean d(Object obj) {
        return c(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cou)) {
            return false;
        }
        cou couVar = (cou) obj;
        if (couVar.e != this.e) {
            return false;
        }
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
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
                            int i5 = (i << 3) + i3;
                            Object obj2 = objArr[i5];
                            float f = fArr[i5];
                            int c = couVar.c(obj2);
                            if (c < 0) {
                                break loop0;
                            }
                            z2 = z3;
                            if (f != couVar.c[c]) {
                                break loop0;
                            }
                        } else {
                            z2 = z3;
                        }
                        j >>= 8;
                        i3++;
                        z3 = z2;
                    } else {
                        z = z3;
                        if (i4 != 8) {
                            return z;
                        }
                    }
                }
            } else {
                z = z3;
            }
            if (i == length) {
                return z;
            }
            i++;
            z3 = z;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j = jArr[i2];
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
                        Object obj = objArr[i6];
                        i3 += Float.floatToIntBits(fArr[i6]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (this.e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.b;
        float[] fArr = this.c;
        long[] jArr = this.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = (~(i2 - length)) >>> 31;
                    int i5 = 0;
                    while (true) {
                        i = 8 - i4;
                        if (i5 >= i) {
                            break;
                        }
                        if ((255 & j) < 128) {
                            int i6 = (i2 << 3) + i5;
                            Object obj = objArr[i6];
                            float f = fArr[i6];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(f);
                            i3++;
                            if (i3 < this.e) {
                                sb.append(", ");
                            }
                        }
                        j >>= 8;
                        i5++;
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
        sb.append('}');
        return sb.toString();
    }
}
