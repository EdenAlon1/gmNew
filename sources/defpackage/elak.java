package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elak {
    public final int[] a;
    public final elai b;
    public elai c;
    public int d;
    public int e;
    public int f;

    public elak(int[] iArr) {
        this.a = iArr;
        elai elaiVar = new elai(-1, -1);
        this.b = elaiVar;
        this.c = elaiVar;
    }

    private final void d(elai elaiVar, StringBuilder sb) {
        for (elai elaiVar2 : elaiVar.d.values()) {
            sb.append("  ");
            sb.append(elaiVar);
            sb.append(" -> ");
            sb.append(elaiVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, elaiVar2.a, Math.min(iArr.length, elaiVar2.b + 1))));
            sb.append("\"]\n");
            d(elaiVar2, sb);
        }
    }

    final void a() {
        elai elaiVar = this.c.c;
        if (elaiVar != null) {
            this.c = elaiVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        elai elaiVar = (elai) this.c.d.get(Integer.valueOf(this.a[this.d]));
        while (true) {
            int i = (elaiVar.b - elaiVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = elaiVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                elaiVar = (elai) elaiVar.d.get(Integer.valueOf(this.a[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int min = Math.min(this.a.length, i2);
            if (min - i == Math.min(this.a.length, i4) - i3) {
                for (int i5 = i; i5 <= min; i5++) {
                    int[] iArr = this.a;
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
