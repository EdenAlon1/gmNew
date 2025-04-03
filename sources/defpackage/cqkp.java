package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqkp implements Comparator {
    private static final long a(cqgj cqgjVar) {
        if (cqgjVar == null) {
            return 0L;
        }
        if (cqjg.e(cqgjVar)) {
            return 1L;
        }
        if (cqjg.f(cqgjVar)) {
            eyja eyjaVar = (cqgjVar.c == 4 ? (cqgb) cqgjVar.d : cqgb.a).c;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            return eyjaVar.b;
        }
        if (!cqjg.g(cqgjVar)) {
            return 0L;
        }
        eyja eyjaVar2 = (cqgjVar.c == 5 ? (cqgd) cqgjVar.d : cqgd.a).f;
        if (eyjaVar2 == null) {
            eyjaVar2 = eyja.a;
        }
        return eyjaVar2.b;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.signum(a((cqgj) obj) - a((cqgj) obj2));
    }
}
