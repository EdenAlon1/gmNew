package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class clpo implements fdxe, clpm {
    public /* synthetic */ void c(clne clneVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void d(clnu clnuVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void e(clqi clqiVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void f(clqm clqmVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void g(clqz clqzVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void h(clrn clrnVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void i(clrv clrvVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void j(clsd clsdVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void k(clsp clspVar, ffbc ffbcVar) {
        throw null;
    }

    public /* synthetic */ void l(clsx clsxVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.fdxe
    public final fedb w() {
        fedg fedgVar = clpq.a;
        if (fedgVar == null) {
            synchronized (clpq.class) {
                fedgVar = clpq.a;
                if (fedgVar == null) {
                    fedf fedfVar = new fedf("bugle.smapi.rcs.MessagingEngineNotificationService");
                    fedfVar.a(clpq.d());
                    fedfVar.a(clpq.c());
                    fedfVar.a(clpq.h());
                    fedfVar.a(clpq.g());
                    fedfVar.a(clpq.f());
                    fedfVar.a(clpq.b());
                    fedfVar.a(clpq.a());
                    fedfVar.a(clpq.e());
                    fedfVar.a(clpq.j());
                    fedfVar.a(clpq.i());
                    fedgVar = new fedg(fedfVar);
                    clpq.a = fedgVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        febs d = clpq.d();
        ffbb ffbbVar = new ffbb(new clpp(this, 0));
        String str = fedgVar.a;
        feda.b(d, ffbbVar, str, fedgVar, hashMap);
        feda.b(clpq.c(), new ffbb(new clpp(this, 1)), str, fedgVar, hashMap);
        feda.b(clpq.h(), new ffbb(new clpp(this, 2)), str, fedgVar, hashMap);
        feda.b(clpq.g(), new ffbb(new clpp(this, 3)), str, fedgVar, hashMap);
        feda.b(clpq.f(), new ffbb(new clpp(this, 4)), str, fedgVar, hashMap);
        feda.b(clpq.b(), new ffbb(new clpp(this, 5)), str, fedgVar, hashMap);
        feda.b(clpq.a(), new ffbb(new clpp(this, 6)), str, fedgVar, hashMap);
        feda.b(clpq.e(), new ffbb(new clpp(this, 7)), str, fedgVar, hashMap);
        feda.b(clpq.j(), new ffbb(new clpp(this, 8)), str, fedgVar, hashMap);
        feda.b(clpq.i(), new ffbb(new clpp(this, 9)), str, fedgVar, hashMap);
        return feda.a(str, fedgVar, hashMap);
    }
}
