package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class tr implements Comparator {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        tt ttVar = (tt) obj;
        tt ttVar2 = (tt) obj2;
        RecyclerView recyclerView = ttVar.d;
        if ((recyclerView == null) != (ttVar2.d == null)) {
            return recyclerView != null ? -1 : 1;
        }
        boolean z = ttVar.a;
        if (z != ttVar2.a) {
            return !z ? 1 : -1;
        }
        int i = ttVar2.b - ttVar.b;
        if (i != 0) {
            return i;
        }
        int i2 = ttVar.c - ttVar2.c;
        if (i2 == 0) {
            return 0;
        }
        return i2;
    }
}
