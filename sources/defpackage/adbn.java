package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class adbn implements fdxe, adbm {
    @Override // defpackage.adbm
    public /* synthetic */ void b(adbf adbfVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void c(adbh adbhVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void d(adbj adbjVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void e(adbr adbrVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void f(addi addiVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void g(adcg adcgVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void h(adck adckVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void i(adcr adcrVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void j(adcy adcyVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void k(adde addeVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void l(ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void m(ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void n(ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.adbm
    public /* synthetic */ void o(ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.fdxe
    public final fedb w() {
        fedg fedgVar = adbp.a;
        if (fedgVar == null) {
            synchronized (adbp.class) {
                fedgVar = adbp.a;
                if (fedgVar == null) {
                    fedf fedfVar = new fedf("com.google.android.apps.messaging.externalapi.proto.ExternalMessagingApi");
                    fedfVar.a(adbp.j());
                    fedfVar.a(adbp.k());
                    fedfVar.a(adbp.n());
                    fedfVar.a(adbp.l());
                    fedfVar.a(adbp.b());
                    fedfVar.a(adbp.i());
                    fedfVar.a(adbp.c());
                    fedfVar.a(adbp.h());
                    fedfVar.a(adbp.d());
                    fedfVar.a(adbp.a());
                    fedfVar.a(adbp.g());
                    fedfVar.a(adbp.e());
                    fedfVar.a(adbp.m());
                    fedfVar.a(adbp.f());
                    fedgVar = new fedg(fedfVar);
                    adbp.a = fedgVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        febs j = adbp.j();
        ffbb ffbbVar = new ffbb(new adbo(this, 0));
        String str = fedgVar.a;
        feda.b(j, ffbbVar, str, fedgVar, hashMap);
        feda.b(adbp.k(), new ffbb(new adbo(this, 1)), str, fedgVar, hashMap);
        feda.b(adbp.n(), new ffbb(new adbo(this, 2)), str, fedgVar, hashMap);
        feda.b(adbp.l(), new ffbb(new adbo(this, 3)), str, fedgVar, hashMap);
        feda.b(adbp.b(), new ffbb(new adbo(this, 4)), str, fedgVar, hashMap);
        feda.b(adbp.i(), new ffbb(new adbo(this, 5)), str, fedgVar, hashMap);
        feda.b(adbp.c(), new ffbb(new adbo(this, 6)), str, fedgVar, hashMap);
        feda.b(adbp.h(), new ffbb(new adbo(this, 7)), str, fedgVar, hashMap);
        feda.b(adbp.d(), new ffbb(new adbo(this, 8)), str, fedgVar, hashMap);
        feda.b(adbp.a(), new ffbb(new adbo(this, 9)), str, fedgVar, hashMap);
        feda.b(adbp.g(), new ffbb(new adbo(this, 10)), str, fedgVar, hashMap);
        feda.b(adbp.e(), new ffbb(new adbo(this, 11)), str, fedgVar, hashMap);
        feda.b(adbp.m(), new ffbb(new adbo(this, 12)), str, fedgVar, hashMap);
        feda.b(adbp.f(), new ffbb(new adbo(this, 13)), str, fedgVar, hashMap);
        return feda.a(str, fedgVar, hashMap);
    }
}
