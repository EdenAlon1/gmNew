package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogq implements Serializable {
    private final int a = 1;
    private final int b = 1;
    private final int c = 0;
    private final int d = 1;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eogq)) {
            return false;
        }
        eogq eogqVar = (eogq) obj;
        int i = eogqVar.a;
        int i2 = eogqVar.b;
        int i3 = eogqVar.c;
        int i4 = eogqVar.d;
        return true;
    }

    public final int hashCode() {
        return 12036526;
    }
}
