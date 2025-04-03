package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffra {
    public static final Object a(ffhd ffhdVar, ffjm ffjmVar, ffgu ffguVar) {
        Object b;
        ffhd u = ffguVar.u();
        ffhd a = ffsa.a(u, ffhdVar);
        ffui.f(a);
        if (a == u) {
            fghk fghkVar = new fghk(a, ffguVar);
            b = fgib.a(fghkVar, fghkVar, ffjmVar);
        } else if (ffkj.e(a.get(ffgw.k), u.get(ffgw.k))) {
            ffvo ffvoVar = new ffvo(a, ffguVar);
            ffhd ffhdVar2 = ((ffqq) ffvoVar).a;
            Object b2 = fghv.b(ffhdVar2, null);
            try {
                Object a2 = fgib.a(ffvoVar, ffvoVar, ffjmVar);
                fghv.c(ffhdVar2, b2);
                b = a2;
            } catch (Throwable th) {
                fghv.c(ffhdVar2, b2);
                throw th;
            }
        } else {
            ffsy ffsyVar = new ffsy(a, ffguVar);
            fgia.b(ffjmVar, ffsyVar, ffsyVar);
            ffql ffqlVar = ffsyVar.b;
            while (true) {
                int i = ffqlVar.c;
                if (i != 0) {
                    if (i != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    b = ffur.b(ffsyVar.E());
                    if (b instanceof ffrt) {
                        throw ((ffrt) b).b;
                    }
                } else if (ffsyVar.b.c(0, 1)) {
                    b = ffhh.a;
                    break;
                }
            }
        }
        if (b == ffhh.a) {
            ffguVar.getClass();
        }
        return b;
    }

    public static final ffss b(ffsk ffskVar, ffhd ffhdVar, ffsm ffsmVar, ffjm ffjmVar) {
        ffhd b = ffsa.b(ffskVar, ffhdVar);
        ffst ffusVar = ffsmVar.b() ? new ffus(b, ffjmVar) : new ffst(b, true);
        ffsmVar.a(ffjmVar, ffusVar, ffusVar);
        return ffusVar;
    }

    public static final ffud c(ffsk ffskVar, ffhd ffhdVar, ffsm ffsmVar, ffjm ffjmVar) {
        ffhd b = ffsa.b(ffskVar, ffhdVar);
        ffqq ffutVar = ffsmVar.b() ? new ffut(b, ffjmVar) : new ffvd(b, true);
        ffsmVar.a(ffjmVar, ffutVar, ffutVar);
        return ffutVar;
    }
}
