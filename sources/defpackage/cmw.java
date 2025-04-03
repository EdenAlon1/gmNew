package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cmw {
    public int[] a;
    public int b;

    public cmw(int i) {
        this.a = i == 0 ? cnb.a : new int[i];
    }

    public final int a(int i) {
        if (i < 0 || i >= this.b) {
            cpx.c("Index must be between 0 and size");
        }
        return this.a[i];
    }

    public final int b() {
        if (this.b == 0) {
            cpx.d("IntList is empty.");
        }
        return this.a[this.b - 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cmw) {
            cmw cmwVar = (cmw) obj;
            int i = cmwVar.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = cmwVar.a;
                ffmj q = ffmk.q(0, i2);
                int i3 = q.a;
                int i4 = q.b;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
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
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3] * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }
}
