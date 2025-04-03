package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class clpu implements fdxe, clps {
    @Override // defpackage.clps
    public /* synthetic */ void b(clni clniVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.clps
    public /* synthetic */ void c(clny clnyVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.clps
    public /* synthetic */ void d(clrd clrdVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.clps
    public /* synthetic */ void e(clrz clrzVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.clps
    public /* synthetic */ void f(clsh clshVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.clps
    public /* synthetic */ void g(clst clstVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.clps
    public /* synthetic */ void h(cltb cltbVar, ffbc ffbcVar) {
        throw null;
    }

    @Override // defpackage.clps
    public /* synthetic */ void i() {
        throw null;
    }

    @Override // defpackage.fdxe
    public final fedb w() {
        fedg fedgVar = clpw.a;
        if (fedgVar == null) {
            synchronized (clpw.class) {
                fedgVar = clpw.a;
                if (fedgVar == null) {
                    fedf fedfVar = new fedf("bugle.smapi.rcs.MessagingEngineService");
                    fedfVar.a(clpw.f());
                    fedfVar.a(clpw.e());
                    fedfVar.a(clpw.d());
                    fedfVar.a(clpw.b());
                    fedfVar.a(clpw.a());
                    fedfVar.a(clpw.c());
                    fedfVar.a(clpw.h());
                    fedfVar.a(clpw.g());
                    fedgVar = new fedg(fedfVar);
                    clpw.a = fedgVar;
                }
            }
        }
        HashMap hashMap = new HashMap();
        febs f = clpw.f();
        ffbb ffbbVar = new ffbb(new clpv(this, 0));
        String str = fedgVar.a;
        feda.b(f, ffbbVar, str, fedgVar, hashMap);
        feda.b(clpw.e(), new ffbb(new clpv(this, 1)), str, fedgVar, hashMap);
        feda.b(clpw.d(), new ffbb(new clpv(this, 2)), str, fedgVar, hashMap);
        feda.b(clpw.b(), new ffbb(new clpv(this, 3)), str, fedgVar, hashMap);
        feda.b(clpw.a(), new ffbb(new clpv(this, 4)), str, fedgVar, hashMap);
        feda.b(clpw.c(), new ffbb(new clpv(this, 5)), str, fedgVar, hashMap);
        feda.b(clpw.h(), new ffbb(new clpv(this, 6)), str, fedgVar, hashMap);
        feda.b(clpw.g(), new ffbb(new clpv(this, 7)), str, fedgVar, hashMap);
        return feda.a(str, fedgVar, hashMap);
    }
}
