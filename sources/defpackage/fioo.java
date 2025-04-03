package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fioo implements fira {
    private final char a;

    protected fioo(char c) {
        this.a = c;
    }

    @Override // defpackage.fira
    public final char a() {
        return this.a;
    }

    @Override // defpackage.fira
    public final char b() {
        return this.a;
    }

    @Override // defpackage.fira
    public final int c() {
        return 1;
    }

    @Override // defpackage.fira
    public final int d(finj finjVar, finj finjVar2) {
        fipy fipmVar;
        if (finjVar.e || finjVar2.d) {
            int i = finjVar2.c;
            if (i % 3 != 0 && (finjVar.c + i) % 3 == 0) {
                return 0;
            }
        }
        int i2 = 2;
        if (finjVar.a() < 2 || finjVar2.a() < 2) {
            String.valueOf(this.a);
            fipmVar = new fipm();
            i2 = 1;
        } else {
            String.valueOf(this.a);
            fipmVar = new fiqh();
        }
        fiqg fiqgVar = new fiqg();
        fiqgVar.c(finjVar.c(i2));
        fiqi e = finjVar.e();
        for (fipy fipyVar : fiqb.a(e, finjVar2.d())) {
            fipmVar.g(fipyVar);
            fiqgVar.b(fipyVar.e());
        }
        fiqgVar.c(finjVar2.b(i2));
        fipmVar.i(fiqgVar.a());
        e.h(fipmVar);
        return i2;
    }
}
