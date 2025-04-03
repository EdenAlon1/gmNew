package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enek extends enem {
    static final enem g(int i) {
        return i < 0 ? enem.c : i > 0 ? enem.d : enem.b;
    }

    @Override // defpackage.enem
    public final int a() {
        return 0;
    }

    @Override // defpackage.enem
    public final enem b(int i, int i2) {
        return g(Integer.compare(i, i2));
    }

    @Override // defpackage.enem
    public final enem c(Comparable comparable, Comparable comparable2) {
        return g(comparable.compareTo(comparable2));
    }

    @Override // defpackage.enem
    public final enem d(Object obj, Object obj2, Comparator comparator) {
        return g(comparator.compare(obj, obj2));
    }

    @Override // defpackage.enem
    public final enem e(boolean z, boolean z2) {
        return g(Boolean.compare(z, z2));
    }

    @Override // defpackage.enem
    public final enem f(boolean z, boolean z2) {
        return g(Boolean.compare(z2, z));
    }
}
