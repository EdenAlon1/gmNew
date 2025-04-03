package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhoz {
    public boolean a = true;

    public final void a(int i, int i2) {
        if (this.a) {
            this.a = i == i2;
        }
    }

    public final void b(long j, long j2) {
        if (this.a) {
            this.a = j == j2;
        }
    }

    public final void c(Object obj, Object obj2) {
        if (this.a && obj != obj2) {
            if (obj == null || obj2 == null) {
                e();
                return;
            }
            if (!obj.getClass().isArray()) {
                this.a = obj.equals(obj2);
                return;
            }
            if (obj.getClass() != obj2.getClass()) {
                e();
                return;
            }
            int i = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (!this.a || jArr == jArr2) {
                    return;
                }
                if (jArr.length != jArr2.length) {
                    e();
                    return;
                }
                while (i < jArr.length && this.a) {
                    b(jArr[i], jArr2[i]);
                    i++;
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (!this.a || iArr == iArr2) {
                    return;
                }
                if (iArr.length != iArr2.length) {
                    e();
                    return;
                }
                while (i < iArr.length && this.a) {
                    a(iArr[i], iArr2[i]);
                    i++;
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (!this.a || sArr == sArr2) {
                    return;
                }
                if (sArr.length != sArr2.length) {
                    e();
                    return;
                }
                for (int i2 = 0; i2 < sArr.length && this.a; i2++) {
                    this.a = sArr[i2] == sArr2[i2];
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (!this.a || cArr == cArr2) {
                    return;
                }
                if (cArr.length != cArr2.length) {
                    e();
                    return;
                }
                for (int i3 = 0; i3 < cArr.length && this.a; i3++) {
                    this.a = cArr[i3] == cArr2[i3];
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (!this.a || bArr == bArr2) {
                    return;
                }
                if (bArr.length != bArr2.length) {
                    e();
                    return;
                }
                for (int i4 = 0; i4 < bArr.length && this.a; i4++) {
                    this.a = bArr[i4] == bArr2[i4];
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (!this.a || dArr == dArr2) {
                    return;
                }
                if (dArr.length != dArr2.length) {
                    e();
                    return;
                }
                while (i < dArr.length && this.a) {
                    b(Double.doubleToLongBits(dArr[i]), Double.doubleToLongBits(dArr2[i]));
                    i++;
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (!this.a || fArr == fArr2) {
                    return;
                }
                if (fArr.length != fArr2.length) {
                    e();
                    return;
                }
                while (i < fArr.length && this.a) {
                    a(Float.floatToIntBits(fArr[i]), Float.floatToIntBits(fArr2[i]));
                    i++;
                }
                return;
            }
            if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                boolean[] zArr2 = (boolean[]) obj2;
                if (!this.a || zArr == zArr2) {
                    return;
                }
                if (zArr.length != zArr2.length) {
                    e();
                    return;
                }
                while (i < zArr.length && this.a) {
                    d(zArr[i], zArr2[i]);
                    i++;
                }
                return;
            }
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (!this.a || objArr == objArr2) {
                return;
            }
            if (objArr.length != objArr2.length) {
                e();
                return;
            }
            while (i < objArr.length && this.a) {
                c(objArr[i], objArr2[i]);
                i++;
            }
        }
    }

    public final void d(boolean z, boolean z2) {
        if (this.a) {
            this.a = z == z2;
        }
    }

    protected final void e() {
        this.a = false;
    }
}
