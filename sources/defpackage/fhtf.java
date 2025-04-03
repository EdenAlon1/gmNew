package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhtf {
    protected final int[] a;

    public fhtf(int[] iArr) {
        this.a = (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fhtf) {
            return Arrays.equals(this.a, ((fhtf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return fics.b(this.a);
    }
}
