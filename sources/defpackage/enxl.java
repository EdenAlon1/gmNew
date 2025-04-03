package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxl {
    public final double[] a;
    public final int b;
    private final int c;

    public enxl(int i) {
        emxf.b(true, "Negative rows not allowed.");
        emxf.b(true, "Negative cols not allowed.");
        this.c = 3;
        this.b = i;
        this.a = new double[i * 3];
    }

    public static enxl b(enyr... enyrVarArr) {
        enxl enxlVar = new enxl(enyrVarArr.length);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < enxlVar.b; i2++) {
                enxlVar.c(i, i2, enyrVarArr[i2].b(i));
            }
        }
        return enxlVar;
    }

    public final double a(int i, int i2) {
        return this.a[(i * this.b) + i2];
    }

    public final void c(int i, int i2, double d) {
        this.a[(i * this.b) + i2] = d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof enxl)) {
            return false;
        }
        enxl enxlVar = (enxl) obj;
        int i = enxlVar.c;
        if (this.b != enxlVar.b) {
            return false;
        }
        int i2 = 0;
        while (true) {
            double[] dArr = this.a;
            if (i2 >= dArr.length) {
                return true;
            }
            if (dArr[i2] != enxlVar.a[i2]) {
                return false;
            }
            i2++;
        }
    }

    public final int hashCode() {
        long j = this.b * 37;
        int i = 0;
        while (true) {
            double[] dArr = this.a;
            if (i >= dArr.length) {
                return (int) j;
            }
            j = (j * 37) + Double.doubleToLongBits(dArr[i]);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Matrix(3x");
        sb.append(this.b);
        sb.append("): ");
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                sb.append(a(i, i2));
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
