package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpz {
    private final SparseBooleanArray a;

    public lpz(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        lti.e(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpz)) {
            return false;
        }
        int i = lvf.a;
        return this.a.equals(((lpz) obj).a);
    }

    public final int hashCode() {
        int i = lvf.a;
        return this.a.hashCode();
    }
}
