package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jal implements Comparator {
    final /* synthetic */ Comparator a;
    final /* synthetic */ Comparator b;

    public jal(Comparator comparator, Comparator comparator2) {
        this.a = comparator;
        this.b = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        return compare != 0 ? compare : this.b.compare(((jjw) obj).b, ((jjw) obj2).b);
    }
}
