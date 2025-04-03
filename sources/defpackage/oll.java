package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oll {
    public static final oll a = new oll(0, ffel.a);
    public final int[] b;
    public final List c;
    public final int d;
    public final List e;

    public oll(int i, List list) {
        this(new int[]{i}, list, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        oll ollVar = (oll) obj;
        return Arrays.equals(this.b, ollVar.b) && ffkj.e(this.c, ollVar.c) && this.d == ollVar.d && ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TransformablePage(originalPageOffsets=" + Arrays.toString(this.b) + ", data=" + this.c + ", hintOriginalPageOffset=" + this.d + ", hintOriginalIndices=null)";
    }

    public oll(int[] iArr, List list, int i) {
        iArr.getClass();
        list.getClass();
        this.b = iArr;
        this.c = list;
        this.d = i;
        this.e = null;
    }
}
