package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mit {
    public final lpz a;
    private final SparseArray b;

    public mit(lpz lpzVar, SparseArray sparseArray) {
        this.a = lpzVar;
        SparseArray sparseArray2 = new SparseArray(lpzVar.b());
        for (int i = 0; i < lpzVar.b(); i++) {
            int a = lpzVar.a(i);
            mis misVar = (mis) sparseArray.get(a);
            lti.f(misVar);
            sparseArray2.append(a, misVar);
        }
        this.b = sparseArray2;
    }

    public final int a() {
        return this.a.b();
    }

    public final mis b(int i) {
        mis misVar = (mis) this.b.get(i);
        lti.f(misVar);
        return misVar;
    }

    public final boolean c(int i) {
        return this.a.c(i);
    }
}
