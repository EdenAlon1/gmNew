package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fimt implements fira {
    @Override // defpackage.fira
    public final char a() {
        return '~';
    }

    @Override // defpackage.fira
    public final char b() {
        return '~';
    }

    @Override // defpackage.fira
    public final int c() {
        return 1;
    }

    @Override // defpackage.fira
    public final int d(finj finjVar, finj finjVar2) {
        if (finjVar.a() != finjVar2.a() || finjVar.a() > 2) {
            return 0;
        }
        fiqi e = finjVar.e();
        fimr fimrVar = new fimr();
        fiqg fiqgVar = new fiqg();
        fiqgVar.c(finjVar.c(finjVar.a()));
        for (fipy fipyVar : fiqb.a(e, finjVar2.d())) {
            fimrVar.g(fipyVar);
            fiqgVar.b(fipyVar.e());
        }
        fiqgVar.c(finjVar2.b(finjVar2.a()));
        fimrVar.i(fiqgVar.a());
        e.h(fimrVar);
        return finjVar.a();
    }
}
