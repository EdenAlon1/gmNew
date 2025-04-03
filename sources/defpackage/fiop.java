package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiop implements fior {
    private static final fioz a;
    private static final fioz b;
    private static final fioz c;
    private static final fioz d;

    static {
        fioy a2 = fioz.a();
        a2.b('0', '9');
        a2.b('A', 'F');
        a2.b('a', 'f');
        a = new fioz(a2);
        fioy a3 = fioz.a();
        a3.b('0', '9');
        b = new fioz(a3);
        fioy a4 = fioz.a();
        a4.b('A', 'Z');
        a4.b('a', 'z');
        fioz fiozVar = new fioz(a4);
        c = fiozVar;
        fioy b2 = fiozVar.b();
        b2.b('0', '9');
        d = new fioz(b2);
    }

    private static final fiot b(fiow fiowVar, fiov fiovVar) {
        return new fiou(new fiqi(fipb.a(fiowVar.g(fiovVar, fiowVar.e()).a())), fiowVar.e());
    }

    @Override // defpackage.fior
    public final fiot a(fios fiosVar) {
        fiow fiowVar = ((finy) fiosVar).a;
        fiov e = fiowVar.e();
        fiowVar.h();
        char a2 = fiowVar.a();
        if (a2 != '#') {
            if (!c.c(a2)) {
                return null;
            }
            fiowVar.m(d);
            if (fiowVar.k(';')) {
                return b(fiowVar, e);
            }
            return null;
        }
        fiowVar.h();
        if (fiowVar.k('x') || fiowVar.k('X')) {
            int m = fiowVar.m(a);
            if (m <= 0 || m > 6 || !fiowVar.k(';')) {
                return null;
            }
            return b(fiowVar, e);
        }
        int m2 = fiowVar.m(b);
        if (m2 <= 0 || m2 > 7 || !fiowVar.k(';')) {
            return null;
        }
        return b(fiowVar, e);
    }
}
