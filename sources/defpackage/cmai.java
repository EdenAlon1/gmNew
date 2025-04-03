package defpackage;

import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final /* synthetic */ class cmai implements Predicate {
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
        clzf clzfVar = (clzf) obj;
        int b = clzd.b(clzfVar.c);
        if (b == 0 || b != 3) {
            return false;
        }
        if ((clzfVar.b & 64) == 0) {
            int i = clzfVar.d;
            int b2 = clzb.b(i);
            if (b2 != 0 && b2 == 5) {
                return true;
            }
            int b3 = clzb.b(i);
            if (b3 != 0 && b3 == 6) {
                return true;
            }
            int b4 = clzb.b(i);
            if (b4 != 0 && b4 == 7) {
                return true;
            }
            int b5 = clzb.b(i);
            return b5 != 0 && b5 == 8;
        }
        int b6 = clzb.b(clzfVar.d);
        if (b6 != 0 && b6 == 9) {
            return true;
        }
        clze clzeVar = clze.INPUT_BOTTOMSHEET;
        clze b7 = clze.b(clzfVar.h);
        if (b7 == null) {
            b7 = clze.UNRECOGNIZED;
        }
        if (clzeVar.equals(b7)) {
            int b8 = clzb.b(clzfVar.d);
            return b8 != 0 && b8 == 10;
        }
        clze clzeVar2 = clze.INPUT_FULLSCREEN;
        clze b9 = clze.b(clzfVar.h);
        if (b9 == null) {
            b9 = clze.UNRECOGNIZED;
        }
        if (!clzeVar2.equals(b9)) {
            return false;
        }
        int i2 = clzfVar.d;
        int b10 = clzb.b(i2);
        if (b10 != 0 && b10 == 5) {
            return true;
        }
        int b11 = clzb.b(i2);
        return b11 != 0 && b11 == 10;
    }
}
