package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajz implements aaka {
    private final cstx a;
    private final asmy b;

    public aajz(cstx cstxVar, asmy asmyVar) {
        cstxVar.getClass();
        this.a = cstxVar;
        this.b = asmyVar;
    }

    @Override // defpackage.aaka
    public final dnwi a(alxr alxrVar) {
        int i;
        dnwj dnwjVar;
        alxrVar.getClass();
        appj g = alxrVar.g();
        if (zsr.x(alxrVar)) {
            return null;
        }
        boolean z = g instanceof apqd;
        if (z && zsr.u(alxrVar)) {
            return null;
        }
        boolean w = alxrVar.w();
        if (zsr.u(alxrVar)) {
            i = 3;
        } else if (zsr.w(alxrVar)) {
            i = 4;
        } else if (zsr.o(alxrVar)) {
            i = 1;
        } else {
            if (!zsr.r(alxrVar) || (alxrVar instanceof alyv)) {
                return null;
            }
            alya d = alxrVar.d();
            d.getClass();
            if (((alyo) d).a() != alxo.SEEN) {
                return null;
            }
            i = 2;
        }
        if (g instanceof appw) {
            String c = ((appw) g).c();
            c.getClass();
            if (this.a.f() && c.length() > 0 && this.a.g(c) && alxrVar.e() == null) {
                dnwjVar = dnwj.b;
                return new dnwi(i, dnwjVar, w, ((ersq) ((arrc) this.b).a.b()).a("bugle.enable_read_receipt_animations"));
            }
        }
        dnwjVar = ((g instanceof apph) || (g instanceof appt) || (g instanceof ufr)) ? dnwj.b : (z || (g instanceof aacb)) ? dnwj.a : (!(g instanceof apmt) || (((apmt) g).g().b & 1) == 0) ? dnwj.c : dnwj.d;
        return new dnwi(i, dnwjVar, w, ((ersq) ((arrc) this.b).a.b()).a("bugle.enable_read_receipt_animations"));
    }
}
