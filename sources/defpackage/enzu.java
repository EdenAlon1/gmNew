package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enzu implements Serializable {
    public static final engw a;
    public final int d;
    private final int e = 0;
    public final int b = 30;
    public final int c = 1;

    static {
        int i = engw.d;
        engr engrVar = new engr();
        for (int i2 = 0; i2 < 6; i2++) {
            engrVar.h(new enxy(enxz.r(i2)));
        }
        a = engrVar.g();
    }

    public enzu(enzq enzqVar) {
        this.d = enzqVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof enzu) {
            enzu enzuVar = (enzu) obj;
            int i = enzuVar.e;
            int i2 = enzuVar.b;
            int i3 = enzuVar.c;
            if (this.d == enzuVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, 30, 1, Integer.valueOf(this.d)});
    }
}
