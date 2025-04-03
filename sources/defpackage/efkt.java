package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efkt {
    static final Object[] a;
    static final efkt b;
    public final Object[] c;
    private final int d;

    static {
        Object[] objArr = new Object[0];
        a = objArr;
        b = new efkt(objArr);
    }

    public efkt(Object... objArr) {
        this.c = objArr;
        this.d = Arrays.hashCode(objArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof efkt)) {
            return false;
        }
        efkt efktVar = (efkt) obj;
        return this.d == efktVar.d && Arrays.equals(this.c, efktVar.c);
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return Arrays.toString(this.c);
    }
}
