package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elr {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    final /* synthetic */ elt e;

    public elr(elt eltVar, List list) {
        this.e = eltVar;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            dwv.c("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
