package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bb {
    public final ArrayList a = new ArrayList();

    public final void a(bc bcVar) {
        float f;
        float f2;
        float f3;
        this.a.clear();
        int i = 1;
        while (true) {
            f = 0.0f;
            if (i >= bcVar.e) {
                break;
            }
            be beVar = bcVar.g.a[i];
            for (int i2 = 0; i2 < 6; i2++) {
                beVar.e[i2] = 0.0f;
            }
            beVar.e[beVar.c] = 1.0f;
            if (beVar.h == 4) {
                this.a.add(beVar);
            }
            i++;
        }
        int size = this.a.size();
        int i3 = 0;
        while (i3 < size) {
            be beVar2 = (be) this.a.get(i3);
            int i4 = beVar2.b;
            if (i4 != -1) {
                ay ayVar = bcVar.c[i4].d;
                int i5 = ayVar.a;
                int i6 = 0;
                while (i6 < i5) {
                    be d = ayVar.d(i6);
                    if (d == null) {
                        f3 = f;
                    } else {
                        float b = ayVar.b(i6);
                        int i7 = 0;
                        while (i7 < 6) {
                            float[] fArr = d.e;
                            fArr[i7] = fArr[i7] + (beVar2.e[i7] * b);
                            i7++;
                            f = f;
                        }
                        f3 = f;
                        if (!this.a.contains(d)) {
                            this.a.add(d);
                        }
                    }
                    i6++;
                    f = f3;
                }
                f2 = f;
                for (int i8 = 0; i8 < 6; i8++) {
                    beVar2.e[i8] = f2;
                }
            } else {
                f2 = f;
            }
            i3++;
            f = f2;
        }
    }

    public final String toString() {
        int size = this.a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            be beVar = (be) this.a.get(i);
            Objects.toString(beVar);
            String str2 = "null[";
            int i2 = 0;
            while (true) {
                float[] fArr = beVar.e;
                if (i2 < 6) {
                    String str3 = str2 + beVar.e[i2];
                    float[] fArr2 = beVar.e;
                    str2 = str3.concat(i2 < 5 ? ", " : "] ");
                    i2++;
                }
            }
            str = str.concat(str2);
        }
        return str;
    }
}
