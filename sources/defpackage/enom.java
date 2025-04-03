package defpackage;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enom implements Comparator {
    protected enom() {
    }

    public static enom d(Comparator comparator) {
        return comparator instanceof enom ? (enom) comparator : new enei(comparator);
    }

    public enom a() {
        return new enof(this);
    }

    public enom b() {
        return new enog(this);
    }

    public enom c() {
        return new enpg(this);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public final List e(Iterable iterable) {
        Object[] r = enjk.r(iterable);
        Arrays.sort(r, this);
        return enkr.a(Arrays.asList(r));
    }
}
