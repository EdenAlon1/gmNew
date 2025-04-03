package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jfq implements Comparator {
    public static final jfq a = new jfq();

    private jfq() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        iam c = ((jjw) obj).c();
        iam c2 = ((jjw) obj2).c();
        int compare = Float.compare(c2.d, c.d);
        if (compare != 0) {
            return compare;
        }
        int compare2 = Float.compare(c.c, c2.c);
        if (compare2 != 0) {
            return compare2;
        }
        int compare3 = Float.compare(c.e, c2.e);
        return compare3 != 0 ? compare3 : Float.compare(c2.b, c.b);
    }
}
