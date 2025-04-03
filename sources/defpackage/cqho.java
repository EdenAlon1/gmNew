package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqho implements ffji {
    final /* synthetic */ ffji a;

    public cqho(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cqgk cqgkVar = (cqgk) obj;
        cqgkVar.getClass();
        cqgo a = cqgn.a((cqfv) cqgkVar.toBuilder());
        this.a.invoke(a);
        cqgk a2 = a.a();
        int i = a2.b;
        if ((i & 2) != 0 && (i & 1) == 0) {
            throw new IllegalStateException("Check failed.");
        }
        eygr<cqgj> eygrVar = a2.c;
        eygrVar.getClass();
        int i2 = 0;
        if (!eygrVar.isEmpty()) {
            int i3 = 0;
            for (cqgj cqgjVar : eygrVar) {
                cqgjVar.getClass();
                if (cqjg.f(cqgjVar) && (i3 = i3 + 1) < 0) {
                    ffdx.k();
                }
            }
            if (i3 > 1) {
                throw new IllegalStateException("Check failed.");
            }
        }
        eygr<cqgj> eygrVar2 = a2.c;
        eygrVar2.getClass();
        if (!eygrVar2.isEmpty()) {
            int i4 = 0;
            for (cqgj cqgjVar2 : eygrVar2) {
                cqgjVar2.getClass();
                if (cqjg.g(cqgjVar2) && (i4 = i4 + 1) < 0) {
                    ffdx.k();
                }
            }
            if (i4 > 1) {
                throw new IllegalStateException("Check failed.");
            }
        }
        eygr<cqgj> eygrVar3 = a2.c;
        eygrVar3.getClass();
        if (!eygrVar3.isEmpty()) {
            for (cqgj cqgjVar3 : eygrVar3) {
                cqgjVar3.getClass();
                if (cqjg.e(cqgjVar3) && (i2 = i2 + 1) < 0) {
                    ffdx.k();
                }
            }
            if (i2 > 1) {
                throw new IllegalStateException("Check failed.");
            }
        }
        return a2;
    }
}
