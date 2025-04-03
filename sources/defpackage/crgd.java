package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crgd implements Comparator {
    final /* synthetic */ Comparator a;

    public crgd(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int compare = this.a.compare(obj, obj2);
        return compare != 0 ? compare : ffgh.a(Integer.valueOf(((crgf) obj).e), Integer.valueOf(((crgf) obj2).e));
    }
}
