package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhpa {
    public int a = 17;

    static {
        new ThreadLocal();
    }

    public final void a(int i) {
        this.a = (this.a * 37) + i;
    }

    public final void b(long j) {
        this.a = (this.a * 37) + ((int) (j ^ (j >> 32)));
    }

    public final void c(Object obj) {
        if (obj == null) {
            this.a *= 37;
            return;
        }
        if (!obj.getClass().isArray()) {
            this.a = (this.a * 37) + obj.hashCode();
            return;
        }
        int i = 0;
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            while (i < jArr.length) {
                b(jArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            while (i < iArr.length) {
                a(iArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            while (i < sArr.length) {
                this.a = (this.a * 37) + sArr[i];
                i++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            while (i < cArr.length) {
                this.a = (this.a * 37) + cArr[i];
                i++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            while (i < bArr.length) {
                this.a = (this.a * 37) + bArr[i];
                i++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            while (i < dArr.length) {
                b(Double.doubleToLongBits(dArr[i]));
                i++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            while (i < fArr.length) {
                this.a = (this.a * 37) + Float.floatToIntBits(fArr[i]);
                i++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            while (i < zArr.length) {
                d(zArr[i]);
                i++;
            }
            return;
        }
        Object[] objArr = (Object[]) obj;
        while (i < objArr.length) {
            c(objArr[i]);
            i++;
        }
    }

    public final void d(boolean z) {
        this.a = (this.a * 37) + (!z ? 1 : 0);
    }

    public final int hashCode() {
        return this.a;
    }
}
