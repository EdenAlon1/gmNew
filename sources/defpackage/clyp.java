package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class clyp implements Predicate {
    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo439negate() {
        return Predicate$CC.$default$negate(this);
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        int a;
        int a2;
        clxy clxyVar = (clxy) obj;
        cskc cskcVar = clyt.a;
        int a3 = clxw.a(clxyVar.c);
        if (a3 == 0) {
            a3 = 1;
        }
        int i = clxyVar.e;
        int a4 = clxv.a(i);
        return a3 == 3 && ((a4 != 0 && a4 == 4) || (((a = clxv.a(i)) != 0 && a == 6) || ((a2 = clxv.a(i)) != 0 && a2 == 5)));
    }
}
