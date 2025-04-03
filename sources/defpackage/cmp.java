package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cmp {
    public float[] a;
    public int b;

    public cmp(int i) {
        this.a = i == 0 ? cms.a : new float[i];
    }

    public final float a(int i) {
        if (i < 0 || i >= this.b) {
            cpx.c("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cmp) {
            cmp cmpVar = (cmp) obj;
            int i = cmpVar.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = cmpVar.a;
                ffmj q = ffmk.q(0, i2);
                int i3 = q.a;
                int i4 = q.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Float.floatToIntBits(fArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            float f = fArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i2++;
        }
        return sb.toString();
    }
}
